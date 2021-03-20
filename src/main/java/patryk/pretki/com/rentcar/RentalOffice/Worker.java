package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.*;

@Entity
@Table
public class Worker { //pracownik

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String departament;

  @Column
  @Enumerated(EnumType.STRING)
  private WorkerPosition workerPosition;
  @Id
  private String id;

  public Worker(String firstName, String lastName, String departament, WorkerPosition workerPosition) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.departament = departament;
    this.workerPosition = workerPosition;
  }

  public Worker() {

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDepartament() {
    return departament;
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }

  public WorkerPosition getWorkerPosition() {
    return workerPosition;
  }

  public void setWorkerPosition(WorkerPosition workerPosition) {
    this.workerPosition = workerPosition;
  }

  @Override
  public String toString() {
    return "Worker{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", departament='" + departament + '\'' +
      ", workerPosition=" + workerPosition +
      '}';
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
