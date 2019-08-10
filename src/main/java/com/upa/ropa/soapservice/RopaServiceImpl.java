package com.upa.ropa.soapservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.upa.ropa.producto.Ropa;

@WebService(endpointInterface = "com.upa.ropa.soapservice.RopaService")
public class RopaServiceImpl implements RopaService {

	static List<Ropa> ropaList = new ArrayList<Ropa>();
	
	
	
	@Override
	public Ropa crearRopa(Ropa ropa) {
		// TODO Auto-generated method stub
		ropaList.add(ropa);	
		return ropa;
	}

	@Override
	public List<Ropa> obtenerTodaLaRopa() {
		// TODO Auto-generated method stub
		return ropaList;
	}

}
