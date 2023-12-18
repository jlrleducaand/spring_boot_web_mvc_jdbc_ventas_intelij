package org.iesvdm.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//La anotación @Data de lombok proporcionará el código de:
//getters/setters, toString, equals y hashCode
//propio de los objetos POJOS o tipo Beans
@Data

// Para modificar equals
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // Solo los que llevan la notacion
//Para generar un constructor con lombok con todos los args

@AllArgsConstructor	//Constructor con todos los argumetos
@NoArgsConstructor 	// Constructor vacio

public class Cliente {
	@EqualsAndHashCode.Include  // Solo el que lleva la notacion se hce iquals
	private long id;

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String ciudad;
	private int categoria;
	
}
