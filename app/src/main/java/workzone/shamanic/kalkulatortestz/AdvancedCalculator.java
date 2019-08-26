package workzone.shamanic.kalkulatortestz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class AdvancedCalculator extends AppCompatActivity
{
    private String newEquation = "0";
    private String oldEquation = "";
    private String resultEquation = "";

    private double firstNumber;
    private double secondNumber;
    private double resultNumber;
    private boolean resultFlag = false;
    private boolean addFlag = false;
    private boolean substractFlag = false;
    private boolean multiplyFlag = false;
    private boolean divideFlag = false;
    private boolean powerFlag = false;
    private boolean sqrtFlag = false;
    private boolean fractorFlag = false;
    private boolean logarithmFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calculator);
        this.setTitle("Tryb Zaawansowany");
        TextView oldEquationScreen = (TextView)findViewById(R.id.oldEquationScreen);
        TextView newEquationScreen = (TextView)findViewById(R.id.newEquationScreen);
        oldEquationScreen.setText(oldEquation);
        newEquationScreen.setText(newEquation);
    }

    public void backToMainMenu(View view)
    {
        Intent intent = new Intent(this, Menu.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void equationScreen(View view)
    {
        TextView oldEquationScreen = (TextView)findViewById(R.id.oldEquationScreen);
        TextView newEquationScreen = (TextView)findViewById(R.id.newEquationScreen);
        if(view.getId() == R.id.reverseButton)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            if(newEquation.equals("0"))
            {
            }
            else
            {
                if(newEquation.charAt(0)=='-')
                {
                    newEquation = newEquation.substring(1);
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquation = '-' + newEquation;
                    newEquationScreen.setText(newEquation);
                }

            }
        }
        if(view.getId() == R.id.clearButton)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquationScreen.setText("0");
            oldEquationScreen.setText("");
        }
        if(view.getId() == R.id.numberOne)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "1";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "1";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "1");
                }
            }
        }
        if(view.getId() == R.id.numberTwo)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "2";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "2";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "2");
                }
            }
        }
        if(view.getId() == R.id.numberThree)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "3";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "3";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "3");
                }
            }
        }
        if(view.getId() == R.id.numberFour)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "4";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "4";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "4");
                }
            }
        }
        if(view.getId() == R.id.numberFive)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "5";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "5";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "5");
                }
            }
        }
        if(view.getId() == R.id.numberSix)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "6";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "6";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "6");
                }
            }
        }
        if(view.getId() == R.id.numberSeven)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "7";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "7";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "7");
                }
            }
        }
        if(view.getId() == R.id.numberEight)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "8";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "8";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "8");
                }
            }
        }
        if(view.getId() == R.id.numberNine)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "9";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "9";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "9");
                }
            }
        }
        if(view.getId() == R.id.numberZero)
        {
            newEquation = newEquationScreen.getText().toString();
            if(resultFlag == true)
            {
                resultFlag = false;
                newEquation = "0";
                newEquationScreen.setText(newEquation);
            }
            else
            {
                if(Objects.equals(newEquation,"0"))
                {
                    newEquation = "0";
                    newEquationScreen.setText(newEquation);
                }
                else
                {
                    newEquationScreen.setText(newEquation + "0");
                }
            }
        }
        if(view.getId() == R.id.dotSymbol)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            if(!newEquation.contains("."))
            {
                newEquationScreen.setText(newEquation + ".");
            }
        }
        if(view.getId() == R.id.backspaceButton)
        {
            newEquation = newEquationScreen.getText().toString();
            if(newEquation.length()!=0)
            {
                if(newEquation.length()-1==0)
                {
                    newEquationScreen.setText("0");

                }
                else
                {
                    newEquationScreen.setText(newEquation.substring(0,newEquation.length()-1));
                }
            }
        }
        if(view.getId() == R.id.addSymbol)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            oldEquation = oldEquationScreen.getText().toString();
            if(Objects.equals(oldEquation,""))
            {
                if(newEquation.length()!=0)
                {
                    firstNumber = Double.parseDouble(newEquation);
                    if(newEquation.charAt(newEquation.length()-1)=='.')
                    {
                        oldEquationScreen.setText(newEquation + "0+");
                        newEquationScreen.setText("");
                        addFlag = true;
                    }
                    else
                    {
                        oldEquationScreen.setText(newEquation + "+");
                        newEquationScreen.setText("");
                        addFlag = true;
                    }
                }
            }
            else
            {
                if(newEquation.length()!=0)
                {
                    addFlag = true;
                    firstNumber = Double.parseDouble(newEquation);
                    secondNumber = Double.parseDouble(oldEquation.substring(0,oldEquation.length()-1));
                    if(substractFlag == true || multiplyFlag == true || divideFlag == true || powerFlag == true)
                    {
                        if(substractFlag == true)
                        {
                            resultNumber = secondNumber - firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "+");
                            newEquationScreen.setText("");
                            addFlag = true;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }
                        if(multiplyFlag == true)
                        {
                            resultNumber = secondNumber * firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "+");
                            newEquationScreen.setText("");
                            addFlag = true;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }
                        if(divideFlag == true)
                        {
                            if(secondNumber!=0)
                            {
                                resultNumber = secondNumber / firstNumber;
                                resultEquation = Double.toString(resultNumber);
                                System.out.println(resultEquation);
                                oldEquationScreen.setText(resultEquation+ "+");
                                newEquationScreen.setText("");
                                addFlag = true;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                            else
                            {
                                oldEquationScreen.setText("");
                                newEquationScreen.setText("0");
                                Context context = getApplicationContext();
                                CharSequence text = "Nie wolno dzielić przez zero!";
                                int duration = Toast.LENGTH_LONG;
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                                addFlag = false;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                            if(powerFlag == true)
                            {
                                resultNumber = Math.pow(secondNumber, firstNumber);
                                resultEquation = Double.toString(resultNumber);
                                System.out.println(resultEquation);
                                oldEquationScreen.setText(resultEquation+ "+");
                                newEquationScreen.setText("");
                                addFlag = true;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                        }

                    }
                    else
                    {
                        resultNumber = secondNumber + firstNumber;
                        resultEquation = Double.toString(resultNumber);
                        System.out.println(resultEquation);
                        oldEquationScreen.setText(resultEquation+ "+");
                        newEquationScreen.setText("");
                        addFlag = true;
                        substractFlag = false;
                        multiplyFlag = false;
                        divideFlag = false;
                        powerFlag = false;
                    }
                }
            }
        }
        if(view.getId() == R.id.substractSymbol)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            oldEquation = oldEquationScreen.getText().toString();
            if(Objects.equals(oldEquation,""))
            {
                if(newEquation.length()!=0)
                {
                    firstNumber = Double.parseDouble(newEquation);
                    if(newEquation.charAt(newEquation.length()-1)=='.')
                    {
                        oldEquationScreen.setText(newEquation + "0-");
                        newEquationScreen.setText("");
                        substractFlag = true;
                    }
                    else
                    {
                        oldEquationScreen.setText(newEquation + "-");
                        newEquationScreen.setText("");
                        substractFlag = true;
                    }
                }
            }
            else
            {
                if(newEquation.length()!=0)
                {
                    substractFlag = true;
                    firstNumber = Double.parseDouble(newEquation);
                    secondNumber = Double.parseDouble(oldEquation.substring(0,oldEquation.length()-1));
                    if(addFlag == true || multiplyFlag == true || divideFlag == true || powerFlag == true)
                    {
                        if(addFlag == true)
                        {
                            resultNumber = secondNumber + firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "-");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = true;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }
                        if(multiplyFlag == true)
                        {
                            resultNumber = secondNumber * firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "-");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = true;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }
                        if(divideFlag == true)
                        {
                            if(secondNumber!=0)
                            {
                                resultNumber = secondNumber / firstNumber;
                                resultEquation = Double.toString(resultNumber);
                                System.out.println(resultEquation);
                                oldEquationScreen.setText(resultEquation+ "-");
                                newEquationScreen.setText("");
                                addFlag = false;
                                substractFlag = true;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                            else
                            {
                                oldEquationScreen.setText("");
                                newEquationScreen.setText("0");
                                Context context = getApplicationContext();
                                CharSequence text = "Nie wolno dzielić przez zero!";
                                int duration = Toast.LENGTH_LONG;
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                                addFlag = false;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                        }

                        if(powerFlag == true)
                        {
                            resultNumber = Math.pow(secondNumber, firstNumber);
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "-");
                            newEquationScreen.setText("");
                            addFlag = true;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }

                    }
                    else
                    {
                        resultNumber = secondNumber - firstNumber;
                        resultEquation = Double.toString(resultNumber);
                        System.out.println(resultEquation);
                        oldEquationScreen.setText(resultEquation+ "-");
                        newEquationScreen.setText("");
                        addFlag = false;
                        substractFlag = true;
                        multiplyFlag = false;
                        divideFlag = false;
                        powerFlag = false;
                    }
                }
            }
        }
        if(view.getId() == R.id.multiplySymbol)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            oldEquation = oldEquationScreen.getText().toString();
            if(Objects.equals(oldEquation,""))
            {
                if(newEquation.length()!=0)
                {
                    firstNumber = Double.parseDouble(newEquation);
                    if(newEquation.charAt(newEquation.length()-1)=='.')
                    {
                        oldEquationScreen.setText(newEquation + "0*");
                        newEquationScreen.setText("");
                        multiplyFlag = true;
                    }
                    else
                    {
                        oldEquationScreen.setText(newEquation + "*");
                        newEquationScreen.setText("");
                        multiplyFlag = true;
                    }
                }
            }
            else
            {
                if(newEquation.length()!=0)
                {
                    multiplyFlag = true;
                    firstNumber = Double.parseDouble(newEquation);
                    secondNumber = Double.parseDouble(oldEquation.substring(0,oldEquation.length()-1));
                    if(substractFlag == true || addFlag == true || divideFlag == true || powerFlag == true)
                    {
                        if(substractFlag == true)
                        {
                            resultNumber = secondNumber - firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "*");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = true;
                            divideFlag = false;
                            powerFlag = false;
                        }
                        if(addFlag == true)
                        {
                            resultNumber = secondNumber + firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "*");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = true;
                            divideFlag = false;
                            powerFlag = false;
                        }
                        if(divideFlag == true)
                        {
                            if(secondNumber!=0)
                            {
                                resultNumber = secondNumber / firstNumber;
                                resultEquation = Double.toString(resultNumber);
                                System.out.println(resultEquation);
                                oldEquationScreen.setText(resultEquation+ "*");
                                newEquationScreen.setText("");
                                addFlag = false;
                                substractFlag = false;
                                multiplyFlag = true;
                                divideFlag = false;
                                powerFlag = false;
                            }
                            else
                            {
                                oldEquationScreen.setText("");
                                newEquationScreen.setText("0");
                                Context context = getApplicationContext();
                                CharSequence text = "Nie wolno dzielić przez zero!";
                                int duration = Toast.LENGTH_LONG;
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                                addFlag = false;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                        }

                        if(powerFlag == true)
                        {
                            resultNumber = secondNumber * firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "*");
                            newEquationScreen.setText("");
                            addFlag = true;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }

                    }
                    else
                    {
                        resultNumber = secondNumber * firstNumber;
                        resultEquation = Double.toString(resultNumber);
                        System.out.println(resultEquation);
                        oldEquationScreen.setText(resultEquation+ "*");
                        newEquationScreen.setText("");
                        addFlag = false;
                        substractFlag = false;
                        multiplyFlag = true;
                        divideFlag = false;
                        powerFlag = false;
                    }
                }
            }
        }
        if(view.getId() == R.id.divideSymbol)

        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            oldEquation = oldEquationScreen.getText().toString();
            if(Objects.equals(oldEquation,""))
            {
                if(newEquation.length()!=0)
                {
                    firstNumber = Double.parseDouble(newEquation);
                    if(newEquation.charAt(newEquation.length()-1)=='.')
                    {
                        oldEquationScreen.setText(newEquation + "0/");
                        newEquationScreen.setText("");
                        divideFlag = true;
                    }
                    else
                    {
                        oldEquationScreen.setText(newEquation + "/");
                        newEquationScreen.setText("");
                        divideFlag = true;
                    }
                }
            }
            else
            {
                if(newEquation.length()!=0)
                {
                    multiplyFlag = true;
                    firstNumber = Double.parseDouble(newEquation);
                    secondNumber = Double.parseDouble(oldEquation.substring(0,oldEquation.length()-1));

                    if(substractFlag == true || addFlag == true || multiplyFlag == true || powerFlag == true)
                    {
                        if(substractFlag == true)
                        {
                            resultNumber = secondNumber - firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "/");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = true;
                            powerFlag = false;
                        }
                        if(addFlag == true)
                        {
                            resultNumber = secondNumber + firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "/");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = true;
                            powerFlag = false;
                        }
                        if(multiplyFlag == true)
                        {
                            resultNumber = secondNumber * firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "/");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = true;
                            powerFlag = false;
                        }

                    }
                    else
                    {
                        if(secondNumber!=0)
                        {
                            resultNumber = secondNumber / firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "/");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = true;
                            powerFlag = false;
                        }
                        else
                        {
                            oldEquationScreen.setText("");
                            newEquationScreen.setText("0");
                            Context context = getApplicationContext();
                            CharSequence text = "Nie wolno dzielić przez zero!";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = false;
                        }
                    }
                }
            }
        }

        if(view.getId() == R.id.powerSymbol)
        {
            if(resultFlag == true)
            {
                resultFlag = false;
            }
            newEquation = newEquationScreen.getText().toString();
            oldEquation = oldEquationScreen.getText().toString();
            if(Objects.equals(oldEquation,""))
            {
                if(newEquation.length()!=0)
                {
                    firstNumber = Double.parseDouble(newEquation);
                    if(newEquation.charAt(newEquation.length()-1)=='.')
                    {
                        oldEquationScreen.setText(newEquation + "0^");
                        newEquationScreen.setText("");
                        powerFlag = true;
                    }
                    else
                    {
                        oldEquationScreen.setText(newEquation + "^");
                        newEquationScreen.setText("");
                        powerFlag = true;
                    }
                }
            }
            else
            {
                if(newEquation.length()!=0)
                {
                    powerFlag = true;
                    firstNumber = Double.parseDouble(newEquation);
                    secondNumber = Double.parseDouble(oldEquation.substring(0,oldEquation.length()-1));
                    if(substractFlag == true || addFlag == true || divideFlag == true || multiplyFlag == true)
                    {
                        if(substractFlag == true)
                        {
                            resultNumber = secondNumber - firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "^");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = true;
                        }
                        if(addFlag == true)
                        {
                            resultNumber = secondNumber + firstNumber;
                            resultEquation = Double.toString(resultNumber);
                            System.out.println(resultEquation);
                            oldEquationScreen.setText(resultEquation+ "^");
                            newEquationScreen.setText("");
                            addFlag = false;
                            substractFlag = false;
                            multiplyFlag = false;
                            divideFlag = false;
                            powerFlag = true;
                            sqrtFlag = false;
                        }
                        if(divideFlag == true)
                        {
                            if(secondNumber!=0)
                            {
                                resultNumber = secondNumber / firstNumber;
                                resultEquation = Double.toString(resultNumber);
                                System.out.println(resultEquation);
                                oldEquationScreen.setText(resultEquation+ "^");
                                newEquationScreen.setText("");
                                addFlag = false;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = true;
                            }
                            else
                            {
                                oldEquationScreen.setText("");
                                newEquationScreen.setText("0");
                                Context context = getApplicationContext();
                                CharSequence text = "Nie wolno dzielić przez zero!";
                                int duration = Toast.LENGTH_LONG;
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                                addFlag = false;
                                substractFlag = false;
                                multiplyFlag = false;
                                divideFlag = false;
                                powerFlag = false;
                            }
                        }

                    }
                    else
                    {
                        resultNumber = Math.pow(secondNumber,firstNumber);
                        resultEquation = Double.toString(resultNumber);
                        System.out.println(resultEquation);
                        oldEquationScreen.setText(resultEquation+ "^");
                        newEquationScreen.setText("");
                        addFlag = false;
                        substractFlag = false;
                        multiplyFlag = false;
                        divideFlag = false;
                        powerFlag = true;
                    }
                }
            }
        }

        if(view.getId() == R.id.sqrtSymbol)
        {
            newEquation = newEquationScreen.getText().toString();
            if(newEquation.length()!=0)
            {
                firstNumber = Double.parseDouble(newEquation);
                firstNumber = Math.sqrt(firstNumber);
                oldEquationScreen.setText("");
                newEquationScreen.setText("" + firstNumber);
            }
        }

        if(view.getId() == R.id.fractorSymbol)
        {
            newEquation = newEquationScreen.getText().toString();
            if(newEquation.length()!=0)
            {
                firstNumber = Double.parseDouble(newEquation);
                if(firstNumber!=0)
                {
                    firstNumber = 1 / firstNumber;
                    oldEquationScreen.setText("");
                    newEquationScreen.setText("" + firstNumber);
                }
                else
                {
                    oldEquationScreen.setText("");
                    newEquationScreen.setText("0");

                    Context context = getApplicationContext();
                    CharSequence text = "Nie wolno dzielić przez zero!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        }

        if(view.getId() == R.id.logarithmSymbol)
        {
            newEquation = newEquationScreen.getText().toString();
            if(newEquation.length()!=0)
            {
                firstNumber = Double.parseDouble(newEquation);
                if(firstNumber!=0)
                {
                    firstNumber = Math.log(firstNumber);
                    oldEquationScreen.setText("");
                    newEquationScreen.setText("" + firstNumber);
                }
                else
                {
                    oldEquationScreen.setText("");
                    newEquationScreen.setText("0");

                    Context context = getApplicationContext();
                    CharSequence text = "Nieprawidłowe dane!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        }

        if(view.getId() == R.id.resultSymbol)
        {
            oldEquation = oldEquationScreen.getText().toString();
            newEquation = newEquationScreen.getText().toString();
            char whatSymbol;
            if(newEquation.length() != 0 && oldEquation.length() != 0)
            {
                whatSymbol = oldEquation.charAt(oldEquation.length() - 1);
                oldEquation = oldEquation.substring(0,oldEquation.length() - 1);
                firstNumber = Double.parseDouble(newEquation);
                secondNumber = Double.parseDouble(oldEquation);
                if(whatSymbol=='+')
                {
                    resultNumber = secondNumber + firstNumber;
                    resultFlag = true;
                    divideFlag = false;
                    multiplyFlag = false;
                    substractFlag = false;
                    addFlag = false;
                }
                if(whatSymbol=='-')
                {
                    resultNumber = secondNumber - firstNumber;
                    resultFlag = true;
                    divideFlag = false;
                    multiplyFlag = false;
                    substractFlag = false;
                    addFlag = false;
                }
                if(whatSymbol=='*')
                {
                    resultNumber = secondNumber * firstNumber;
                    resultFlag = true;
                    divideFlag = false;
                    multiplyFlag = false;
                    substractFlag = false;
                    addFlag = false;
                }
                newEquation = Double.toString(resultNumber);
                oldEquation = "" + whatSymbol;
                oldEquationScreen.setText("");
                newEquationScreen.setText(newEquation);
                if(whatSymbol=='/')
                {
                    if(secondNumber!=0)
                    {
                        resultNumber = secondNumber / firstNumber;
                        newEquation = Double.toString(resultNumber);
                        oldEquation = "" + whatSymbol;
                        oldEquationScreen.setText("");
                        newEquationScreen.setText(newEquation);
                        resultFlag = true;
                        divideFlag = false;
                        multiplyFlag = false;
                        substractFlag = false;
                        addFlag = false;
                    }
                    else
                    {
                        oldEquationScreen.setText("");
                        newEquationScreen.setText("0");

                        Context context = getApplicationContext();
                        CharSequence text = "Nie wolno dzielić przez zero!";
                        int duration = Toast.LENGTH_LONG;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        resultFlag = false;
                        divideFlag = false;
                        multiplyFlag = false;
                        substractFlag = false;
                        addFlag = false;
                    }

                }
            }
        }
    }
}