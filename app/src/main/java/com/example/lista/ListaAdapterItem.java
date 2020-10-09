package com.example.lista;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListaAdapterItem extends ArrayAdapter<Item> {

    private Context context;
    private ArrayList<Item> lista;



    public ListaAdapterItem(Context context, ArrayList<Item> lista){
        super(context,0,lista);
        this.context=context;
        this.lista=lista;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        Item itemPosicao = this.lista.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.item,null);

        TextView tvRm = (TextView)convertView.findViewById(R.id.textView);
        tvRm.setText(itemPosicao.getRmAluno());

        TextView tvNome =(TextView)convertView.findViewById(R.id.textView4);
        tvNome.setText(itemPosicao.getNomeAluno());

        TextView tvEndereco =(TextView)convertView.findViewById(R.id.textView5);
        tvEndereco.setText(itemPosicao.getEndAluno());

        TextView tvFoto =(TextView)convertView.findViewById(R.id.textView6);
        tvFoto.setText(itemPosicao.getFotoAluno());

        return convertView;

    }
}
