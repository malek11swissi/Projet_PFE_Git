package poratil_web_client.poratil.web.Model.Securite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import static jakarta.persistence.GenerationType.AUTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="Compteur")
public class Compteur {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id ;
    
}



