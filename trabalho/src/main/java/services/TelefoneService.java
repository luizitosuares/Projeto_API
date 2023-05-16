package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Telefone;
import repositories.TelefoneRepository;


@Service
public class TelefoneService {

	
	
	@Autowired
	TelefoneRepository telefoneRepository;
	
	
	public List<Telefone> getAllTelefones() {
    	return telefoneRepository.findAll();
    }

    public Telefone getTelefoneById(Integer id) {
    	
    	return telefoneRepository.findById(id).orElse(null);
    }

    
    public Telefone saveTelefone(Telefone telefone) {
    	return telefoneRepository.save(telefone);
    }


    public Telefone updateTelefone(Telefone telefone, Integer id) {
    	return telefoneRepository.save(telefone);
    }


    public Boolean deleteTelefone(Integer id) {
    	telefoneRepository.deleteById(id);
		return null;
    }

    public Boolean delTelefone(Integer id) {
    telefoneRepository.deleteById(id);
    Telefone telefoneDeletado = telefoneRepository.findById(id).orElse(null);
    if(null == telefoneDeletado)
    	return true;
    else
    	return false;
    
    }

	public Object getAllLivros() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}

	
	
	