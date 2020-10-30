package tracking

trait Tracked {
  private var location = "Not shipped yet."

  def getLocation: String = location
}
