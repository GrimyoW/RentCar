package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class Car { //samochody

  @Column
  private String mark;

  @Column
  private String model;

  @Column
  private String bodyType;

  @Column
  private long year;

  @Column
  private String color;

  @Column
  private BigDecimal mileage;

  @Column
  private BigDecimal price;

  @Column
  @Enumerated(EnumType.STRING)
  private CarsStatus carsStatus;
  @Id
  private String id;

  public Car(String mark, String model, String bodyType, long year, String color, BigDecimal mileage, BigDecimal price, CarsStatus carsStatus) {
    this.mark = mark;
    this.model = model;
    this.bodyType = bodyType;
    this.year = year;
    this.color = color;
    this.mileage = mileage;
    this.price = price;
    this.carsStatus = carsStatus;
  }

  public Car() {

  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public long getYear() {
    return year;
  }

  public void setYear(long year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public BigDecimal getMileage() {
    return mileage;
  }

  public void setMileage(BigDecimal mileage) {
    this.mileage = mileage;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CarsStatus getCarsStatus() {
    return carsStatus;
  }

  public void setCarsStatus(CarsStatus carsStatus) {
    this.carsStatus = carsStatus;
  }

  @Override
  public String toString() {
    return "Car{" +
      "mark='" + mark + '\'' +
      ", model='" + model + '\'' +
      ", bodyType='" + bodyType + '\'' +
      ", year=" + year +
      ", color='" + color + '\'' +
      ", mileage=" + mileage +
      ", price=" + price +
      ", carsStatus=" + carsStatus +
      '}';
  }


  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
