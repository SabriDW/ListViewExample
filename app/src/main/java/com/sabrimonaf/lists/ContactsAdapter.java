package com.sabrimonaf.lists;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sabri on 10/9/17.
 */

public class ContactsAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resId;
    private List<Contact> contacts;

    public ContactsAdapter(Context context, int resId, List<Contact> contacts) {
        super(context, resId, contacts);
        this.context = context;
        this.resId = resId;
        this.contacts = contacts;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Log.v("GET VIEW", "CALLED!");

        if (convertView == null) {
            Log.v("CONVERT VIEW IS", "NULL");
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resId, null);
        } else {
            Log.v("CONVERT VIEW IS", "NOT NULL");
        }


        Contact contact = contacts.get(position);

        Log.v("POSITION", String.valueOf(position));
        Log.v("CONTACT", contact.toString());
        Log.v("============", "============");

        ImageView image = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.name);
        TextView phone = convertView.findViewById(R.id.phone);
        TextView email = convertView.findViewById(R.id.email);

        image.setImageResource(contact.getImgRes());
        name.setText(contact.getName());
        phone.setText(contact.getPhone());
        email.setText(contact.getEmail());

        return convertView;
    }
}
