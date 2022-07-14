package com.spark.scalaTest

object ArrayTest {
  def main(args: Array[String]) {
    
    //调用方法
    singleArray
    multiArray
    
      
   }
  
  //数组
  def singleArray() {
       var myList = Array(1.9, 2.9, 3.4, 3.5)
     
       println("数组：" + '\n')
      // 输出所有数组元素
      for ( x <- myList ) {
         println( x )
      }


      // 计算数组所有元素的总和
      var total = 0.0;
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("总和为 " + total);
      
      
      // 查找数组中的最大元素
      var max = myList(0);
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      println("最大值为 " + max);
      
  }
  
    //多维数组
    def multiArray() {
      val myMatrix = Array.ofDim[Int](3, 3)
     
      // 创建矩阵
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }
     
      println('\n' + "多维数组：" + '\r')
      // 打印二维阵列
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
  }
    
}