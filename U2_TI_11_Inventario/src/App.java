public class App {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario(3);

        Producto productowan = new Producto("101", "Disco lanzable", 2);
        Producto productotuo = new Producto("202", "Una pc", 5);
        Producto productotri = new Producto("303", "Una silla", 4);
        Producto productofour = new Producto("404", "Un router q me encontre por ahi", 3);

        inventario.agregarProducto(productowan);
        inventario.agregarProducto(productotuo);
        inventario.agregarProducto(productotri);
        inventario.agregarProducto(productofour);

        System.out.println("Total de cosas que me encontre por ahi y ahora quiero venderte " + inventario.totalItems());

        Producto buscando = inventario.buscar("101");
        if (buscando != null) {
            System.out.println("trakas, si tenemos eso aqui " + buscando.getNombre() + " y tenemos " + buscando.getCantidad());
        } else {
            System.out.println("ni sabia si estaba eso pero no lo tenemos");
        }       

        Producto buscando2 = inventario.buscar("202");
        if (buscando2 != null) {
            System.out.println("trakas, si tenemos eso aqui " + buscando2.getNombre() + " y tenemos " + buscando2.getCantidad());
        } else {
            System.out.println("ni sabia si estaba eso pero no lo tenemos");
        } 
        
        Producto buscando3 = inventario.buscar("303");
        if (buscando3 != null) {
            System.out.println("trakas, si tenemos eso aqui " + buscando3.getNombre() + " y tenemos " + buscando3.getCantidad());
        } else {
            System.out.println("ni sabia si estaba eso pero no lo tenemos");
        }  
        
        Producto buscando4 = inventario.buscar("404");
        if (buscando4 != null) {
            System.out.println("trakas, si tenemos eso aqui " + buscando4.getNombre() + " y tenemos " + buscando4.getCantidad());
        } else {
            System.out.println("ni sabia si estaba eso pero no lo tenemos");
        }      

        boolean eliminado = inventario.eliminarProducto("202");
        if (eliminado) {
            System.out.println("tenemos error en el sistema, nuestro cuarto producto no se muestra asi que eliminamos el producto 202");
        } else {
            System.out.println("No se pudo eliminar");
        }

        


    }
}
