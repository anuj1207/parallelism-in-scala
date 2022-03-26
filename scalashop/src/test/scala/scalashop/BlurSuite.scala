package scalashop

import java.util.concurrent.*
import scala.collection.*

class BlurSuite extends munit.FunSuite :
  val img = Img(4, 3,
    Array(
      1, 2, 3, 2,
      1, 6, 8, 12,
      44, 23, 43, 65
    )
  )

  test("") {
    println(boxBlurKernel(img, 2, 1, 1))
  }
