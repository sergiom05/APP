package com.example.myfit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Recomendación extends AppCompatActivity {
    Button calc_btn;
    TextView a, b, c, d, e, f;
    EditText p, q, r, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.recomendacion_calorias);

        calc_btn = findViewById(R.id.calculate_btn);
        a = findViewById(R.id.cal_maintain);
        b = findViewById(R.id.cal_bulk);
        c = findViewById(R.id.cal_cut);
        d = findViewById(R.id.mac_protein);
        e = findViewById(R.id.mac_carb);
        f = findViewById(R.id.mac_fat);
        p = findViewById(R.id.editAge);
        q = findViewById(R.id.editHeight);
        r = findViewById(R.id.editWeight);
        s = findViewById(R.id.editGender);

        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = s.getText().toString().trim().toUpperCase();
                if (gender.equals("M")) {
                    maleCheck();
                } else if (gender.equals("F")) {
                    femaleCheck();
                } else {
                    noUse();
                }
            }
        });
    }

    private void noUse() {
        a.setText("Por favor, ingresa un género válido (M o F).");
        clearResults();
    }

    private void clearResults() {
        if (b != null) b.setText("");
        if (c != null) c.setText("");
        if (d != null) d.setText("");
        if (e != null) e.setText("");
        if (f != null) f.setText("");
    }

    private void femaleCheck() {
        try {
            double wt1 = Double.parseDouble(r.getText().toString());
            double ht1 = Double.parseDouble(q.getText().toString());
            double age1 = Double.parseDouble(p.getText().toString());

            if (wt1 <= 0 || ht1 <= 0 || age1 <= 0) {
                a.setText("Por favor, asegúrate de que la edad, peso y altura sean mayores a cero.");
                clearResults();
                return;
            }

            double formula3 = 1.9 * ht1;
            double formula5 = 4.7 * age1;
            double formula4 = formula3 / formula5;
            double formula6 = 9.6 * wt1;
            double formula2 = 665.1 + formula6 + formula4;
            double result = formula2 * 1.3;

            a.setText("Calorías necesarias para mantener tu peso: " + (int) result + " kcal");
            double bulk = result + 400;
            b.setText("Calorías para aumentar masa muscular: " + (int) bulk + " kcal");
            double cut = result - 400;
            c.setText("Calorías recomendadas para perder peso: " + (int) cut + " kcal");
            double protein = (0.4 * result) / 4;
            d.setText("Cantidad recomendada de proteína: " + (int) protein + " g");
            double carbohydrates = (0.6 * result) / 4;
            e.setText("Cantidad recomendada de carbohidratos: " + (int) carbohydrates + " g");
            double fat = (0.2 * result) / 9;
            f.setText("Cantidad recomendada de grasas: " + (int) fat + " g");

        } catch (NumberFormatException e) {
            a.setText("Por favor, ingresa valores numéricos válidos para edad, peso y altura.");
            clearResults();
        }
    }

    private void maleCheck() {
        try {
            double wt1 = Double.parseDouble(r.getText().toString());
            double ht1 = Double.parseDouble(q.getText().toString());
            double age1 = Double.parseDouble(p.getText().toString());

            if (wt1 <= 0 || ht1 <= 0 || age1 <= 0) {
                a.setText("Por favor, asegúrate de que la edad, peso y altura sean mayores a cero.");
                clearResults();
                return;
            }

            double formula6 = 13.8 * wt1;
            double formula4 = 6.8 * age1;
            double formula3 = 5 * ht1;
            double formula5 = formula3 / formula4;
            double formula2 = 66.5 + formula6 + formula5;
            double result = formula2 * 1.3;

            a.setText("Calorías necesarias para mantener tu peso: " + (int) result + " kcal");
            double bulk = result + 500;
            b.setText("Calorías para aumentar masa muscular: " + (int) bulk + " kcal");
            double cut = result - 500;
            c.setText("Calorías recomendadas para perder peso: " + (int) cut + " kcal");
            double protein = (0.4 * result) / 4;
            d.setText("Cantidad recomendada de proteína: " + (int) protein + " g");
            double carbohydrates = (0.6 * result) / 4;
            e.setText("Cantidad recomendada de carbohidratos: " + (int) carbohydrates + " g");
            double fat = (0.2 * result) / 9;
            f.setText("Cantidad recomendada de grasas: " + (int) fat + " g");

        } catch (NumberFormatException e) {
            a.setText("Por favor, ingresa valores numéricos válidos para edad, peso y altura.");
            clearResults();
        }
    }
}
