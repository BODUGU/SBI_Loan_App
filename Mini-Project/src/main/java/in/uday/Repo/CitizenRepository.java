package in.uday.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.model.CitizenPlan;

public interface CitizenRepository extends JpaRepository<CitizenPlan, Long> {

}
