package com.example.chongieball.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Create Adapter RecyclerView
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter
        .AnimalViewHolder> {

    private List<Animal> animals;

    public AnimalAdapter(List<Animal> animals) {
        this.animals = animals;
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        private ImageView animalPicture;
        private TextView animalBahasaName;
        private TextView animalLatinName;

        AnimalViewHolder(View view) {
            super(view);

            animalPicture = view.findViewById(R.id.iv_picture);
            animalBahasaName = view.findViewById(R.id
                    .tv_name_indonesian);
            animalLatinName = view.findViewById(R.id.tv_name_latin);
        }
    }

    //return total data in list
    @Override
    public int getItemCount() {
        return animals.size();
    }

    //set layout for recyclerview
    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup container, int
            viewType) {
        View view = LayoutInflater.from(container.getContext()).inflate(R
                .layout.animal_list, container, false);

        return new AnimalViewHolder(view);
    }

    //set data
    @Override
    public void onBindViewHolder(AnimalViewHolder animalViewHolder, int
            position) {
        Animal animal = animals.get(position);
        animalViewHolder.animalPicture.setImageResource(animal.getAnimalPicture());
        animalViewHolder.animalBahasaName.setText(animal.getBahasaLanguage());
        animalViewHolder.animalLatinName.setText(animal.getLatinLanguage());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
