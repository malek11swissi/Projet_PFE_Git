package poratil_web_client.poratil.web.Model.Securite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import static jakarta.persistence.GenerationType.AUTO;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="Forfait")
public class Forfait {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name="nomForfait")
    private String NomForfait;
    @Column(name="Prix")
    private Long Prix;
}
