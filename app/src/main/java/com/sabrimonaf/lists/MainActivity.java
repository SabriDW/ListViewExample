package com.sabrimonaf.lists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myListView = (ListView) findViewById(R.id.my_list_view);

        List<Contact> contacts = new ArrayList<>();


        contacts.add(new Contact("Miran", "0770000191", "miran9191@gmail.com", R.drawable.ic_contact_yellow));
        contacts.add(new Contact("Sabri", "0770246874", "sabri.sniper@gmail.com", R.drawable.ic_contact_blue));
        contacts.add(new Contact("Mohammed", "07702346234", "mohammed@gmail.com", R.drawable.ic_contact_red));
        contacts.add(new Contact("Ahmed", "07702244234", "ahmed@gmail.com", R.drawable.ic_contact_black));

        ContactsAdapter myContactsAdapter = new ContactsAdapter(this, R.layout.item_contact, contacts);


        myListView.setAdapter(myContactsAdapter);

    }


}
