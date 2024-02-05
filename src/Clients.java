public class Clients {
    String firstName;
    int age;
    int saldo;

    // CONSTRUCTOR
    Clients(){          // METODO
        saldo = 10;
    }

    void newAccount (){
        System.out.println(firstName + ", sua conta foi criada com sucesso!" + "\nSeu novo saldo é de: R$ " + saldo);
    }
}
/***
 " "
 ''
 \n     pular linha
 \t     tab
 ***/