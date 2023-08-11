
class Persona {
     private int id;
     private int edad;
     private Sexo type;

    public Persona(int id, int edad, Sexo type) {
        this.id = id;
        this.edad = edad;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getType() {
        return type;
    }

    public void setType(Sexo type) {
        this.type = type;
    }
}
