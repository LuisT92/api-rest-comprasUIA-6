package uia.com.apirest.patronesDisenno.fachada;

import uia.com.apirest.modelo.ItemSolicitudOCModelo;

import java.util.ArrayList;

public interface IFachadaSOC {
    ArrayList<ItemSolicitudOCModelo> getItems(int id);
}
