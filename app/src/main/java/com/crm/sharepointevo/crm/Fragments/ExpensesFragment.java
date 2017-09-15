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
import com.crm.sharepointevo.crm.R;
import com.crm.sharepointevo.crm.adapters.ExpensesCellAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExpensesFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;


    public ExpensesFragment() {
        // Required empty public constructor
    }

    private TextView firstColumn, secondColumn, thirdColumn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.items_layout, container, false);

        firstColumn = (TextView) view.findViewById(R.id.tvFirstColumn);
        secondColumn = (TextView) view.findViewById(R.id.tvSecondColumn);
        thirdColumn = (TextView) view.findViewById(R.id.tvThirdColumn);

        firstColumn.setText("Activities");
        secondColumn.setText("Or No.");
        thirdColumn.setText("Status");

        ArrayList<ExpensesModel> expensesModels = new ArrayList<>();
        expensesModels.add(new ExpensesModel("Fix for close button","Low","Pending"));
        expensesModels.add(new ExpensesModel("Fix for close button","Low","Pending"));
        expensesModels.add(new ExpensesModel("Fix for close button","Low","Pending"));
        expensesModels.add(new ExpensesModel("Fix for close button","Low","Pending"));
        expensesModels.add(new ExpensesModel("Fix for close button","Low","Pending"));

        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ExpensesCellAdapter(expensesModels);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
