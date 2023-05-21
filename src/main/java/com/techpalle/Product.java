package com.techpalle;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Objects;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String pname;
    private Integer batchno;
    private Double price;
    private Integer noofproduct;

    public Product() {
    }

    public Product(Integer id, String pname, Integer batchno, Double price, Integer noofproduct) {
        Id = id;
        this.pname = pname;
        this.batchno = batchno;
        this.price = price;
        this.noofproduct = noofproduct;
    }

    public Product(String pname, Integer batchno, Double price, Integer noofproduct) {
        this.pname = pname;
        this.batchno = batchno;
        this.price = price;
        this.noofproduct = noofproduct;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getBatchno() {
        return batchno;
    }

    public void setBatchno(Integer batchno) {
        this.batchno = batchno;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNoofproduct() {
        return noofproduct;
    }

    public void setNoofproduct(Integer noofproduct) {
        this.noofproduct = noofproduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(Id, product.Id) && Objects.equals(pname, product.pname) && Objects.equals(batchno, product.batchno) && Objects.equals(price, product.price) && Objects.equals(noofproduct, product.noofproduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, pname, batchno, price, noofproduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", pname='" + pname + '\'' +
                ", batchno=" + batchno +
                ", price=" + price +
                ", noofproduct=" + noofproduct +
                '}';
    }
}
