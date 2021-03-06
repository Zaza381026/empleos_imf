package org.fernando.izazaga.service.db;

import java.util.List;
import java.util.Optional;

import org.fernando.izazaga.model.Vacante;
import org.fernando.izazaga.repository.VacantesRepository;
import org.fernando.izazaga.service.IntVacantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Primary
public class VacantesServiceJpa implements IntVacantesService {
	
	@Autowired
	private VacantesRepository repoVacantes;

	@Override
	public List<Vacante> obtenerTodas() {
		// TODO Auto-generated method stub
		return repoVacantes.findAll();
	}

	@Override
	public Vacante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Vacante> optional = repoVacantes.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Vacante vacante) {
		repoVacantes.save(vacante);

	}

	@Override
	public void eliminar(Integer id) {
		repoVacantes.deleteById(id);
		
	}

	@Override
	public Page<Vacante> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoVacantes.findAll(page);
	}

}
