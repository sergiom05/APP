package com.example.myfit;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CaloríasComida extends AppCompatActivity {
    private HashMap _$_findCachedViewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.actividad_calorias);
        ListView listview = this.findViewById(R.id.listView);
        boolean var4 = false;
        List list = (List) (new ArrayList());
        TextView calorieText = this.findViewById(R.id.calorieText);
        Button reset = this.findViewById(R.id.reset);
        final TextView value = this.findViewById(R.id.valueCal);
        list.add(new modelo("Arroz", "Arroz simple: 200 cal", R.drawable.rice_bowl)); // Arroz simple
        list.add(new modelo("Pan", "2 rebanadas de pan: 140 cal", R.drawable.roti_canai)); // 2 rebanadas
        list.add(new modelo("Sopa", "Sopa simple: 50 cal", R.drawable.dal2)); // Sopa simple
        list.add(new modelo("Ensalada", "Ensalada mixta: 80 cal", R.drawable.salad)); // Ensalada mixta
        list.add(new modelo("Fideos", "Fideos: 140 cal", R.drawable.noodles)); // Fideos
        list.add(new modelo("Hamburguesa", "Hamburguesa: 300 cal", R.drawable.hamburger)); // Hamburguesa
        list.add(new modelo("Pizza", "Pizza: 250 cal", R.drawable.pizza)); // Pizza
        list.add(new modelo("Bebida fría", "Bebida carbonatada: 140 cal", R.drawable.soft_drink)); // Bebida carbonatada
        list.add(new modelo("Manzana", "Manzana: 95 cal", R.drawable.apple)); // Manzana
        list.add(new modelo("Pan", "4 rebanadas de pan: 200 cal", R.drawable.baguette)); // 4 rebanadas
        list.add(new modelo("Pastel", "1 rebanada de pastel: 300 cal", R.drawable.cake)); // Pastel
        list.add(new modelo("Muffin", "Muffin: 150 cal", R.drawable.cupcake)); // Muffin
        list.add(new modelo("Zanahoria", "Zanahoria: 30 cal", R.drawable.carrot)); // Zanahoria
        list.add(new modelo("Pollo", "Pollo: 220 cal", R.drawable.chicken_leg)); // Pollo
        list.add(new modelo("Chocolate", "Barra de chocolate: 200 cal", R.drawable.chocolate)); // Barra de chocolate
        list.add(new modelo("Donas", "Donas: 150 cal", R.drawable.donut)); // Donas
        list.add(new modelo("Dulces", "Dulces variados: 250 cal", R.drawable.fazuelos)); // Dulces variados
        list.add(new modelo("Papas fritas", "Papas fritas medianas: 350 cal", R.drawable.french_fries)); // Papas fritas
        list.add(new modelo("Naranja", "Naranja: 60 cal", R.drawable.fruit)); // Naranja
        list.add(new modelo("Perro caliente", "Perro caliente: 250 cal", R.drawable.hot_dog)); // Perro caliente
        list.add(new modelo("Rollos", "Rollos: 150 cal", R.drawable.kebab)); // Rollos
        list.add(new modelo("Papas fritas", "Papas fritas: 200 cal", R.drawable.potato_chips)); // Papas fritas
        list.add(new modelo("Sundae", "Sundae: 200 cal", R.drawable.sundae)); // Sundae
        list.add(new modelo("Helado", "Helado: 150 cal", R.drawable.parfait)); // Helado
        list.add(new modelo("Fresa", "Fresa: 50 cal", R.drawable.strawberry)); // Fresa
        list.add(new modelo("Carne", "250 g de carne roja: 300 cal", R.drawable.meat)); // Carne roja
        list.add(new modelo("Arroz con menestra", "Arroz con menestra: 200 cal", R.drawable.vegan_food)); // Arroz con menestra


        listview.setAdapter(new adaptador_comida(this, R.layout.fila_lista, list));
        ((ListView) this.findViewById(R.id.listView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(@NotNull AdapterView parent, @NotNull View view, int position, long id) {
                TextView var10000;
                TextView var10001;
                String var6;

                if (position == 0) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 1) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 2) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 3) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 80));
                }

                if (position == 4) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 5) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 300));
                }

                if (position == 6) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }

                if (position == 7) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 8) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 95));
                }

                if (position == 9) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 10) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 300));
                }

                if (position == 11) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 150));
                }

                if (position == 12) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 30));
                }

                if (position == 13) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 220));
                }

                if (position == 14) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 15) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 150));
                }

                if (position == 16) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }

                if (position == 17) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 350));
                }

                if (position == 18) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 60));
                }

                if (position == 19) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }

                if (position == 20) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 150));
                }

                if (position == 21) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 22) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 23) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 150));
                }

                if (position == 24) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 150));
                }

                if (position == 25) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 26) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 27) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 300));
                }

                if (position == 28) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 70));
                }
            }
        });

        reset.setOnClickListener(new OnClickListener() {
            public final void onClick(View it) {
                value.setText("0");
            }
        });
    }
}