package simplixpackets;

import dev.simplix.core.common.aop.SimplixApplication;
import io.github.retrooper.packetevents.PacketEvents;
import org.bukkit.Bukkit;

@SimplixApplication(name = "SimplixPackets", version = "1.0", authors = "Steviebeenz", dependencies = "SimplixCore")
public class main {
    public main() {
        PacketEvents.create(Bukkit.getPluginManager().getPlugin("SimplixCore"));
        PacketEvents.get().getSettings()
                .compatInjector(false)
                .checkForUpdates(false);
        PacketEvents.get().loadAsyncNewThread();
        PacketEvents.get().registerListener(new PEPacketListener());
        PacketEvents.get().init();
    }
}
