# For Eclipse...

* Install the Scala plugin from [http://scala-ide.org/](http://scala-ide.org/). You can also get a bundle of Eclipse with the plugin already installed from that site.
* Run: `./sbt eclipse` (or `sbt.bat eclipse`) to generate Eclipse files.
* In Eclipse, File > Import > Existing project into Workspace and select this folder.

# For IntelliJ...

* Install the JetBrains Scala plugin (there are detailed instructions in [the Lift cookbook](http://cookbook.liftweb.net/#idea))
* Run: `./sbt gen-idea` to generate IDEA project files.
* In IntelliJ, select Open Project and navigate to select this folder.


