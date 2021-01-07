package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    /* access modifiers changed from: protected */
    public void addBackReferenceProperties(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        String str;
        List<BeanPropertyDefinition> findBackReferences = beanDescription.findBackReferences();
        if (findBackReferences != null) {
            for (BeanPropertyDefinition beanPropertyDefinition : findBackReferences) {
                AnnotationIntrospector.ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
                if (findReferenceType == null) {
                    str = null;
                } else {
                    str = findReferenceType.getName();
                }
                SettableBeanProperty constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getPrimaryType());
                if (beanDeserializerBuilder._backRefProperties == null) {
                    beanDeserializerBuilder._backRefProperties = new HashMap<>(4);
                }
                constructSettableProperty.fixAccess(beanDeserializerBuilder._config);
                beanDeserializerBuilder._backRefProperties.put(str, constructSettableProperty);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0240 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addBeanProps(com.fasterxml.jackson.databind.DeserializationContext r21, com.fasterxml.jackson.databind.BeanDescription r22, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder r23) {
        /*
        // Method dump skipped, instructions count: 676
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder):void");
    }

    /* access modifiers changed from: protected */
    public void addInjectables(BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        Map<Object, AnnotatedMember> findInjectables = beanDescription.findInjectables();
        if (findInjectables != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : findInjectables.entrySet()) {
                AnnotatedMember value = entry.getValue();
                PropertyName construct = PropertyName.construct(value.getName());
                JavaType type = value.getType();
                beanDescription.getClassAnnotations();
                Object key = entry.getKey();
                if (beanDeserializerBuilder._injectables == null) {
                    beanDeserializerBuilder._injectables = new ArrayList();
                }
                boolean canOverrideAccessModifiers = beanDeserializerBuilder._config.canOverrideAccessModifiers();
                boolean z = canOverrideAccessModifiers && beanDeserializerBuilder._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
                if (canOverrideAccessModifiers) {
                    value.fixAccess(z);
                }
                beanDeserializerBuilder._injectables.add(new ValueInjector(construct, type, value, key));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addObjectIdReader(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator;
        JavaType javaType;
        SettableBeanProperty settableBeanProperty;
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo != null) {
            Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
            ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(beanDescription.getClassInfo(), objectIdInfo);
            if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyName = objectIdInfo.getPropertyName();
                settableBeanProperty = beanDeserializerBuilder._properties.get(propertyName.getSimpleName());
                if (settableBeanProperty != null) {
                    JavaType javaType2 = settableBeanProperty._type;
                    javaType = javaType2;
                    propertyBasedObjectIdGenerator = new PropertyBasedObjectIdGenerator(objectIdInfo.getScope());
                } else {
                    StringBuilder V0 = je.V0("Invalid Object Id definition for ");
                    V0.append(beanDescription.getBeanClass().getName());
                    V0.append(": cannot find property with name '");
                    V0.append(propertyName);
                    V0.append("'");
                    throw new IllegalArgumentException(V0.toString());
                }
            } else {
                JavaType javaType3 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) generatorType), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                propertyBasedObjectIdGenerator = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
                javaType = javaType3;
            }
            beanDeserializerBuilder._objectIdReader = ObjectIdReader.construct(javaType, objectIdInfo.getPropertyName(), propertyBasedObjectIdGenerator, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverInstance);
        }
    }

    public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer<?> jsonDeserializer;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(beanDescription, deserializationContext);
            beanDeserializerBuilder._valueInstantiator = findValueInstantiator;
            addBeanProps(deserializationContext, beanDescription, beanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, beanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, beanDeserializerBuilder);
            addInjectables(beanDescription, beanDeserializerBuilder);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                ArrayIterator arrayIterator = (ArrayIterator) this._factoryConfig.deserializerModifiers();
                while (arrayIterator.hasNext()) {
                    ((BeanDeserializerModifier) arrayIterator.next()).getClass();
                }
            }
            if (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) {
                jsonDeserializer = beanDeserializerBuilder.build();
            } else {
                jsonDeserializer = new AbstractDeserializer(beanDeserializerBuilder, beanDeserializerBuilder._beanDesc, beanDeserializerBuilder._backRefProperties, beanDeserializerBuilder._properties);
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                ArrayIterator arrayIterator2 = (ArrayIterator) this._factoryConfig.deserializerModifiers();
                while (arrayIterator2.hasNext()) {
                    ((BeanDeserializerModifier) arrayIterator2.next()).getClass();
                }
            }
            return jsonDeserializer;
        } catch (NoClassDefFoundError e) {
            return new ErrorThrowingDeserializer(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), ClassUtil.exceptionMessage(e2), beanDescription, (BeanPropertyDefinition) null);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>; */
    public JsonDeserializer buildThrowableDeserializer(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        SettableBeanProperty constructSettableProperty;
        deserializationContext.mo12getConfig();
        BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(beanDescription, deserializationContext);
        beanDeserializerBuilder._valueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        addBeanProps(deserializationContext, beanDescription, beanDeserializerBuilder);
        AnnotatedMethod findMethod = beanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (!(findMethod == null || (constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct(deserializationContext.mo12getConfig(), findMethod, new PropertyName("cause")), findMethod.getParameterType(0))) == null)) {
            beanDeserializerBuilder._properties.put(constructSettableProperty.getName(), constructSettableProperty);
        }
        beanDeserializerBuilder.addIgnorable("localizedMessage");
        beanDeserializerBuilder.addIgnorable("suppressed");
        if (this._factoryConfig.hasDeserializerModifiers()) {
            ArrayIterator arrayIterator = (ArrayIterator) this._factoryConfig.deserializerModifiers();
            while (arrayIterator.hasNext()) {
                ((BeanDeserializerModifier) arrayIterator.next()).getClass();
            }
        }
        ThrowableDeserializer throwableDeserializer = new ThrowableDeserializer((BeanDeserializer) beanDeserializerBuilder.build());
        if (this._factoryConfig.hasDeserializerModifiers()) {
            ArrayIterator arrayIterator2 = (ArrayIterator) this._factoryConfig.deserializerModifiers();
            while (arrayIterator2.hasNext()) {
                ((BeanDeserializerModifier) arrayIterator2.next()).getClass();
            }
        }
        return throwableDeserializer;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType) {
        SettableBeanProperty settableBeanProperty;
        AnnotatedMember setter = beanPropertyDefinition.getSetter();
        if (setter == null) {
            setter = beanPropertyDefinition.getField();
        }
        if (setter != null) {
            JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, setter, javaType);
            TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
            if (setter instanceof AnnotatedMethod) {
                settableBeanProperty = new MethodProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedMethod) setter);
            } else {
                settableBeanProperty = new FieldProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedField) setter);
            }
            JsonDeserializer<?> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, setter);
            if (findDeserializerFromAnnotation == null) {
                findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
            }
            if (findDeserializerFromAnnotation != null) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, settableBeanProperty, resolveMemberAndTypeAnnotations));
            }
            AnnotationIntrospector.ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
            if (findReferenceType != null && findReferenceType.isManagedReference()) {
                settableBeanProperty._managedReferenceName = findReferenceType.getName();
            }
            ObjectIdInfo findObjectIdInfo = beanPropertyDefinition.findObjectIdInfo();
            if (findObjectIdInfo != null) {
                settableBeanProperty._objectIdInfo = findObjectIdInfo;
            }
            return settableBeanProperty;
        }
        deserializationContext.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition, "No non-constructor mutator available", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        AnnotatedMethod getter = beanPropertyDefinition.getGetter();
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, getter, getter.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler(), beanDescription.getClassAnnotations(), getter);
        JsonDeserializer<?> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, getter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, setterlessProperty, resolveMemberAndTypeAnnotations)) : setterlessProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        String str;
        JsonDeserializer<?> jsonDeserializer;
        JavaType materializeAbstractType;
        DeserializationConfig config = deserializationContext.mo12getConfig();
        ArrayIterator arrayIterator = (ArrayIterator) this._factoryConfig.deserializers();
        while (true) {
            str = null;
            if (!arrayIterator.hasNext()) {
                jsonDeserializer = null;
                break;
            }
            jsonDeserializer = ((Deserializers) arrayIterator.next()).findBeanDeserializer(javaType, config, beanDescription);
            if (jsonDeserializer != null) {
                break;
            }
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, beanDescription);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (materializeAbstractType = materializeAbstractType(deserializationContext, beanDescription)) != null) {
            return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.getClassIntrospector().forDeserialization(config, materializeAbstractType, config));
        }
        JsonDeserializer<?> findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (findDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            ArrayIterator arrayIterator2 = (ArrayIterator) this._factoryConfig.deserializerModifiers();
            while (arrayIterator2.hasNext()) {
                ((BeanDeserializerModifier) arrayIterator2.next()).getClass();
            }
        }
        if (findDefaultDeserializer != null) {
            return findDefaultDeserializer;
        }
        Class<?> rawClass = javaType.getRawClass();
        String canBeABeanType = ClassUtil.canBeABeanType(rawClass);
        if (canBeABeanType != null) {
            StringBuilder V0 = je.V0("Cannot deserialize Class ");
            V0.append(rawClass.getName());
            V0.append(" (of type ");
            V0.append(canBeABeanType);
            V0.append(") as a Bean");
            throw new IllegalArgumentException(V0.toString());
        } else if (!ClassUtil.isProxyType(rawClass)) {
            try {
                if (!ClassUtil.isObjectOrPrimitive(rawClass) && rawClass.getEnclosingMethod() != null) {
                    str = "local/anonymous";
                }
            } catch (NullPointerException | SecurityException unused) {
            }
            if (str == null) {
                SubTypeValidator.instance().validateSubType(deserializationContext, javaType, beanDescription);
                return buildBeanDeserializer(deserializationContext, javaType, beanDescription);
            }
            StringBuilder V02 = je.V0("Cannot deserialize Class ");
            V02.append(rawClass.getName());
            V02.append(" (of type ");
            V02.append(str);
            V02.append(") as a Bean");
            throw new IllegalArgumentException(V02.toString());
        } else {
            throw new IllegalArgumentException(je.l0(rawClass, je.V0("Cannot deserialize Proxy class "), " as a Bean"));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) {
        String str;
        boolean z;
        JavaType constructType = deserializationContext.constructType(cls);
        DeserializationConfig config = deserializationContext.mo12getConfig();
        BeanDescription forDeserializationWithBuilder = config.getClassIntrospector().forDeserializationWithBuilder(config, constructType, config);
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, forDeserializationWithBuilder);
            DeserializationConfig config2 = deserializationContext.mo12getConfig();
            BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(forDeserializationWithBuilder, deserializationContext);
            beanDeserializerBuilder._valueInstantiator = findValueInstantiator;
            addBeanProps(deserializationContext, forDeserializationWithBuilder, beanDeserializerBuilder);
            addObjectIdReader(deserializationContext, forDeserializationWithBuilder, beanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, forDeserializationWithBuilder, beanDeserializerBuilder);
            addInjectables(forDeserializationWithBuilder, beanDeserializerBuilder);
            JsonPOJOBuilder.Value findPOJOBuilderConfig = forDeserializationWithBuilder.findPOJOBuilderConfig();
            if (findPOJOBuilderConfig == null) {
                str = "build";
            } else {
                str = findPOJOBuilderConfig.buildMethodName;
            }
            AnnotatedMethod findMethod = forDeserializationWithBuilder.findMethod(str, null);
            if (findMethod != null && config2.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(findMethod.mo17getMember(), config2.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            beanDeserializerBuilder._buildMethod = findMethod;
            if (this._factoryConfig.hasDeserializerModifiers()) {
                ArrayIterator arrayIterator = (ArrayIterator) this._factoryConfig.deserializerModifiers();
                while (arrayIterator.hasNext()) {
                    ((BeanDeserializerModifier) arrayIterator.next()).getClass();
                }
            }
            AnnotatedMethod annotatedMethod = beanDeserializerBuilder._buildMethod;
            if (annotatedMethod != null) {
                Class<?> rawReturnType = annotatedMethod.getRawReturnType();
                Class<?> rawClass = javaType.getRawClass();
                if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                    beanDeserializerBuilder._context.reportBadDefinition(beanDeserializerBuilder._beanDesc.getType(), String.format("Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)", beanDeserializerBuilder._buildMethod.getFullName(), rawReturnType.getName(), javaType.getRawClass().getName()));
                    throw null;
                }
            } else if (!str.isEmpty()) {
                beanDeserializerBuilder._context.reportBadDefinition(beanDeserializerBuilder._beanDesc.getType(), String.format("Builder class %s does not have build method (name: '%s')", beanDeserializerBuilder._beanDesc.getBeanClass().getName(), str));
                throw null;
            }
            Collection<SettableBeanProperty> values = beanDeserializerBuilder._properties.values();
            beanDeserializerBuilder._fixAccess(values);
            BeanPropertyMap beanPropertyMap = new BeanPropertyMap(beanDeserializerBuilder._config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), values, beanDeserializerBuilder._collectAliases(values));
            beanPropertyMap.assignIndexes();
            boolean z2 = !beanDeserializerBuilder._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
            if (!z2) {
                Iterator<SettableBeanProperty> it = values.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().hasViews()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = z2;
            BuilderBasedDeserializer builderBasedDeserializer = new BuilderBasedDeserializer(beanDeserializerBuilder, beanDeserializerBuilder._beanDesc, javaType, beanDeserializerBuilder._objectIdReader != null ? beanPropertyMap.withProperty(new ObjectIdValueProperty(beanDeserializerBuilder._objectIdReader, PropertyMetadata.STD_REQUIRED)) : beanPropertyMap, beanDeserializerBuilder._backRefProperties, beanDeserializerBuilder._ignorableProps, beanDeserializerBuilder._ignoreAllUnknown, z);
            if (!this._factoryConfig.hasDeserializerModifiers()) {
                return builderBasedDeserializer;
            }
            ArrayIterator arrayIterator2 = (ArrayIterator) this._factoryConfig.deserializerModifiers();
            while (arrayIterator2.hasNext()) {
                ((BeanDeserializerModifier) arrayIterator2.next()).getClass();
            }
            return builderBasedDeserializer;
        } catch (NoClassDefFoundError e) {
            return new ErrorThrowingDeserializer(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), ClassUtil.exceptionMessage(e2), forDeserializationWithBuilder, (BeanPropertyDefinition) null);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBuilder;Ljava/util/List<Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;>;Ljava/util/Set<Ljava/lang/String;>;)Ljava/util/List<Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;>; */
    /* access modifiers changed from: protected */
    public List filterBeanProps(DeserializationContext deserializationContext, BeanDeserializerBuilder beanDeserializerBuilder, List list, Set set) {
        Class<?> rawPrimaryType;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition beanPropertyDefinition = (BeanPropertyDefinition) it.next();
            String name = beanPropertyDefinition.getName();
            if (!set.contains(name)) {
                if (beanPropertyDefinition.hasConstructorParameter() || (rawPrimaryType = beanPropertyDefinition.getRawPrimaryType()) == null || !isIgnorableType(deserializationContext.mo12getConfig(), rawPrimaryType, hashMap)) {
                    arrayList.add(beanPropertyDefinition);
                } else {
                    beanDeserializerBuilder.addIgnorable(name);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Boolean;>;)Z */
    /* access modifiers changed from: protected */
    public boolean isIgnorableType(DeserializationConfig deserializationConfig, Class cls, Map map) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) map.get(cls);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (cls != String.class && !cls.isPrimitive()) {
            deserializationConfig.getConfigOverride(cls);
            Boolean isIgnorableType = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).getClassInfo());
            if (isIgnorableType != null) {
                bool = isIgnorableType;
            }
        }
        map.put(cls, bool);
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public JavaType materializeAbstractType(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        ArrayIterator arrayIterator = (ArrayIterator) this._factoryConfig.abstractTypeResolvers();
        while (arrayIterator.hasNext()) {
            deserializationContext.mo12getConfig();
            ((AbstractTypeResolver) arrayIterator.next()).getClass();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        ClassUtil.verifyMustOverride(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }
}
