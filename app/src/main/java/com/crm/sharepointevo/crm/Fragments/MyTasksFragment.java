package com.crm.sharepointevo.crm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.InProgressModel;
import com.crm.sharepointevo.crm.Models.MyTasksModel;
import com.crm.sharepointevo.crm.R;
import com.crm.sharepointevo.crm.adapters.InProgressCellAdapter;
import com.crm.sharepointevo.crm.adapters.MyTasksCellAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyTasksFragment extends Fragment {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private TextView firstColumn, secondColumn, thirdColumn;

    public MyTasksFragment() {
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

        ArrayList<MyTasksModel> myTasksModels = new ArrayList<>();
        myTasksModels.add(new MyTasksModel("Fixes close button","Low","Pending"));
        myTasksModels.add(new MyTasksModel("Fixes close button","Low","Pending"));
        myTasksModels.add(new MyTasksModel("Fixes close button","Low","Pending"));
        myTasksModels.add(new MyTasksModel("Fixes close button","Low","Pending"));
        myTasksModels.add(new MyTasksModel("Fixes close button","Low","Pending"));

        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MyTasksCellAdapter(myTasksModels);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
