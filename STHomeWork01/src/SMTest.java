
public class SMTest {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        studentManage.add(1,"κ����","19980913",true);
        studentManage.findstudent("κ����");
        studentManage.revise("κ����");
        studentManage.findAll();
        studentManage.logout();
    }
}
