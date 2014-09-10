package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import HelloWebApp._

object HelloWebApp {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[DeepMe])
    }
}
@Controller
@EnableAutoConfiguration
class DeepMe {
  @RequestMapping(Array("/"))
  @ResponseBody
  def home(): String = "Hello World!"
 
}
