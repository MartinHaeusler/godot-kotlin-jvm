package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.ext.fqNameIsJvmType
import godot.entrygenerator.model.FloatRangeHintAnnotation
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RegisteredProperty
import java.util.*

class FloatRangeHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<FloatRangeHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.FLOAT)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, JvmType.FLOAT.fqName)
        }
        if (propertyHintAnnotation == null) {
            return ""
        }

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(propertyHintAnnotation.start)
        argumentsForStringTemplate.add(propertyHintAnnotation.end)
        if (propertyHintAnnotation.step >= 0) {
            argumentsForStringTemplate.add(propertyHintAnnotation.step)
        }

        if (propertyHintAnnotation.or != Range.NONE) {
            argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
        }

        return argumentsForStringTemplate.joinToString(",")
    }
}
