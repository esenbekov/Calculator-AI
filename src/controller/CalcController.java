package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import java.lang.StringBuilder;

/**
 * created by eseisl on 08.10.2020
 */

public class CalcController {
    //Private data members - All buttons and the label (Everything FXML)
    @FXML private GridPane grid;
    @FXML private Button ac;
    @FXML private Button negative;
    @FXML private Button divide;
    @FXML private Button percent;
    @FXML private Button minus;
    @FXML private Button plus;
    @FXML private Button equal;
    @FXML private Button dot;
    @FXML private Button nine;
    @FXML private Button eight;
    @FXML private Button seven;
    @FXML private Button six;
    @FXML private Button five;
    @FXML private Button four;
    @FXML private Button three;
    @FXML private Button two;
    @FXML private Button one;
    @FXML private Button zero;
    @FXML private Button multiply;
    @FXML private Label result;

    //Private data members - Everything else
    String firstNumber = new String();
    String secondNumber = new String();
    boolean isFirst = true;
    String operate;

    //Public Methods
    //Initialize method - called automatically and sets action event listeners
    public void initialize()
    {
        setActionListeners();
        //calcGrowth();
    }

    //Action event listeners
    public void actionPerformed(ActionEvent e)
    {
        Button btn = new Button();
        btn = (Button) e.getSource();

        if (isFirst)
        {
            firstNumber += btn.getText();
        }
        else
        {
            secondNumber += btn.getText();
        }

        if (isFirst)
        {
            result.setText(firstNumber);
        }
        else
        {
            result.setText(secondNumber);
        }
    }

