package com.company;

public class Order {
    private String OrderNumber="0001";
    private String Articulo, Local, Repartidor, price;

    public Order(String OrderNumber, String Articulo,String Local, String price, String Repartidor){
        this.OrderNumber= OrderNumber;
        this.Articulo= Articulo;
        this.Local=Local;
        this.price=price;
        this.Repartidor=Repartidor;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        this.Articulo = articulo;
    }


    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        this.Local = local;
    }

    public String getRepartidor() {
        return Repartidor;
    }

    public void setRepartidor(String repartidor) {
       this.Repartidor = repartidor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
