package decorator.abs_class;

abstract public class Beverage {

    public enum Size {TALL, GRANDE, VENTI}

    private Size size = Size.TALL;

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
