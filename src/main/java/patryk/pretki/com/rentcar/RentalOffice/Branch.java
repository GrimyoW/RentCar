package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Branchs")
public class Branch {
  // nazwa firmy
  // domena internetowa
  // adres kontaktowy
  // właściciel
  // logotyp
  // lista oddziałów


  @Column(name = "Wypożyczalnia samochodów")
  private String WypożyczalniaSamochodów;




}
