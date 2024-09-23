/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Server extends UnicastRemoteObject implements Adder
{
    public Server() throws RemoteException
    {
        super();
    }
    public int add(int x , int y)
    {
        return x+y;
    }
    public float fac(int x)
    {
        if(x==1)
        {
            return 1;
        }
        return x*fac(x-1);
    }
    public static void main (String args[]) throws Exception
    {
        Server s = new Server();
        Registry rg = LocateRegistry.createRegistry(1099);
        rg.rebind("Adder" , s);
        System.out.println("server running");
    }
}
