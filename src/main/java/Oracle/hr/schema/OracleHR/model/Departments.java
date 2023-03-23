package Oracle.hr.schema.OracleHR.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Departments {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "department_id")
  private int departmentId;

  @Column(name = "department_name")
  private String departmentName;

  @Column(name ="manager_id")
  private int managerId;

  @Column(name = "location_id")
  private int locationId;

}
