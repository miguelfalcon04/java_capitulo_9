public abstract class Animal {

    protected String sexo;
    protected String nombre;


    public Animal(String sexo, String nombre){
        this.sexo = sexo;
        this.nombre=nombre;
    }

    public String getSexo(){
        return sexo;
    }

    public String getNombre(){
        return nombre;
    }

    public void duerme(){
        System.out.println("Zzzzzzzz");
    }

    public void come(String comida){
        System.out.print("Estoy comiendo "+comida);
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
