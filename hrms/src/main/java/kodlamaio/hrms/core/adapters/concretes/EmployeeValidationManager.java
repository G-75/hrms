package kodlamaio.hrms.core.adapters.concretes;

import org.springframework.stereotype.Service;


import kodlamaio.hrms.core.adapters.abstracts.EmployeeValidationService;
import kodlamaio.hrms.entities.concretes.Employer;


@Service
public class EmployeeValidationManager implements EmployeeValidationService{

	@Override
	public boolean isValidatedByEmployee(Employer employer) {
		
		return false;
	}
}

	