package com.crm.sharepointevo.crm.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.ExpensesModel;
import com.crm.sharepointevo.crm.Models.InProgressModel;
import com.crm.sharepointevo.crm.R;
import com.crm.sharepointevo.crm.adapters.ExpensesCellAdapter;
import com.crm.sharepointevo.crm.adapters.InProgressCellAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InProgressFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private TextView firstColumn, secondColumn, thirdColumn;

    public InProgressFragment() {
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

        ArrayList<InProgressModel> inProgressModels = new ArrayList<>();
        inProgressModels.add(new InProgressModel("Fixes close button","Low","Pending"));
        inProgressModels.add(new InProgressModel("Fixes close button","Low","Pending"));
        inProgressModels.add(new InProgressModel("Fixes close button","Low","Pending"));
        inProgressModels.add(new InProgressModel("Fixes close button","Low","Pending"));
        inProgressModels.add(new InProgressModel("Fixes close button","Low","Pending"));

        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new InProgressCellAdapter(inProgressModels);
        recyclerView.setAdapter(adapter);

        return view;

    }

}
