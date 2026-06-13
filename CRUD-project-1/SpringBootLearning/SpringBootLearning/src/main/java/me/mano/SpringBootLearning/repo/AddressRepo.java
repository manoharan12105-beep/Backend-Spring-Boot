package me.mano.SpringBootLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.mano.SpringBootLearning.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
