// Collection framework provides set of interfaces
// and classes to implement various data structures and algortithms

import java.util.ArrayList;
import java.util.List;

public class CollectionProgram {

    public static void main(String[] args){

        List<Integer> list=new ArrayList();
        List<Integer> list2=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(5);

        list2.add(50);
        list2.add(60);

        list.addAll(list2);

        System.out.println("List elements are: "+list);
        System.out.println("List2 elements are: "+list2);
        System.out.println("Access element : "+list.get(1));

      //  list.remove(2);
     //   System.out.println("New List :"+list);

        List<String> list3=new ArrayList<>();
        list3.add("India");
        list3.add("USA");
        list3.add("Singapore");

        Student s=new Student();
        s.setId(1);
        s.setName("A");
        s.setCity("Pune");

        Student s1=new Student();
        s1.setId(2);
        s1.setName("B");
        s1.setCity("Mumbai");

        List<Student> stuList=new ArrayList<>();
        stuList.add(s);
        stuList.add(s1);

    }

}

class Student{

    private Integer id;
    private String name;
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}