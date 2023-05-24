//Proyecto Final - Gimnasio

//Estudiante:  Raj Ahir                  Cédula: 20-39-6034          Grupo: 1SF124

//Estudiante:  Adriana González          Cédula: 8-997-2009          Grupo: 1SF124                         

//Estudiante:  Snehkumar Ahir            Cédula: 20-39-6036          Grupo: 1SF124       

import java.util.Scanner;
public class Gimnasio {

	private String [] instructor = new String [3];
	private int [][] instructD = new int [3][2];
	
	private int [][] plan = new int [3][4];
	private double [] cost = new double [3];
	
	private String [][] cliente = new String [5][3];
	private int [][] clienteD = new int [5][4];
	
	private int [][] ingresos = new int [5][3];
	private double [] monto = new double [3];
	
	private int [] act = new int [3];
	private double prom;
	
	
	Scanner sc=new Scanner(System.in);


	public void setInstructor (String [] instructor)
		{
		this.instructor = instructor;
		}	
	public void setInstructD (int [][] instructD)
		{
		this.instructD = instructD;
		}	
	public void setPlan (int [][] plan)
		{
		this.plan = plan;
		}	
	public void setCost (double [] cost)
		{
		this.cost = cost;
		}	
	public void setCliente (String [][] cliente)
		{
		this.cliente = cliente;
		}	
	public void setClienteD (int [][] clienteD)
		{
		this.clienteD = clienteD;
		}	
	public void setIngresos (int [][] ingresos)
		{
		this.ingresos = ingresos;
		}
	public void setMonto (double [] monto)
		{
		this.monto = monto;
		}	
	public void setAct (int [] act)
		{
		this.act = act;
		}
	public void setProm (double prom)
		{
		this.prom = prom;
		}

	public String getInstructor (int pos)
		{
		String num;
		num = instructor[pos];
		return num;
		}
	public int getInstructD (int pos, int ind)
		{
		int num1;
		num1 = instructD[pos][ind];
		return num1;
		}
	public int getPlan (int pos, int ind)
		{
		int num2;
		num2 = plan[pos][ind];
		return num2;
		}
	public double getCost (int pos)
		{
		double num3;
		num3 = cost[pos];
		return num3;
		}
	public String getCliente (int pos, int ind)
		{
		String num4;
		num4 = cliente[pos][ind];
		return num4;
		}
	public int getClienteD (int pos, int ind)
		{
		int num5;
		num5 = clienteD[pos][ind];
		return num5;
		}
	public int getIngresos (int pos, int ind)
		{
		int num6;
		num6 = ingresos[pos][ind];
		return num6;
		}
	public double getMonto (int pos)
		{
		double num7;
		num7 = monto[pos];
		return num7;
		}
	public int getAct (int pos)
		{
		int num8;
		num8 = act[pos];
		return num8;
		}
	public double getProm (double prom)
		{
		double num9;
		num9 = prom;
		return num9;
		}
	
	public int Menu ()
		{
		int opcion;
		
		System.out.printf("\n-------------------------------------------------------------------------");
		System.out.printf("\n                           Opciones del Menu                           ");
		System.out.printf("\n-------------------------------------------------------------------------");
		System.out.printf("\n\n1: Catalogo de Mantenimiento");
		System.out.printf("\n2: Registrar los ingresos por mes");
		System.out.printf("\n3: Reportes o consultas");
		System.out.printf("\n4: Salir del Programa\n\n");
		System.out.printf("-------------------------------------------------------------------------\n");
		System.out.printf("Ingrese el codigo respectivo de la funcion que desea realizar: ");
		opcion=sc.nextInt();
		System.out.printf("-------------------------------------------------------------------------\n");
		
		return opcion;
		}

