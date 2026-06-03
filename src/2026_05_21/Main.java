class Main {

    class Student {
        int age;
        String name;
        int rollNumber;

        public Student(String name, int age, int rollno) {
            this.age = age;
            this.name = name;
            this.rollNumber = rollno;
        }

        public void display() {
            System.out.println("Age: " + this.age);
            System.out.println("Name: " + this.name);
            System.out.println("RollNumber: " + this.rollNumber);
        }
    }

    public static void main(String args[]) {
        Main m = new Main();              // create outer class object
        Student s = m.new Student("Rahul", 23, 123); // create inner class object
        s.display();
    }
}