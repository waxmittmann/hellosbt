lazy val yellow = taskKey[Unit]("An example task")

lazy val root = (project in file(".")).
  settings(
    name := "hello",
    yellow := {
      println("Yellow Submarine")
    }
  )
