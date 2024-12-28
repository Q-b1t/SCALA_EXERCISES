class Curso (){
  var v_publica:Int=0
  private var v_privada:Int=0
  protected var v_protected: Int=0

}

class Asignatura extends Curso{
  var z:Int=0

}

object Principal
{
  def main(args: Array[String]): Unit = {
    var curso1= new Curso()
  }



}