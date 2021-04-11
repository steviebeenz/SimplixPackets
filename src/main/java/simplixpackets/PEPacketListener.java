package simplixpackets;

import dev.simplix.core.common.event.Events;
import io.github.retrooper.packetevents.event.PacketListenerAbstract;
import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;
import io.github.retrooper.packetevents.event.priority.PacketEventPriority;

public class PEPacketListener extends PacketListenerAbstract {
    public PEPacketListener() {
        super(PacketEventPriority.MONITOR);
    }

    @Override
    public void onPacketPlayReceive(PacketPlayReceiveEvent event) {
        Events.call(new SimplixIncomingPacket(event));
    }
    @Override
    public void onPacketPlaySend(PacketPlaySendEvent event) {
        Events.call(new SimplixOutgoingPacket(event));
    }

}
