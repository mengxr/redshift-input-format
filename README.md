RedshiftInputFormat
===

Hadoop input format for Redshift tables unloaded with the ESCAPE option.

Usage in Spark Core:
```scala
import com.github.mengxr.hadoop.input.RedshiftInputFormat

val records = sc.newAPIHadoopFile(
  path,
  classOf[RedshiftInputFormat],
  classOf[java.lang.Long],
  classOf[Array[String]])
```

Usage in Spark SQL:
```scala
import com.github.mengxr.hadoop.input.RedshiftInputFormat._

// Call redshiftFile() that returns a SchemaRDD with all string columns.
val records: SchemaRDD = sqlContext.redshiftFile(path, Seq("name", "age"))
```
