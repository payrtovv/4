
public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Verde";
    private String cilindraje;

    //Constructores

    public Automovil() {

    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }


    public String verDetalle(){
        String dv = "La marca es -> " + this.marca + "\n" +
                "El modelo es -> " + getModelo() + "\n" +
                "El color es -> " + getColor() + "\n" +
                "El cilindraje es -> " + getCilindraje() + "\n";
        return dv;
    }
}
