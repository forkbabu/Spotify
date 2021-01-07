package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

public class RootNameLookup implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient LRUMap<ClassKey, PropertyName> _rootNames = new LRUMap<>(20, 200);

    public PropertyName findRootName(Class<?> cls, MapperConfig<?> mapperConfig) {
        ClassKey classKey = new ClassKey(cls);
        V v = this._rootNames._map.get(classKey);
        if (v != null) {
            return v;
        }
        PropertyName findRootName = mapperConfig.getAnnotationIntrospector().findRootName(mapperConfig.introspectClassAnnotations(cls).getClassInfo());
        if (findRootName == null || !findRootName.hasSimpleName()) {
            findRootName = PropertyName.construct(cls.getSimpleName());
        }
        this._rootNames.put(classKey, findRootName);
        return findRootName;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new RootNameLookup();
    }
}
