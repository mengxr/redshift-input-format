RedshiftInputFormat
===

Hadoop input format for Redshift tables unloaded with the ESCAPE option.

Usage in Spark:
```scala
import com.github.mengxr.hadoop.input.RedshiftInputFormat

val records = sc.newAPIHadoopFile(
  path,
  classOf[RedshiftInputFormat],
  classOf[java.lang.Long],
  classOf[Array[String]])
```
