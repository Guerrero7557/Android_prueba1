package pe.edu.idat.appreciclerviewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pe.edu.idat.appreciclerviewimage.databinding.ActivityDetalleBinding;
import pe.edu.idat.appreciclerviewimage.databinding.ActivityMainBinding;

public class DetalleActivity extends AppCompatActivity {

    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());
        if(getIntent().hasExtra("android")){
            Android objandroid = getIntent().getParcelableExtra("android");
            binding.ivImgDetalle.setImageResource(objandroid.getImagen());
            binding.tvNombreADetalle.setText(objandroid.getNombre());
            binding.tvAndroidVersion.setText(objandroid.getVersion());
        }
    }
}