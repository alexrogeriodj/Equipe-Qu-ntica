package com.quantica.amigodapraca.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import com.quantica.amigodapraca.R;
import com.quantica.amigodapraca.firebaseobjects.Evento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andre on 22/04/2017.
 */

public class NotificacaoAdapter extends RecyclerView.Adapter<NotificacaoAdapter.ViewHolder>{
    private List<Evento> mDataset = new ArrayList<>();

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitulo;
        public TextView mData;
        public TextView mDescricao;

        public ViewHolder(View v) {
            super(v);
            mTitulo = (TextView) v.findViewById(R.id.titulo);
            mData = (TextView) v.findViewById(R.id.data);
            mDescricao = (TextView) v.findViewById(R.id.descricao);
        }

    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public NotificacaoAdapter(List<Evento> myDataset) {
        mDataset = myDataset;
    }

    public void add(Evento e) {
        mDataset.add(e);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public NotificacaoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cartao_bom, parent, false);
        // set the view's size, margins, paddings and layout parameters

        NotificacaoAdapter.ViewHolder vh = new NotificacaoAdapter.ViewHolder(v);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(NotificacaoAdapter.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTitulo.setText(mDataset.get(position).getNome());
        holder.mData.setText(mDataset.get(position).getData());
        holder.mDescricao.setText(mDataset.get(position).getDescricao());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

