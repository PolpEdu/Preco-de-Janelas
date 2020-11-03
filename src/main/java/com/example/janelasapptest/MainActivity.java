package com.example.janelasapptest;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


class Dados {

    public String[] TipoVidro = {
            "Planiclear", "Extra claro", "Bronze_ver_gris", "Azul", "Fosco",
            "P126", "Bioclean", "ST-120 ou 150 incolor", "STB120", "ST-420 verde", "Antélio claro", "Stopsol claro",
            "Stopsol B_V_G", "Stopsol azul", "Laminado inc", "Lam Planitherm", "Planitherm" , "Planitherm Temp",
            "ClimaGuard Premiun2", "ClimaGuard Premiun2 temp", "4S Planitherm", "4S Planitherm Temp", "ONE Planitherm",
            "ONE Planitherm Temp", "Guardian Sun", "Guardian Sun Temp", "Planistar", "SKN154/165/176 II", "Xtream 60/28 Temp"
    };

    public String[] Tempera = { //tempera de tipos diferentes pode ser adicionada até 3 vezes
            "Nada", "Decalage", "Tempera4", "Tempera5", "Tempera6", "Tempera8", "Tempera10", "Tempera11", "Tempera12", "Tempera13", "Tempera14", "Tempera15",
            "Tempera16","Tempera17", "Tempera18", "Tempera19", "Tempera20"
    };
}


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener { //adicionei dois metodos para items clicados
Dados dados = new Dados();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boolean inispinner= true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tipo butão nicknaming calc.
        Button Calc = findViewById(R.id.Calc); //encontramos por o id btncalc. Ligamos os dois
        //vou dar nomes a todos os spinners
        final Spinner spinnerTipo = findViewById(R.id.TipoSpinner);
        final Spinner spinner2 = findViewById(R.id.Spinner2);
        final Spinner spinner3 = findViewById(R.id.Spinner3);
        final Spinner spinner4 = findViewById(R.id.Spinner4);
        final Spinner spinner5 = findViewById(R.id.Spinner5);
        final Spinner spinner6 = findViewById(R.id.Spinner6);
        final Spinner spinner7 = findViewById(R.id.Spinner7);
        final Spinner spinner8 = findViewById(R.id.Spinner8);
        final Spinner spinner9 = findViewById(R.id.Spinner9);
        final Spinner spinner10 = findViewById(R.id.Spinner10);
        final Spinner spinner11 = findViewById(R.id.Spinner11);

        final Button limpar = findViewById(R.id.limpa);

        //enquanto corre quero que ele se lembre o que fazer quando clicar no butão
        Calc.setOnClickListener(new View.OnClickListener() {
            //vou enunciar estes antes para trabalhar com a tabela
            Toast MensagemErro = Toast.makeText(getApplicationContext(),"Erro valores Inválidos.",Toast.LENGTH_LONG);

            public Boolean FAIL = false;

            public double Tabela(String txtTipo, String txt2)
            {
                String PreTotaltxt = "";
                Double preTipoVidro1 = 0.0;


            if (txtTipo.equals(dados.TipoVidro[0])) { //usar .equals
                    //System.out.println("Correspondido Planiclear");
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            preTipoVidro1 = 1.5;
                            break;
                        case "6mm":
                            preTipoVidro1 = 3.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 6.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 9.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[1])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 8.5;
                            break;
                        case "5mm":
                            preTipoVidro1 = 10.5;
                            break;
                        case "6mm":
                            preTipoVidro1 = 12.5;
                            break;
                        case "8mm":
                            preTipoVidro1 = 20.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 25.00;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                }
                else if (txtTipo.equals(dados.TipoVidro[2])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 3.0;
                            break;
                        case "5mm":
                            preTipoVidro1 = 5.0;
                            break;
                        case "6mm":
                            preTipoVidro1 = 7.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 15.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 19.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[3])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 15.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 27.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[4])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 6.0;
                            break;
                        case "5mm":
                            preTipoVidro1 = 8.0;
                            break;
                        case "6mm":
                            preTipoVidro1 = 10.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 15.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 19.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[5])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 1.7;
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 6.0;
                            break;
                        case "8mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[6])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 24.0;
                            break;
                        case "8mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[7])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 19.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 24.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[8])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 24.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 28.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[9])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 23.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 27.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[10])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            preTipoVidro1 = 12.0;
                            break;
                        case "6mm":
                            preTipoVidro1 = 16.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 26.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 32.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[11])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 11.0;
                            break;
                        case "5mm":
                            preTipoVidro1 = 12.0;
                            break;
                        case "6mm":
                            preTipoVidro1 = 16.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 26.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[12])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 15.0;
                            break;
                        case "5mm":
                            preTipoVidro1 = 17.0;
                            break;
                        case "6mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "8mm":
                            preTipoVidro1 = 60.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[13])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 30.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 40.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[14])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 11.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 13.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 17.0;
                            break;
                        case "12mm":
                            preTipoVidro1 = 21.0;
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            preTipoVidro1 = 30.0;
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[15])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "8mm":
                            preTipoVidro1 = 28.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 32.8;
                            break;
                        case "12mm":
                            preTipoVidro1 = 40.0;
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[16]) || txtTipo.equals(dados.TipoVidro[18])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 7.0;
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 8.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 15.5;
                            break;
                        case "10mm":
                            preTipoVidro1 = 23.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[17]) || txtTipo.equals(dados.TipoVidro[19])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 18.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 24.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 30.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[20])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 9.0;
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 11.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 18.5;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[21])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "8mm":
                            preTipoVidro1 = 24.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 32.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[22])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 11.0;
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 13.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 20.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[23])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 26.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 34.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[24])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 11.0;
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 14.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 21.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[25])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 28.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 36.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[26])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            preTipoVidro1 = 12.0;
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 16.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 26.0;
                            break;
                        case "10mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[27])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 30.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 37.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 56.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }
                } else if (txtTipo.equals(dados.TipoVidro[28])) {
                    switch (txt2) {
                        case "Nada":
                            preTipoVidro1 = 0.0;
                            break;
                        case "4mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "5mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "6mm":
                            preTipoVidro1 = 45.0;
                            break;
                        case "8mm":
                            preTipoVidro1 = 50.0;
                            break;
                        case "10mm":
                            preTipoVidro1 = 60.0;
                            break;
                        case "12mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "14mm":
                            PreTotaltxt = "Não existe.";
                            break;
                        case "16mm":
                            PreTotaltxt = "Não existe.";
                            break;
                    }

                }
                if (PreTotaltxt.equals("Não existe."))
                {
                    FAIL = true;
                    MensagemErro.show();
                    TextView textView1 = findViewById(R.id.txtResultado);
                    textView1.setText("Erro.");
                }
                System.out.println(txtTipo);
                return preTipoVidro1;
            } //dá return ao preço vindo da tabela

            public double ButiralGenerator(String txt)
            {
                Double preButiral = 0.0;
                switch (txt) {
                    case ("Nada"):
                        preButiral = 0.0;
                        break;
                    case ("2ºButiral inc"):
                        preButiral = 5.0;
                        break;
                    case ("4ºButiral inc"):
                        preButiral = 15.0;
                        break;
                    case ("2ºButiral opalino"):
                        preButiral = 8.0;
                        break;
                    case ("1ºButiral silence"):
                        preButiral = 8.0;
                        break;
                    case ("2ºButiral silence"):
                        preButiral = 16.0;
                        break;
                    case ("3ºButiral silence"):
                        preButiral = 24.0;
                        break;
                    case ("1ºButiral B_V_G"):
                        preButiral = 7.0;
                        break;
                }
                return preButiral;
            } //dá return ao valor do Butiral


            @Override
            public void onClick(View v) { //quando o butão foi clickado
                //digo ao valores que correspondem
                Double preBase = 17.0, PreTotal, preTipoVidro1, preButiral1,
                        preCaixa = 0.0, preArgon = 0.0, preTempera = 0.0, preTipoVidro2,
                        preButiral2 = 0.0, Area= 0.0, Forma= 0.0, PreTotalSemPercentagem1;

                FAIL = false;
                //temos qque defenir os spinners aqui porque se fosse atrás ainda não teriam assumido valores logo podiam ser nulos.
                //E não queremos isso
                String txtTipo1 = spinnerTipo.getSelectedItem().toString();
                String txtlargura1 = spinner2.getSelectedItem().toString();
                String txtTipo2 = spinner7.getSelectedItem().toString();
                String txtlargura2 = spinner8.getSelectedItem().toString();

                String txt3 = spinner3.getSelectedItem().toString();
                String txt4 = spinner4.getSelectedItem().toString();
                String txt5 = spinner5.getSelectedItem().toString();
                String txt6 = spinner6.getSelectedItem().toString();


                String txt9 = spinner9.getSelectedItem().toString();
                String txt10 = spinner10.getSelectedItem().toString();
                String txt11 = spinner11.getSelectedItem().toString();


                preTipoVidro1 = Tabela(txtTipo1,txtlargura1);
                preButiral1 = ButiralGenerator(txt3);
                preTipoVidro2= Tabela(txtTipo2,txtlargura2);
                preButiral2 = ButiralGenerator(txt9);

                switch (txt4) {
                    case "caixa 12mm":
                        preCaixa = 0.0;
                        break;
                    case "caixa 14mm":
                        preCaixa = 0.0;
                        break;
                    case "caixa 16mm":
                        preCaixa = 0.8;
                        break;
                    case "caixa 18mm":
                        preCaixa = 1.5;
                        break;
                    case "caixa 20mm":
                        preCaixa = 2.0;
                        break;
                    case "caixa mais de 20 mm":
                        preCaixa = 3.0;
                        break;
                    case "caixa lac branca ou preta":
                        preCaixa = 2.0;
                        break;
                    case "Silicone estrutural":
                        preCaixa = 4.0;
                        break;
                }
                switch (txt5) {
                    case "Nada":
                        preArgon = 0.0;
                        break;
                    case "Argon 16mm":
                        preArgon = 3.0;
                        break;
                    case "Argon 18mm":
                        preArgon = 4.0;
                        break;
                    case "Argon 20mm":
                        preArgon = 5.0;
                        break;
                    case "Argon 22mm":
                        preArgon = 6.0;
                        break;
                    case "Argon 24mm":
                        preArgon = 7.0;
                        break;
                    case "Argon 27mm":
                        preArgon = 9.0;
                        break;
                }
                switch (txt10) {
                    case "Nada":
                        Area = 0.0;
                        break;
                    case "entre 4 a 6m2":
                        Area = 0.15;
                        break;
                    case "entre 6 a 8m2":
                        Area = 0.35;
                        break;
                    case "entre 8 a 10m2":
                        Area = 0.55;
                        break;
                    case "entre 10 a 12m2":
                        Area = 0.8;
                        break;
                    case "mais 12m2":
                        Area = 1.0;
                        break;

                }
                switch (txt11) {
                    case "Nada":
                        Forma = 0.0;
                        break;
                    case "Sutado":
                        Forma = 0.3;
                        break;
                    case "Molde":
                        Forma = 0.5;
                        break;
                    case "Circular ou oval":
                        Forma = 1.0;
                        break;
                    case "com furo":
                        Forma = 1.5;
                        break;
                }
                //descobri que a o preço da tempera é dado pelo seu nome. Se os valores da tempera atualizarem DESCULPA.
                for (int i = 0; i<17; i++){
                    if (dados.Tempera[i].equals(txt6))
                    {
                        if(i==0)
                        {//Nada
                            preTempera = 0.0;
                        }
                        else if (i==1)
                        {//Decalage
                            preTempera = 20.0;
                        }
                        else if (i>1)
                        {//para todas as outras RETIRA OS NUMEROS DA STRING :P
                            Pattern p = Pattern.compile("\\d+");
                            Matcher m = p.matcher(txt6);
                            while(m.find()){
                                preTempera = Double.parseDouble(m.group());
                            }
                        }
                    }
                }

                /*
                System.out.println("Preço Da Base: "+ preBase);
                System.out.println("Preço do Tipo de Vidro 1: "+ preTipoVidro1); //a Tabela() dá return ao preTipoVidro1
                System.out.println("Preço Butiral 1 : "+ preButiral1);
                System.out.println("Preço Caixa: "+ preCaixa);
                System.out.println("Preço Argon: "+ preArgon);
                System.out.println("Preço Tempera: "+ preTempera);
                System.out.println("Preço do Tipo de Vidro 2: "+preTipoVidro2);
                System.out.println("Preço Butiral 2 : "+ preButiral2);
                System.out.println("Area: "+ Area);
                System.out.println("Forma: "+ Forma);
                */

                PreTotalSemPercentagem1 = preBase + preTipoVidro1 + preButiral1 +
                        preCaixa + preArgon +preTempera +
                        preTipoVidro2 + preButiral2;

                PreTotal = PreTotalSemPercentagem1 * (1 + Area) * (1+ Forma);


                System.out.println("Preço Total: "+ Math.round(PreTotal * 100)/100.00);

                //para mostrar o Resultado
                if (FAIL == false)
                {
                    TextView textView = findViewById(R.id.txtResultado);
                    textView.setText(Math.round(PreTotal * 100)/100.00 + " €");
                }
            }
        });
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.txtResultado);
                textView.setText("Total  ");
            }
        });

        //spinnerTipo

        //o proximo comando vai meter o texto da array do xml no spinner
        //adapta a array (chamei-lhe adaptador)
        //preciso de passar o contexto, a array e o layout aparecem
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.PrimeiroVidro,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //layout de como caem
        spinnerTipo.setAdapter(adaptador); //ligo os dois

        //para o spinner reagir ao click quando esta selected
        spinnerTipo.setOnItemSelectedListener(this);

        //Spinner2
        adaptador = ArrayAdapter.createFromResource(this,R.array.Larguras,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adaptador);
        spinner2.setOnItemSelectedListener(this);

        //Spinner3
        adaptador = ArrayAdapter.createFromResource(this,R.array.Butiral,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adaptador);
        spinner3.setOnItemSelectedListener(this);

        //Spinner4
        adaptador = ArrayAdapter.createFromResource(this,R.array.Caixa,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adaptador);
        spinner4.setOnItemSelectedListener(this);

        //Spinner5
        adaptador = ArrayAdapter.createFromResource(this,R.array.Argon,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adaptador);
        spinner5.setOnItemSelectedListener(this);

        //Spinner6
        adaptador = ArrayAdapter.createFromResource(this,R.array.Tempera,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adaptador);
        spinner6.setOnItemSelectedListener(this);

        //Spinner7
        adaptador = ArrayAdapter.createFromResource(this,R.array.PrimeiroVidro,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adaptador);
        spinner7.setOnItemSelectedListener(this);

        //Spinner8
        adaptador = ArrayAdapter.createFromResource(this,R.array.Larguras,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adaptador);
        spinner8.setOnItemSelectedListener(this);

        //Spinner9
        adaptador = ArrayAdapter.createFromResource(this,R.array.Butiral,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adaptador);
        spinner9.setOnItemSelectedListener(this);

        //Spinner10
        adaptador = ArrayAdapter.createFromResource(this,R.array.Area,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(adaptador);
        spinner10.setOnItemSelectedListener(this);

        //Spinner11
        adaptador = ArrayAdapter.createFromResource(this,R.array.Forma,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(adaptador);
        spinner11.setOnItemSelectedListener(this);

    }

    @Override //metodo do item selected
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String texto =  parent.getItemAtPosition(position).toString(); //converto o item na posição numa string
        //AGORA QUE JA TENHO A STRING TEXTO basta mostra-la usando "Toast"
        Toast.makeText(parent.getContext(),texto,Toast.LENGTH_SHORT).show(); //o contexto, a string para ser escreita e a forma (lenght_short)
    }

    @Override //quando nada é selecionado
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
