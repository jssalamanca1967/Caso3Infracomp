/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2infracomp;

import uniandes.gload.core.LoadGenerator;
import uniandes.gload.core.Task;

/**
 *
 * @author j.montes495
 */
public class Generator {
    
    private LoadGenerator generator;
    
    public Generator(int numeroTask, int espacio)
    {
        Task work = createTask();
        int numberOfTasks = numeroTask;
        int gapBetweenTasks = espacio;
        generator = new LoadGenerator("Cliente - Servidor", numberOfTasks, work, gapBetweenTasks);
        generator.generate();
        
    }
    
    private Task createTask()
    {
        return new ClientServerTask();
    }
     
    
    
}
