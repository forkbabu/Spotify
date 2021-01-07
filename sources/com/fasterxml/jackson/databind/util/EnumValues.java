package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        int i = ClassUtil.a;
        Class<? super Enum<?>> superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum<?>[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr != null) {
            String[] findEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(superclass, enumArr, new String[enumArr.length]);
            SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
            int length = enumArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Enum<?> r4 = enumArr[i2];
                String str = findEnumValues[i2];
                if (str == null) {
                    str = r4.name();
                }
                serializableStringArr[r4.ordinal()] = new SerializedString(str);
            }
            return new EnumValues(cls, serializableStringArr);
        }
        StringBuilder V0 = je.V0("Cannot determine enum constants for Class ");
        V0.append(cls.getName());
        throw new IllegalArgumentException(V0.toString());
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public SerializableString serializedValueFor(Enum<?> r2) {
        return this._textual[r2.ordinal()];
    }
}
