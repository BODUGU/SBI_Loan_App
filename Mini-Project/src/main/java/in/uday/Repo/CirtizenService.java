package in.uday.Repo;

import java.util.List;

import in.uday.model.CitizenPlan;

public interface CirtizenService {

	public List<CitizenPlan> generateApprovedPlansReport();

	List<CitizenPlan> generateDeniedPlansReport();

	List<CitizenPlan> generatedTerminatedPalnReport();

}
