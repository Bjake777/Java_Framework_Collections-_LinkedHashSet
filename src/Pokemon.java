import java.util.Objects;

public class Pokemon {
    private char name;
    private Player owner;

    public Pokemon(char name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return name == pokemon.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name=" + name +
                ", owner=" + owner +
                '}';
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
