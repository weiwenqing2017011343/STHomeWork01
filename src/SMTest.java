
/*public class SMTest {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        studentManage.add(1,"魏文晴","19980913",true);
        studentManage.findstudent("魏文晴");
        studentManage.revise("魏文晴");
        studentManage.findAll();
        studentManage.logout();
    }
}*/

//static的方法直接用类名调用，新建对象会造成空间浪费
public class SMTest {
    public static void main(String[] args) {
        //StudentManage studentManage = new StudentManage();
        StudentManage.add(1,"魏文晴","19980913",true);
        StudentManage.findstudent("魏文晴");
        StudentManage.revise("魏文晴");
        StudentManage.findAll();
        StudentManage.logout();
    }
}

