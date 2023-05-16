package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Turma;
import repositories.TurmaRepository;


@Service
public class TurmaService {

	@Autowired
	TurmaRepository turmaRepository;
	
	
	public List<Turma> getAllTurmas() {
    	return turmaRepository.findAll();
    }

    public Turma getTurmaById(Integer id) {
    	
    	return turmaRepository.findById(id).orElse(null);
    }

    
    public Turma saveTurma(Turma turma) {
    	return turmaRepository.save(turma);
    }


    public Turma updateTurma(Turma turma, Integer id) {
    	return turmaRepository.save(turma);
    }


    public Boolean deleteTurma(Integer id) {
    	turmaRepository.deleteById(id);
		return null;
    }

    public Boolean delTurma(Integer id) {
    turmaRepository.deleteById(id);
    Turma turmaDeletado = turmaRepository.findById(id).orElse(null);
    if(null == turmaDeletado)
    	return true;
    else
    	return false;
    
    }

	public Object getAllLivros() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}

