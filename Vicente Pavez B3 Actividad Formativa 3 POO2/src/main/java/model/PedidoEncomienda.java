package model;
public class PedidoEncomienda extends Pedido {
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }
    @Override public double calcularTiempoEntrega() { return distanciaKm * 8.0; }
    @Override public void mostrarResumen() { System.out.println("Resumen Pedido Encomienda #" + idPedido); }
    @Override public void despachar() { System.out.println("Despachando encomienda..."); }
    @Override public void cancelar() { System.out.println("Cancelando encomienda..."); }
    @Override public void rastrear() { System.out.println("Rastreando encomienda..."); }
}
