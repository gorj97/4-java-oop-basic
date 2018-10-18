package com.example.task03;

public class ComplexNumber {
    int realPart;
    int imaginaryPart;

    ComplexNumber(){}

    ComplexNumber(int tmpRealPart, int tmpImaginaryPart){
        this.realPart = tmpRealPart;
        this.imaginaryPart = tmpImaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber complexNumber){
        return new ComplexNumber(this.realPart + complexNumber.realPart, this.imaginaryPart + complexNumber.imaginaryPart);
    }

    public ComplexNumber mult(ComplexNumber complexNumber){
        return new ComplexNumber(this.realPart * complexNumber.realPart, this.imaginaryPart * complexNumber.imaginaryPart - 2 * this.imaginaryPart * complexNumber.imaginaryPart);
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
