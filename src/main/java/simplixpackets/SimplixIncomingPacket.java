package simplixpackets;

import dev.simplix.core.common.event.AbstractEvent;
import io.github.retrooper.packetevents.event.PacketEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.packetwrappers.play.in.flying.WrappedPacketInFlying;
import io.github.retrooper.packetevents.packetwrappers.play.in.useentity.WrappedPacketInUseEntity;

public class SimplixIncomingPacket extends AbstractEvent  {

    private PacketPlayReceiveEvent packet;

    public SimplixIncomingPacket(PacketPlayReceiveEvent packet) {
        this.packet = packet;

    }

    public PacketEvent getPacket() {return packet;}
}
