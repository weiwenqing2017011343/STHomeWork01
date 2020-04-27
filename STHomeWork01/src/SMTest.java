
public class SMTest {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        studentManage.add(1,"ÎºÎÄÇç","19980913",true);
        studentManage.findstudent("ÎºÎÄÇç");
        studentManage.revise("ÎºÎÄÇç");
        studentManage.findAll();
        studentManage.logout();
    }
}
