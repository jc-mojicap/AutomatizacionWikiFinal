package edu.uniandes.automatizacion.servicios.service.log.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uniandes.automatizacion.servicios.dao.catalogo.iface.AuditoriaRepository;
import edu.uniandes.automatizacion.servicios.dao.model.Auditoria;
import edu.uniandes.automatizacion.servicios.service.log.iface.AuditoriaService;

@Service
public class AuditoriaServiceImpl implements AuditoriaService{

	@Autowired
	private AuditoriaRepository auditoriaRepository;
	
	@Override
	public List<Auditoria> findByTablaModificada(String tablaModificada) {
		return auditoriaRepository.findByTablaModificada(tablaModificada);
	}

	@Override
	public Auditoria guardarAuditoria(Auditoria auditoria) {
		return auditoriaRepository.saveAndFlush(auditoria);
	}

}
