package love.chihuyu.silkspawner

import love.chihuyu.silkspawner.events.BlockBrake
import org.bukkit.plugin.java.JavaPlugin

class SilkSpawner: JavaPlugin() {
    companion object {
        lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }
    override fun onEnable() {
        server.pluginManager.registerEvents(BlockBrake(this), this)
        logger.info("plugin has loaded.")
    }

    override fun onDisable() {
        logger.info("plugin has unloaded")
    }
}