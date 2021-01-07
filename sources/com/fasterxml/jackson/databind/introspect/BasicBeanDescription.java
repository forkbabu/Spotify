package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicBeanDescription extends BeanDescription {
    private static final Class<?>[] NO_VIEWS = new Class[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AnnotatedClass _classInfo;
    protected final MapperConfig<?> _config;
    protected Class<?>[] _defaultViews;
    protected boolean _defaultViewsResolved;
    protected ObjectIdInfo _objectIdInfo;
    protected final POJOPropertiesCollector _propCollector;
    protected List<BeanPropertyDefinition> _properties;

    protected BasicBeanDescription(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List<BeanPropertyDefinition> list) {
        super(javaType);
        this._propCollector = null;
        this._config = mapperConfig;
        if (mapperConfig == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    public static BasicBeanDescription forOtherUse(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    public Converter<Object, Object> _createConverter(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                this._config.getHandlerInstantiator();
                return (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
            }
            throw new IllegalStateException(je.l0(cls, je.V0("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(je.n0(obj, je.V0("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> _properties() {
        if (this._properties == null) {
            POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
            if (!pOJOPropertiesCollector._collected) {
                pOJOPropertiesCollector.collectAll();
            }
            this._properties = new ArrayList(pOJOPropertiesCollector._properties.values());
        }
        return this._properties;
    }

    public boolean addProperty(BeanPropertyDefinition beanPropertyDefinition) {
        if (hasProperty(beanPropertyDefinition.getFullName())) {
            return false;
        }
        _properties().add(beanPropertyDefinition);
        return true;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findAnyGetter() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        AnnotatedMember annotatedMember = null;
        if (pOJOPropertiesCollector != null) {
            if (!pOJOPropertiesCollector._collected) {
                pOJOPropertiesCollector.collectAll();
            }
            LinkedList<AnnotatedMember> linkedList = pOJOPropertiesCollector._anyGetters;
            if (linkedList != null) {
                if (linkedList.size() <= 1) {
                    annotatedMember = pOJOPropertiesCollector._anyGetters.getFirst();
                } else {
                    pOJOPropertiesCollector.reportProblem("Multiple 'any-getters' defined (%s vs %s)", pOJOPropertiesCollector._anyGetters.get(0), pOJOPropertiesCollector._anyGetters.get(1));
                    throw null;
                }
            }
        }
        if (annotatedMember == null || Map.class.isAssignableFrom(annotatedMember.getRawType())) {
            return annotatedMember;
        }
        StringBuilder V0 = je.V0("Invalid 'any-getter' annotation on method ");
        V0.append(annotatedMember.getName());
        V0.append("(): return type is not instance of java.util.Map");
        throw new IllegalArgumentException(V0.toString());
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findAnySetterAccessor() {
        AnnotatedMethod annotatedMethod;
        AnnotatedMember annotatedMember;
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector != null) {
            if (!pOJOPropertiesCollector._collected) {
                pOJOPropertiesCollector.collectAll();
            }
            LinkedList<AnnotatedMethod> linkedList = pOJOPropertiesCollector._anySetters;
            if (linkedList == null) {
                annotatedMethod = null;
            } else if (linkedList.size() <= 1) {
                annotatedMethod = pOJOPropertiesCollector._anySetters.getFirst();
            } else {
                pOJOPropertiesCollector.reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", pOJOPropertiesCollector._anySetters.get(0), pOJOPropertiesCollector._anySetters.get(1));
                throw null;
            }
            if (annotatedMethod != null) {
                Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
                if (rawParameterType == String.class || rawParameterType == Object.class) {
                    return annotatedMethod;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", annotatedMethod.getName(), rawParameterType.getName()));
            }
            POJOPropertiesCollector pOJOPropertiesCollector2 = this._propCollector;
            if (!pOJOPropertiesCollector2._collected) {
                pOJOPropertiesCollector2.collectAll();
            }
            LinkedList<AnnotatedMember> linkedList2 = pOJOPropertiesCollector2._anySetterField;
            if (linkedList2 == null) {
                annotatedMember = null;
            } else if (linkedList2.size() <= 1) {
                annotatedMember = pOJOPropertiesCollector2._anySetterField.getFirst();
            } else {
                pOJOPropertiesCollector2.reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", pOJOPropertiesCollector2._anySetterField.get(0), pOJOPropertiesCollector2._anySetterField.get(1));
                throw null;
            }
            if (annotatedMember != null) {
                if (Map.class.isAssignableFrom(annotatedMember.getRawType())) {
                    return annotatedMember;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", annotatedMember.getName()));
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<BeanPropertyDefinition> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition beanPropertyDefinition : _properties()) {
            AnnotationIntrospector.ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
            if (findReferenceType != null && findReferenceType.isBackReference()) {
                String name = findReferenceType.getName();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(name);
                } else if (!hashSet.add(name)) {
                    throw new IllegalArgumentException(je.y0("Multiple back-reference properties with name '", name, "'"));
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Class<?>[] findDefaultViews() {
        Class<?>[] clsArr;
        if (!this._defaultViewsResolved) {
            this._defaultViewsResolved = true;
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            if (annotationIntrospector == null) {
                clsArr = null;
            } else {
                clsArr = annotationIntrospector.findViews(this._classInfo);
            }
            if (clsArr == null && !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArr = NO_VIEWS;
            }
            this._defaultViews = clsArr;
        }
        return this._defaultViews;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Converter<Object, Object> findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public JsonFormat.Value findExpectedFormat(JsonFormat.Value value) {
        JsonFormat.Value value2;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null || (value2 = annotationIntrospector.findFormat(this._classInfo)) == null) {
            value2 = null;
        }
        JsonFormat.Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._classInfo._class);
        if (defaultPropertyFormat != null) {
            return value2 == null ? defaultPropertyFormat : value2.withOverrides(defaultPropertyFormat);
        }
        return value2;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Method findFactoryMethod(Class<?>... clsArr) {
        for (AnnotatedMethod annotatedMethod : this._classInfo.getFactoryMethods()) {
            if (isFactoryMethod(annotatedMethod) && annotatedMethod.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (rawParameterType.isAssignableFrom(cls)) {
                        return annotatedMethod._method;
                    }
                }
                continue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Map<Object, AnnotatedMember> findInjectables() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return Collections.emptyMap();
        }
        if (!pOJOPropertiesCollector._collected) {
            pOJOPropertiesCollector.collectAll();
        }
        return pOJOPropertiesCollector._injectables;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMember findJsonValueAccessor() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        if (!pOJOPropertiesCollector._collected) {
            pOJOPropertiesCollector.collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = pOJOPropertiesCollector._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return pOJOPropertiesCollector._jsonValueAccessors.get(0);
        }
        pOJOPropertiesCollector.reportProblem("Multiple 'as-value' properties defined (%s vs %s)", pOJOPropertiesCollector._jsonValueAccessors.get(0), pOJOPropertiesCollector._jsonValueAccessors.get(1));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Class<?> findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<BeanPropertyDefinition> findProperties() {
        return _properties();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value value) {
        JsonInclude.Value findPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this._classInfo)) == null) {
            return value;
        }
        return value == null ? findPropertyInclusion : value.withOverrides(findPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Converter<Object, Object> findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (AnnotatedConstructor annotatedConstructor : this._classInfo.getConstructors()) {
            if (annotatedConstructor.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedConstructor.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return annotatedConstructor._constructor;
                    }
                }
                continue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Annotations getClassAnnotations() {
        return this._classInfo._classAnnotations;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<AnnotatedConstructor> getConstructors() {
        return this._classInfo.getConstructors();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public List<AnnotatedMethod> getFactoryMethods() {
        List<AnnotatedMethod> factoryMethods = this._classInfo.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return factoryMethods;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : factoryMethods) {
            if (isFactoryMethod(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Set<String> getIgnoredPropertyNames() {
        HashSet<String> hashSet;
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            hashSet = null;
        } else {
            hashSet = pOJOPropertiesCollector._ignoredPropertyNames;
        }
        return hashSet == null ? Collections.emptySet() : hashSet;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public boolean hasKnownClassAnnotations() {
        return this._classInfo._classAnnotations.size() > 0;
    }

    public boolean hasProperty(PropertyName propertyName) {
        BeanPropertyDefinition beanPropertyDefinition;
        Iterator<BeanPropertyDefinition> it = _properties().iterator();
        while (true) {
            if (!it.hasNext()) {
                beanPropertyDefinition = null;
                break;
            }
            beanPropertyDefinition = it.next();
            if (beanPropertyDefinition.hasName(propertyName)) {
                break;
            }
        }
        return beanPropertyDefinition != null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public Object instantiateBean(boolean z) {
        AnnotatedConstructor defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z) {
            defaultConstructor.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor._constructor.newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ClassUtil.throwIfError(e);
            ClassUtil.throwIfRTE(e);
            StringBuilder V0 = je.V0("Failed to instantiate bean of type ");
            V0.append(this._classInfo._class.getName());
            V0.append(": (");
            V0.append(e.getClass().getName());
            V0.append(") ");
            V0.append(ClassUtil.exceptionMessage(e));
            throw new IllegalArgumentException(V0.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public boolean isFactoryMethod(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedMethod);
        if (findCreatorAnnotation != null && findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
            return false;
        }
        return true;
    }

    public boolean removeProperty(String str) {
        Iterator<BeanPropertyDefinition> it = _properties().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected BasicBeanDescription(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r3._type
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r1 = r3._classDef
            r2.<init>(r0)
            r2._propCollector = r3
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r3._config
            r2._config = r0
            if (r0 != 0) goto L_0x0013
            r0 = 0
            r2._annotationIntrospector = r0
            goto L_0x0019
        L_0x0013:
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r0.getAnnotationIntrospector()
            r2._annotationIntrospector = r0
        L_0x0019:
            r2._classInfo = r1
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r3._annotationIntrospector
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r1 = r3._classDef
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r0 = r0.findObjectIdInfo(r1)
            if (r0 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r3._annotationIntrospector
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r3 = r3._classDef
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r0 = r1.findObjectReferenceInfo(r3, r0)
        L_0x002d:
            r2._objectIdInfo = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.BasicBeanDescription.<init>(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector):void");
    }
}
