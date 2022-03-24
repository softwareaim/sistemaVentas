
package com.ventas.sistemadeventas.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utiles {
    // https://parzibyte.me/blog/2019/03/04/obtener-formatear-fecha-hora-actual-java/
    public static String obtenerFechaYHoraActual() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        LocalDateTime ahora = LocalDateTime.now();
        return formateador.format(ahora);
    }
}
