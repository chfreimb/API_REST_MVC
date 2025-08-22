package com.pedidoMVCCaio.API_Pedidos.model.service;
import com.pedidoMVCCaio.API_Pedidos.model.entity.Pedido;
import com.pedidoMVCCaio.API_Pedidos.model.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository PedidoRepository) {
        this.pedidoRepository = PedidoRepository;
    }

    public List<Pedido> listarTodosPedidos() {
        return (this.pedidoRepository.findAll());
    }
    
    public Pedido buscarPedidoPorId(Integer id) {
        Optional<Pedido> optionalPedido = this.pedidoRepository.findById(id);
        return optionalPedido.orElse(null);
    }
    
    public List<Pedido> buscarPorNumeroDoPedido(String numeroPedido) {
    	return this.pedidoRepository.findBynumeroPedido(numeroPedido);
    }
    
    public Pedido criarPedido(Pedido pedido) {
        return this.pedidoRepository.save(pedido);
    }

    public boolean deletarPedidoPorId(Integer id) {
        try {
            this.pedidoRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public Integer contar() {
        return Math.toIntExact(this.pedidoRepository.count());
    }
}
