package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Instrutor;
import repositories.InstrutorRepository;

@Service
public class InstrutorService {

	
	
		@Autowired
		InstrutorRepository instrutorRepository;
		
		
		public List<Instrutor> getAllInstrutors() {
	    	return instrutorRepository.findAll();
	    }

	    public Instrutor getInstrutorById(Integer id) {
	    	
	    	return instrutorRepository.findById(id).orElse(null);
	    }

	    
	    public Instrutor saveInstrutor(Instrutor instrutor) {
	    	return instrutorRepository.save(instrutor);
	    }


	    public Instrutor updateInstrutor(Instrutor instrutor, Integer id) {
	    	return instrutorRepository.save(instrutor);
	    }


	    public Boolean deleteInstrutor(Integer id) {
	    	instrutorRepository.deleteById(id);
			return null;
	    }

	    public Boolean delInstrutor(Integer id) {
	    instrutorRepository.deleteById(id);
	    Instrutor instrutorDeletado = instrutorRepository.findById(id).orElse(null);
	    if(null == instrutorDeletado)
	    	return true;
	    else
	    	return false;
	    
	    }

		public Object getAllLivros() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	    
	}

	
