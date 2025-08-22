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

    public String getnumeroPedido() {
        return numeroPedido;
    }

    public void setnumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getquantidadePedido() {
        return quantidadePedido;
    }

    public void setquantidadePedido(Integer quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }
    
    public String getitemPedido() {
        return itemPedido;
    }

    public void setitemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Double getvalor() {
        return valor;
    }

    public void setvalor(Double valor) {
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
