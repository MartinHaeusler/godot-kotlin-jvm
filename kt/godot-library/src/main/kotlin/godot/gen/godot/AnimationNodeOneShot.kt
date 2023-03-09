// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Plays an animation once in [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. This node will execute a sub-animation and return once it finishes. Blend times for fading in and out can be customized, as well as filters.
 *
 * After setting the request and changing the animation playback, the one-shot node automatically clears the request on the next process frame by setting its `request` value to [ONE_SHOT_REQUEST_NONE].
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Play child animation connected to "shot" port.
 *
 * animation_tree.set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_FIRE)
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/OneShot/request"] = AnimationNodeOneShot.ONE_SHOT_REQUEST_FIRE
 *
 *
 *
 * # Abort child animation connected to "shot" port.
 *
 * animation_tree.set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_ABORT)
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/OneShot/request"] = AnimationNodeOneShot.ONE_SHOT_REQUEST_ABORT
 *
 *
 *
 * # Get current state (read-only).
 *
 * animation_tree.get("parameters/OneShot/active"))
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/OneShot/active"]
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Play child animation connected to "shot" port.
 *
 * animationTree.Set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_FIRE);
 *
 *
 *
 * // Abort child animation connected to "shot" port.
 *
 * animationTree.Set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_ABORT);
 *
 *
 *
 * // Get current state (read-only).
 *
 * animationTree.Get("parameters/OneShot/active");
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeOneShot : AnimationNodeSync() {
  /**
   * The blend type.
   */
  public var mixMode: MixMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_MIX_MODE,
          LONG)
      return AnimationNodeOneShot.MixMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_MIX_MODE,
          NIL)
    }

  /**
   * The fade-in duration. For example, setting this to `1.0` for a 5 second length animation will produce a crossfade that starts at 0 second and ends at 1 second during the animation.
   */
  public var fadeinTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_FADEIN_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_FADEIN_TIME, NIL)
    }

  /**
   * The fade-out duration. For example, setting this to `1.0` for a 5 second length animation will produce a crossfade that starts at 4 second and ends at 5 second during the animation.
   */
  public var fadeoutTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_FADEOUT_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_FADEOUT_TIME, NIL)
    }

  /**
   * If `true`, the sub-animation will restart automatically after finishing.
   *
   * In other words, to start auto restarting, the animation must be played once with the [ONE_SHOT_REQUEST_FIRE] request. The [ONE_SHOT_REQUEST_ABORT] request stops the auto restarting, but it does not disable the [autorestart] itself. So, the [ONE_SHOT_REQUEST_FIRE] request will start auto restarting again.
   */
  public var autorestart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_HAS_AUTORESTART, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART, NIL)
    }

  /**
   * The delay after which the automatic restart is triggered, in seconds.
   */
  public var autorestartDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART_DELAY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART_DELAY, NIL)
    }

  /**
   * If [autorestart] is `true`, a random additional delay (in seconds) between 0 and this value will be added to [autorestartDelay].
   */
  public var autorestartRandomDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART_RANDOM_DELAY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART_RANDOM_DELAY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEONESHOT, scriptIndex)
    return true
  }

  public enum class OneShotRequest(
    id: Long,
  ) {
    /**
     * The default state of the request. Nothing is done.
     */
    ONE_SHOT_REQUEST_NONE(0),
    /**
     * The request to play the animation connected to "shot" port.
     */
    ONE_SHOT_REQUEST_FIRE(1),
    /**
     * The request to stop the animation connected to "shot" port.
     */
    ONE_SHOT_REQUEST_ABORT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MixMode(
    id: Long,
  ) {
    /**
     * Blends two animations. See also [godot.AnimationNodeBlend2].
     */
    MIX_MODE_BLEND(0),
    /**
     * Blends two animations additively. See also [godot.AnimationNodeAdd2].
     */
    MIX_MODE_ADD(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
