import java.io._

object Principal {


  def main(args: Array[String]): Unit = {
    var input_file = "/temp/example1.dat"
    var output_file = "/temp/example1.backup"

    var input = None: Option[FileInputStream]
    var output = None: Option[FileOutputStream]

    try {
      input = Some(new FileInputStream(input_file))
      output = Some(new FileOutputStream(output_file))
      var character = 0
      while ( {
        character = input.get.read;character != -1 }) {
        output.get.write(character)
      }
    } catch {
      case ex1: IOException => ex1.printStackTrace()
    } finally {
      println("[!] clearning up ...")
      if (input.isDefined) input.get.close()
      if (output.isDefined) output.get.close()
    }
  }
}