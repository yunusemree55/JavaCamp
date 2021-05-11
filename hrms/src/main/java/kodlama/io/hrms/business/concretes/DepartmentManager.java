package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.DepartmentService;
import kodlama.io.hrms.dataAccess.abstracts.DepartmentDao;
import kodlama.io.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService {

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	
	@Override
	public List<Department> getAll() {
		
		return this.departmentDao.findAll();
	}

	@Override
	public void add(Department department) {
		
		this.departmentDao.save(department);
		System.out.println("Veritabanına kaydedildi: " + department.getName());
		
	}

}
