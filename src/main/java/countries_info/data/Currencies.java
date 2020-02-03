package countries_info.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Currencies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int currenciesId;
    private String code;
    private String name;
    private String symbol;

    public Currencies() {
    }
}
