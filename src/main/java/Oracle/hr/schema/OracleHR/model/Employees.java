package Oracle.hr.schema.OracleHR.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employees {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="employee_id")
  private int employeeId;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email")
  private String email;

  @Column(name="phone_number")
  private String phoneNumber;

  @Column(name="hire_date")
  private LocalDateTime hireDate;

  @Column(name="job_id")
  private String jobId;

  @Column(name="salary")
  private int salary;

  @Column(name="commission_pct")
  private int commissionPct;

  @Column(name="manager_id")
  private int managerId;

  @Column(name="department_id")
  private int departmentId;

}
