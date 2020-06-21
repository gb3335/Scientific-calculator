package com.android.calculator;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.calculator.R;

import static android.text.TextUtils.isEmpty;
import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multiply,divide,square,root,percent,equal,dot,pie, fact, log;
    EditText display,result;
    String value1, value2, value3, cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //numbers
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        dot = findViewById(R.id.dot);

        //calculation
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        root=findViewById(R.id.root);
        square=findViewById(R.id.square);
        percent=findViewById(R.id.percent);
        equal=findViewById(R.id.equal);
        //pie=findViewById(R.id.pie);
        log=findViewById(R.id.log);
        //fact=findViewById(R.id.fact);



        //text field
        result=findViewById(R.id.result);
        display=findViewById(R.id.value);
    }


    public void number(View view){
        if(view.getId()==R.id.one){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + one.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + one.getText().toString());

                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.two){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + two.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + two.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.three){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + three.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + three.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.four){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + four.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + four.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.five){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + five.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + five.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.six){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + six.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + six.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.seven){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + seven.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + seven.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.eight){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + eight.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + eight.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.nine){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + nine.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + nine.getText().toString());
                //value1 = display.getText().toString();
            }
        }
        if(view.getId()==R.id.zero){
            if(lastCharRoot()){
                setValueCal();
                display.setText(display.getText().toString() + "X" + zero.getText().toString());
                cal = multiply.getText().toString();
            }else {
                //String num = one.getText().toString();
                display.setText(display.getText().toString() + zero.getText().toString());
                //value1 = display.getText().toString();
            }
        }
    }

    public void setReset(View view){
        display.setText(null);
        result.setText(null);
    }

    public void setBack(View v) {

        String str = display.getText().toString();
        if (str.length() > 1) {
            str = str.substring(0, str.length() - 1);
            display.setText(str);
            result.setText(null);
        } else if (str.length() <= 1) {
            display.setText(null);
            result.setText(null);
        }
    }

    public boolean doubleFun(){
        String lastCah = display.getText().toString().substring(display.getText().toString().length() - 1);
        if(lastCah.equals("+") || lastCah.equals("-") || lastCah.equals("X") || lastCah.equals("%") || lastCah.equals("÷") || lastCah.equals("^") || lastCah.equals(")")){

            return true;
        }
        return false;
    }

    public boolean doubleFu(){
        String lastCah = display.getText().toString().substring(display.getText().toString().length() - 1);
        if(lastCah.equals("+") || lastCah.equals("-") || lastCah.equals("X") || lastCah.equals("%") || lastCah.equals("÷") || lastCah.equals("^") ){

            return true;
        }
        return false;
    }

    public boolean lastDot(){
        String lastCah = display.getText().toString().substring(display.getText().toString().length() - 1);
        if(lastCah.equals(".")){
            return true;
        }
        return false;
    }

    public boolean lastCharRoot(){
        if(display.getText().toString().equals("")){
            return false;
        }else {
            String lastCah = display.getText().toString().substring(display.getText().toString().length() - 1);
            if (lastCah.equals("√")) {
                return true;
            }
            return false;
        }
    }

    public boolean whichFun(){

        if (display.getText().toString().contains("+")) {
            return true;
        }
        if (display.getText().toString().contains("-")) {
            return true;
        }
        if (display.getText().toString().contains("X")) {
            return true;
        }
        if (display.getText().toString().contains("÷")) {
            return true;
        }
        if (display.getText().toString().contains("%")) {
            return true;
        }
        if (display.getText().toString().contains("√")) {
            return true;
        }
        if (display.getText().toString().contains("^")) {
            return true;
        }

        return false;
    }

    public void setCalculation(View view){
        if (view.getId() == R.id.plus) {

            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
            } else {
                //int count = display.getText().toString().length() - display.getText().toString().replaceAll("+", "").length();
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else {
                    if (whichFun()) {
                        setValueCal();
                        display.setText(display.getText().toString() + plus.getText().toString());
                        cal = plus.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = plus.getText().toString();
                        display.setText(display.getText().toString() + plus.getText().toString());
                    }
                }
            }

        }
        if (view.getId() == R.id.minus) {
            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
            } else {
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else {
                    if (whichFun()) {
                        setValueCal();
                        display.setText(display.getText().toString() + minus.getText().toString());
                        cal = minus.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = minus.getText().toString();
                        display.setText(display.getText().toString() + minus.getText().toString());
                    }
                }
            }

        }
        if (view.getId() == R.id.multiply) {
            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
            } else {
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else {
                    if (whichFun()) {
                        setValueCal();
                        display.setText(display.getText().toString() + multiply.getText().toString());
                        cal = multiply.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = multiply.getText().toString();
                        display.setText(display.getText().toString() + multiply.getText().toString());
                    }
                }
            }

        }
        if (view.getId() == R.id.divide) {
            if (display.getText().toString().equals("") || display.getText().toString().equals("0")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
            } else {
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else {
                    if (whichFun()) {
                        setValueCal();
                        display.setText(display.getText().toString() + divide.getText().toString());
                        cal = divide.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = divide.getText().toString();
                        display.setText(display.getText().toString() + divide.getText().toString());
                    }
                }
            }

        }
        if (view.getId() == R.id.percent) {
            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
            } else {
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else {
                    if (whichFun()) {
                        setValueCal();
                        display.setText(display.getText().toString() + percent.getText().toString());
                        cal = percent.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = percent.getText().toString();
                        display.setText(display.getText().toString() + percent.getText().toString());
                    }
                }
            }

        }
        if (view.getId() == R.id.root) {
            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
                result.setText(null);

            }else {
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else {
                    if (whichFun()) {
                        //Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                        //display.setText(null);
                        //result.setText(null);
                        setValueCal();
                        display.setText(display.getText().toString() + root.getText().toString());
                        cal = root.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = root.getText().toString();
                        display.setText(display.getText().toString() + root.getText().toString());
                    }
                }
            }

        }
        if (view.getId() == R.id.square) {
            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                display.setText(null);
            } else {
                if(doubleFun()){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else{
                    if (whichFun()) {
                        setValueCal();
                        display.setText(display.getText().toString() + square.getText().toString());
                        cal = square.getText().toString();
                    } else {
                        value1 = display.getText().toString();
                        cal = square.getText().toString();
                        display.setText(display.getText().toString() + square.getText().toString());
                    }
                }
            }
        }
        if (view.getId() == R.id.log) {

            if (display.getText().toString().equals("")) {
                Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();

            } else {
                if(whichFun()){
                    if(doubleFun()) {
                        Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                    }else if(lastDot()){
                        Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                    }
                }
                value3 = display.getText().toString();
                display.setText("log("+display.getText().toString()+")");
                cal = log.getText().toString();
                //int count = display.getText().toString().length() - display.getText().toString().replaceAll("+", "").length();

            }

        }
    }

    public void setEqual(View view){

        if(isEmpty(display.getText().toString())){
            Toast.makeText(this, "enter an valid expression", Toast.LENGTH_LONG).show();
            //result.setText(display.getText().toString());
        }else if(doubleFu()) {
            Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
        }else if(lastDot()) {
            Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
        }else{
            String str = display.getText().toString();
            if (str.contains(cal)) {
                //String str = display.getText().toString();

                //cal = plus.getText().toString();
                if (cal.equals("+")) {
                    value1 = str.substring(0, str.indexOf("+"));
                    value2 = str.substring(str.indexOf("+")+1, str.length());
                    double total = Double.parseDouble(value1) + Double.parseDouble(value2);
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);
                }
                if (cal.equals("-")) {
                    value1 = str.substring(0, str.indexOf("-"));
                    value2 = str.substring(str.indexOf("-")+1, str.length());
                    double total = Double.parseDouble(value1) - Double.parseDouble(value2);
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);
                }
                if (cal.equals("X")) {
                    value1 = str.substring(0, str.indexOf("X"));
                    value2 = str.substring(str.indexOf("X")+1, str.length());
                    double total = Double.parseDouble(value1) * Double.parseDouble(value2);
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);
                }
                if (cal.equals("÷")) {
                    value1 = str.substring(0, str.indexOf("÷"));
                    value2 = str.substring(str.indexOf("÷")+1, str.length());
                    double total = Double.parseDouble(value1) / Double.parseDouble(value2);
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);
                }
                if (cal.equals("%")) {
                    value1 = str.substring(0, str.indexOf("%"));
                    value2 = str.substring(str.indexOf("%")+1, str.length());
                    double total = (Double.parseDouble(value2) * Double.parseDouble(value1)) / 100;
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);
                }
                if (cal.equals("^")) {
                    value1 = str.substring(0, str.indexOf("^"));
                    value2 = str.substring(str.indexOf("^")+1, str.length());
                    double total = Math.pow(Double.parseDouble(value1), Double.parseDouble(value2));
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);
                }
                if (cal.equals("√")) {
                    value1 = str.substring(0, str.indexOf("√"));
                    //value2 = str.substring(str.indexOf("√")+1, str.length());
                    double total = Math.sqrt(Double.parseDouble(value1));
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);

                }
                if (cal.equals("ł")) {
                    //value1 = str.substring(4, str.indexOf(")"));
                    //value2 = str.substring(str.indexOf("√")+1, str.length());
                    double total = Math.log(Double.parseDouble(value3));
                    String v = "" + total;
                    result.setText(v);
                    display.setText(v);

                }

            }else {

            }
        }
    }

    public void setValueCal(){
        if(display.getText().toString().contains("+")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("+"));
            value2 = str.substring(str.indexOf("+")+1, str.length());
            cal = plus.getText().toString();
            //totaling
            double total = Double.parseDouble(value1) + Double.parseDouble(value2);
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("-")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("-"));
            value2 = str.substring(str.indexOf("-")+1, str.length());
            cal = minus.getText().toString();
            //totaling
            double total = Double.parseDouble(value1) - Double.parseDouble(value2);
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("X")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("X"));
            value2 = str.substring(str.indexOf("X")+1, str.length());
            cal = multiply.getText().toString();
            //totaling
            double total = Double.parseDouble(value1) * Double.parseDouble(value2);
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("÷")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("÷"));
            value2 = str.substring(str.indexOf("÷")+1, str.length());
            cal = divide.getText().toString();
            //totaling
            double total = Double.parseDouble(value1) / Double.parseDouble(value2);
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("%")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("%"));
            value2 = str.substring(str.indexOf("%")+1, str.length());
            cal = percent.getText().toString();
            //totaling
            double total = (Double.parseDouble(value2) * Double.parseDouble(value1)) / 100;
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("√")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("√"));
            //value2 = str.substring(str.indexOf("√")+1, str.length());
            cal = root.getText().toString();
            //totaling
            double total = Math.sqrt(Double.parseDouble(value1));
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("^")){
            String str = display.getText().toString();
            value1 = str.substring(0, str.indexOf("^"));
            value2 = str.substring(str.indexOf("^")+1, str.length());
            cal = square.getText().toString();
            //totaling
            double total = Math.pow(Double.parseDouble(value1), Double.parseDouble(value2));
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
        if(display.getText().toString().contains("ł")){
            //String str = display.getText().toString();
            //value1 = str.substring(0, str.indexOf("ł"));
            //value2 = str.substring(str.indexOf("^")+1, str.length());
            cal = log.getText().toString();
            //totaling
            double total = Math.log(Double.parseDouble(value3));
            String v = "" + total;
            result.setText(v);
            //display.setText(v);
            display.setText(v);
        }
    }

    public void setDot(View view){
        //char c = "g";
        //String string = display.getText().toString();
        //int ct = string.length() - string.replaceAll(".","").length();
        if(display.getText().toString().equals("")){
            display.setText("0.");
        }else {
            if(whichFun()){
                if (doubleFun()) {
                    display.setText(display.getText().toString() + "0.");
                } else if (lastCharRoot()) {
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                }else if(lastDot()){
                    Toast.makeText(this, "invalid condition", Toast.LENGTH_LONG).show();
                }else if(countChar(display.getText().toString(), '.')>=2){
                    Toast.makeText(this, "invalid expression", Toast.LENGTH_LONG).show();
                } else {
                    display.setText(display.getText().toString() + dot.getText().toString());
                }
            }else {
                if(display.getText().toString().contains(".")) {
                    Toast.makeText(this, "only one dot allow", Toast.LENGTH_LONG).show();
                }else {
                    display.setText(display.getText().toString() + dot.getText().toString());
                }
            }
        }
    }


    public int countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }

        return count;
    }

}
