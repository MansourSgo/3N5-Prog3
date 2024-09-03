package org.example

fun main(args : Array<String>){
for (string in args){
    var hauteur = string.toInt();
    var esp = " ";
    var nbr = 0;
    for(row in 1..hauteur){
        print(esp.repeat(hauteur - row  ))
        for (col in 1..row + nbr){
            print("*")
        }
        nbr++;
        println()
    }
}


}