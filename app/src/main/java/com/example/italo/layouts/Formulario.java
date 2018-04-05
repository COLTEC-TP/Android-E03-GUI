//package com.example.italo.layouts;
//
//import android.app.Activity;
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.support.v7.app.AlertDialog;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import br.ufmg.coltec.tp.e03_adapters.R;
//
//public class Formulario extends Activity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_formulario);
//
//        Button Bformulario = (Button) findViewById(R.id.Bformulario);
//
//        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
//
//        Bformulario.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//// Parâmetros para o Dialog
//                alertBuilder.setTitle(getResources().getText(R.string.aviso));
//                alertBuilder.setMessage(getResources().getText(R.string.desejo));
//
//// Opção positiva
//                alertBuilder.setPositiveButton(getResources().getText(R.string.sim), new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(getBaseContext(), getResources().getText(R.string.enviado),Toast.LENGTH_LONG).show();
//                        finish();
//                    }
//                });
//
//// Opção negativa
//                alertBuilder.setNegativeButton(getResources().getText(R.string.cancelar), new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(getBaseContext(),getResources().getText(R.string.cancelado), Toast.LENGTH_LONG).show();
//                        finish();
//                    }
//                });
//
//// Print
//                AlertDialog dialog = alertBuilder.create();
//                dialog.show();
//
//            }
//        });
//    }
//}
