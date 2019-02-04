package studentapplication;
public class StudentApplication {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        
        //student1
        student1.setId(654152);
        student1.setName("Martin");
        student1.setAge(51);
        
        //student2
        student2.setId(654151);
        student2.setName("Jane");
        student2.setAge(23);
        
        
        //student1.printMessage();
        //student2.printMessage();
        
        System.out.println(student1.getAge());
        
    }
    
}
