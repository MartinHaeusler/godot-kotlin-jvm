// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A node used for animation playback.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * An animation player is used for general-purpose playback of animations. It contains a dictionary of [godot.AnimationLibrary] resources and custom blend times between animation transitions.
 *
 * Some methods and properties use a single key to reference an animation directly. These keys are formatted as the key for the library, followed by a forward slash, then the key for the animation within the library, for example `"movement/run"`. If the library's key is an empty string (known as the default library), the forward slash is omitted, being the same key used by the library.
 *
 * [godot.AnimationPlayer] is better-suited than [godot.Tween] for more complex animations, for example ones with non-trivial timings. It can also be used over [godot.Tween] if the animation track editor is more convenient than doing it in code.
 *
 * Updating the target properties of animations occurs at the process frame.
 */
@GodotBaseType
public open class AnimationPlayer : Node() {
  /**
   * Notifies when an animation finished playing.
   *
   * **Note:** This signal is not emitted if an animation is looping.
   */
  public val animationFinished: Signal1<StringName> by signal("animName")

  /**
   * Emitted when a queued animation plays after the previous animation finished. See [queue].
   *
   * **Note:** The signal is not emitted when the animation is changed via [play] or by an [godot.AnimationTree].
   */
  public val animationChanged: Signal2<StringName, StringName> by signal("oldName", "newName")

  /**
   * Notifies when an animation starts playing.
   */
  public val animationStarted: Signal1<StringName> by signal("animName")

  /**
   * Notifies when an animation list is changed.
   */
  public val animationListChanged: Signal0 by signal()

  /**
   * Notifies when the animation libraries have changed.
   */
  public val animationLibrariesUpdated: Signal0 by signal()

  /**
   * Notifies when the caches have been cleared, either automatically, or manually via [clearCaches].
   */
  public val cachesCleared: Signal0 by signal()

