package br.com.rhounsell.checkoutchallenge.base.bo;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.base.repository.IRepositoryBase;


@Service
public abstract class BaseBO<T extends EntityDTOBase, S extends EntityBase, I extends IRepositoryBase<S>> {
	private I repository;

	public BaseBO(I instance) {
		this.repository = instance;
	}

	public T getOne(Long id) {
		return (T) this.repository.getOne(id).toDTO();
	}

	public Collection<T> getAll() {
		Collection<S>  collection = this.repository.findAll();
		return (Collection<T>) collection.stream().map(S::toDTO).collect(Collectors.toList());
	}

	@SuppressWarnings("unchecked")
	public T save(T dto) {
		return (T) this.repository.save((S) dto.toEntity()).toDTO();
	}
	
	public void delete(Long id) {
		this.repository.delete((S) this.getOne(id).toEntity());
	}
	
}
