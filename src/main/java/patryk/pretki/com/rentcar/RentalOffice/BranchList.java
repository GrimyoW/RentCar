package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Lista_Oddziałów")
public class BranchList {

  @Table(name = "Adres")
  private String adres;

  @Table(name = "WorkerList")
  private String workerlist;

  @Table(name = "AvailableCars")
  private String availablecars;

  @ManyToOne(targetEntity = Car.class)  //nie jestem tego pewien
  private Car car;

  public BranchList(String adres, String workerlist, String availablecars, Car car) {
    this.adres = adres;
    this.workerlist = workerlist;
    this.availablecars = availablecars;
    this.car = car;
  }

  public String getAdres() {
    return adres;
  }

  public void setAdres(String adres) {
    this.adres = adres;
  }

  public String getWorkerlist() {
    return workerlist;
  }

  public void setWorkerlist(String workerlist) {
    this.workerlist = workerlist;
  }

  public String getAvailablecars() {
    return availablecars;
  }

  public void setAvailablecars(String availablecars) {
    this.availablecars = availablecars;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  @Override
  public String toString() {
    return "BranchList{" +
      "adres='" + adres + '\'' +
      ", workerlist='" + workerlist + '\'' +
      ", availablecars='" + availablecars + '\'' +
      ", car=" + car +
      '}';
  }
}
