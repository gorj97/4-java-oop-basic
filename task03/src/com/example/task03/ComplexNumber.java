package com.example.task03;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumber(int tmpRealPart, int tmpImaginaryPart){
        this.realPart = tmpRealPart;
        this.imaginaryPart = tmpImaginaryPart;
    }

    int getRealPart(){
        return this.realPart;
    }

    int getImaginaryPart(){
        return this.imaginaryPart;
    }

    void setRealPart(int realPart){
        this.realPart = realPart;
    }

    void setImaginaryPart(int imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber complexNumber){
        return new ComplexNumber(this.realPart + complexNumber.realPart, this.imaginaryPart + complexNumber.imaginaryPart);
    }

    public ComplexNumber mult(ComplexNumber complexNumber){
        //a - realPart
        //b - imaginaryPart
        //(a1 + i * b1) * (a2 + i * b2) = (a1 * a2 - b1 * b2) + i(a1 * b2 + b1 * a2)

        return new ComplexNumber(this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart, this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart);
    }

    public String toString(){
        if(this.imaginaryPart > 0) {
            return String.valueOf(this.realPart) + " + i * " + String.valueOf(this.imaginaryPart);
        }
        else{
            return String.valueOf(this.realPart) + " - i * " + String.valueOf(Math.abs(this.imaginaryPart));
        }
    }
}
