class Main {
    public static void main(String[] args) throws InterruptedException{
        Passagem p = new Passagem();
        Carro amb1 = new Carro("ambulancia", "ABC1234", p);
        Carro amb2 = new Carro("ambulancia", "UVW8901", p);
        Carro viat1 = new Carro("viatura", "POL5678", p);
        Carro comum1 = new Carro("", "MNO3421", p);

        comum1.start();
        amb1.start();
        amb2.start();
        viat1.start();
    }
}