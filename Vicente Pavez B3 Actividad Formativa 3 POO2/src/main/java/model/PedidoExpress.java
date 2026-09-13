package model;
public class PedidoExpress extends Pedido {
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }
    @Override public double calcularTiempoEntrega() { return distanciaKm * 3.0; }
    @Override public void mostrarResumen() { System.out.println("Resumen Pedido Express #" + idPedido); }
    @Override public void despachar() { System.out.println("Despachando express..."); }
    @Override public void cancelar() { System.out.println("Cancelando express..."); }
    @Override public void rastrear() { System.out.println("Rastreando express..."); }
}