	public void RealizarMante()
		{
		int cod, fun, n=1, dato, t=0, id=0, j=0, info=0;
		String apro = "aprobada.";

		System.out.printf("\n-------------------------------------------------------------------------");
		System.out.printf("\n                            Mantenimientos                            ");
		System.out.printf("\n-------------------------------------------------------------------------");
		System.out.printf("\n\n1: Mantenimiento para Instructor.");
		System.out.printf("\n2: Mantenimiento para Planes de Suscripcion.");
		System.out.printf("\n3: Mantenimiento para Cliente.\n\n");
		System.out.printf("-------------------------------------------------------------------------\n");
		System.out.printf("Ingrese el codigo respectivo de la funcion que desea realizar: ");
		cod=sc.nextInt();
		System.out.printf("-------------------------------------------------------------------------\n");

		switch(cod)
			{
			case 1:
					System.out.printf("\n------------------------------------------------------");
					System.out.printf("\n                   Funciones                   ");
					System.out.printf("\n------------------------------------------------------");
					System.out.printf("\n\n1: Registrar Instructor.");
					System.out.printf("\n2: Modificar datos de Instructor.");
					System.out.printf("\n3: Eliminar Instructor.\n\n");
					System.out.printf("------------------------------------------------------\n");
					System.out.printf("Ingrese el codigo de la funcion que desea realizar: ");
					fun=sc.nextInt();
					System.out.printf("------------------------------------------------------\n");
							
					if (fun == 1)
						{
						for (t=0; t<3; t++)
				      		{
							sc.nextLine();
							System.out.printf("\nIngrese el nombre del Instructor " + n + ": ");
							instructor[t] = sc.nextLine();
							System.out.printf("Ingrese el id del Instructor " + n + ": ");
							instructD[t][0] = sc.nextInt();
							n = n+1;
							instructD[t][1] = 1;
				      		}
						} 
			
					
					else if (fun == 2)
						{
						System.out.printf("\nIngrese el id del instructor que desea modificar: ");
						info = sc.nextInt();
						
						for (t=0; t<3; t++)
				      		{
							if (info == instructD[t][0])
								{
								id = t;
								}
				      		}
				
						System.out.printf("\nCodigos de Datos: ");
						System.out.printf("\n| 1: Nombre | 2: Id |");
						System.out.printf("\n\nIngrese codigo del dato que desea modificar:  ");
						dato = sc.nextInt();
			
						if (dato == 1)
							{
							sc.nextLine();
							System.out.printf("\nIngrese el nuevo nombre del instructor: ");
							instructor[id] = sc.nextLine();
				      		}
						
						else 
							{
							System.out.printf("\nIngrese el nuevo id del instructor: ");
							instructD[id][0] = sc.nextInt();
				      		}
							
						} 
			
					
					else if (fun == 3)
						{
						System.out.printf("\nIngrese el id del instructor al cual desea eliminar: ");
						info = sc.nextInt();
			
						for (j=0; j<5; j++)
							{
							if (clienteD[j][2] == info)
								{
								apro = "rechazada.";
								}
							}
							
						for (t=0; t<3; t++)
							{
							if (info == instructD[t][0])
								{
								if (apro != "rechazada.")
									{
									instructD[t][1] = 2;
									}
								}
							}
						
								
						System.out.printf("\nLa cancelacion del instructor ha sido " + apro + "\n");
						}
					
					
					else
						{
						System.out.printf("\nCodigo Invalido!!!");
						}
			break;

			case 2:
					System.out.printf("\n------------------------------------------------------");
					System.out.printf("\n                   Funciones                   ");
					System.out.printf("\n------------------------------------------------------");
					System.out.printf("\n\n1: Registrar Plan de Suscripcion");
					System.out.printf("\n2: Modificar Plan de Suscripcion");
					System.out.printf("\n3: Eliminar Plan de Suscripcion\n\n");
					System.out.printf("------------------------------------------------------\n");
					System.out.printf("Ingrese el codigo de la funcion que desea realizar: ");
					fun=sc.nextInt();
					System.out.printf("------------------------------------------------------\n");
							
					if (fun == 1)
						{
						for (t=0; t<3; t++)
				      		{
							System.out.printf("\nIngrese el id del plan " +  n  +  ": ");                                                                           
							plan[t][0] = sc.nextInt();
							System.out.printf("Ingrese las horas por semana que incluye el plan " + n + ": ");
							plan[t][1] = sc.nextInt();
							System.out.printf("Incluye Instructor? (1:Si O 2:No): ");
							plan[t][2] = sc.nextInt();
							System.out.printf("Ingrese el costo mensual del plan " + n + ": ");
							cost[t] = sc.nextDouble();
							n = n+1;
							plan[t][3] = 1;
				      		}
						} 
			
					
					else if (fun == 2)
						{
						System.out.printf("\nIngrese el id actual del plan que desea modificar: ");
						info = sc.nextInt();
			
						for (t=0; t<3; t++)
				      		{
							if (info == plan[t][0])
								{
								id = t;
								}
				      		}
						
						System.out.printf("\nCodigos de Datos: ");
						System.out.printf("\n| 1: Id | 2: Horas | 3: Inclusion de Instructor | 4: Costo |");
						System.out.printf("\n\nCual dato del plan desea modificar? ");
						dato = sc.nextInt();
			
						if (dato == 1)
							{
							System.out.printf("\nIngrese el nuevo id del plan: ");
							plan[id][0] = sc.nextInt();
				      		}
							
						else if (dato == 2)
							{
							System.out.printf("\nIngrese la nueva cantidad de horas del plan: ");
							plan[id][1] = sc.nextInt();
				      		}
						
						else if (dato == 3)
							{
							System.out.printf("\nDesea incluir instructor al plan? (1:Si O 2:No)");
							plan[id][2] = sc.nextInt();
				      		}
						
						else if (dato == 4)
							{
							System.out.printf("\nIngrese el nuevo precio del plan: ");
							cost[id] = sc.nextDouble();
				      		}
							
						else
							{
							System.out.printf("\nCodigo Invalido!!!");
							}
						}
			
					
					else if (fun == 3)
						{
						System.out.printf("\nIngrese el id del plan al cual desea eliminar: ");
						info = sc.nextInt();
			
						for (t=0; t<3; t++)
				      		{
							if (info == plan[t][0])
								{
								plan[t][3] = 2;
								}
				      		}
						}
			
					else
						{
						System.out.printf("\nCodigo Invalido!!!");
						}
			break;
		
			case 3:
					System.out.printf("\n------------------------------------------------------");
					System.out.printf("\n                   Funciones                   ");
					System.out.printf("\n------------------------------------------------------");
					System.out.printf("\n\n1: Registrar Cliente");
					System.out.printf("\n2: Modificar datos del Cliente");
					System.out.printf("\n3: Eliminar Cliente\n\n");
					System.out.printf("------------------------------------------------------\n");
					System.out.printf("Ingrese el codigo de la funcion que desea realizar: ");
					fun=sc.nextInt();
					System.out.printf("------------------------------------------------------\n");
							
					if (fun == 1)
						{
						for (t=0; t<5; t++)
				      		{
							sc.nextLine();
							System.out.printf("\nIngrese el nombre del cliente " + n + ": ");
							cliente[t][0] = sc.nextLine();
							System.out.printf("Ingrese el id del cliente " + n + ": ");
							clienteD[t][0] = sc.nextInt();
							sc.nextLine();
							System.out.printf("Ingrese el correo electronico del cliente " + n + ": ");
							cliente[t][1] = sc.nextLine();
							System.out.printf("Ingrese el numero de celular del cliente " + n + ": ");
							cliente[t][2] = sc.nextLine();
							System.out.printf("Ingrese el id del plan suscrito del cliente " + n + ": ");
							clienteD[t][1] = sc.nextInt();
							
							for (j=0; j<3; j++)
					      		{
								if (plan[j][0] == clienteD[t][1])
									{
									if(plan[j][2] != 2)
										{
										System.out.printf("Ingrese el id del instructor del cliente " + n + ": ");
										clienteD[t][2] = sc.nextInt();
										}
									}
					      		}
							
							n = n+1;
							clienteD[t][3] = 1;
				      		}
						} 
			
					
					else if (fun == 2)
						{
						System.out.printf("\nIngrese el id actual del cliente que desea modificar datos: ");
						info = sc.nextInt();
			
						for (t=0; t<5; t++)
				      		{
							if (info == clienteD[t][0])
								{
								id = t;
								}
				      		}
				
						System.out.printf("\nCodigos de Datos: ");
						System.out.printf("\n| 1: Nombre | 2: Id | 3: Correo electronico | 4: Numero de celular | 5: Id del plan suscrito | 6: Id del instructor |");
						System.out.printf("\n\nCual dato del cliente desea modificar? ");
						dato = sc.nextInt();
						
						if (dato == 1)
							{
							sc.nextLine();
							System.out.printf("\nIngrese el nuevo nombre del cliente: ");
							cliente[id][0] = sc.nextLine();
				      		}
						
						else if (dato == 2)
							{
							System.out.printf("\nIngrese el nuevo id del cliente: ");
							clienteD[id][0] = sc.nextInt();
				      		}
			
						else if (dato == 3)
							{
							sc.nextLine();
							System.out.printf("\nIngrese el nuevo correo electronico del cliente: ");
							cliente[id][1] = sc.nextLine();
				      		}
						
						else if (dato == 4)
							{
							sc.nextLine();
							System.out.printf("\nIngrese el nuevo numero de celular del cliente: ");
							cliente[id][2] = sc.nextLine();
				      		}
			
						else if (dato == 5)
							{
							System.out.printf("\nIngrese el nuevo id del plan suscrito del cliente: ");
							clienteD[id][1] = sc.nextInt();
				      		}
						
						else if (dato == 6)
							{
							System.out.printf("\nIngrese el nuevo id del instructor del cliente: ");
							clienteD[id][2] = sc.nextInt();
				      		}
						
						else
							{
							System.out.printf("\nCodigo Invalido!!!");
							}
						} 
			
					
					else if (fun == 3)
						{
						System.out.printf("\nIngrese el id del cliente al cual desea eliminar: ");
						info = sc.nextInt();
			
						for (t=0; t<5; t++)
				      		{
							if (info == clienteD[t][0])
								{
								clienteD[t][3] = 2;
								}
				      		}
						}
					
					else
						{
						System.out.printf("\nCodigo Invalido!!!");
						}		 
			break; 

			default:
				{
				System.out.println("\n\nCODIGO INVALIDO!!!\n");
				System.exit (0); 
				}
			break;
			}
		}
			
		

	
	public void RegistrarIngreso()
		{
		int t, j, n=1;

		System.out.printf("\nEstado de Suscripcion   ");
		System.out.printf("\n| 1: Activa | 2: Desactiva |\n\n");

		for (j=0; j<3; j++)
			{
			for (t=0; t<5; t++)
	      		{
				System.out.printf("Ingrese el estado de la suscripcion del cliente " + getCliente(t,0) + " en el mes " + n + ": ");
				ingresos[t][j] = sc.nextInt();
	      		}	
			n = n+1;
			System.out.printf("\n");
			}
		}
	
