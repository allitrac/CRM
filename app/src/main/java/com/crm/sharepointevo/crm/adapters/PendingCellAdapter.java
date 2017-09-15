package com.crm.sharepointevo.crm.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.MyTasksModel;
import com.crm.sharepointevo.crm.Models.PendingModel;
import com.crm.sharepointevo.crm.R;

import java.util.ArrayList;

/**
 * Created by ksfgh on 29/08/2017.
 */

public class PendingCellAdapter extends RecyclerView.Adapter<PendingCellAdapter.ViewHolder> {

    private ArrayList<PendingModel> pendingModels;

    public PendingCellAdapter(ArrayList<PendingModel> expensesModels) {
        this.pendingModels = expensesModels;
    }

    @Override
    public PendingCellAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        PendingCellAdapter.ViewHolder viewHolder = new PendingCellAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PendingCellAdapter.ViewHolder holder, int position) {

        holder.mFirstCell.setText(pendingModels.get(position).getmActivities());
        holder.mSecondCell.setText(pendingModels.get(position).getmPriority());
        holder.mThirdCell.setText(pendingModels.get(position).getmStatus());
    }

    @Override
    public int getItemCount() {
        return pendingModels.size();
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
