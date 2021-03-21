package patryk.pretki.com.rentcar.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateRentCarDto {

  @NotNull
  @NotEmpty
  @Size(min = 5, max = 10)
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
