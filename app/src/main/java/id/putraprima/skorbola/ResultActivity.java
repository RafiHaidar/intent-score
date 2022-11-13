package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;
    private Intent Hasil;
    private String Pemenang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Hasil = getIntent();
        Pemenang = Hasil.getStringExtra("Winner");
        result = findViewById(R.id.textView3);
        result.setText("Winner");
    }
}
