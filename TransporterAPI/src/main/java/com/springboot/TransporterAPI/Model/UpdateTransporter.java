package com.springboot.TransporterAPI.Model;

import lombok.Data;

@Data
public class UpdateTransporter {
	private Long phoneNo = null;
	private String transporterLocation;
	private String name;
	private String companyName;
	private String kyc;
	private Boolean companyApproved;
	private Boolean transporterApproved;
}