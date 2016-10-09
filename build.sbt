name := "justplayscala"

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
   "org.webjars" 		%	"bootstrap" 		% "3.1.1-1",
  "org.webjars" 		% 	"bootswatch-yeti" 	% "3.1.1",
  "org.webjars" 		% 	"html5shiv" 		% "3.7.0",
  "org.webjars" 		% 	"respond" 			% "1.4.2"
)