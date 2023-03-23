package Oracle.hr.schema.OracleHR.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Locations {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String locationId;

  @Column(name = "street_address")
  private String streetAddress;

  @Column(name = "postal_code")
  private String postalCode;

  @Column(name = "city")
  private String city;

  @Column(name = "state_province")
  private String stateProvince;

  @Column(name = "country_id")
  private  String countryId;

}
