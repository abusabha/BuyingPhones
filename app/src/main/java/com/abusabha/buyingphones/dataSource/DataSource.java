package com.abusabha.buyingphones.dataSource;

import com.abusabha.buyingphones.R;
import com.abusabha.buyingphones.model.Phone;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Phone> getPhones() {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Iphone", "10$", R.drawable.iphone, 5));
        return phones;
    }
}
