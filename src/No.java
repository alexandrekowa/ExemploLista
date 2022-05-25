public class No {
	
    private Integer info;
    private No proximo;

    public No(){
        info = null;
        proximo = null;
    }

    public void setInfo(Integer info){
        this.info = info;
    }

    public void setProx(No proximo){
        this.proximo = proximo;
    }

    public Integer getInfo(){
        return this.info;
    }

    public No getProx(){
        return this.proximo;
    }
}
