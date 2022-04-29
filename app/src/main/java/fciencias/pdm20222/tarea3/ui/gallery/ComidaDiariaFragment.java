package fciencias.pdm20222.tarea3.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import fciencias.pdm20222.tarea3.R;
import fciencias.pdm20222.tarea3.databinding.FragmentHomeBinding;

public class ComidaDiariaFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.comida_diaria_fragment,container,false);

        return root;
    }
}