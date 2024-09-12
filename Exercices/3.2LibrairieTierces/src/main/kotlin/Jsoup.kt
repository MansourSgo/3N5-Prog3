package com.jsoupTest.jsoupTest;


import java.io.IOException;

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements


fun main(args : Array<String>){
val url = args[0];
    val document = Jsoup.connect(url).get()
    val body = document.body()
    val element = body.select("a")
    for (i in element){
        println(i.text() + " = ")
    }
}