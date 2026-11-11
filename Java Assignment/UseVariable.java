public class UseVariable {
    // Instance Variable
    int age = 20;
    public void display() {
        // Local Variable
        int marks = 90;
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
    }
    public static void main(String[] args) {
        UseVariable obj = new UseVariable();
        obj.display();
    }
}
