package com.pedidoMVCCaio.API_Pedidos.model.entity;
import jakarta.persistence.*;

@Entity
@Table(name="pedido")
public class Pedido {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String numeroPedido;
    private String descricao;
    private Integer quantidadePedido;
    private String itemPedido;
    private Double valor;

    public Pedido() {
    }

    public Pedido(String numeroPedido, String descricao, Integer quantidadePedido,String itemPedido, Double valor) {

        this.numeroPedido = numeroPedido;
        this.descricao = descricao;
        this.quantidadePedido = quantidadePedido;
        this.itemPedido = itemPedido;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(Integer quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }
    
    public String getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", numeroPedido='" + numeroPedido + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidadePedido=" + quantidadePedido +
                ", itemPedido=" + itemPedido +
                ", valor=" + valor +
                '}';
    }
}
