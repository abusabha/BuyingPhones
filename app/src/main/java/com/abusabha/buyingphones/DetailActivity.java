package com.abusabha.buyingphones;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.abusabha.buyingphones.model.Phone;

public class DetailActivity extends AppCompatActivity {
    TextView model, price, store;
    ImageView image;
    Phone phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        phone = (Phone) getIntent().getSerializableExtra("phone");

        initViews();
    }

    private void initViews() {
        model = findViewById(R.id.model);
        price = findViewById(R.id.price);
        store = findViewById(R.id.store);
        image = findViewById(R.id.image);

        model.setText(phone.getPhoneModel());
        price.setText(phone.getPhonePrice());
        store.setText(phone.getStore());
        image.setImageResource(phone.getImage());
    }
}