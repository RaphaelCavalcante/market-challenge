package br.com.rhounsell.checkoutchallenge.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhounsell.checkoutchallenge.base.controller.BaseController;
import br.com.rhounsell.checkoutchallenge.bo.ClientBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.ClientDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Client;
import br.com.rhounsell.checkoutchallenge.repository.ClientRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Client Controller", description = "Client Controller")
@RestController
@RequestMapping(name = "Client Controller", path = "/client")
public class ClientWs extends BaseController<ClientDTO, Client, ClientRepository, ClientBO> {

}
