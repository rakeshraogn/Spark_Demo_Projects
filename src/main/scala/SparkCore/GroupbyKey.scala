package SparkCore

/**
  * Created by Pankaj Gaur on 07-07-2020.
  */

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.sql._

object GroupbyKey {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.master("local[*]").appName("reducebykeyvsGroupbykey").getOrCreate()
    val sc = spark.sparkContext







  }
}