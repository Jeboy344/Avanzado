package org.edu.cac;

public interface Comunicable {
    // Definimos una interfaz comunicable.

    // 2 funcionalidades en común que deben de tener
    // las clases que implementen esta interfaz

    // Las interfaces deben tener unicamente metodos abstractos (solo la firma)
    public void recibirMensaje(Mensaje mensaje, Persona emisor);

    public void enviarMensaje(Mensaje mensaje, Persona destinatario);
}
