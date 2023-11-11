package ma.formation.rest.service.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable {
        private Long id;
        private String description;
        private Double price;
        private Double quantity;
    }
