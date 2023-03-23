package Oracle.hr.schema.OracleHR.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jobs {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="job_id")
  private String jobId;

  @Column(name = "job_title")
  private String jobTitle;

  @Column(name = "min_salary")
  private int minSalary;

  @Column(name = "max_salary")
  private int maxSalary;

}
