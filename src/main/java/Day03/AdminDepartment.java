package Day03;

public class AdminDepartment extends Department{
    private int DepartmentSize;

    private void setDepartmentSize(int DepartmentSize){
        this.DepartmentSize = DepartmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return this.DepartmentSize;
    }
}
