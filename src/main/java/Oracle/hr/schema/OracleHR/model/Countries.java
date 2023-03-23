package Oracle.hr.schema.OracleHR.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Countries {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "country_id")
  private String countryId;

  @Column(name = "country_name")
  private String countryName;

  @Column(name = "region_id")
  private int regionId;
}
