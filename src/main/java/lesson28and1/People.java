package lesson28and1;

import java.util.Date;

public class People {
    private String name;
    private Integer salary;
    private Date date;

    public People() {
    }

    public People(String name, Integer salary, Date date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Работники{" +
                "ФИО ='" + name + '\'' +
                ", ЗП =" + salary +
                ", дата приема =" + date +
                '}';
    }
}
