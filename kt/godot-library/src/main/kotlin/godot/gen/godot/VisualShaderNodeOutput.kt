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
 * Represents the output shader parameters within the visual shader graph.
 *
 * This visual shader node is present in all shader graphs in form of "Output" block with mutliple output value ports.
 */
@GodotBaseType
open class VisualShaderNodeOutput : VisualShaderNode() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEOUTPUT)
}