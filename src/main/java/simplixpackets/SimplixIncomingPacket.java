package simplixpackets;

import dev.simplix.core.common.event.AbstractEvent;
import io.github.retrooper.packetevents.event.PacketEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;

public class SimplixIncomingPacket extends AbstractEvent  {

    private PacketPlayReceiveEvent packet;

    public SimplixIncomingPacket(PacketPlayReceiveEvent packet) {
        this.packet = packet;
    }

    public PacketEvent getPacket() {return packet;}
}
