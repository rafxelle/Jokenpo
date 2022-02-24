package rafaelle.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
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
    private int escolha1;
    private int escolha2;

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
                if (escolha1 == 0) {
                    maoa.setImageResource(R.drawable.pedra);
                    escolha1++;
                } else if (escolha1 == 1) {
                    maoa.setImageResource(R.drawable.tesoura);
                    escolha1++;
                } else if (escolha1 == 2) {
                    maoa.setImageResource(R.drawable.mao);
                    escolha1 = 0;

                }
            }
        });

        maob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast alerta = Toast.makeText(getApplicationContext(), "kkkkkkkkkkkkkkkk", Toast.LENGTH_LONG);
                alerta.show();
                if (escolha2 == 0) {
                    maoa.setImageResource(R.drawable.pedra);
                    escolha2++;
                } else if (escolha2 == 1) {
                    maoa.setImageResource(R.drawable.tesoura);
                    escolha2++;
                } else if (escolha2 == 2) {
                    maoa.setImageResource(R.drawable.mao);
                    escolha2 = 0;

                }

            }

        });
    }
}