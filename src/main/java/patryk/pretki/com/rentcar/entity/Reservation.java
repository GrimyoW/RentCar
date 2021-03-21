package patryk.pretki.com.rentcar.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Reservation { //reserwacaj

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int reservationId;

  @Column
  private LocalDate dateReservation;

  @Column
  private LocalDate realStartDateReservation;

  @Column
  private LocalDate realReturnDate;

  @Column
  private BigDecimal price;

  @Column
  private String returnCityBranch;

  @Column
  @ManyToOne(targetEntity = Car.class)   //Powstaje na podstawie klasy car czy w jakiś inny sposób?
  private Car car;
  @Column
  @ManyToOne(targetEntity = Customers.class) //Powstaje na podstawie klasy pracowników czy w jakiś inny sposób?
  private Customers customers;
  @Column
  @ManyToOne(targetEntity = BranchList.class) //Powstaje na podstawie klasy listy firmm czy w jakiś inny sposób?
  private BranchList branchList;

  public Reservation(int reservationId, LocalDate dateReservation, LocalDate realStartDateReservation, LocalDate realReturnDate, BigDecimal price, String returnCityBranch, Car car, Customers customers, BranchList branchList) {
    this.reservationId = reservationId;
    this.dateReservation = dateReservation;
    this.realStartDateReservation = realStartDateReservation;
    this.realReturnDate = realReturnDate;
    this.price = price;
    this.returnCityBranch = returnCityBranch;
    this.car = car;
    this.customers = customers;
    this.branchList = branchList;
  }

  public Reservation() {

  }

  public int getReservationId() {
    return reservationId;
  }

  public void setReservationId(int reservationId) {
    this.reservationId = reservationId;
  }

  public LocalDate getDateReservation() {
    return dateReservation;
  }

  public void setDateReservation(LocalDate dateReservation) {
    this.dateReservation = dateReservation;
  }

  public LocalDate getRealStartDateReservation() {
    return realStartDateReservation;
  }

  public void setRealStartDateReservation(LocalDate realStartDateReservation) {
    this.realStartDateReservation = realStartDateReservation;
  }

  public LocalDate getRealReturnDate() {
    return realReturnDate;
  }

  public void setRealReturnDate(LocalDate realReturnDate) {
    this.realReturnDate = realReturnDate;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getReturnCityBranch() {
    return returnCityBranch;
  }

  public void setReturnCityBranch(String returnCityBranch) {
    this.returnCityBranch = returnCityBranch;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public Customers getCustomers() {
    return customers;
  }

  public void setCustomers(Customers customers) {
    this.customers = customers;
  }

  public BranchList getBranchList() {
    return branchList;
  }

  public void setBranchList(BranchList branchList) {
    this.branchList = branchList;
  }

  @Override
  public String toString() {
    return "Reservation{" +
      "reservationId=" + reservationId +
      ", dateReservation=" + dateReservation +
      ", realStartDateReservation=" + realStartDateReservation +
      ", realReturnDate=" + realReturnDate +
      ", price=" + price +
      ", returnCityBranch='" + returnCityBranch + '\'' +
      ", car=" + car +
      ", customers=" + customers +
      ", branchList=" + branchList +
      '}';
  }
}
