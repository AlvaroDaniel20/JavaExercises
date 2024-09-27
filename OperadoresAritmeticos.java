public class OperadoresAritmeticos {
    public static void main(String[] args) {
        final double CAMISETAPRICE = 25;
        final double PANTALONPRICE = 30;
        final double DISCOUNT = 0.15;
        final double SECONDDISCOUNT = 0.05;

        double camisetadiscount = CAMISETAPRICE * DISCOUNT;
        double pantalondiscount = PANTALONPRICE * DISCOUNT;

        double camisetafinalprice = CAMISETAPRICE - camisetadiscount;
        double pantalonfinalprice = PANTALONPRICE - pantalondiscount;

        double totalpriceafterdiscount = camisetafinalprice + pantalonfinalprice;

        double secondcamiseta = camisetafinalprice * SECONDDISCOUNT;
        double secondcamisetafinalprice = camisetafinalprice - secondcamiseta;

        double totalfinal = totalpriceafterdiscount + secondcamisetafinalprice;

        System.out.println("El precio total es: " + totalfinal);
    }
}
