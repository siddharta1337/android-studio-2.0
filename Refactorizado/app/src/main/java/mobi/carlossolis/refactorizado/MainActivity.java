package mobi.carlossolis.refactorizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CambiarTexto();

    }

    private void CambiarTexto() {
        TextView miTextoEspecial = (TextView) findViewById(R.id.miTexto);
        miTextoEspecial.setText("Hola");
    }
}
