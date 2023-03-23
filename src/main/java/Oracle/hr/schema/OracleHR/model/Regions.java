package Oracle.hr.schema.OracleHR.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Regions {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "region_id")
  private int regionId;

  @Column(name = "region_name")
  private String regionName;

}
