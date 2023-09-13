package org.jspider.springbootrestapi.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "laptopinfo")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="lid")
    private int id;
    @Column(name ="lname")
    private String name;
    @Column(name="lcolor")
    private String color;



}
