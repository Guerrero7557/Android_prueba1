package pe.edu.idat.appreciclerviewimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import pe.edu.idat.appreciclerviewimage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Android> lista = new ArrayList<>();
        lista.add(new Android(lista.size()+1,R.drawable.image1, "Base","1.0"));
        lista.add(new Android(lista.size()+1,R.drawable.image2, "Base_1_1","1.1"));
        lista.add(new Android(lista.size()+1,R.drawable.image3, "Cupcake","1.5"));
        lista.add(new Android(lista.size()+1,R.drawable.image4, "Donut","1.6"));
        lista.add(new Android(lista.size()+1,R.drawable.image5, "Eclair","2.0"));
        lista.add(new Android(lista.size()+1,R.drawable.image6, "Froyo","2.2"));
        lista.add(new Android(lista.size()+1,R.drawable.image7, "Gingerbread","2.3"));
        lista.add(new Android(lista.size()+1,R.drawable.image8, "Honeycomb","3.0"));
        lista.add(new Android(lista.size()+1,R.drawable.image9, "Jelly Bean","4.1"));
        lista.add(new Android(lista.size()+1,R.drawable.image10, "Marshmello","4.3"));

        binding.rvandroid.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        AndroidAdapter adapter= new AndroidAdapter(lista, MainActivity.this);

        binding.rvandroid.setAdapter(adapter);

    }
}