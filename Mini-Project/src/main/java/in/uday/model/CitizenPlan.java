package in.uday.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CitizenPlan {

	@Id
	private long CITIZEN_ID;
	private String CITIZEN_NAME;
	private String GENDER;
	private String PLAN_NAME;
	private String PLAN_STATUS;
	private Date PLAN_START_DATE;
	private Date PLAN_END_DATE;
	private double BENFIT_NUMBER;
	private String DENIAL_REASON;
	private Date TERMINATE_DATE;
	private String TERMINATE_REASON;

	public CitizenPlan() {

	}

	public long getCITIZEN_ID() {
		return CITIZEN_ID;
	}

	public void setCITIZEN_ID(long cITIZEN_ID) {
		CITIZEN_ID = cITIZEN_ID;
	}

	public String getCITIZEN_NAME() {
		return CITIZEN_NAME;
	}

	public void setCITIZEN_NAME(String cITIZEN_NAME) {
		CITIZEN_NAME = cITIZEN_NAME;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getPLAN_NAME() {
		return PLAN_NAME;
	}

	public void setPLAN_NAME(String pLAN_NAME) {
		PLAN_NAME = pLAN_NAME;
	}

	public String getPLAN_STATUS() {
		return PLAN_STATUS;
	}

	public void setPLAN_STATUS(String pLAN_STATUS) {
		PLAN_STATUS = pLAN_STATUS;
	}

	public Date getPLAN_START_DATE() {
		return PLAN_START_DATE;
	}

	public void setPLAN_START_DATE(Date pLAN_START_DATE) {
		PLAN_START_DATE = pLAN_START_DATE;
	}

	public Date getPLAN_END_DATE() {
		return PLAN_END_DATE;
	}

	public void setPLAN_END_DATE(Date pLAN_END_DATE) {
		PLAN_END_DATE = pLAN_END_DATE;
	}

	public double getBENFIT_NUMBER() {
		return BENFIT_NUMBER;
	}

	public void setBENFIT_NUMBER(double bENFIT_NUMBER) {
		BENFIT_NUMBER = bENFIT_NUMBER;
	}

	public String getDENIAL_REASON() {
		return DENIAL_REASON;
	}

	public void setDENIAL_REASON(String dENIAL_REASON) {
		DENIAL_REASON = dENIAL_REASON;
	}

	public Date getTERMINATE_DATE() {
		return TERMINATE_DATE;
	}

	public void setTERMINATE_DATE(Date tERMINATE_DATE) {
		TERMINATE_DATE = tERMINATE_DATE;
	}

	public String getTERMINATE_REASON() {
		return TERMINATE_REASON;
	}

	public void setTERMINATE_REASON(String tERMINATE_REASON) {
		TERMINATE_REASON = tERMINATE_REASON;
	}

	@Override
	public String toString() {
		return "CitizenPlan [CITIZEN_ID=" + CITIZEN_ID + ", CITIZEN_NAME=" + CITIZEN_NAME + ", GENDER=" + GENDER
				+ ", PLAN_NAME=" + PLAN_NAME + ", PLAN_STATUS=" + PLAN_STATUS + ", PLAN_START_DATE=" + PLAN_START_DATE
				+ ", PLAN_END_DATE=" + PLAN_END_DATE + ", BENFIT_NUMBER=" + BENFIT_NUMBER + ", DENIAL_REASON="
				+ DENIAL_REASON + ", TERMINATE_DATE=" + TERMINATE_DATE + ", TERMINATE_REASON=" + TERMINATE_REASON + "]";
	}

	public CitizenPlan(long cITIZEN_ID, String cITIZEN_NAME, String gENDER, String pLAN_NAME, String pLAN_STATUS,
			Date pLAN_START_DATE, Date pLAN_END_DATE, double bENFIT_NUMBER, String dENIAL_REASON, Date tERMINATE_DATE,
			String tERMINATE_REASON) {
		super();
		CITIZEN_ID = cITIZEN_ID;
		CITIZEN_NAME = cITIZEN_NAME;
		GENDER = gENDER;
		PLAN_NAME = pLAN_NAME;
		PLAN_STATUS = pLAN_STATUS;
		PLAN_START_DATE = pLAN_START_DATE;
		PLAN_END_DATE = pLAN_END_DATE;
		BENFIT_NUMBER = bENFIT_NUMBER;
		DENIAL_REASON = dENIAL_REASON;
		TERMINATE_DATE = tERMINATE_DATE;
		TERMINATE_REASON = tERMINATE_REASON;
	}

}
