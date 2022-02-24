package rafaelle.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private float topo;
    private ImageView maoa;
    private ImageView maob;
    private TextView player11;
    private TextView player22;
    private TextView result;
    private ImageView vss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maoa = findViewById(R.id.mao1);
        maob = findViewById(R.id.mao2);
        player11 = findViewById(R.id.player1);
        player22 = findViewById(R.id.player2);
        result = findViewById(R.id.win);
        vss = findViewById(R.id.vs);


        maoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast alerta = Toast.makeText(getApplicationContext(), "kkkkkkkkkkkkkkkk", Toast.LENGTH_LONG);
                alerta.show();
                maoa.setImageResource(R.drawable.pedra);

            }

        });
        maob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast alerta = Toast.makeText(getApplicationContext(), "kkkkkkkkkkkkkkkk", Toast.LENGTH_LONG);
                alerta.show();

            }

        });
    }
}