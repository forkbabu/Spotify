package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.StdConverter;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Multimap;
import com.google.common.collect.Range;
import com.google.common.collect.Table;
import com.google.common.hash.HashCode;
import com.google.common.net.HostAndPort;
import com.google.common.net.InternetDomainName;
import java.io.Serializable;
import java.util.Set;

public class GuavaSerializers extends Serializers.Base implements Serializable {
    static final long serialVersionUID = 1;

    static class FluentConverter extends StdConverter<Object, Iterable<?>> {
        static final FluentConverter instance = new FluentConverter();

        FluentConverter() {
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public Object convert(Object obj) {
            return (Iterable) obj;
        }
    }

    private JavaType _findDeclared(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        StringBuilder V0 = je.V0("Strange ");
        V0.append(cls.getName());
        V0.append(" sub-type, ");
        V0.append(javaType);
        V0.append(", can not find type parameters");
        throw new IllegalArgumentException(V0.toString());
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
        Set<String> set = null;
        if (!Multimap.class.isAssignableFrom(mapLikeType.getRawClass())) {
            return null;
        }
        Object findFilterId = serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(Multimap.class, beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            set = defaultPropertyIgnorals.getIgnored();
        }
        return new MultimapSerializer(mapLikeType, jsonSerializer, typeSerializer, jsonSerializer2, set, findFilterId);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        if (!Optional.class.isAssignableFrom(referenceType.getRawClass())) {
            return null;
        }
        return new GuavaOptionalSerializer(referenceType, typeSerializer == null && serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING), typeSerializer, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class<?> rawClass = javaType.getRawClass();
        if (Range.class.isAssignableFrom(rawClass)) {
            return new RangeSerializer(_findDeclared(javaType, Range.class));
        }
        if (Table.class.isAssignableFrom(rawClass)) {
            return new TableSerializer(_findDeclared(javaType, Table.class));
        }
        if (HostAndPort.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (InternetDomainName.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (CacheBuilderSpec.class.isAssignableFrom(rawClass) || CacheBuilder.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (HashCode.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!FluentIterable.class.isAssignableFrom(rawClass)) {
            return null;
        }
        return new StdDelegatingSerializer(FluentConverter.instance, _findDeclared(javaType, Iterable.class), null);
    }
}
