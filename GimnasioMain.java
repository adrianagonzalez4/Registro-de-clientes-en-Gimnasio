//Proyecto Final - Gimnasio

//Estudiante:  Raj Ahir                  Cédula: 20-39-6034          Grupo: 1SF124

//Estudiante:  Adriana González          Cédula: 8-997-2009          Grupo: 1SF124                         

//Estudiante:  Snehkumar Ahir            Cédula: 20-39-6036          Grupo: 1SF124       

public class GimnasioMain {

      public static void main(String[] args) {

		int opcion = 0;

		Gimnasio gm = new Gimnasio();
		
		while (opcion < 5)
			{
			opcion = gm.Menu();	

			switch(opcion)
				{
				case 1:
					gm.RealizarMante();				
				break;
				
				case 2:					
					gm.RegistrarIngreso();					
				break;
				
				case 3:		
					gm.ConsultarReporte();	
				break;		
				
				case 4: 
					System.out.println("\nVuelva Pronto, Te esperamos!\n");
					System.exit (0);
				break;
				
				default: 
					System.out.println("\n\nCODIGO INVALIDO!!!\n");
					System.exit (0); 
				break;
				}
			}
      	}
	}




