package crud.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
