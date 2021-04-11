package simplixpackets;

import dev.simplix.core.common.event.AbstractEvent;
import io.github.retrooper.packetevents.event.PacketEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;

public class SimplixOutgoingPacket extends AbstractEvent  {

    private PacketPlaySendEvent packet;

    public SimplixOutgoingPacket(PacketPlaySendEvent packet) {
        this.packet = packet;
    }

    public PacketEvent getPacket() {return packet;}
}
