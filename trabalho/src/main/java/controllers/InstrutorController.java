package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Instrutor;
import services.InstrutorService;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

	
	 @Autowired
	    InstrutorService instrutorService;
	    
	    @GetMapping
	    public ResponseEntity<List<Instrutor>> getAllInstrutors() {
	        return new ResponseEntity<>(instrutorService.getAllInstrutors(),
	                HttpStatus.OK);
	        //ResponseEntity manipula o retorno
	    }
	    
	    @GetMapping("/{id_instrutor}")
	    public ResponseEntity<Instrutor> getInstrutorById( @PathVariable Integer id_instrutor) {
	        //return instrutorService.getInstrutorById(id);
	        Instrutor instrutorResponse = instrutorService.getInstrutorById(id_instrutor);
	        if(null == instrutorResponse)
	            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        else
	            return new ResponseEntity<>(instrutorResponse, HttpStatus.OK);
	    }
	    
	    @PostMapping
	    public ResponseEntity<Instrutor> saveInstrutor (@RequestBody Instrutor instrutor) {
	        return new ResponseEntity<>(instrutorService.saveInstrutor(instrutor),
	        		HttpStatus.CREATED);
	    }
	    
	    @PutMapping
	    public ResponseEntity<Instrutor> updateInstrutor(@RequestBody Instrutor instrutor, Integer id) {
	        return new ResponseEntity<> (instrutorService.updateInstrutor(instrutor, id),
	        		HttpStatus.OK);
	    }
	    
	    @DeleteMapping
	    public ResponseEntity<Boolean> delInstrutor(@PathVariable Integer id) {
	       Boolean resp = instrutorService.delInstrutor(id);
	       if(resp)
	    	   return new ResponseEntity<>(resp, HttpStatus.OK);
	       else
	    	   return new ResponseEntity<>(resp,HttpStatus.NOT_MODIFIED);
	    }
	}

	
	
	

