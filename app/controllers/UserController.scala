package controllers

import java.util.Locale
import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents}

@Singleton
class UserController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  def create = Action { request =>
    val body: AnyContent = request.body

    val contentType: Option[String] = request.contentType.map(_.toLowerCase(Locale.ENGLISH))
    println(contentType)

    val name = body.asText
    println(name)
    Ok("not implemented")
  }

  def get(id: Int) = Action {
    println(id)
    Ok("not implemented")
  }

  def delete(id: Int) = Action {
    println(id)
    Ok("not implemented")
  }
}
