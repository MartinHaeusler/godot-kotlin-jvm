// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MultiplayerPeer
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract class for specialized [godot.PacketPeer]s used by the [godot.MultiplayerAPI].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/537](https://godotengine.org/asset-library/asset/537)
 *
 * Manages the connection with one or more remote peers acting as server or client and assigning unique IDs to each of them. See also [godot.MultiplayerAPI].
 *
 * **Note:** The [godot.MultiplayerAPI] protocol is an implementation detail and isn't meant to be used by non-Godot servers. It may change without notice.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class MultiplayerPeer internal constructor() : PacketPeer() {
  public val connectionFailed: Signal0 by signal()

  public val connectionSucceeded: Signal0 by signal()

  /**
   * Emitted when a remote peer has disconnected.
   */
  public val peerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted when a remote peer connects.
   */
  public val peerConnected: Signal1<Long> by signal("id")

  public val serverDisconnected: Signal0 by signal()

  /**
   * If `true`, this [godot.MultiplayerPeer] refuses new connections.
   */
  public var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_IS_REFUSING_NEW_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_REFUSE_NEW_CONNECTIONS, NIL)
    }

  /**
   * The manner in which to send packets to the target peer. See [enum TransferMode], and the [setTargetPeer] method.
   */
  public var transferMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_TRANSFER_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_TRANSFER_MODE,
          NIL)
    }

  /**
   * The channel to use to send packets. Many network APIs such as ENet and WebRTC allow the creation of multiple independent channels which behaves, in a way, like separate connections. This means that reliable data will only block delivery of other packets on that channel, and ordering will only be in respect to the channel the packet is being sent on. Using different channels to send **different and independent** state updates is a common way to optimize network usage and decrease latency in fast-paced games.
   *
   * **Note:** The default channel (`0`) actually works as 3 separate channels (one for each [enum TransferMode]) so that [TRANSFER_MODE_RELIABLE] and [TRANSFER_MODE_UNRELIABLE_ORDERED] does not interact with each other by default. Refer to the specific network API documentation (e.g. ENet or WebRTC) to learn how to set up channels correctly.
   */
  public var transferChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_TRANSFER_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_TRANSFER_CHANNEL, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERPEER, scriptIndex)
    return true
  }

  /**
   * Sets the peer to which packets will be sent.
   *
   * The [id] can be one of: [TARGET_PEER_BROADCAST] to send to all connected peers, [TARGET_PEER_SERVER] to send to the peer acting as server, a valid peer ID to send to that specific peer, a negative peer ID to send to all peers except that one. By default, the target peer is [TARGET_PEER_BROADCAST].
   */
  public fun setTargetPeer(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_TARGET_PEER,
        NIL)
  }

  /**
   * Returns the ID of the [godot.MultiplayerPeer] who sent the next available packet. See [godot.PacketPeer.getAvailablePacketCount].
   */
  public fun getPacketPeer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_PACKET_PEER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Waits up to 1 second to receive a new network event.
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_POLL, NIL)
  }

  /**
   * Returns the current state of the connection. See [enum ConnectionStatus].
   */
  public fun getConnectionStatus(): MultiplayerPeer.ConnectionStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_CONNECTION_STATUS, LONG)
    return MultiplayerPeer.ConnectionStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the ID of this [godot.MultiplayerPeer].
   */
  public fun getUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a randomly generated integer that can be used as a network unique ID.
   */
  public fun generateUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GENERATE_UNIQUE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class ConnectionStatus(
    id: Long
  ) {
    /**
     * The MultiplayerPeer is disconnected.
     */
    CONNECTION_DISCONNECTED(0),
    /**
     * The MultiplayerPeer is currently connecting to a server.
     */
    CONNECTION_CONNECTING(1),
    /**
     * This MultiplayerPeer is connected.
     */
    CONNECTION_CONNECTED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Packets are sent to all connected peers.
     */
    public final const val TARGET_PEER_BROADCAST: Long = 0

    /**
     * Packets are sent to the remote peer acting as server.
     */
    public final const val TARGET_PEER_SERVER: Long = 1
  }
}