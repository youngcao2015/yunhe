package entity;

/**
 * student 查询 包装对象，用于复杂查询，除了传入student对象外的其他许多参数
 */
public class StudentQueryVo {
    private StudentCustom studentCustom;

    // 其他参数对象等
    // ...

    public StudentCustom getStudentCustom() {
        return studentCustom;
    }

    public void setStudentCustom(StudentCustom studentCustom) {
        this.studentCustom = studentCustom;
    }
}
