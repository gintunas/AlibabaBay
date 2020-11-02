package tracking

trait Tracking {
  private val location = "Not shipped yet."

  def getLocation: String = location
}
