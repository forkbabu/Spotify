package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.google.common.base.Optional;
import com.google.common.collect.Multimap;
import java.io.Serializable;
import java.lang.reflect.Type;

public class GuavaTypeModifier extends TypeModifier implements Serializable {
    static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.type.TypeModifier
    public JavaType modifyType(JavaType javaType, Type type, TypeBindings typeBindings, TypeFactory typeFactory) {
        if (javaType.isReferenceType() || javaType.isContainerType()) {
            return javaType;
        }
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == Multimap.class) {
            return MapLikeType.upgradeFrom(javaType, javaType.containedTypeOrUnknown(0), javaType.containedTypeOrUnknown(1));
        }
        return rawClass == Optional.class ? ReferenceType.upgradeFrom(javaType, javaType.containedTypeOrUnknown(0)) : javaType;
    }
}
