package entitiesObject;

public class Rectangle {
    //ATRIBUTOS
    public double largura;
    public double altura;

    //MÉTODOS
    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return (largura * 2) + (altura * 2);
    }

    public double diagonal(){
        return Math.sqrt(largura*largura + altura*altura);
    }
}
