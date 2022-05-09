package brightspark.configdelegates.example

import net.minecraftforge.fml.ModLoadingContext
import net.minecraftforge.fml.common.Mod

@Mod(ConfigDelegatesExample.MOD_ID)
class ConfigDelegatesExample {
	companion object {
		const val MOD_ID = "configdelegatesexample"
	}

	init {
		ExampleConfig.register(ModLoadingContext.get())
	}
}
