package pe.edu.idat.ec3_torresmateo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import pe.edu.idat.ec3_torresmateo.databinding.ItemBusBinding;

import java.util.ArrayList;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.ViewHolder>{

    ItemBusBinding binding;
    private ArrayList<Bus> lista = new ArrayList<>();

    @NonNull
    @Override
    public BusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemBusBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BusAdapter.ViewHolder holder, int position) {
        final Bus objBus = lista.get(position);
        holder.binding.ivimagen.setImageResource(objBus.getImage());
        holder.binding.tvparadero.setText(objBus.getParadero());
        holder.binding.tvhorario.setText(objBus.getHorario().toString());
        holder.binding.tvpasajeros.setText(String.valueOf(objBus.getPasajeros()));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void setData(ArrayList<Bus>data){
        lista.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ItemBusBinding binding;
        public ViewHolder(ItemBusBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
