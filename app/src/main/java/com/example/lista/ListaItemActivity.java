package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_item);

        ArrayList<Item> lista = new ArrayList<Item>();

        Item a = new Item("1","Bento Oliveira","Joaquim Bueno","1");
        Item b = new Item("2","Betina Eduarda","Heleno Gabriel","2");
        Item c = new Item("3","Beatriz Costa","Davi Gabriel","3");
        Item d = new Item("4","Karen","Joaquim, Bueno de Campos","4");
        Item e = new Item("5","Marcos Oliveira","Rua Grécia","5");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);

        ListaAdapterItem adapterItem = new ListaAdapterItem(this, lista);

        ListView listView = (ListView)findViewById(R.id.listView);

        listView.setAdapter(adapterItem);

    }
}