package org.example;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort(); //middleware

        System.out.println(stub.counvertir(7600));

        Compte cp = stub.consulterCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}