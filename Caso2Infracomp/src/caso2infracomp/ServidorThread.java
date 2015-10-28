/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2infracomp;

import servidor.Servidor;

/**
 *
 * @author j.montes495
 */
public class ServidorThread extends Thread {

	public ServidorThread() {

	}

	public void run() {
		try {
			Servidor servidor = new Servidor(443);
			servidor.main(null);
		} catch (Exception e) {
			System.out.println("Fallo en el servidor");
			e.printStackTrace();
		}
	}

}
