package com.hcl.rest.repository;import com.hcl.rest.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}