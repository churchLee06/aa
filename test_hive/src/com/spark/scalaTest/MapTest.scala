package com.spark.scalaTest

object MapTest {
  
  def main(args: Array[String]){
       val sites = Map("runoob" -> "http://www.runoob.com",
                       "baidu" -> "http://www.baidu.com",
                       "taobao" -> "http://www.taobao.com")
      println( "colors 中的键为 : " + sites.keys )
      println( "colors 中的值为 : " + sites.values )
      println( "检测 colors 是否为空 : " + sites.isEmpty )
      
      sites.keys.foreach{ i =>  
                           print( "Key = " + i )
                           println(" Value = " + sites(i) )}
  
  }
}