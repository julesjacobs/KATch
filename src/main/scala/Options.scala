package nkpl

object Options {
  var convertToKat = false
  var inputFile = ""
  def katIndex() = s"kat/${inputFile.replace('/', '_')}_index.txt"
  var outputCSV = "benchresults/comparison.csv"
  var freneticTimeout = "86400s" // 24h
}
