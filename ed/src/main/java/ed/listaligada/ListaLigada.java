package ed.listaligada;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;
    public void adicionaNoComeco(Object elemento){
        if(this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }

        this.totalDeElementos++;

    }

    @Override
    public String toString() {

        if(this.totalDeElementos == 0) {
            return "[]";
        }
        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProxima();
        }

        builder.append("]");

        return builder.toString();
    }

    public void adiciona(Object elemento){

        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        }else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }

    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao){
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao Inexistente");
        }

        Celula atual = primeira;

        for(int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    public void adiciona(int posicao, Object elemento) {

        if(posicao == 0 ) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            adiciona(elemento);
        } else {
            Celula anterior = pegaCelula(posicao - 1);
            Celula proxima = anterior.getProxima();

            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco() {
        if(this.totalDeElementos == 0 ) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        this.primeira = this.primeira.getProxima();
        this.totalDeElementos--;

        if(this.totalDeElementos == 0) {
            this.ultima = null;
        }

    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object elemento){
        Celula atual = this.primeira;
        while(atual != null) {
            if(atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public void removeDoFim() {
        if(this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProxima(null);;
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }

    public void remove(int posicao) {
        if(posicao == 0) {
            this.removeDoComeco();
        } else if ( posicao == this.totalDeElementos -1) {
            this.removeDoFim();
        } else {
            Celula anterior = this.pegaCelula(posicao -1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();

            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);

            this.totalDeElementos--;
        }
    }

}
