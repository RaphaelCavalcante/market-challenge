package br.com.rhounsell.checkoutchallenge.bo;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.ClientDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Client;
import br.com.rhounsell.checkoutchallenge.repository.ClientRepository;

@Service
public class ClientBO extends BaseBO<ClientDTO, Client, ClientRepository>{

	public ClientBO(ClientRepository instance) {
		super(instance);
	}

}
