package org.example;

public class Familia {

    private Animal papa;
    private Animal mama;
    private Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia(){
        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa.getNombre()+
                        "\nLa mamá es: "+this.mama.getNombre()+
                            "\nEl hijo es: "+this.hijo.getNombre()
        );
    }

    public Animal getPapa() {
        return papa;
    }

    public void setPapa(Animal papa) {
        this.papa = papa;
    }

    public Animal getMama() {
        return mama;
    }

    public void setMama(Animal mama) {
        this.mama = mama;
    }

    public Animal getHijo() {
        return hijo;
    }

    public void setHijo(Animal hijo) {
        this.hijo = hijo;
    }

    public void tenerHijo(String nombre){
        System.out.println(this.papa.getPareja());
        if(this.papa.getPareja() != null){
            Animal hijo = new Animal();
            hijo.setNombre(nombre);
            hijo.setPeso(1.0);
            double random = Math.random();
            if (random < 0.5){
                hijo.setGenero("F");
            } else{
                hijo.setGenero("M");
            }
            setHijo(hijo);
        }else{
            System.out.println("Aun no puedes tener hijos");
        }
    }
}
