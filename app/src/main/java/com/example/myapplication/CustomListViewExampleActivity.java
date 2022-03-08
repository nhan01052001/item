package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity{
    private List<Items> listItem;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        listView = (ListView) listView.findViewById(R.id.idListView);
        listItem = new ArrayList<>();
        listItem.add(new Items(1, "Lập Trình Java"));
        listItem.add(new Items(2, "Lập Trình Android"));
        listItem.add(new Items(3, "Lập Trình JavaFX"));
        listItem.add(new Items(4, "Lập Trình Web"));
        listItem.add(new Items(5, "Lập Trình Ruby"));
        listItem.add(new Items(6, "Lập Trình C++"));
        listItem.add(new Items(7, "Lập Trình PHP"));
        listItem.add(new Items(8, "Lập Trình WordPress"));

        ItemsAdapter adapter = new ItemsAdapter(this, R.layout.item_custom_list_view, listItem);
        listView.setAdapter(adapter);

    }
}
