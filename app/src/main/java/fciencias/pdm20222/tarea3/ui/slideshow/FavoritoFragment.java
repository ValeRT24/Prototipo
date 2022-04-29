package fciencias.pdm20222.tarea3.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import fciencias.pdm20222.tarea3.R;
import fciencias.pdm20222.tarea3.databinding.FragmentHomeBinding;

public class FavoritoFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_favorito,container,false);
        return root;
    }
}




