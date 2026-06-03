class Rectangle {

    // Private instance variables
    private double length;
    private double width;

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();

        // Set values
        rect.setLength(12.5);
        rect.setWidth(6.5);

        // Get and print values
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
    }
}