package com.example.project01_clone.external;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.project01_clone.R;

public class ExternalFragment extends Fragment {
    ImageView imgv1, imgv2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_external,container,false);
        imgv1  = v.findViewById(R.id.imgv_1);
        imgv2 = v.findViewById(R.id.imgv_2);

       // Glide.with(this).load(
                //"https://img.freepik.com/free-photo/composition-with-christmas-decorations-in-the-interior_169016-5544.jpg?w=2000").into(imgv1);

       // Glide.with(this).load(
                //"https://i.pinimg.com/originals/c0/aa/5e/c0aa5e597604a5b07c3b9761d4ddd431.gif").into(imgv2);

        return v;
    }
}
