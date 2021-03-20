package patryk.pretki.com.rentcar.RentalOffice;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Rent { // wypożyczenia


  @Id
  @Column
  @GeneratedValue(generator = "donationSeq")
  @GenericGenerator(name = "donationSeq", strategy = "increment")
  private int rentId;

  @Column
  @ManyToOne(targetEntity = Worker.class) //Powstaje na podstawie klasy pracowników czy w jakiś inny sposób?
  private Worker worker;

  @Column
  private LocalDate rentDate;


  @Column
  @ManyToOne(targetEntity = Reservation.class)
  private Reservation reservation;

  @Column
  private String Uwagi;

  public Rent(int rentId, Worker worker, LocalDate rentDate, Reservation reservation, String uwagi) {
    this.rentId = rentId;
    this.worker = worker;
    this.rentDate = rentDate;
    this.reservation = reservation;
    Uwagi = uwagi;
  }

  public Rent() {

  }

  public int getRentId() {
    return rentId;
  }

  public void setRentId(int rentId) {
    this.rentId = rentId;
  }

  public Worker getWorker() {
    return worker;
  }

  public void setWorker(Worker worker) {
    this.worker = worker;
  }

  public LocalDate getRentDate() {
    return rentDate;
  }

  public void setRentDate(LocalDate rentDate) {
    this.rentDate = rentDate;
  }

  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  public String getUwagi() {
    return Uwagi;
  }

  public void setUwagi(String uwagi) {
    Uwagi = uwagi;
  }

  @Override
  public String toString() {
    return "Rent{" +
      "rentId=" + rentId +
      ", worker=" + worker +
      ", rentDate=" + rentDate +
      ", reservation=" + reservation +
      ", Uwagi='" + Uwagi + '\'' +
      '}';
  }
}
