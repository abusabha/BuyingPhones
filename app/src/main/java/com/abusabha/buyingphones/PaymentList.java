package com.abusabha.buyingphones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.abusabha.buyingphones.adapter.PhonesAdapter;
import com.abusabha.buyingphones.dataSource.DataSource;

public class PaymentList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_list);


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setAdapter(new PhonesAdapter(DataSource.getPhones(), this));
    }
}