package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;

public class Logic implements Serializable {
	
	public static final String A="Activo";
	public static final String PS="Pasivo";
	public static final String PT="Patrimonio";
	public static final String G="Gasto";
	public static final String I="Ingreso";
	
	private Hashtable<String,String> diccionario;
	
	private double cuentaPorPagar=0;
	private double cuentaPorCobrar=0;
	private double patrimonio=0;
	private double ingreso=0;
	private double gasto=0;

	public Logic() {
		// TODO Auto-generated constructor stub
		diccionario=new Hashtable<String,String>();
		

	}
	
	public void asignarCuentaBalanceGeneral(String tipo, double valor) {
		if(diccionario.get(tipo).equalsIgnoreCase(A)) {
			cuentaPorCobrar+=valor;
		}else if(diccionario.get(tipo).equalsIgnoreCase(PS)) {
			cuentaPorPagar+=valor;
		}else if(diccionario.get(tipo).equalsIgnoreCase(PT)) {
			patrimonio+=valor;
		}else if(diccionario.get(tipo).equalsIgnoreCase(G)) {
			gasto+=valor;
		}else if(diccionario.get(tipo).equalsIgnoreCase(I)) {
			ingreso+=valor;
		}
		
		
		
	}
	
	
	public double calcularUtilidad() {
		
		double utilidad=ingreso-gasto;
		return utilidad;
	}
	
	
	
	
	public void readDiccionario(){
		try{
			FileInputStream fileInput= new FileInputStream(new File("./datos/palabras.txt"));
			ObjectInputStream objectInput= new ObjectInputStream(fileInput);
			
			diccionario= (Hashtable<String, String>) objectInput.readObject();
			objectInput.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	

}
