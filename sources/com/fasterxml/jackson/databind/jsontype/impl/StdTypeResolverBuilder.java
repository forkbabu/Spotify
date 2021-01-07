package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    protected TypeIdResolver _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.Id _idType;
    protected JsonTypeInfo.As _includeAs;
    protected boolean _typeIdVisible = false;
    protected String _typeProperty;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r16.isAbstract() == false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.jsontype.TypeDeserializer buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig r15, com.fasterxml.jackson.databind.JavaType r16, java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType> r17) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection):com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, collection, true, false);
        int ordinal = this._includeAs.ordinal();
        if (ordinal == 0) {
            return new AsPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (ordinal == 1) {
            return new AsWrapperTypeSerializer(idResolver, null);
        }
        if (ordinal == 2) {
            return new AsArrayTypeSerializer(idResolver, null);
        }
        if (ordinal == 3) {
            return new AsExternalTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (ordinal == 4) {
            return new AsExistingPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        StringBuilder V0 = je.V0("Do not know how to construct standard type serializer for inclusion type: ");
        V0.append(this._includeAs);
        throw new IllegalStateException(V0.toString());
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder' to match base method */
    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder defaultImpl(Class cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    /* access modifiers changed from: protected */
    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        JavaType javaType2;
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.Id id = this._idType;
        if (id != null) {
            int ordinal = id.ordinal();
            HashMap hashMap = null;
            if (ordinal == 0) {
                return null;
            }
            if (ordinal == 1) {
                return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
            }
            if (ordinal == 2) {
                return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
            }
            if (ordinal != 3) {
                StringBuilder V0 = je.V0("Do not know how to construct standard type id resolver for idType: ");
                V0.append(this._idType);
                throw new IllegalStateException(V0.toString());
            } else if (z != z2) {
                Map hashMap2 = z ? new HashMap() : null;
                if (z2) {
                    hashMap = new HashMap();
                    hashMap2 = new TreeMap();
                }
                if (collection != null) {
                    for (NamedType namedType : collection) {
                        Class<?> type = namedType.getType();
                        String name = namedType.hasName() ? namedType.getName() : TypeNameIdResolver._defaultTypeId(type);
                        if (z) {
                            hashMap2.put(type.getName(), name);
                        }
                        if (z2 && ((javaType2 = (JavaType) hashMap.get(name)) == null || !type.isAssignableFrom(javaType2.getRawClass()))) {
                            hashMap.put(name, mapperConfig.constructType(type));
                        }
                    }
                }
                return new TypeNameIdResolver(mapperConfig, javaType, hashMap2, hashMap);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder' to match base method */
    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder inclusion(JsonTypeInfo.As as) {
        if (as != null) {
            this._includeAs = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder' to match base method */
    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder' to match base method */
    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver) {
        if (id != null) {
            this._idType = id;
            this._customIdResolver = typeIdResolver;
            this._typeProperty = id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }
}
