import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{

    private String name;
    private int score;

    public Restaurant(String name , int score){
        this.name = name;
        this.score = score;
    }


    @Override
    public int compareTo(Restaurant obj) {
        int comparation = this.name.compareToIgnoreCase(obj.name);
        if(comparation == 0){
            comparation = Integer.compare(obj.score , this.score);
        }
        return comparation;
    }

    @Override
    public boolean equals(Object obj) {
        boolean valid = false;
        if(this == obj){
            valid = true;
        }
        if(obj == null || getClass() != obj.getClass()){
            valid = false;
        }
        Restaurant restaurant = (Restaurant) obj;
        if(this.name.equalsIgnoreCase(restaurant.name) && this.score == restaurant.score){
            valid = true;
        }
        return valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + "\n" + "Score: " + score;
    }
}