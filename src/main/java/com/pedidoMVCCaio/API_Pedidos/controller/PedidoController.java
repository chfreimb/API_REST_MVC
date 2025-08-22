package com.pedidoMVCCaio.API_Pedidos.controller;
import com.pedidoMVCCaio.API_Pedidos.model.entity.Pedido;
import com.pedidoMVCCaio.API_Pedidos.model.service.PedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
@RequestMapping("/v1/pedidos")
public class PedidoController {
	
	private final PedidoService pedidoService;
	
	public PedidoController(PedidoService pedidoService) {
	        this.pedidoService = pedidoService;
	}
	
	 @GetMapping({"/", ""})
	public List<Pedido> listarTodos() {
		return this.pedidoService.listarTodosPedidos();
	}
	
	@GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Integer id) {
        return this.pedidoService.buscarPedidoPorId(id);
    }
	
	@GetMapping("/numeroPedido/{numeroPedido}") 
	public List<Pedido> buscarPorNumeroDoPedido(@PathVariable String numeroPedido) {
		return this.pedidoService.buscarPorNumeroDoPedido(numeroPedido); 
	}
	
    @GetMapping("/count")
    public Integer contar() {
        return this.pedidoService.contar();
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return this.pedidoService.criarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public boolean deletarPorId(@PathVariable Integer id) {
        return this.pedidoService.deletarPedidoPorId(id);
    }
}
