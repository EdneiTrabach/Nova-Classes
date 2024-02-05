public class Main {
    public static void main(String[] args) {
        // UTILIZAÇÃO DO METODO E VERIFICAR ENCAPSULAMENTO
        Car car = new Car("BMW", "X6", 2024, 125_000);

        car.setModelo("M3");

        System.out.println(car.getMarca()); // CHAMAMENTO DO GETTER - metodo
        System.out.println(car.getAno()); // CHAMAMENTO DO GETTER - metodo
        System.out.println(car.getModelo()); // CHAMAMENTO DO GETTER - metodo
        System.out.println("Valor de venda: R$ " + car.valorVenda()); // CHAMAMENTO DO GETTER - metodo






        /***
        Clients c001 = new Clients();
        c001.firstName = "Ednei";
        c001.age = 26;

        Clients c002 = new Clients();
        c002.firstName = "Vitoria";
        c002.age = 23;

        c002.newAccount();
         ***/

    }
}


/***
 " "
 ''
 \n     pular linha
 \t     tab
 ***/


