package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "series")
    int series;

    // сторона не несущая ответсвености за отношение
    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {

    }

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }


    @Override
    public String toString() {
        return name + " " + series;
    }

}
