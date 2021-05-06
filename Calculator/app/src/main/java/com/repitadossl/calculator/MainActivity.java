package com.repitadossl.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected StringBuffer op1 = new StringBuffer();
    protected StringBuffer op2 = new StringBuffer();
    protected int cue = 0;
    protected String op = new String();
    protected TextView pnl1;
    protected TextView pnl2;
    protected TextView pnlOp;

    public static final String EXTRA_MESSAGE = "com.repitadossl.mainactivity.MESSAGE";

    protected float resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pnl1 = (TextView) findViewById(R.id.edittextop1);
        pnl2 = (TextView) findViewById(R.id.edittextop2);
        pnlOp = (TextView) findViewById(R.id.operador);


    }

    public void mostrar1(){
        this.pnl1.setText(this.op1.toString());
    }

    public void mostrar2(){
        this.pnl2.setText(this.op2.toString());
    }

    public void mostrarOp(){this.pnlOp.setText((this.op.toString()));}

    /**
     *
     * @param view
     */
    public void uno(View view){
        if (cue == 0){
            op1.append("1");
            mostrar1();

        }else{
            op2.append("1");
            mostrar2();

        }
    }

    /**
     *
     * @param view
     */
    public void dos(View view){
        if (cue == 0){
            op1.append("2");
            mostrar1();

        }else{
            op2.append("2");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void tres(View view){
        if (cue == 0){
            op1.append("3");
            mostrar1();
        }else {
            op2.append("3");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void cuatro(View view){
        if (cue == 0){
            op1.append("4");
            mostrar1();
        }else{
            op2.append("4");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void cinco(View view){
        if (cue == 0){
            op1.append("5");
            mostrar1();
        }else{
            op2.append("5");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void seis(View view){
        if (cue == 0){
            op1.append("6");
            mostrar1();
        }else{
            op2.append("6");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void siete(View view){
        if (cue == 0){
            op1.append("7");
            mostrar1();
        }else{
            op2.append("7");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void ocho(View view){
        if (cue == 0){
            op1.append("8");
            mostrar1();
        }else{
            op2.append("8");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void nueve(View view){
        if (cue == 0){
            op1.append("9");
            mostrar1();
        }else{
            op2.append("9");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void cero(View view){
        if (cue == 0){
            op1.append("0");
            mostrar1();
        }else{
            op2.append("0");
            mostrar2();
        }
    }

    /**
     *
     * @param view
     */
    public void punto(View view){
        if (cue == 0){
            op1.append(".");
            mostrar1();
        }else{
            op2.append(".");
            mostrar2();
        }
    }

    public void sumar(View view){
        float f = Float.parseFloat(op1.toString());
        resultado += f;
        cue = 1;
        op = "+";
        mostrarOp();
    }

    public void restar(View view){
        float f = Float.parseFloat(op1.toString());
        resultado += f;
        cue = 2;
        op = "-";
        mostrarOp();
    }

    public void multiplicar(View view){
        float f = Float.parseFloat(op1.toString());
        resultado += f;
        cue = 3;
        op = "*";
        mostrarOp();
    }

    public void dividir(View view){
        float f = Float.parseFloat(op1.toString());
        resultado += f;
        cue = 4;
        op = "/";
        mostrarOp();
    }

    public void igual(View view){
        switch (cue) {
            case 1://sumar
                float f = Float.parseFloat(op2.toString());
                resultado += f;
                break;
            case 2://restar
                float f1 = Float.parseFloat(op2.toString());
                resultado -= f1;
                break;
            case 3://multiplicar
                float f2 = Float.parseFloat(op2.toString());
                resultado = resultado * f2;
                break;
            case 4://dividir
                float f3 = Float.parseFloat(op2.toString());
                resultado = resultado / f3;
                break;
        }

        Intent intent = new Intent(this,MainActivity2.class);
        String message ="El resultado es : " + resultado;
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

        pnl1.setText("");
        pnl2.setText("");
        pnlOp.setText("");

        cue = 0;
        op = new String();
        op1 = new StringBuffer();
        op2 = new StringBuffer();
        resultado = 0;
    }

}