package uia.com.apirest.patronesDisenno.fachada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.compras.SolicitudOrdenCompra;
import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.modelo.SolicitudOCModelo;
import uia.com.apirest.modelo.ItemSolicitudOCModelo;
import uia.com.apirest.modelo.ItemCotizacionModelo;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public abstract class FachadaModelSOC implements IFachada {
    GestorCompras miGestorCompras;

    private HashMap<Integer, SolicitudOrdenCompra> misSolicitudesOC;
    private ArrayList<ItemSolicitudOCModelo> miMoledoSolicitudes = new ArrayList<ItemSolicitudOCModelo>();

    @Autowired
    public FachadaModelSOC(GestorCompras gestorCompras)
    {
        this.miGestorCompras = gestorCompras;
        misSolicitudesOC = this.miGestorCompras.getSolicitudOC(vendedor);
    }


    public ArrayList<ItemSolicitudOCModelo> ItemSolicitudOCModelo(int id)
    {
            for (int i = 0; i < misSolicitudesOC.size(); i++) {
                //   CotizacionModelo(int id, String name, String codigo,  int vendedor, int clasificacionVendedor, double total, int entrega)
                ItemSolicitudOCModelo item = new SolicitudOCModelo(misSolicitudesOC.get(i).getId(), misSolicitudesOC.get(i).getName(), misSolicitudesOC.get(i).getCodigo());


                if (misSolicitudesOC.get(i).getItems() != null) {
                    ArrayList<ItemSolicitudOCModelo> misItemsCotizaciones = new ArrayList<ItemSolicitudOCModelo>();
                    for (int j = 0; j < misSolicitudesOC.get(i).getItems().size(); j++) {
                        ItemSolicitudOCModelo nodo = new ItemSolicitudOCModelo(
                                misSolicitudesOC.get(i).getName());
                        );
                        if(nodo.getId()==id)
                            miMoledoSolicitudes.add(item);
                    }
                }
            }

            return this.miMoledoSolicitudes;

    }

    public ArrayList<ItemComprasUIAModelo> itemsSolicitud(int id)
    {
        return null;
    }

    public ArrayList<ItemSolicitudOCModelo> itemsReporte()
    {
        return null; //this.reporte.getItems();
    }
}
