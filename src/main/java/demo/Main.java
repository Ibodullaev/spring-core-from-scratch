package demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;
import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
          //This is a regular way of writing dependency, but it is without IoC principle. It is bad practise:
//        Doctor doctor = new Doctor();
//        doctor.assist();
//
//        //Here we will use IoC principle and use xml based config for calling beans(objects):
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Doctor doctor1 = context.getBean(Doctor.class); //here we provided type
//        doctor1.assist();
//        Nurse nurse = (Nurse) context.getBean("nurse"); //here we provided id in xml
//        nurse.assist();
//        Staff doctor2 = context.getBean(Doctor.class); //here we are using interface and calling its child class
//        doctor2.assist();
//        Doctor doctor3 = context.getBean(Doctor.class); //here we are returning the value of property from XML file
//        System.out.println(doctor3.getQualification());
//        Doctor doctor4 = context.getBean(Doctor.class); //here we are using nurse object from doctor class, and we give it in xml file as property and ref
//        doctor4.getNurse();

//        //Here we will use IoC principle and use Annotation (XML) based config for calling beans(objects):
//        Doctor doctor = context.getBean(Doctor.class); //we added @Component into Doctor class
//        doctor.assist();

//        //Here we will use IoC principle and use Annotation (Config.class) based config for calling beans(objects):
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

//        //Here spring bean uses Singleton design pattern to make object:
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.setQualification("Master in medicine."); //this stays as a value for objects
//        System.out.println(doctor.getQualification());
//        Doctor doctor1 = context.getBean(Doctor.class);
//        System.out.println(doctor1.getQualification()); //returns the value of doctor object

        //Here spring bean uses Prototype design pattern to make object:
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.setQualification("Master in medicine."); //this stays as a value for objects
        System.out.println(doctor.getQualification());
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1.getQualification()); //returns the value of doctor1 object which is null
    }
}
