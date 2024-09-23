/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.rmi.*;
import java.rmi.registry.*;
public class Client 
{
    public static void main(String rgs[]) throws Exception
    {
        Registry rg=LocateRegistry.getRegistry("localhost" , 1099);
        Adder ad=(Adder)rg.lookup("Adder");
        System.out.println("sum: "+ad.add(3,6));
    }
}
