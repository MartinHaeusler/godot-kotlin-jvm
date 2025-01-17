// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Detects approximately when the node is visible on screen.
 *
 * The VisibleOnScreenNotifier3D detects when it is visible on the screen. It also notifies when its bounding rectangle enters or exits the screen or a [godot.Camera3D]'s view.
 *
 * If you want nodes to be disabled automatically when they exit the screen, use [godot.VisibleOnScreenEnabler3D] instead.
 *
 * **Note:** VisibleOnScreenNotifier3D uses the render culling code to determine whether it's visible on screen, which also means that its [godot.Node3D.visible] must be `true` to work correctly.
 */
@GodotBaseType
public open class VisibleOnScreenNotifier3D : VisualInstance3D() {
  /**
   * Emitted when the VisibleOnScreenNotifier3D enters the screen.
   */
  public val screenEntered: Signal0 by signal()

  /**
   * Emitted when the VisibleOnScreenNotifier3D exits the screen.
   */
  public val screenExited: Signal0 by signal()

  /**
   * The VisibleOnScreenNotifier3D's bounding box.
   */
  @CoreTypeLocalCopy
  public var aabb: AABB
    @JvmName("getAabb_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getAabb()
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAabbPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISIBLEONSCREENNOTIFIER3D, scriptIndex)
    return true
  }

  /**
   * The VisibleOnScreenNotifier3D's bounding box.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visibleonscreennotifier3d.aabb
   * //Your changes
   * visibleonscreennotifier3d.aabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun aabbMutate(block: AABB.() -> Unit): AABB = aabb.apply{
      block(this)
      aabb = this
  }


  /**
   * If `true`, the bounding box is on the screen.
   *
   * **Note:** It takes one frame for the node's visibility to be assessed once added to the scene tree, so this method will return `false` right after it is instantiated, even if it will be on screen in the draw pass.
   */
  public fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnScreenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier3D", "set_aabb")

    public val isOnScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier3D", "is_on_screen")
  }
}
