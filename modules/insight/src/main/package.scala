package lila

package object insight extends PackageObject {

  private[insight] def logger = lila.log("insight")

  private[insight] type Ply = Int
}
