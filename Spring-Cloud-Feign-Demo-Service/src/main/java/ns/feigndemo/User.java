package ns.feigndemo;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
@Table(name="User")
public class User {
	@Id
	private int id;	
	@NotBlank
	@Size(min = 2, max = 10)    
	private String firstName;
	@NotBlank
	private String lastName;	
	private String middleName;
	@NotNull
	@Min(2)
	@Max(100)	
	private Integer age;

}
