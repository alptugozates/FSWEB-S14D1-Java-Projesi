import com.workintech.company.Employee;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;
import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("****************************");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("****************************");

        Employee employee = new Employee(1, "Ali", 100000);
        System.out.println("Employee name= " + employee.getName());
        System.out.println("Employee id= " + employee.getId());
        System.out.println("Employee salary= " + employee.getSalary());
        employee.work();

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(2, "Alptug", 30000 );
        System.out.println("JD name= " + juniorDeveloper.getName());
        System.out.println("JD id= " + juniorDeveloper.getId());
        System.out.println("JD salary" + juniorDeveloper.getSalary());
        juniorDeveloper.work();

        MidDeveloper midDeveloper = new MidDeveloper(3, "Ahmet", 55000);
        System.out.println("MD name= " + midDeveloper.getName());
        System.out.println("MD id= " + midDeveloper.getId());
        System.out.println("MD salary= " + midDeveloper.getSalary());
        midDeveloper.work();

         SeniorDeveloper seniorDeveloper = new SeniorDeveloper(4, "Mustafa", 80000);
        System.out.println("SD name= " + seniorDeveloper.getName());
        System.out.println("SD id= " + seniorDeveloper.getId());
        System.out.println("SD salary= " + seniorDeveloper.getSalary());
        seniorDeveloper.work();

    }


}