package playground

import scala.collection.immutable.HashSet

object ScalaPlayground extends App {
  println("Hello!")

  var res = twoSum(Seq(1,2,3,4,5), 5)
  println(res)

  private def twoSum(values: Seq[Int], sum: Int): Option[(Int, Int)] = {

    def inner(values: Seq[Int], set: HashSet[Int]):Option[(Int, Int)] = values match {
      case Nil => None
      case head :: tail =>  if(set.contains(sum - head))
                              Some(sum - head, head)
                            else
                              inner(tail, set + head)
    }

    inner(values, HashSet.empty[Int])
  }
}


