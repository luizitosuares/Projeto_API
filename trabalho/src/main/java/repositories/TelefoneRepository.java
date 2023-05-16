package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

}
