package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.RegisterModel;
import java.util.List;

 
//We are creating repository class and extend JpaRepository - becoz it help to performing CRUD operation
//extends JpaRepository- is generic type so we need to write this model name and their id type 

public interface RegisterRepo extends JpaRepository<RegisterModel, Integer> {

//	List<RegisterModel> findByMobileNumber(long mobileNumber);
	List<RegisterModel>findByMobileNumber (long mobileNumber);
	
	@Query("select r from RegisterModel r where r.status = :status")
	List<RegisterModel>findByStatus(String status);
	
//	    @Query("SELECT r FROM RegisterModel r WHERE r.status = :status AND r.name = :name")
//	    List<RegisterModel> findByStatusAndName(String status, String name);

}



