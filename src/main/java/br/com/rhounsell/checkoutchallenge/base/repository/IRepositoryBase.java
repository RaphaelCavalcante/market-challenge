package br.com.rhounsell.checkoutchallenge.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;

@Repository
public interface IRepositoryBase <T extends EntityBase >extends JpaRepository<T, Long>{

}
