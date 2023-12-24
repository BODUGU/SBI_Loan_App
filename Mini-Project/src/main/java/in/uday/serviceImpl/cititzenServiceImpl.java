package in.uday.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.uday.Repo.CirtizenService;
import in.uday.model.CitizenPlan;

@Service
public class cititzenServiceImpl implements CirtizenService {

	@Override
	public List<CitizenPlan> generateApprovedPlansReport() {
		
		return null;
	}

	@Override
	public List<CitizenPlan> generateDeniedPlansReport() {
		
		return null;
	}

	@Override
	public List<CitizenPlan> generatedTerminatedPalnReport() {
		
		return null;
	}

}
