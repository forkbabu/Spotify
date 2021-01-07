package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CreatorCollector {
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[9];
    protected SettableBeanProperty[] _delegateArgs;
    protected int _explicitCreators = 0;
    protected final boolean _forceAccess;
    protected boolean _hasNonDefaultCreator = false;
    protected SettableBeanProperty[] _propertyBasedArgs;

    protected static final class StdTypeConstructor extends AnnotatedWithParams implements Serializable {
        private static final long serialVersionUID = 1;
        private final AnnotatedWithParams _base;
        private final int _type;

        public StdTypeConstructor(AnnotatedWithParams annotatedWithParams, int i) {
            super(annotatedWithParams, null);
            this._base = annotatedWithParams;
            this._type = i;
        }

        /* access modifiers changed from: protected */
        public final Object _construct() {
            int i = this._type;
            if (i == 1) {
                return new ArrayList();
            }
            if (i == 2) {
                return new HashMap();
            }
            if (i == 3) {
                return new LinkedHashMap();
            }
            StringBuilder V0 = je.V0("Unknown type ");
            V0.append(this._type);
            throw new IllegalStateException(V0.toString());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call() {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call1(Object obj) {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        /* renamed from: getAnnotated */
        public AnnotatedElement mo14getAnnotated() {
            return this._base.mo14getAnnotated();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Class<?> getDeclaringClass() {
            return this._base.getDeclaringClass();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        /* renamed from: getMember */
        public Member mo17getMember() {
            return this._base.mo17getMember();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public String getName() {
            return this._base.getName();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public int getParameterCount() {
            return this._base.getParameterCount();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public JavaType getParameterType(int i) {
            return this._base.getParameterType(i);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Class<?> getRawParameterType(int i) {
            return this._base.getRawParameterType(i);
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public Class<?> getRawType() {
            return this._base.getRawType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public JavaType getType() {
            return this._base.getType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Object getValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object
        public int hashCode() {
            return this._base.hashCode();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object
        public String toString() {
            return this._base.toString();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Annotated withAnnotations(AnnotationMap annotationMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call(Object[] objArr) {
            return _construct();
        }
    }

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        DeserializationConfig config = deserializationContext.mo12getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
        Object findDeserializer = annotationIntrospector.findDeserializer(parameter);
        if (findDeserializer != null) {
            return parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, findDeserializer));
        }
        return annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    /* access modifiers changed from: protected */
    public boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        return annotatedWithParams.getDeclaringClass().isEnum() && "valueOf".equals(annotatedWithParams.getName());
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 5, z);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 8, z)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 6, z)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 4, z);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 2, z);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 3, z);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (verifyNonDup(annotatedWithParams, 7, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String name = settableBeanPropertyArr[i].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) && (num = (Integer) hashMap.put(name, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i), ClassUtil.nameOf(this._beanDesc.getBeanClass())));
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 1, z);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) {
        AnnotatedWithParams annotatedWithParams;
        JavaType _computeDelegateType = _computeDelegateType(deserializationContext, this._creators[6], this._delegateArgs);
        JavaType _computeDelegateType2 = _computeDelegateType(deserializationContext, this._creators[8], this._arrayDelegateArgs);
        JavaType type = this._beanDesc.getType();
        AnnotatedWithParams annotatedWithParams2 = this._creators[0];
        if (annotatedWithParams2 != null) {
            Class<?> declaringClass = annotatedWithParams2.getDeclaringClass();
            if (declaringClass == List.class || declaringClass == ArrayList.class) {
                annotatedWithParams = new StdTypeConstructor(annotatedWithParams2, 1);
                StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(type);
                AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
                stdValueInstantiator.configureFromObjectSettings(annotatedWithParams, annotatedWithParamsArr[6], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr[7], this._propertyBasedArgs);
                stdValueInstantiator.configureFromArraySettings(this._creators[8], _computeDelegateType2, this._arrayDelegateArgs);
                stdValueInstantiator.configureFromStringCreator(this._creators[1]);
                stdValueInstantiator.configureFromIntCreator(this._creators[2]);
                stdValueInstantiator.configureFromLongCreator(this._creators[3]);
                stdValueInstantiator.configureFromDoubleCreator(this._creators[4]);
                stdValueInstantiator.configureFromBooleanCreator(this._creators[5]);
                return stdValueInstantiator;
            }
            if (declaringClass == LinkedHashMap.class) {
                annotatedWithParams = new StdTypeConstructor(annotatedWithParams2, 3);
            } else if (declaringClass == HashMap.class) {
                annotatedWithParams = new StdTypeConstructor(annotatedWithParams2, 2);
            }
            StdValueInstantiator stdValueInstantiator2 = new StdValueInstantiator(type);
            AnnotatedWithParams[] annotatedWithParamsArr2 = this._creators;
            stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams, annotatedWithParamsArr2[6], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr2[7], this._propertyBasedArgs);
            stdValueInstantiator2.configureFromArraySettings(this._creators[8], _computeDelegateType2, this._arrayDelegateArgs);
            stdValueInstantiator2.configureFromStringCreator(this._creators[1]);
            stdValueInstantiator2.configureFromIntCreator(this._creators[2]);
            stdValueInstantiator2.configureFromLongCreator(this._creators[3]);
            stdValueInstantiator2.configureFromDoubleCreator(this._creators[4]);
            stdValueInstantiator2.configureFromBooleanCreator(this._creators[5]);
            return stdValueInstantiator2;
        }
        annotatedWithParams = annotatedWithParams2;
        StdValueInstantiator stdValueInstantiator22 = new StdValueInstantiator(type);
        AnnotatedWithParams[] annotatedWithParamsArr22 = this._creators;
        stdValueInstantiator22.configureFromObjectSettings(annotatedWithParams, annotatedWithParamsArr22[6], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr22[7], this._propertyBasedArgs);
        stdValueInstantiator22.configureFromArraySettings(this._creators[8], _computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator22.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator22.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator22.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator22.configureFromDoubleCreator(this._creators[4]);
        stdValueInstantiator22.configureFromBooleanCreator(this._creators[5]);
        return stdValueInstantiator22;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[6] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[7] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        if (this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) annotatedWithParams.mo14getAnnotated(), this._forceAccess);
        }
        annotatedWithParamsArr[0] = annotatedWithParams;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x004e: APUT  (r3v8 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r8v2 java.lang.String) */
    /* access modifiers changed from: protected */
    public boolean verifyNonDup(AnnotatedWithParams annotatedWithParams, int i, boolean z) {
        boolean z2;
        int i2 = 1 << i;
        this._hasNonDefaultCreator = true;
        AnnotatedWithParams annotatedWithParams2 = this._creators[i];
        if (annotatedWithParams2 != null) {
            if ((this._explicitCreators & i2) == 0) {
                z2 = !z;
            } else if (!z) {
                return false;
            } else {
                z2 = true;
            }
            if (z2 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (_isEnumValueOf(annotatedWithParams)) {
                        return false;
                    }
                    if (!_isEnumValueOf(annotatedWithParams2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = TYPE_DESCS[i];
                        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = annotatedWithParams2;
                        objArr[3] = annotatedWithParams;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                }
            }
        }
        if (z) {
            this._explicitCreators |= i2;
        }
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        if (annotatedWithParams != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) annotatedWithParams.mo14getAnnotated(), this._forceAccess);
        }
        annotatedWithParamsArr[i] = annotatedWithParams;
        return true;
    }
}
