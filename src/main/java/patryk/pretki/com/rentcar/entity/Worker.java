package patryk.pretki.com.rentcar.entity;


import javax.persistence.*;

@Entity
@Table
public class Worker { //pracownik

  @Column
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idWorker;
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


  public Worker() {

  }

  public Worker(long idWorker, String firstName, String lastName, String departament, WorkerPosition workerPosition, String id) {
    this.idWorker = idWorker;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departament = departament;
    this.workerPosition = workerPosition;
    this.id = id;
  }

  public long getIdWorker() {
    return idWorker;
  }

  public void setIdWorker(int idWorker) {
    this.idWorker = idWorker;
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Worker{" +
      "idWorker=" + idWorker +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", departament='" + departament + '\'' +
      ", workerPosition=" + workerPosition +
      ", id='" + id + '\'' +
      '}';
  }
}
