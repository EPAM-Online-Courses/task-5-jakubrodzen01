package efs.task.collections.entity;
import java.util.Objects;

import java.util.List;

public class Town implements Comparable{
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Town town = (Town) o;
        return townName.equals(town.townName);
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
    @Override
    public int hashCode() {
        return Objects.hash(townName);
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }

    @Override
    public int compareTo(Object town) {
        Town t = (Town) town;
        return this.getTownName().compareTo(t.getTownName());
    }

}