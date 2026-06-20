package com.shopsphere.shopsphere_backend.Repository;

import com.shopsphere.shopsphere_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User, Long> {

}
