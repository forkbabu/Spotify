package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1;

    protected BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter _constructWriter(com.fasterxml.jackson.databind.SerializerProvider r17, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r18, com.fasterxml.jackson.databind.ser.PropertyBuilder r19, boolean r20, com.fasterxml.jackson.databind.introspect.AnnotatedMember r21) {
        /*
        // Method dump skipped, instructions count: 581
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.ser.PropertyBuilder, boolean, com.fasterxml.jackson.databind.introspect.AnnotatedMember):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x08d0  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0981  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> _createSerializer2(com.fasterxml.jackson.databind.SerializerProvider r25, com.fasterxml.jackson.databind.JavaType r26, com.fasterxml.jackson.databind.BeanDescription r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 2469
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) {
        JavaType javaType2;
        SerializationConfig config = serializerProvider.mo12getConfig();
        BeanDescription forSerialization = config.getClassIntrospector().forSerialization(config, javaType, config);
        JsonSerializer<?> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, forSerialization.getClassInfo());
        if (findSerializerFromAnnotation != null) {
            return findSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaType2 = javaType;
        } else {
            try {
                javaType2 = annotationIntrospector.refineSerializationType(config, forSerialization.getClassInfo(), javaType);
            } catch (JsonMappingException e) {
                serializerProvider.reportBadTypeDefinition(forSerialization, e.getMessage(), new Object[0]);
                throw null;
            }
        }
        if (javaType2 != javaType) {
            if (!javaType2.hasRawClass(javaType.getRawClass())) {
                forSerialization = config.getClassIntrospector().forSerialization(config, javaType2, config);
            }
            z = true;
        }
        Converter<Object, Object> findSerializationConverter = forSerialization.findSerializationConverter();
        if (findSerializationConverter == null) {
            return _createSerializer2(serializerProvider, javaType2, forSerialization, z);
        }
        JavaType outputType = findSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(javaType2.getRawClass())) {
            forSerialization = config.getClassIntrospector().forSerialization(config, outputType, config);
            findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, forSerialization.getClassInfo());
        }
        if (findSerializerFromAnnotation == null && !outputType.isJavaLangObject()) {
            findSerializerFromAnnotation = _createSerializer2(serializerProvider, outputType, forSerialization, true);
        }
        return new StdDelegatingSerializer(findSerializationConverter, outputType, findSerializerFromAnnotation);
    }

    /* access modifiers changed from: protected */
    public Iterable<Serializers> customSerializers() {
        return this._factoryConfig.serializers();
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Ljava/util/List<Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;>;)V */
    /* access modifiers changed from: protected */
    public void removeIgnorableTypes(SerializationConfig serializationConfig, List list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition beanPropertyDefinition = (BeanPropertyDefinition) it.next();
            if (beanPropertyDefinition.getAccessor() == null) {
                it.remove();
            } else {
                Class<?> rawPrimaryType = beanPropertyDefinition.getRawPrimaryType();
                Boolean bool = (Boolean) hashMap.get(rawPrimaryType);
                if (bool == null) {
                    serializationConfig.getConfigOverride(rawPrimaryType);
                    bool = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(rawPrimaryType).getClassInfo());
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(rawPrimaryType, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;Ljava/util/List<Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;>;)Ljava/util/List<Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;>; */
    /* access modifiers changed from: protected */
    public List removeOverlappingTypeIds(List list) {
        boolean z;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = (BeanPropertyWriter) list.get(i);
            TypeSerializer typeSerializer = beanPropertyWriter._typeSerializer;
            if (typeSerializer != null && typeSerializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                PropertyName construct = PropertyName.construct(typeSerializer.getPropertyName());
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BeanPropertyWriter beanPropertyWriter2 = (BeanPropertyWriter) it.next();
                    if (beanPropertyWriter2 != beanPropertyWriter) {
                        PropertyName propertyName = beanPropertyWriter2._wrapperName;
                        if (propertyName != null) {
                            z = propertyName.equals(construct);
                        } else {
                            z = construct.hasSimpleName(beanPropertyWriter2._name.getValue()) && !construct.hasNamespace();
                        }
                        if (z) {
                            beanPropertyWriter._typeSerializer = null;
                            break;
                        }
                    }
                }
            }
        }
        return list;
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Ljava/util/List<Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;>;)V */
    /* access modifiers changed from: protected */
    public void removeSetterlessGetters(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition beanPropertyDefinition = (BeanPropertyDefinition) it.next();
            if (!beanPropertyDefinition.couldDeserialize() && !beanPropertyDefinition.isExplicitlyIncluded()) {
                it.remove();
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        StringBuilder V0 = je.V0("Subtype of BeanSerializerFactory (");
        V0.append(getClass().getName());
        V0.append(") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
        throw new IllegalStateException(V0.toString());
    }
}
