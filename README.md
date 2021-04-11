# SimplixPackets
 Simple NoDepend Packet API SimplixModule for SimplixCore (Powered by PacketEvents)
 

Events:
 - simplixpackets.SimplixIncomingPacket
 - simplixpackets.SimplixIncomingPacket

Get PE Packet: **event**.getPacket()

Check Type: **event**.getPacket.getPacketId() == PacketType.Play.Server.**InsertpacketType**

### Example of making a Flying Packet wrapper

WrappedPacketInFlying **MyWrapperName** = new WrappedPacketInUseEntity(**event**.getPacket().getNMSPacket())

### Initialisation:

1. SimplixInstaller (just add new simplixpackets.main(this))
2. Manual (new simplixpackets.main(this))

The parameter is a plugin's main class.