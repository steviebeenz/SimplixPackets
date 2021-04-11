package simplixpackets;

import dev.simplix.core.common.aop.SimplixApplication;
import io.github.retrooper.packetevents.PacketEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

@SimplixApplication(name = "SimplixPackets", version = "1.0", authors = "Steviebeenz", dependencies = "SimplixCore")
public class main {
    public main(Plugin plugin) {
        PacketEvents.create(plugin);
        PacketEvents.get().getSettings()
                .compatInjector(false)
                .checkForUpdates(false);
        PacketEvents.get().loadAsyncNewThread();
        PacketEvents.get().registerListener(new PEPacketListener());
        PacketEvents.get().init();
    }
}
