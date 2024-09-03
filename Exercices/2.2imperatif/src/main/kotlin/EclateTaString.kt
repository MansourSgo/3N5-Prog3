package org.example

fun main(args : Array<String>){
    var mot = 0;
    var lettres = 0;
    for (Char in args[mot]){
        if (lettres == args[mot].length ){
            mot++;
        }
        println(args[mot][lettres])
        lettres++
    }
}