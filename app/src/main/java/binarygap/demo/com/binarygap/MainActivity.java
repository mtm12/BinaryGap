package binarygap.demo.com.binarygap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private Button buttonSolve;
    private int solution;
    private TextView textViewSolution;
    private BinaryGapSolution binaryGapsolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        buttonSolve = (Button) findViewById(R.id.buttonSolve);
        textViewSolution = (TextView) findViewById(R.id.textViewSolution);

        buttonSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextNumber.getText() != null){
                    binaryGapsolution = new BinaryGapSolution();
                    solution = binaryGapsolution.solution(Integer.valueOf(editTextNumber.getText().toString()));
                    Log.d("Gap", "Solution: " + String.valueOf(solution));
                    textViewSolution.setText("Solution: " + solution);
                }

            }
        });
    }
}
