package com.julian082.app2687390

public class Consionales {
fun main() {

        print("Digite el primer numero")
        Var num1= readLine()!!.toInt()

        print("Digite el segundo numero")
        Var num2= readLine()!!.toInt()

        if (num1 > num2){
            print (num1)
        }
        else if (num1 < num2){
            print (num2)
        }

        else if (num1 == num2){
            print ("Los numeros son iguales")
        }
        else{
            print("Error")
        }

        //Crear un numero aleatorio
        Var aleatorio= (1<..<50).random()

        print("Digite un numero de 1 a 20")
        Var num= readLine()!!.toInt()

        if (num in 1<..<20 ){
            print ("Esta en el rango")
        }
        else{
            print("Te dije un numero del 1 al 20, me estresa trabajar con gente que no sabe seguir ordenes, ya mejor apague y vamonos")
        }

        Var aleatorio= (0<..<50).random()

        when (aleatorio)
        0 -> println("No hay concidencias ${aleatorio}" )
        in 1..10 -> println("Hay 10 concidencias ${aleatorio}")
        in 20..50 -> println("Hay muchas condiciones ${aleatorio}")


        println("Bienvenido, este es un jego de lanzar 2 dados, Ganas si:\n
                Sacas un par de unos en los dos dados \n
                Sacas un total  de tres en los 2 dados\n
                Sacas un total  de tres en los 2 dados\n ")
                Var dado1= (1<..<6).random()
        Var dado2= (1<..<6).random()

        if (dado1 ==1 && dado2 ==1)
        {
            println("Gano con un par de unos")
        }
        else if (dado1 ==2 && dado2 ==1 || dado1 ==2 && dado2 ==1)
        {
            println("Gano al sacar tres")
        }

        else if (dado1 ==5 && dado2 ==6 || dado1 ==6 && dado2 ==5)
        {
            println("Gano al sacar once")
        }
        else  if (dado1 ==6 && dado2 ==6 )
        {
            println("Gano con un par de seis")
        }
        else if (dado1 ==4 && dado2 ==3 || dado1 ==3 && dado2 ==4 || dado1 ==5 && dado2 ==2 || dado1 ==2 && dado2 ==5 || dado1 ==6 && dado2 ==1 || dado1 ==1 && dado2 ==6 )
        {
            println("Gano al sacar 7")
        }

        else {
            println("Perdio")
        }

        println("Bienvenido al supermercado Noe, estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si esta es mayor a 50.000 y dependiendo de tu suerte:\n
                Si scas 1 es la bolita roja, que tiene un descuento del 10% en el valor de tu compra\n
                Si scas 2 es la bolita azul, que tiene un descuento del 30% en el valor de tu compra\n
                Si scas 3 es la bolita amarilla, que tiene un descuento del 50% en el valor de tu compra\n
                Si scas 4 es la bolita blanca, te llevas tu compra totalmente gratis\n")

                println("Ingrese el valor de la compra")
                Var compra= readLine()!!.toInt()
                Var bola= (1<..<4).random()

        if (compra>50000){
            if (bola==1)
            {
                println("Usted tiene un descuento del 10%, al sacar la bola roja");
                Var desc=(valor+10)/100;
                Var total=compra-desc;
                println("Su valor a pagar con el descuento es del: " + total);
            }
            else if (bola==2)
            {
                println("Usted tiene un descuento del 30%, al sacar la bola azul");
                Var desc=(valor+30)/100;
                Var total=compra-desc;
                println("Su valor a pagar con el descuento es del: " + total);
            }
            else  if (bola==3)
            {
                println("Usted tiene un descuento del 50%, al sacar la bola amarilla");
                Var desc=(valor+50)/100;
                Var total=compra-desc;
                println("Su valor a pagar con el descuento es del: " + total);
            }
            else if (bola==4)
            {
                println("Usted tiene un descuento del 100%, al sacar la bola blanca. Feliicidades su compra es gratis");
                Var desc=(valor+100)/100;
                Var total=compra-desc;
                println("Su valor a pagar con el descuento es del: " + total);
            }
            else
            {
                println("Usted no cuenta con ningun descuento.");
                println("Su total a pagar es ${compra}");
            }
        }
    }
}
