public class Student {
    String name;
    int id;
    float cgpa;

    Student(String name,int id,float cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
   void display(){
        this.show();
    }
      void show() {
       System.out.println("name: " + this.name);
       System.out.println("id: " + this.id);
       System.out.println("cgpa: " + this.cgpa);
      }
      Student(){
        this("Bappy", 06, 3.50f);
      }
public static void main(String[] args) {
    Student  bappy = new Student();       
    bappy.display();
}
}
