// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public object GDExtensionManager : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GDEXTENSIONMANAGER)
    return false
  }

  /**
   *
   */
  public fun loadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSIONMANAGER_LOAD_EXTENSION,
        LONG)
    return GDExtensionManager.LoadStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun reloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSIONMANAGER_RELOAD_EXTENSION,
        LONG)
    return GDExtensionManager.LoadStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun unloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSIONMANAGER_UNLOAD_EXTENSION,
        LONG)
    return GDExtensionManager.LoadStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun isExtensionLoaded(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDEXTENSIONMANAGER_IS_EXTENSION_LOADED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getLoadedExtensions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDEXTENSIONMANAGER_GET_LOADED_EXTENSIONS, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   *
   */
  public fun getExtension(path: String): GDExtension? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSIONMANAGER_GET_EXTENSION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as GDExtension?
  }

  public enum class LoadStatus(
    id: Long,
  ) {
    /**
     *
     */
    LOAD_STATUS_OK(0),
    /**
     *
     */
    LOAD_STATUS_FAILED(1),
    /**
     *
     */
    LOAD_STATUS_ALREADY_LOADED(2),
    /**
     *
     */
    LOAD_STATUS_NOT_LOADED(3),
    /**
     *
     */
    LOAD_STATUS_NEEDS_RESTART(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