	public void ConsultarReporte()
		{
		int op, j, t, info;
	
		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n                Reportes o Consultas                   ");
		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n\n1: Listar los clientes por instructor.");
		System.out.printf("\n2: Listar los ingresos por mes.");
		System.out.printf("\n3: Listar el total de monto de las suscripciones por mes.");
		System.out.printf("\n4: Listar el promedio de ingresos para los tres meses.");
		System.out.printf("\n5: Listar los meses con el ingreso mayor al promedio.");
		System.out.printf("\n6: Listar los meses con el ingreso menor al promedio.\n\n");

		System.out.printf("------------------------------------------------------\n");
		System.out.printf("Ingrese el codigo de la funcion que desea realizar: ");
		op=sc.nextInt();
		System.out.printf("------------------------------------------------------\n");

		switch(op)
			{
			case 1:
				System.out.printf("\nIngrese el id del instructor al cual desea saber los clientes: ");
				info = sc.nextInt();
	
				for (t=0; t<3; t++)
		      		{
					if (info == instructD[t][0])
						{
						System.out.printf("\nClientes asignados al Instructor " + getInstructor(t) + ": \n");
						}
		      		}
		      		
				for (j=0; j<5; j++)
	      			{
					if (info == clienteD[j][2])
						{
						System.out.printf("\n  - " + getCliente(j,0));
						}
	      			}	
				System.out.printf("\n");
			break;

			case 2:
					for (t=0; t<5; t++)
	      				{
						for (j=0; j<3; j++)
	  						{
							if (ingresos[t][j] == 1)
								{
								act[j] = act[j] + 1;
								}
	  						}
	      				}
					
					System.out.printf("\nLa cantidad de clientes con suscripcion activa durante el mes 1 es: " + getAct(0));
					System.out.printf("\nLa cantidad de clientes con suscripcion activa durante el mes 2 es: " + getAct(1));
					System.out.printf("\nLa cantidad de clientes con suscripcion activa durante el mes 3 es: " + getAct(2) + "\n");
			break;

			case 3:
					for (t=0; t<5; t++)
	      				{
						if (ingresos[t][0] == 1)
							{
							for (j=0; j<3; j++)
	      						{
								if (clienteD[t][1] == plan[j][0])
									{
									monto[0] = monto[0] + cost[j];
									}
	      						}
							}

						if (ingresos[t][1] == 1)
							{
							for (j=0; j<3; j++)
	      						{
								if (clienteD[t][1] == plan[j][0])
									{
									monto[1] = monto[1] + cost[j];
									}
	      						}
							}

						if (ingresos[t][2] == 1)
							{
							for (j=0; j<3; j++)
	      						{
								if (clienteD[t][1] == plan[j][0])
									{
									monto[2] = monto[2] + cost[j];
									}
	      						}
							}
	      				}
					System.out.printf("\nEl total de monto recaudado a partir de las suscripciones del mes 1 es: $" + getMonto(0));
					System.out.printf("\nEl total de monto recaudado a partir de las suscripciones del mes 2 es: $" + getMonto(1));
					System.out.printf("\nEl total de monto recaudado a partir de las suscripciones del mes 3 es: $" + getMonto(2) + "\n");
			break;
			
			case 4:
					for (t=0; t<3; t++)
						{
						prom = prom + act[t];
						}
					
					prom = prom/3;
					System.out.printf("\nEl promedio de los ingresos de los tres meses es: " + prom + "\n");
			break;

			case 5:
					System.out.printf("\nLos meses con los ingresos mayor al promedio: \n");
					if (act[0] > prom)
						{
						System.out.printf("\n-  Mes 1");
						}
					
					if (act[1] > prom)
						{
						System.out.printf("\n-  Mes 2");
						}
					
					if (act[2] > prom)
						{
						System.out.printf("\n-  Mes 3");
						}
					System.out.printf("\n");
			break;

			case 6:
					System.out.printf("\nLos meses con los ingresos menor al promedio: \n");
					if (act[0] < prom)
						{
						System.out.printf("\n-  Mes 1");
						}
					
					if (act[1] < prom)
						{
						System.out.printf("\n-  Mes 2");
						}
					
					if (act[2] < prom)
						{
						System.out.printf("\n-  Mes 3");
						}
					System.out.printf("\n");
			break;
			
			default: 
					System.out.println("\n\nCODIGO INVALIDO!!!\n");
					System.exit (0); 
			break;
			}
		}
	}
