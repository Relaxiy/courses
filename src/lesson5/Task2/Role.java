//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson5.Task2;

public enum Role {
    DIRECTOR("Директор"),
    EMPLOYEE("Рядовой сотрудник"),
    HR("Менеджер отдела кадров");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}