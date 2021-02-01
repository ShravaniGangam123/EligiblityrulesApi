package com.shravani.bindings;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CO_PDFS")

public class Copdfs {
	@Id
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name="CASE_NUMBER")
	private Integer caseNum;
	
	@Column(name="PDF_DOCUMENT")
	private String planDocument;

	@Column(name="PLAN_NAME")
	private Date startDate ;

}
