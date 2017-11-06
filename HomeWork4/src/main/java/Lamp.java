public class Lamp {
    String name;
    int illumination;

    public Lamp(String name, int illumination) {
        this.name = name;
        this.illumination = illumination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIllumination() {
        return illumination;
    }

    public void setIllumination(int illumination) {
        this.illumination = illumination;
    }
}
