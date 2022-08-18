package com.pension.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailsOfPensioner {
	private long id;
	private String name;
	private Date dob;
	private long aadhaar;
	private String pAN;
	private double salaryEarned;
	private int allowances;
	private String typeofPension;
	private BankDetail bankDetail;
}
