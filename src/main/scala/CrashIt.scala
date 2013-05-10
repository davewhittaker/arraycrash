object CrashIt extends App {

	import scala.collection.JavaConverters._

	val arrays = ListVendor.list().asScala

	arrays foreach { 
		case a: Array[_] =>
			(a(0),a(1)) match {
				case (a: String, null) => println("As I expected!")
				case other => println("Huh?")
			}
		case _ => println("Not an array")
	}

}