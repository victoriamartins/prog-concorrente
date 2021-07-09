class Carro extends Thread{
    Passagem passagem;
    String tipo, placa;

    public Carro(String tipo, String placa, Passagem passagem){
        this.tipo = tipo;

        if (tipo.equals("ambulancia")) this.setPriority(10);
        else if (tipo.equals("viatura")) this.setPriority(9);
        else {
            setPriority(5);
            this.tipo = "comum";
        }

        this.placa = placa;
        this.passagem = passagem;
    }

    @Override
    public void run(){
        this.passagem.passar(this.tipo);
    }
}
