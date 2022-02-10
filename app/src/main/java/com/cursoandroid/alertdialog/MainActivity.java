package com.cursoandroid.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

            //Instancia AlertDialog

        AlertDialog.Builder dialog =new AlertDialog.Builder( this );

            //configurar titulo e mensagem

        dialog.setTitle("Titulo da dialog");
        dialog.setMessage("Mensagem da dialog");

            //configurar cancelamento

        dialog.setCancelable(false);

            //configurar icone

        dialog.setIcon( android.R.drawable.ic_btn_speak_now );

            //configura acoes para sim e não

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(
                       getApplicationContext(),
                       "Execultar ação ao clicar no botão sim",
                       Toast.LENGTH_SHORT
                ).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Execultar ação ao clicar no botão não",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

            //criar e exibir AlertDialog

        dialog.create();
        dialog.show();
    }

}