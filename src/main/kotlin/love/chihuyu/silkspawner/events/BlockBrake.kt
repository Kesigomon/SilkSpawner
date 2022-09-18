package love.chihuyu.silkspawner.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.plugin.java.JavaPlugin


class BlockBrake(private val plugin: JavaPlugin) : Listener {
    @EventHandler
    fun onBlockBrake(event: BlockBreakEvent){
        val block = event.block;

    }
}
