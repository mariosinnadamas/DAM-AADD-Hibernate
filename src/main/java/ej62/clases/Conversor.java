package ej62.clases;

import jakarta.persistence.AttributeConverter;


public class Conversor implements AttributeConverter<Casa,String> {

    //JAVA --> BD
    @Override
    public String convertToDatabaseColumn(Casa casa) {
        if (casa == null){
            return null;
        }
        return casa.getDireccion() + " ; " + casa.getCiudad() + " ; " +
                casa.getCodigoPostal();
    }

    @Override
    public Casa convertToEntityAttribute(String direccionBD) {
        if (direccionBD == null || direccionBD.isEmpty()){
            return null;
        }

        String[] partes = direccionBD.split(";");
        return new Casa(partes[0], partes[1], partes[2]);
    }
}
