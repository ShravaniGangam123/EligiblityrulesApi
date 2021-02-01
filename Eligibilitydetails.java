package com.shravani.bindings;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="ELIGIBLITY_DTLS")
public class Eligibilitydetails {
	
	@Id
	@Column(name="ed_trace_id")
	private Integer edtraceid ;
	
	@Column(name="benefit_amt")
    private String benifitAmt;
	
    @Column(name="case_num")  
    private Integer caseNum;
    
    @Column(name="create_dt")   
    private Date createDate;
    
    @Column(name="denial_reason") 
    private String denialReason;
    
    @Column(name="plan_end_dt")  
    private Date planEnddate;
    
    @Column(name="plan_name")  
    private String planName;
    
    @Column(name="plan_start_dt") 
    private Date planStartdate;
   
    @Column(name="plan_status") 
    private String planStatus;
  
    @Column(name="update_dt")   
    private Date updateStatusdate;
   

}
