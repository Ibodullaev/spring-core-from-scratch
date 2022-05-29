package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype") //using Prototype design pattern instead of default Singleton
public class Doctor implements Staff, BeanNameAware {
    //private Nurse nurse;
    private String qualification;
//
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    public void assist(){
        System.out.println("Doctor is assisting.");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    //Beans put the name first, and they instantiate the object. This method will be called first before any method or property.
    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name is called");
    }

    //This postConstructor method will be called after bean puts the name.
    @PostConstruct
    public void postConstructor(){
        System.out.println("Post Constructor is called");
    }

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
}
