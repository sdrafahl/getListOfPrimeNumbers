object ListOfPrimes {

  def main(args: Array[String]) {
    val x = 0;
    var primes: List[Int] = List();
    for(x <- 1 until 100) {
      if(isPrime((x))) {
        primes = x :: primes;
      }
    }
    println(primes);
  }

  def isPrime(value: Int): Boolean = {
    var a = 0;
    var result = true;
    for (a <- 2 until value) {
      result = (value % a) != 0 && result;
    }
    return result;
  }
}