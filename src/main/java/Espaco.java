public class Espaco {
    private String endereco;
    private Double area;
    private Tipo tipo;
    private String responsavel;
    
    public Espaco(String endereco, Double area, Tipo tipo, String responsavel) {
        this.endereco = endereco;
        this.area = area;
        this.tipo = tipo;
        this.responsavel = responsavel;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    

}