  /**
   * The node from which node path references will travel.
   */
  public var rootNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootPtr, NIL)
    }

  /**
   * The key of the currently playing animation. If no animation is playing, the property's value is an empty string. Changing this value does not restart the animation. See [play] for more information on playing animations.
   *
   * **Note:** While this property appears in the Inspector, it's not meant to be edited, and it's not saved in the scene. This property is mainly used to get the currently playing animation, and internally for animation playback tracks. For more information, see [godot.Animation].
   */
  public var currentAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentAnimationPtr, NIL)
    }

  /**
   * If playing, the current animation's key, otherwise, the animation last played. When set, this changes the animation, but will not play it unless already playing. See also [currentAnimation].
   */
  public var assignedAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAssignedAnimationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAssignedAnimationPtr, NIL)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoplayPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  /**
   * This is used by the editor. If set to `true`, the scene will be saved with the effects of the reset animation (the animation with the key `"RESET"`) applied as if it had been seeked to time 0, with the editor keeping the values that the scene had before saving.
   *
   * This makes it more convenient to preview and edit animations in the editor, as changes to the scene will not be saved as long as they are set in the reset animation.
   */
  public var resetOnSave: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResetOnSaveEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResetOnSaveEnabledPtr, NIL)
    }

  /**
   * The length (in seconds) of the currently playing animation.
   */
  public val currentAnimationLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  /**
   * The position (in seconds) of the currently playing animation.
   */
  public val currentAnimationPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationPositionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  /**
   * The process notification in which to update animations.
   */
  public var playbackProcessMode: AnimationProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
      return AnimationPlayer.AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
    }

  /**
   * The default time in which to blend animations. Ranges from 0 to 4096 with 0.01 precision.
   */
  public var playbackDefaultBlendTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultBlendTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultBlendTimePtr, NIL)
    }

  /**
   * If `true`, updates animations in response to process-related notifications.
   */
  public var playbackActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
    }

  /**
   * The speed scaling ratio. For example, if this value is `1`, then the animation plays at normal speed. If it's `0.5`, then it plays at half speed. If it's `2`, then it plays at double speed.
   *
   * If set to a negative value, the animation is played in reverse. If set to `0`, the animation will not advance.
   */
  public var speedScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
    }

  /**
   * The call mode to use for Call Method tracks.
   */
  public var methodCallMode: AnimationMethodCallMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMethodCallModePtr, LONG)
      return AnimationPlayer.AnimationMethodCallMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMethodCallModePtr, NIL)
    }

  /**
   * The number of possible simultaneous sounds for each of the assigned AudioStreamPlayers.
   *
   * For example, if this value is `32` and the animation has two audio tracks, the two [godot.AudioStreamPlayer]s assigned can play simultaneously up to `32` voices each.
   */
  public var audioMaxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioMaxPolyphonyPtr, NIL)
    }

  /**
   * If `true` and the engine is running in Movie Maker mode (see [godot.MovieWriter]), exits the engine with [godot.SceneTree.quit] as soon as an animation is done playing in this [godot.AnimationPlayer]. A message is printed when the engine quits for this reason.
   *
   * **Note:** This obeys the same logic as the [animationFinished] signal, so it will not quit the engine if the animation is set to be looping.
   */
  public var movieQuitOnFinish: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMovieQuitOnFinishEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMovieQuitOnFinishEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONPLAYER, scriptIndex)
    return true
  }

  /**
   * A virtual function for processing after key getting during playback.
   */
  public open fun _postProcessKeyValue(
    animation: Animation,
    track: Int,
    `value`: Any?,
    _object: Object,
    objectIdx: Int,
  ): Any? {
    throw NotImplementedError("_post_process_key_value is not implemented for AnimationPlayer")
  }

  /**
   * Adds [library] to the animation player, under the key [name].
   */
  public fun addAnimationLibrary(name: StringName, library: AnimationLibrary): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to library)
    TransferContext.callMethod(rawPtr, MethodBindings.addAnimationLibraryPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the [godot.AnimationLibrary] associated with the key [name].
   */
  public fun removeAnimationLibrary(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAnimationLibraryPtr, NIL)
  }

  /**
   * Moves the [godot.AnimationLibrary] associated with the key [name] to the key [newname].
   */
  public fun renameAnimationLibrary(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameAnimationLibraryPtr, NIL)
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.AnimationLibrary] with key [name].
   */
  public fun hasAnimationLibrary(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationLibraryPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the first [godot.AnimationLibrary] with key [name] or `null` if not found.
   *
   * To get the [godot.AnimationPlayer]'s global animation library, use `get_animation_library("")`.
   */
  public fun getAnimationLibrary(name: StringName): AnimationLibrary? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLibraryPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationLibrary?)
  }

  /**
   * Returns the list of stored library keys.
   */
  public fun getAnimationLibraryList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLibraryListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.Animation] with key [name].
   */
  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.Animation] with the key [name]. If the animation does not exist, `null` is returned and an error is logged.
   */
  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Animation?)
  }

  /**
   * Returns the list of stored animation keys.
   */
  public fun getAnimationList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Triggers the [animTo] animation when the [animFrom] animation completes.
   */
  public fun animationSetNext(animFrom: StringName, animTo: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, MethodBindings.animationSetNextPtr, NIL)
  }

  /**
   * Returns the key of the animation which is queued to play after the [animFrom] animation.
   */
  public fun animationGetNext(animFrom: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to animFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.animationGetNextPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their keys.
   */
  public fun setBlendTime(
    animFrom: StringName,
    animTo: StringName,
    sec: Double,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo, DOUBLE to sec)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendTimePtr, NIL)
  }

  /**
   * Returns the blend time (in seconds) between two animations, referenced by their keys.
   */
  public fun getBlendTime(animFrom: StringName, animTo: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Plays the animation with key [name]. Custom blend times and speed can be set.
   *
   * The [fromEnd] option only affects when switching to a new animation track, or if the same track but at the start or end. It does not affect resuming playback that was paused in the middle of an animation. If [customSpeed] is negative and [fromEnd] is `true`, the animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * The [godot.AnimationPlayer] keeps track of its current or last played animation with [assignedAnimation]. If this method is called with that same animation [name], or with no [name] parameter, the assigned animation will resume playing if it was paused.
   *
   * **Note:** The animation will be updated the next time the [godot.AnimationPlayer] is processed. If other variables are updated at the same time this is called, they may be updated too early. To perform the update immediately, call `advance(0)`.
   */
  @JvmOverloads
  public fun play(
    name: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see its description for more information.
   */
  @JvmOverloads
  public fun playBackwards(name: StringName = StringName(""), customBlend: Double = -1.0): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend)
    TransferContext.callMethod(rawPtr, MethodBindings.playBackwardsPtr, NIL)
  }

  /**
   * Pauses the currently playing animation. The [currentAnimationPosition] will be kept and calling [play] or [playBackwards] without arguments or with the same animation name as [assignedAnimation] will resume the animation.
   *
   * See also [stop].
   */
  public fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the `custom_speed` is reset to `1.0`. See also [pause].
   *
   * If [keepState] is `true`, the animation state is not updated visually.
   *
   * **Note:** The method / audio / animation playback tracks will not be processed by this method.
   */
  @JvmOverloads
  public fun stop(keepState: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed` are `0`).
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Queues an animation for playback once the current one is done.
   *
   * **Note:** If a looped animation is currently playing, the queued animation will never play unless the looped animation is stopped somehow.
   */
  public fun queue(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.queuePtr, NIL)
  }

  /**
   * Returns a list of the animation keys that are currently queued to play.
   */
  public fun getQueue(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getQueuePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Clears all queued, unplayed animations.
   */
  public fun clearQueue(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearQueuePtr, NIL)
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the [speedScale] property multiplied by `custom_speed` argument specified when calling the [play] method.
   *
   * Returns a negative value if the current animation is playing backwards.
   */
  public fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the key of [animation] or an empty [godot.StringName] if not found.
   */
  public fun findAnimation(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.findAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the key for the [godot.AnimationLibrary] that contains [animation] or an empty [godot.StringName] if not found.
   */
  public fun findAnimationLibrary(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.findAnimationLibraryPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * [godot.AnimationPlayer] caches animated nodes. It may not notice if a node disappears; [clearCaches] forces it to update the cache again.
   */
  public fun clearCaches(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachesPtr, NIL)
  }

  /**
   * Seeks the animation to the [seconds] point in time (in seconds). If [update] is `true`, the animation updates too, otherwise it updates at process time. Events between the current frame and [seconds] are skipped.
   *
   * **Note:** Seeking to the end of the animation doesn't emit [animationFinished]. If you want to skip animation and emit the signal, use [advance].
   */
  @JvmOverloads
  public fun seek(seconds: Double, update: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Shifts position in the animation timeline and immediately updates the animation. [delta] is the time in seconds to shift. Events between the current frame and [delta] are handled.
   */
  public fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, MethodBindings.advancePtr, NIL)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    /**
     * Process animation during physics frames (see [godot.Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]). This is especially useful when animating physics bodies.
     */
    ANIMATION_PROCESS_PHYSICS(0),
    /**
     * Process animation during process frames (see [godot.Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    ANIMATION_PROCESS_IDLE(1),
    /**
     * Do not process animation. Use [advance] to process the animation manually.
     */
    ANIMATION_PROCESS_MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AnimationMethodCallMode(
    id: Long,
  ) {
    /**
     * Batch method calls during the animation process, then do the calls after events are processed. This avoids bugs involving deleting nodes or modifying the AnimationPlayer while playing.
     */
    ANIMATION_METHOD_CALL_DEFERRED(0),
    /**
     * Make method calls immediately when reached in the animation.
     */
    ANIMATION_METHOD_CALL_IMMEDIATE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _postProcessKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "_post_process_key_value")

    public val addAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "add_animation_library")

    public val removeAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "remove_animation_library")

    public val renameAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "rename_animation_library")

    public val hasAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "has_animation_library")

    public val getAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation_library")

    public val getAnimationLibraryListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation_library_list")

    public val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "has_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation")

    public val getAnimationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_animation_list")

    public val animationSetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_set_next")

    public val animationGetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_get_next")

    public val setBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_blend_time")

    public val getBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_blend_time")

    public val setDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_default_blend_time")

    public val getDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_default_blend_time")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "play")

    public val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_backwards")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "pause")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "stop")

    public val isPlayingPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "is_playing")

    public val setCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_current_animation")

    public val getCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation")

    public val setAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_assigned_animation")

    public val getAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_assigned_animation")

    public val queuePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "queue")

    public val getQueuePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "get_queue")

    public val clearQueuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "clear_queue")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "set_active")

    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "is_active")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_speed_scale")

    public val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_playing_speed")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_autoplay")

    public val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_autoplay")

    public val setResetOnSaveEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_reset_on_save_enabled")

    public val isResetOnSaveEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_reset_on_save_enabled")

    public val setRootPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "set_root")

    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "get_root")

    public val findAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "find_animation")

    public val findAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "find_animation_library")

    public val clearCachesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "clear_caches")

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_process_callback")

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_process_callback")

    public val setMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_method_call_mode")

    public val getMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_method_call_mode")

    public val setAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_audio_max_polyphony")

    public val getAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_audio_max_polyphony")

    public val setMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_movie_quit_on_finish_enabled")

    public val isMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_movie_quit_on_finish_enabled")

    public val getCurrentAnimationPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_position")

    public val getCurrentAnimationLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_length")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "seek")

    public val advancePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "advance")
  }
}
