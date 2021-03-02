package tw.edu.pu.s107123456.guessnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText etUserNum;
    private Button btnReset, btnGuess;
    private TextView tvResult;
    //
    private int counter;
    private int luckyNum = (int)(Math.random()*100+1);
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        etUserNum = findViewById(R.id.etUserNumer);
        btnReset = findViewById(R.id.btnReset);
        btnGuess = findViewById(R.id.btnGuess);
        tvResult = findViewById(R.id.tvResult);
        //
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luckyNum = (int)(Math.random()*100+1);
                tvResult.setText("");
                counter = 0;
            }
        });
        //
        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}