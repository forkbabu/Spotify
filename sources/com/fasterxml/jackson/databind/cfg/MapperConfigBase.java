package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConfigFeature;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

public abstract class MapperConfigBase<CFG extends ConfigFeature, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    private static final int AUTO_DETECT_MASK = ((((MapperFeature.AUTO_DETECT_FIELDS.getMask() | MapperFeature.AUTO_DETECT_GETTERS.getMask()) | MapperFeature.AUTO_DETECT_IS_GETTERS.getMask()) | MapperFeature.AUTO_DETECT_SETTERS.getMask()) | MapperFeature.AUTO_DETECT_CREATORS.getMask());
    private static final int DEFAULT_MAPPER_FEATURES = MapperConfig.collectFeatureDefaults(MapperFeature.class);
    protected static final ConfigOverride EMPTY_OVERRIDE = ConfigOverride.Empty.INSTANCE;
    protected final ContextAttributes _attributes;
    protected final ConfigOverrides _configOverrides;
    protected final SimpleMixInResolver _mixIns;
    protected final PropertyName _rootName;
    protected final RootNameLookup _rootNames;
    protected final SubtypeResolver _subtypeResolver;
    protected final Class<?> _view;

    protected MapperConfigBase(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, DEFAULT_MAPPER_FEATURES);
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = subtypeResolver;
        this._rootNames = rootNameLookup;
        this._rootName = null;
        this._view = null;
        this._attributes = ContextAttributes.Impl.EMPTY;
        this._configOverrides = configOverrides;
    }

    /* access modifiers changed from: protected */
    public abstract T _withBase(BaseSettings baseSettings);

    /* access modifiers changed from: protected */
    public abstract T _withMapperFeatures(int i);

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public final Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    public PropertyName findRootName(JavaType javaType) {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return propertyName;
        }
        RootNameLookup rootNameLookup = this._rootNames;
        rootNameLookup.getClass();
        return rootNameLookup.findRootName(javaType.getRawClass(), this);
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final ContextAttributes getAttributes() {
        return this._attributes;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ConfigOverride getConfigOverride(Class<?> cls) {
        ConfigOverride findOverride = this._configOverrides.findOverride(cls);
        return findOverride == null ? ConfigOverride.Empty.INSTANCE : findOverride;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2) {
        this._configOverrides.findOverride(cls2);
        JsonInclude.Value defaultPropertyInclusion = getDefaultPropertyInclusion(cls);
        if (defaultPropertyInclusion == null) {
            return null;
        }
        return defaultPropertyInclusion.withOverrides(null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable() {
        return this._configOverrides._defaultMergeable;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        this._configOverrides.findOverride(cls);
        return MapperConfig.EMPTY_FORMAT;
    }

    public final JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, AnnotatedClass annotatedClass) {
        JsonIgnoreProperties.Value value;
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            value = null;
        } else {
            value = annotationIntrospector.findPropertyIgnorals(annotatedClass);
        }
        this._configOverrides.findOverride(cls);
        return JsonIgnoreProperties.Value.merge(value, null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        this._configOverrides.findOverride(cls);
        JsonInclude.Value value = this._configOverrides._defaultInclusion;
        if (value == null) {
            return null;
        }
        return value.withOverrides(null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonSetter.Value getDefaultSetterInfo() {
        return this._configOverrides._defaultSetterInfo;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, AnnotatedClass annotatedClass) {
        JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.NONE;
        VisibilityChecker.Std std = this._configOverrides._visibilityChecker;
        int i = this._mapperFeatures;
        int i2 = AUTO_DETECT_MASK;
        if ((i & i2) != i2) {
            if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS)) {
                std = ((VisibilityChecker.Std) std).withFieldVisibility(visibility);
            }
            if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS)) {
                std = ((VisibilityChecker.Std) std).withGetterVisibility(visibility);
            }
            if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
                std = ((VisibilityChecker.Std) std).withIsGetterVisibility(visibility);
            }
            if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS)) {
                std = ((VisibilityChecker.Std) std).withSetterVisibility(visibility);
            }
            if (!isEnabled(MapperFeature.AUTO_DETECT_CREATORS)) {
                std = ((VisibilityChecker.Std) std).withCreatorVisibility(visibility);
            }
        }
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            std = annotationIntrospector.findAutoDetectVisibility(annotatedClass, std);
        }
        return this._configOverrides.findOverride(cls) != null ? ((VisibilityChecker.Std) std).withOverrides(null) : std;
    }

    public final PropertyName getFullRootName() {
        return this._rootName;
    }

    public final SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public final T with(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            i |= mapperFeature.getMask();
        }
        if (i == this._mapperFeatures) {
            return this;
        }
        return _withMapperFeatures(i);
    }

    public final T without(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            i &= mapperFeature.getMask() ^ -1;
        }
        if (i == this._mapperFeatures) {
            return this;
        }
        return _withMapperFeatures(i);
    }

    public Boolean getDefaultMergeable(Class<?> cls) {
        this._configOverrides.findOverride(cls);
        return this._configOverrides._defaultMergeable;
    }

    public PropertyName findRootName(Class<?> cls) {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return propertyName;
        }
        return this._rootNames.findRootName(cls, this);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion() {
        return this._configOverrides._defaultInclusion;
    }

    public final T with(TypeFactory typeFactory) {
        BaseSettings baseSettings = this._base;
        if (baseSettings._typeFactory != typeFactory) {
            baseSettings = new BaseSettings(baseSettings._classIntrospector, baseSettings._annotationIntrospector, baseSettings._propertyNamingStrategy, typeFactory, baseSettings._typeResolverBuilder, baseSettings._dateFormat, baseSettings._locale, baseSettings._timeZone, baseSettings._defaultBase64);
        }
        return _withBase(baseSettings);
    }

    protected MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, BaseSettings baseSettings) {
        super(mapperConfigBase, baseSettings);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    protected MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, int i) {
        super(mapperConfigBase, i);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    protected MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, PropertyName propertyName) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = propertyName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }
}
