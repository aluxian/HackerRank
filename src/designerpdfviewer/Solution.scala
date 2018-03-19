package designerpdfviewer

object Solution {

  val letters = Array('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
    't', 'u', 'v', 'w', 'x', 'y', 'z')

  def designerPdfViewer(h: Array[Int], word: String): Int = {
    val letterToHeight = letters.zip(h).toMap
    val maxHeight = word.map(letterToHeight).max
    val mm2 = word.length * maxHeight
    mm2
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var h = new Array[Int](26);
    for (h_i <- 0 to 26 - 1) {
      h(h_i) = sc.nextInt();
    }
    var word = sc.next();
    val result = designerPdfViewer(h, word);
    println(result)
  }

}
