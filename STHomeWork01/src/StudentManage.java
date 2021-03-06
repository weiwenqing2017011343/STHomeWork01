
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> arrayList = new ArrayList<>();
    public static void add(int ID,String name,String birDate,boolean gender)
    {

        Student student = new Student();
        student.setBirDate(birDate);
        student.setID(ID);
        student.setName(name);
        student.setGender(gender);
        arrayList.add(student);

    }

    public static void findstudent(String name1)
    {

        boolean isFind = false;

        for (Student student1 : arrayList)
        {
            if (student1.getName().equals(name1) )
            {
                isFind =true;
                System.out.println("学号：" + student1.getID()  + "姓名：" + student1.getName() + "出生日期："+student1.getBirDate()+"性别"+(student1.isGender()?"男":"女"));
            }
        }
        if (!isFind)
            System.out.println("未查到");
    }

    public static void remove(String name2)
    {
        boolean isFindremove = false;

        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name2) )
            {
                isFindremove =true;
                arrayList.remove(student1);
            }
        }
        if (!isFindremove)
            System.out.println("未查到此人");
    }
    public static void revise(String name3)
    {

        boolean isFindrevise = false;
        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name3) )
            {
                isFindrevise =true;
                System.out.println("请输入修改人的出生日期");
                String birdh = scanner.nextLine();
                student1.setBirDate(birdh);
                System.out.println("请输入修改人的性别");
                boolean sex = scanner.nextLine().equals("男")?true:false;
                student1.setGender(sex);

            }
        }
        if (!isFindrevise)
            System.out.println("未查到此人");
    }
public static void findAll()
{
    for (Student student1 : arrayList)
        System.out.println("学号：" + student1.getID()  + "姓名：" + student1.getName() + "出生日期："+student1.getBirDate()+"性别"+(student1.isGender()?"男":"女"));

}
public  static  void logout()
{
    System.exit(0);
}
    public static void App()
    {
        boolean logout = true;
        while (logout)
        {
            System.out.println("请选择操作");
            System.out.println("*******************");
            System.out.println("*     1.插入       *");
            System.out.println("*     2.查找       *");
            System.out.println("*     3.删除       *");
            System.out.println("*     4.修改       *");
            System.out.println("*     5.输出       *");
            System.out.println("*     6.退出       *");
            System.out.println("*******************");
            
            String s = scanner.nextLine();
            switch (s){
                case "1":
                    int ID = arrayList.size()+1;
                    System.out.println("姓名：");
                    String name = scanner.nextLine();
                    System.out.println("出生日期：");
                    String birDate = scanner.nextLine();
                    System.out.println("性别：");
                    boolean gender = (scanner.nextLine().equals("女"))?true:false;
                    add(ID,name,birDate,gender);
                    break;
                case "2":
                    System.out.println("请输入查找人的姓名：");
                    String name1 = scanner.nextLine();
                    findstudent(name1);
                    break;
                case "3":
                    System.out.println("请输入删除人的姓名：");
                    String name2 = scanner.nextLine();
                    remove(name2);
                    break;
                case "4":
                    System.out.println("请输入修改人的姓名：");
                    String name3 = scanner.nextLine();
                   revise(name3);
                    break;
                case "5":
                    findAll();
                    break;
                case "6":
                    logout();
                    break;
            }
        }
    }
    public static void main(String[] args) {

    App();

    }
}










   