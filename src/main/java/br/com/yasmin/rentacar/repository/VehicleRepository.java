package br.com.yasmin.rentacar.repository;

import br.com.yasmin.rentacar.model.CustomerModel;
import br.com.yasmin.rentacar.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}
