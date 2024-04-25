public class Peluqueria {
    
    public void cortarPelo(Perro p) {
        if (p.getPelo()) {
            p.setPelo(Boolean.FALSE);
        } else {
            System.out.println("Nada que cortar");
        }
    }
}

