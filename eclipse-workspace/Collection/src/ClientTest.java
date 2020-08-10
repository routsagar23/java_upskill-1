import java.util.HashSet;

class EmpE {

    String name;
    int age;

    public EmpE(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
   public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof EmpE))
            return false;
        EmpE employee = (EmpE) obj;
        return employee.getAge() == this.getAge()
                && employee.getName() == this.getName();
   }
    

 
        public int hashCode() {
            int result=17;
            result=31*result+age;
            result=31*result+(name!=null ? name.hashCode():0);
            return result;
        }
    
}
public class ClientTest {
    public static void main(String[] args) {
        EmpE employee = new EmpE("rajeev", 24);
        EmpE employee1 = new EmpE("rajeev", 25);
        EmpE employee2 = new EmpE("rajeev", 24);

        HashSet<EmpE> employees = new HashSet<EmpE>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
        + "  employee2.hashCode():" + employee2.hashCode());
    }
}
