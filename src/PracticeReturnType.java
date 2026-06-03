class PracticeReturnType {

    // Method returning int
    public int getIntValue() {
        return 10;
    }

    // Method returning double
    public double getDoubleValue() {
        return 25.5;
    }

    // Method returning String
    public String getStringValue() {
        return "Hello Java";
    }

    // Method returning boolean
    public boolean getBooleanValue() {
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        PracticeReturnType s = new PracticeReturnType();

        System.out.println("Int Value: " + s.getIntValue());
        System.out.println("Double Value: " + s.getDoubleValue());
        System.out.println("String Value: " + s.getStringValue());
        System.out.println("Boolean Value: " + s.getBooleanValue());
    }
}