    public void addit(ActionEvent e)
    {
        if (secondNumber.equals(""))
        {
            isFirst = false;

            operate = "+";
        }
        else
        {
            if(operate.equals(""))
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                finish = first + second;

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
            }
            else
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                if (operate.equals("+"))
                {
                    finish = first + second;
                }
                else if (operate.equals("-"))
                {
                    finish = first - second;
                }
                else if (operate.equals("*"))
                {
                    finish = first * second;
                }
                else
                {
                    finish = first / second;
                }

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
                operate = "+";
            }
        }
    }

    public void subtract(ActionEvent e)
    {
        if (secondNumber.equals(""))
        {
            isFirst = false;

            operate = "-";
        }
        else
        {
            if (operate.equals(""))
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                finish = first - second;

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
            }
            else
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                if (operate.equals("+"))
                {
                    finish = first + second;
                }
                else if (operate.equals("-"))
                {
                    finish = first - second;
                }
                else if (operate.equals("*"))
                {
                    finish = first * second;
                }
                else
                {
                    finish = first / second;
                }

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
                operate = "-";
            }
        }
    }

    public void times(ActionEvent e)
    {
        if (secondNumber.equals(""))
        {
            isFirst = false;

            operate = "*";
        }
        else
        {
            if (operate.equals(""))
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                finish = first * second;

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
            }
            else
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                if (operate.equals("+"))
                {
                    finish = first + second;
                }
                else if (operate.equals("-"))
                {
                    finish = first - second;
                }
                else if (operate.equals("*"))
                {
                    finish = first * second;
                }
                else
                {
                    finish = first / second;
                }

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
                operate = "*";
            }
        }
    }

    public void div(ActionEvent e)
    {
        if (secondNumber.equals(""))
        {
            isFirst = false;

            operate = "/";
        }
        else
        {
            if(operate.equals(""))
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                finish = first / second;

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
            }
            else
            {
                double first = Double.parseDouble(firstNumber);
                double second = Double.parseDouble(secondNumber);
                Double finish = 0.0;
                String finishString = "";

                if (operate.equals("+"))
                {
                    finish = first + second;
                }
                else if (operate.equals("-"))
                {
                    finish = first - second;
                }
                else if (operate.equals("*"))
                {
                    finish = first * second;
                }
                else
                {
                    finish = first / second;
                }

                finishString = finish.toString();
                result.setText(finishString);

                firstNumber = finishString;
                isFirst = false;
                secondNumber = "";
                operate = "/";
            }
        }
    }

    public void clear(ActionEvent e)
    {
        isFirst = true;
        firstNumber = "";
        secondNumber = "";
        result.setText("0");
    }

    public void per(ActionEvent e)
    {
        if (isFirst)
        {
            Double first = Double.parseDouble(firstNumber);
            first *= .01;
            firstNumber = first.toString();
            result.setText(firstNumber);
        }
        else
        {
            Double second = Double.parseDouble(secondNumber);
            second *= .01;
            secondNumber = second.toString();
            result.setText(secondNumber);
        }
    }

    public void neg(ActionEvent e)
    {
        if (isFirst)
        {
            StringBuilder sb = new StringBuilder(firstNumber);
            sb.insert(0, '-');
            firstNumber = sb.toString();
            result.setText(firstNumber);
        }
        else
        {
            StringBuilder sb = new StringBuilder(secondNumber);
            sb.insert(0, '-');
            secondNumber = sb.toString();
            result.setText(firstNumber);
        }
    }

    public void period(ActionEvent e)
    {
        if (isFirst)
        {
            firstNumber += ".";
        }
        else
        {
            secondNumber += ".";
        }
    }

    public void equals(ActionEvent e)
    {
        if (isFirst)
        {
            result.setText(firstNumber);
        }
        else
        {
            double first = Double.parseDouble(firstNumber);
            double second = Double.parseDouble(secondNumber);
            Double finish = 0.0;
            String finishString = "";

            if (operate.equals("+"))
            {
                finish = first + second;
            }
            else if (operate.equals("-"))
            {
                finish = first - second;
            }
            else if (operate.equals("*"))
            {
                finish = first * second;
            }
            else
            {
                finish = first / second;
            }

            finishString = finish.toString();
            result.setText(finishString);

            firstNumber = finishString;
            isFirst = false;
            secondNumber = "";
            operate = "";
        }
    }


    //Sets all action event listeners for all buttons
    public void setActionListeners()
    {
        nine.setOnAction(e -> {
            actionPerformed(e);
        });

        eight.setOnAction(e -> {
            actionPerformed(e);
        });

        seven.setOnAction(e -> {
            actionPerformed(e);
        });

        six.setOnAction(e -> {
            actionPerformed(e);
        });

        five.setOnAction(e -> {
            actionPerformed(e);
        });

        four.setOnAction(e -> {
            actionPerformed(e);
        });

        three.setOnAction(e -> {
            actionPerformed(e);
        });

        two.setOnAction(e -> {
            actionPerformed(e);
        });

        one.setOnAction(e -> {
            actionPerformed(e);
        });

        zero.setOnAction(e -> {
            actionPerformed(e);
        });

        minus.setOnAction(e -> {
            subtract(e);
        });

        plus.setOnAction(e -> {
            addit(e);
        });

        divide.setOnAction(e -> {
            div(e);
        });

        multiply.setOnAction(e -> {
            times(e);
        });

        dot.setOnAction(e -> {
            period(e);
        });

        percent.setOnAction(e -> {
            per(e);
        });

        negative.setOnAction(e -> {
            neg(e);
        });

        ac.setOnAction(e -> {
            clear(e);
        });

        equal.setOnAction(e -> {
            equals(e);
        });
    }


    public void calcGrowth()
    {
        int numRows = 6;
        int numColumns = 4;
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            RowConstraints rc = new RowConstraints();
            rc.setVgrow(Priority.ALWAYS) ; // allow row to grow
            rc.setFillHeight(true); // ask nodes to fill height for row
            // other settings as needed...
            grid.getRowConstraints().add(rc);
        }
        for (int colIndex = 0; colIndex < numColumns; colIndex++) {
            ColumnConstraints cc = new ColumnConstraints();
            cc.setHgrow(Priority.ALWAYS) ; // allow column to grow
            cc.setFillWidth(true); // ask nodes to fill space for column
            // other settings as needed...
            grid.getColumnConstraints().add(cc);
        }
    }
}

