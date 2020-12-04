package br.com.rhounsell.checkoutchallenge.base.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.base.repository.IRepositoryBase;

public class BaseController <T extends EntityDTOBase, E extends EntityBase, I extends IRepositoryBase<E>, B extends BaseBO<T, E, I>>{
	@Autowired
	protected B bo;
	//create
	 @PostMapping(path = "/")
	public ResponseEntity<?> save(@RequestBody @Valid T dto) {
		return ResponseEntity.ok(bo.save(dto));
	}
	//read
	@GetMapping("/{id}")
	public ResponseEntity<?> get(@RequestParam(value="id")Long id){
		return ResponseEntity.ok(bo.getOne(id)
				);
	}
	@GetMapping("/")
	public ResponseEntity<?> list(){
		return ResponseEntity.ok(bo.getAll());
	}
	//update
	@PutMapping("/")
	public ResponseEntity<?> update(@RequestBody @Valid T dto){
		return ResponseEntity.ok(bo.save(dto));
	}
	//delete
	@DeleteMapping("/{id}")
	public void delete(@RequestParam(value="id") Long id){
	}
}
