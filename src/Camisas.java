public class Camisas {

    String Tamanho;
    String Cor;

    public Camisas(String Tamanho){
        this.Tamanho = Tamanho;

    }

    public Camisas(String Tamanho, String Cor){
        this.Tamanho = Tamanho;
        this.Cor = Cor;

    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public String getCor() {
        return Cor;
    }

    public String retonar(){
        return "\n" + Tamanho + "\n" + Cor;

    }

    public class Oversized extends Camisas{
       String Tipo;


        public Oversized(String Tamanho, String Tipo) {
            super(Tamanho);
            this.Tipo = Tipo;

        }

        public Oversized(String Tamanho, String Cor, String Tipo){
            super(Tamanho, Cor);
            this.Tipo = Tipo;

        }

        public void setTipo(String tipo) {
            Tipo = tipo;
        }

        public String getTipo() {
            return Tipo;
        }

        public String retornarOversized(){
            return Tipo;

        }

    }

}
