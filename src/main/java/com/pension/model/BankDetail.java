package com.pension.model;

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
public class BankDetail {
	private long id;
	private String name;
	private long accountNumber;
	private String bankType;
}
