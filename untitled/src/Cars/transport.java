package Cars;

public class transport {
    public float speed;
    public float weight;
    public String color;
    public byte[] coordinate;


    public void setValues(float _speed, float _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        this.speed = _speed + 5.0f;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Speed " + speed + "Weight " + weight + "Color " + color;
        String infoCoordinate = "Coordinate: " + coordinate;
        return info + infoCoordinate;
    }
}

