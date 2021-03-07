package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car {

  @Column (name = "mark")
  private String mark;

  @Column (name = "model")
  private String model;

  @Column (name = "body type")
  private String bodyType;

  @Column (name = "year")
  private long year;

  @Column (name = "color")
  private String color;

  @Column (name = "mileage")
  private BigDecimal mileage;

  @Column (name = "price")
  private BigDecimal price;

  @Column (name = "car status")
  @Enumerated(EnumType.STRING)
  private CarsStatus carsStatus;

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


}
