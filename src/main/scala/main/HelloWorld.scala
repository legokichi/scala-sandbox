package main

import org.apache.spark._


object HelloWorld{
  def main (args: Array[String] ): Unit = {
    println("hello world")
    val conf = new SparkConf().setAppName("HelloSpark").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val count = sc.parallelize(Array(1,2,3,4,5,6,7,8,9)).count()
    println(count)
    System.exit(0)
  }
}