package tr.com.mali.diziyedeger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Indis,Toplam;
    EditText Sayi;
    Button Ekle,Sifirla;
    public Integer[] notlar = new Integer[6];
    public int indis =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Indis = findViewById(R.id.textViewIndis);
        Toplam = findViewById(R.id.textViewToplam);
        Sayi = findViewById(R.id.editTextSayi);
        Ekle = findViewById(R.id.buttonEkle);
        Sifirla = findViewById(R.id.buttonSifirla);


        Ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indis <6){
                    int sayi;
                    sayi = Integer.parseInt(Sayi.getText().toString());
                    notlar[indis]=sayi;
                    indis++;
                    Indis.setText("İndis: " + Integer.toString(indis));
                    int toplam = 0;
                    for (int i = 0; i < indis; i++) {
                        toplam += notlar[i];
                    }
                    Toplam.setText("Toplam: " + Integer.toString(toplam));
                    Sayi.getText().clear();
                }
                else{
                    Indis.setText("Dizi dolu");
                }

            }
        });
        Sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indis=0;
                Indis.setText("İndis: 0");
                Toplam.setText("Toplam: 0");
                notlar = new Integer[6];
            }
        });


    }
}