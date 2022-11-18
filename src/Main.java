import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }

    Comportamento normal= new ComportamentoNormal();
    Comportamento defensivo= new ComportamentoDefensivo();
    Comportamento agressivo= new ComportamentoAgressivo();
    //Robo robo = new Robo();
    //robo.setComportamento(defensivo);
    //robo.mover();
    //robo.mover();


    //Facade
    //Facade facade = new Facade();
    //facade.migrarCliente("Venilton", "1564654655");






}