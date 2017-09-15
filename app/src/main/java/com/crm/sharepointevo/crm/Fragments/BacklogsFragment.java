package com.crm.sharepointevo.crm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.BacklogsModel;
import com.crm.sharepointevo.crm.Models.PendingModel;
import com.crm.sharepointevo.crm.R;
import com.crm.sharepointevo.crm.adapters.BacklogsCellAdapter;
import com.crm.sharepointevo.crm.adapters.PendingCellAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BacklogsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private TextView firstColumn, secondColumn, thirdColumn;

    public BacklogsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.items_layout, container, false);
        firstColumn = (TextView) view.findViewById(R.id.tvFirstColumn);
        secondColumn = (TextView) view.findViewById(R.id.tvSecondColumn);
        thirdColumn = (TextView) view.findViewById(R.id.tvThirdColumn);

        firstColumn.setText("Activities");
        secondColumn.setText("Priority.");
        thirdColumn.setText("Status");

        ArrayList<BacklogsModel> backlogsModels = new ArrayList<>();
        backlogsModels.add(new BacklogsModel("Fixes close button","Low","Pending"));
        backlogsModels.add(new BacklogsModel("Fixes close button","Low","Pending"));
        backlogsModels.add(new BacklogsModel("Fixes close button","Low","Pending"));
        backlogsModels.add(new BacklogsModel("Fixes close button","Low","Pending"));
        backlogsModels.add(new BacklogsModel("Fixes close button","Low","Pending"));

        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new BacklogsCellAdapter(backlogsModels);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
