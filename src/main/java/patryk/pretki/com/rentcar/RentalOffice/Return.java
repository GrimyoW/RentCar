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


}
