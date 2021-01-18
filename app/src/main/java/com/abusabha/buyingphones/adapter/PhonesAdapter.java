package com.abusabha.buyingphones.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abusabha.buyingphones.DetailActivity;
import com.abusabha.buyingphones.R;
import com.abusabha.buyingphones.model.Phone;

import java.util.List;

public class PhonesAdapter extends RecyclerView.Adapter<PhonesAdapter.PhoneViewHolder> {
    private final List<Phone> phones;
    private final Context context;

    public PhonesAdapter(List<Phone> phones, Context context) {
        this.phones = phones;
        this.context = context;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new PhoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        Phone currentPhone = phones.get(position);

        holder.image.setImageResource(currentPhone.getImage());
        holder.model.setText(currentPhone.getPhoneModel());
        holder.price.setText(currentPhone.getPhonePrice());
        holder.store.setText(String.valueOf(currentPhone.getStore()));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("phone", currentPhone);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return phones.size();
    }

    static class PhoneViewHolder extends RecyclerView.ViewHolder {
        TextView model, price, store;
        ImageView image;

        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            model = itemView.findViewById(R.id.modle_text);
            price = itemView.findViewById(R.id.price_text);
            store = itemView.findViewById(R.id.store_text);
            image = itemView.findViewById(R.id.phone_img);
        }
    }
}
