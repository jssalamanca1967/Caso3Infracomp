/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2infracomp;

import uniandes.gload.core.Task;

/**
 *
 * @author j.montes495
 */
public class ClientServerTask extends Task{
    
    @Override
    public void execute() {
        Cliente cliente = new Cliente();
        cliente.start();    
    }

    @Override
    public void fail() {
    }

    @Override
    public void success() {
    }
    
}
