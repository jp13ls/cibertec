/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.aplicacionprueba.service.impl;

import pe.edu.cibertec.aplicacionprueba.service.MensajeService;

/**
 *
 * @author JAVA-ADV-VS
 */
public class MensajeServiceImpl implements MensajeService{

    public void publicar(String mensaje) {
        System.out.println("Imprimiendo localmente mensaje: " + mensaje
                + " desde la clase: " + MensajeServiceImpl.class.getName());
    }
}
