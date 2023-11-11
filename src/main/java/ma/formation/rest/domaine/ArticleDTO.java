package ma.formation.rest.domaine;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ArticleDTO implements Serializable{
        private Long id;
        @Size(min = 1, max = 30, message = "description size must e between 1 and 30")
    private String description;
    private Double price;
        @Min(value = 1, message = "The quantity value must be greeter than 1")
     private Double quantity;
    }

