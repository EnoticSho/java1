package geekbrains;

public class Employee {
    public String name;
    public String position;
    public String mail;
    public int phone;
    public int salary;
    public int age;

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petr petrovich", "engineer", "qwe", 3754412, 10, 25);
        employees[1] = new Employee("Ivan Jovanovich", "engineer", "qwe", 37544123, 15, 30);
        employees[2] = new Employee("Sergey Sergeevich", "engineer", "qwe", 3754412, 124, 35);
        employees[3] = new Employee("Geisha", "engineer", "qwe", 3754412, 12135, 40);
        employees[4] = new Employee("Sonya", "engineer", "qwe", 3754412, 12315, 45);

        for (Employee a : employees) {
            if (a.getAge() >= 40) {
                a.printInfo();
            }
        }
    }

    public Employee(String name, String position, String mail, int phone, int salary, int age) {
        this.name = name;
        this.mail = mail;
        this.position = position;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("ФИО : " + this.name + ". Должность : " + this.position +
                ". email : " + this.mail + ". Телефон : " + this.phone +
                ". Зарплата : " + this.salary + ". Возраст :" + this.age);
    }
}
