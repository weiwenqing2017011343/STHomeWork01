
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
                System.out.println("ѧ�ţ�" + student1.getID()  + "������" + student1.getName() + "�������ڣ�"+student1.getBirDate()+"�Ա�"+(student1.isGender()?"��":"Ů"));
            }
        }
        if (!isFind)
            System.out.println("δ�鵽");
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
            System.out.println("δ�鵽����");
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
                System.out.println("�������޸��˵ĳ�������");
                String birdh = scanner.nextLine();
                student1.setBirDate(birdh);
                System.out.println("�������޸��˵��Ա�");
                boolean sex = scanner.nextLine().equals("Ů")?true:false;
                student1.setGender(sex);

            }
        }
        if (!isFindrevise)
            System.out.println("δ�鵽����");
    }
    
    
    
public static void findAll()
{
    for (Student student1 : arrayList)
        System.out.println("ѧ�ţ�" + student1.getID()  + "������" + student1.getName() + "�������ڣ�"+student1.getBirDate()+"�Ա�"+(student1.isGender()?"��":"Ů"));

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
            System.out.println("��ѡ�����");
            System.out.println("*******************");
            System.out.println("*     1.����       *");
            System.out.println("*     2.����       *");
            System.out.println("*     3.ɾ��       *");
            System.out.println("*     4.�޸�       *");
            System.out.println("*     5.���       *");
            System.out.println("*     6.�˳�       *");
            System.out.println("*******************");
            
            String s = scanner.nextLine();
            switch (s){
                
            case "1":
                    int ID = arrayList.size()+1;
                    System.out.println("������");
                    String name = scanner.nextLine();
                    System.out.println("�������ڣ�");
                    String birDate = scanner.nextLine();
                    System.out.println("�Ա�");
                    boolean gender = (scanner.nextLine().equals("Ů"))?true:false;
                    add(ID,name,birDate,gender);
                    break;
                
                case "2":
                    System.out.println("����������˵�������");
                    String name1 = scanner.nextLine();
                    findstudent(name1);
                    break;
                
                case "3":
                    System.out.println("������ɾ���˵�������");
                    String name2 = scanner.nextLine();
                    remove(name2);
                    break;
                
                case "4":
                    System.out.println("�������޸��˵�������");
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










   