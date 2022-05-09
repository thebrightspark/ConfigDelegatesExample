package brightspark.configdelegates.example

import brightspark.configdelegates.DelegatedConfig

object ExampleConfig : DelegatedConfig() {
	val testNumber: Long by config {
		comment("Here's a comment")
		defineInRange("testNumber", 0L, 0L, 1000L)
	}

	var mutableString: String by configMutable {
		comment("Here's another comment")
		define("mutableString", "default")
	}
}
