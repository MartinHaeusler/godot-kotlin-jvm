// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Suppress

/**
 * Vertical scroll bar.
 *
 * Vertical version of [godot.ScrollBar], which goes from top (min) to bottom (max).
 */
@GodotBaseType
open class VScrollBar : ScrollBar() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VSCROLLBAR)
}