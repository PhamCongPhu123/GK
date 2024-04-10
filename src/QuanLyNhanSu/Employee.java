package QuanLyNhanSu;

import QuanLyNhanSu.IEmployee;

class Employee implements IEmployee {
    protected String ID;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;

    public Employee(String ID, String fullName, String birthDay, String phone, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Day: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}