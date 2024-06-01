public class SpaceShip implements ProtoType{

    private String name;
    private int crew;
    private Double fuel;
    private Alien captain;

    public SpaceShip(String name, int crew, Double fuel, Alien captain) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
        this.captain = captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Alien getCaptain() {
        return captain;
    }

    public void setCaptain(Alien captain) {
        this.captain = captain;
    }

    @Override
    public ProtoType createClone() {
        return new SpaceShip(name,crew,fuel,(Alien) captain.createClone());
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", captain=" + captain +
                '}';
    }
}
