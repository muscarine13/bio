package com.muscimol.bio.creature;

import java.util.concurrent.ThreadLocalRandom;

public class Consument_3 extends Consument {

    public static Consument_3 createRandom() {
        int index = ThreadLocalRandom.current().nextInt(Consuments_3.values().length);
        return new Consument_3(
                Consuments_3.values()[index].max_satiety,
                Consuments_3.values()[index].reproduction_chance,
                Consuments_3.values()[index].max_moves,
                Consuments_3.values()[index].image_atlas_name);
    }

    public static Consument_3 createNew(Consuments_3 type) {
        return new Consument_3(
                type.max_satiety,
                type.reproduction_chance,
                type.max_moves,
                type.image_atlas_name);
    }

    public static Consument_3 createNew(int max_satiety, int reproduction_chance, int max_moves, String image_atlas_name) {
        return new Consument_3(max_satiety, reproduction_chance, max_moves, image_atlas_name);
    }

    private Consument_3(int max_satiety, int reproduction_chance, int max_moves, String image_atlas_name) {
        this.max_satiety = max_satiety;
        this.max_moves = max_moves;
        moves = max_moves;
        satiety = max_satiety;
        this.image_atlas_name = image_atlas_name;

        this.active = true;
        this.reproduction_chance = reproduction_chance;

    }

    @Override
    Thing getClone() {
        return (Thing) Consument_3.createNew(max_satiety, reproduction_chance, max_moves, image_atlas_name);
    }

    @Override
    boolean isEdible(Thing thing) {
        if (thing instanceof Consument_2 || thing instanceof Consument_1) return true;
        else return false;


    }
    @Override
    public Thing duplicate() {
        return getClone();
    }

}
