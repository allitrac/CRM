package com.crm.sharepointevo.crm.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.ExpensesModel;
import com.crm.sharepointevo.crm.Models.InProgressModel;
import com.crm.sharepointevo.crm.R;

import java.util.ArrayList;

/**
 * Created by ksfgh on 25/08/2017.
 */

public class InProgressCellAdapter extends RecyclerView.Adapter<InProgressCellAdapter.ViewHolder> {

    private ArrayList<InProgressModel> inProgressModels;

    public InProgressCellAdapter(ArrayList<InProgressModel> expensesModels){
        this.inProgressModels = expensesModels;
    }


    @Override
    public InProgressCellAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        InProgressCellAdapter.ViewHolder viewHolder = new InProgressCellAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(InProgressCellAdapter.ViewHolder holder, int position) {

        holder.mFirstCell.setText(inProgressModels.get(position).getmActivities());
        holder.mSecondCell.setText(inProgressModels.get(position).getmPriority());
        holder.mThirdCell.setText(inProgressModels.get(position).getmStatus());
    }

    @Override
    public int getItemCount() {
        return inProgressModels.size();
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
