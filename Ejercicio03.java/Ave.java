public abstract class Ave extends Animal{

    public Ave(String sexo, String nombre){
        super(sexo,nombre);
    }

    public void volar(){
        System.out.println(nombre+" está volando");
    }

    public void poneHuevo(){
        System.out.println(nombre+" ha puesto un huevo");
    }

    public void aterriza(){
        System.out.println(nombre+" ha aterrizado");
    }
}
