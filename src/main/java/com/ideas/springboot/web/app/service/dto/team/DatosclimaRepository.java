package com.ideas.springboot.web.app.service.dto.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DatosclimaRepository extends JpaRepository<Datosclima, Long>{


	@Override
	Datosclima save(Datosclima datosClima);

}
