package com.crm.sharepointevo.crm.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.ExpensesModel;
import com.crm.sharepointevo.crm.R;

import java.util.ArrayList;

/**
 * Created by ksfgh on 25/08/2017.
 */

public class ExpensesCellAdapter extends RecyclerView.Adapter<ExpensesCellAdapter.ViewHolder>{

    private ArrayList<ExpensesModel> expensesModels;

    public ExpensesCellAdapter(ArrayList<ExpensesModel> expensesModels){
        this.expensesModels = expensesModels;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        ExpensesCellAdapter.ViewHolder viewHolder = new ExpensesCellAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mFirstCell.setText(expensesModels.get(position).getmActivity());
        holder.mSecondCell.setText(expensesModels.get(position).getmOrderNo());
        holder.mThirdCell.setText(expensesModels.get(position).getmStatus());
    }

    @Override
    public int getItemCount() {
        return expensesModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mFirstCell, mSecondCell, mThirdCell;

        public ViewHolder(View itemView) {
            super(itemView);

            mFirstCell = (TextView) itemView.findViewById(R.id.tvFirstCell);
            mSecondCell = (TextView) itemView.findViewById(R.id.tvSecondCell);
            mThirdCell = (TextView) itemView.findViewById(R.id.tvThirdCell);
        }
    }
}
