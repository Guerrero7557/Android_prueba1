package pe.edu.idat.appreciclerviewimage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.edu.idat.appreciclerviewimage.databinding.ItemAndroidBinding;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {

    private List<Android> lista;
    private Context context;

    public AndroidAdapter(List<Android> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public AndroidAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(ItemAndroidBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidAdapter.ViewHolder holder, int position) {
        final Android itemAndroid = lista.get(position);
        holder.binding.ivimagen.setImageResource(itemAndroid.getImagen());
        holder.binding.tvNombre.setText(itemAndroid.getNombre());
        holder.binding.tvVersion.setText(itemAndroid.getVersion());

        holder.binding.contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intentandroidD = new Intent(context, DetalleActivity.class);
                intentandroidD.putExtra("android", itemAndroid);
                context.startActivity(intentandroidD);
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemAndroidBinding binding;
        public ViewHolder( ItemAndroidBinding itemView) {

            super(itemView.getRoot());
            binding=itemView;
        }
    }
}
