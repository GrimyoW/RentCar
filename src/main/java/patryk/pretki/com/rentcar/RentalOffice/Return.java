package patryk.pretki.com.rentcar.RentalOffice;

import patryk.pretki.com.rentcar.RentalOffice.Customers;
import patryk.pretki.com.rentcar.RentalOffice.Reservation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ReturnCars")
public class Return {

  @Column
  @ManyToOne(targetEntity = Customers.class)
  private Customers customers;

  @Column(name = "return date")
  private LocalDate returnDate;

  @Column
  @ManyToOne(targetEntity = Reservation.class)
  private Reservation reservation;

  @Column(name = "suplement")
  private BigDecimal suplemnet;

  @Column(name = "uwagi")
  private String uwagi;

  public Return(Customers customers, LocalDate returnDate, Reservation reservation, BigDecimal suplemnet, String uwagi) {
    this.customers = customers;
    this.returnDate = returnDate;
    this.reservation = reservation;
    this.suplemnet = suplemnet;
    this.uwagi = uwagi;
  }

  public Customers getCustomers() {
    return customers;
  }

  public void setCustomers(Customers customers) {
    this.customers = customers;
  }

  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  public BigDecimal getSuplemnet() {
    return suplemnet;
  }

  public void setSuplemnet(BigDecimal suplemnet) {
    this.suplemnet = suplemnet;
  }

  public String getUwagi() {
    return uwagi;
  }

  public void setUwagi(String uwagi) {
    this.uwagi = uwagi;
  }

  @Override
  public String toString() {
    return "Return{" +
      "customers=" + customers +
      ", returnDate=" + returnDate +
      ", reservation=" + reservation +
      ", suplemnet=" + suplemnet +
      ", uwagi='" + uwagi + '\'' +
      '}';
  }
}
