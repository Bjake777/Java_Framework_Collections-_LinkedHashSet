import java.util.Objects;

public class Player {
    private static int counter = 0;
    private int id;
    private String name;
    private String surname;
    private int points;

    public Player(String name, String surname) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.points = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name) && Objects.equals(surname, player.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", points=" + points +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
