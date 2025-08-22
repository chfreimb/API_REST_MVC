package com.pedidoMVCCaio.API_Pedidos.model.repository;
import com.pedidoMVCCaio.API_Pedidos.model.entity.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	List<Pedido> findBynumeroPedido(String numeroPedido);
}
