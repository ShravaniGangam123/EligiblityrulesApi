package com.shravani.bindings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="BATCH_SUMMERY")

public class BatchSummery {
	@Id
	@Column(name="SUMMERY_ID")
	private Integer summeryId ;

	@Column(name="BATCH_NAME")
	private String batchName ;

	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount ;

	@Column(name="SUCCESS_TRIGGER_COUNT")
	private Integer sucTriggerCount ;
	
	@Column(name="TOTAL_TRIGGER_PROCESSED")
	private String totalTriggerProcessed ;
	

}
