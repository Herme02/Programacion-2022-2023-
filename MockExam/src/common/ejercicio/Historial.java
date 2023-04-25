package common.ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Historial {
	

	private Map<LocalDate, Combinacion> sorteos;

	public Historial() {
		super();
		this.sorteos = new HashMap<>();
	}
	
	
	public boolean addSorteo(LocalDate fechaSorteo, Combinacion c1) throws HistorialException{
		boolean validacion = false;
		
		if(!sorteos.containsKey(fechaSorteo)) {
			this.sorteos.put(fechaSorteo, c1);
			validacion = true;
		}else {
			throw new HistorialException("Ya hay un sorteoen esta fecha");
		}
		return validacion;
	}
	
	
	public boolean addSorteo(int anno, int mes,  int dia, Combinacion c1) throws HistorialException {
		boolean validacion = false;
		
		LocalDate fechaComprimida = LocalDate.of(anno, mes, dia);
		
		if(!sorteos.containsKey(fechaComprimida)) {
			this.sorteos.put(fechaComprimida, c1);
			validacion = true;
		}else {
			throw new HistorialException("Ya hay un sorteo en esta fecha");
		}
		
		return validacion;
	}

	
	public boolean actualizarSorteo(int anno, int mes,  int dia, Combinacion c1) throws HistorialException{
		boolean validacion = false;
		
		LocalDate fechaComprimida = LocalDate.of(anno, mes, dia);
		
		if(sorteos.containsKey(fechaComprimida)) {
			this.sorteos.replace(fechaComprimida, this.sorteos.get(fechaComprimida),c1);
			validacion = true;
		}else {
			throw new HistorialException("No se ha encontrado la fecha del sorteo a actualizar");
		}
		
		return validacion;
		
	}
	
	
	public boolean actualizarSorteo(LocalDate fechaSorteo, Combinacion c1) throws HistorialException{
		boolean validacion = false;
		
		if(sorteos.containsKey(fechaSorteo)) {
			this.sorteos.replace(fechaSorteo, this.sorteos.get(fechaSorteo), c1);
			validacion = true;
		}else {
			throw new HistorialException("No se a encontrado la fecha del sorteo a actualizar");
		}
		
		return validacion;
	}
	
	
	public boolean borrarSorteo(LocalDate fechaSorteo) throws HistorialException{
		boolean validacion = false;
		
		if(sorteos.containsKey(fechaSorteo)) {
			this.sorteos.remove(fechaSorteo);
			validacion = true;
		}else {
			throw new HistorialException("No se a encontrado la fecha del sorteo a borrar");
		}
		
		return validacion;
	}
	
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> listaPorFecha = new ArrayList<>();
		
		for(LocalDate i : this.sorteos.keySet()) {
			if(i.isAfter(fecha)) {
				listaPorFecha.add(this.sorteos.get(i).toString());
			}
		}
		return listaPorFecha;
	}
	
	
	public List<String> mostrarHistorico(){
		List<String> historico = new ArrayList<>();
		
		for(LocalDate i : this.sorteos.keySet()) {
			
				historico.add(this.sorteos.get(i).toString());
			
		}
		return historico;
	}
	
	
}
