package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.RegisterModel;
 
//We are creating repository class and extend JpaRepository - becoz it help to performing CRUD operation
//extends JpaRepository- is generic type so we need to write this model name and their id type 

public interface RegisterRepo extends JpaRepository<RegisterModel, Integer> {

	
}



