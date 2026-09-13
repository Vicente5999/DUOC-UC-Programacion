package model;
public class PedidoComida extends Pedido {
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }
    @Override public double calcularTiempoEntrega() { return distanciaKm * 5.0; }
    @Override public void mostrarResumen() { System.out.println("Resumen Pedido Comida #" + idPedido); }
    @Override public void despachar() { System.out.println("Despachando comida..."); }
    @Override public void cancelar() { System.out.println("Cancelando comida..."); }
    @Override public void rastrear() { System.out.println("Rastreando comida..."); }
}
