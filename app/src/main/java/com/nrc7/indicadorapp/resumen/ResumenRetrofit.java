package com.nrc7.indicadorapp.resumen;

public class ResumenRetrofit {

    // ESTA CLASE ES SOLO PARA RESUMIR CON COMENTARIOS
    /*
    1. Añadir dependencias y permisos
    2. Crear POJO(s)
    3. Crear RetrofitClient (Receta)
    4. Reemplazar BASE_URL por la parte estatica de la URL a consultar
    5. Crear interface Api con la parte variable de la URL a consultar
    6. Iniciar Call o llamado a la API MIINDICADOR
    7. Crear DataSource (logica del llamado)
    8. Unir parte Fija de la URL con la parte variable
    9. Encolar el call a la API
    10. Obtener respuesta dentro del metodo onResponse
    11. Crear interface IData para enviar el valor al MainActivity
    12. Instanciar dentro de DataSource la interface IData
    13. Crear constructor a DataSource con la instancia de IData
    14. Dentro de onResponse, ejecutar el metodo de IData con el valor entre parentesis
    15. En MainActivity implements IData e implement methods
    16. En MainActivity, dentro del metodo onCreate(), instanciar la clase DataSource (this)
    17. Luego utilizar metodo getIndicador() disponible en instancia de DataSource
    18. En MainActivity, dentro del metodo notificarValor(String valor), setear variable valor al TextView
    19. En MainActivity, sobreescribir metodo onDestroy(), ctrl + o
    20. Dentro de onDestroy, decir dataSource = null para quitar la referencia a esta clase
     */
}
