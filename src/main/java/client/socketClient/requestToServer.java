
package main.java.client.socketClient;

import java.io.IOException;
import java.util.LinkedHashMap;

import main.java.serv.dao.DAOFactory;
import main.java.serv.dao.Vehicule;
import main.java.serv.dao.VehiculeDAOImpl;
import main.java.serv.json.Json;

public class requestToServer {

	DAOFactory dao=new DAOFactory("jdbc:mysql://localhost:8889/tacos", "root", "root");
	private String classe;
	private String type;
	private String objectJson="";
	LinkedHashMap<String,String> listParam = new LinkedHashMap<String,String>();

/*
 * Méthode permettant de traduire et d'executer la requête du client
 */
	public void evalRequest() throws IOException{
		switch (classe){
		case "vehicle" : 
			VehiculeDAOImpl vdao= new VehiculeDAOImpl(dao);
			switch (type){
			case "select" : 
				switch (listParam.size()){
				case 0 : //return Vehicule.getAllVehicule();
					break;
				case 1 :
					if (listParam.containsKey(Parameter.IMMAT)) {
						vdao.find(Integer.parseInt(listParam.get(Parameter.IMMAT)));
					}
					else if (listParam.containsKey(Parameter.ID)) {
						//	 vdao.findById(Integer.parseInt(listParam.get(Parameter.ID)));
					}
				}
				
			case "delete" : 
				switch (listParam.size()){
				case 0 : //return Vehicule.getAllVehicule();
					break;
				case 1 :
						vdao.delete(Integer.parseInt(listParam.get(Parameter.ID)));
				default :
					break;
					
				}
				/*
				 * UPDATE PREND 1 param :  le  vehicule mis à jour
				 */
			case "update" :	
				switch (listParam.size()){
				case 0 : //RIEN
					break;
				case 1 : 	
					Json<Vehicule> myJSon= new Json<Vehicule>(Vehicule.class);
					Vehicule v= myJSon.deSerialize(objectJson);
					vdao.update(v);
					break;


				default :
					break;

				}

				/*
				 * UPDATE PREND 1 param :  le nouveau vehicule
				 */
			case "insert" :
				switch (listParam.size()){
				case 0 : //RIEN
					break;
				case 1 : 	
					Json<Vehicule> myJSon= new Json<Vehicule>(Vehicule.class);
					Vehicule v= myJSon.deSerialize(objectJson);
					vdao.insert(v);;
					break;
				default :
					break;

				}


			}
		case "employee" :
			break;
		default :
			break;
		}
	}}
