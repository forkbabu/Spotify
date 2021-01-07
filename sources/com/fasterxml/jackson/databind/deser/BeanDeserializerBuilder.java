package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BeanDeserializerBuilder {
    protected SettableAnyProperty _anySetter;
    protected HashMap<String, SettableBeanProperty> _backRefProperties;
    protected final BeanDescription _beanDesc;
    protected AnnotatedMethod _buildMethod;
    protected final DeserializationConfig _config;
    protected final DeserializationContext _context;
    protected HashSet<String> _ignorableProps;
    protected boolean _ignoreAllUnknown;
    protected List<ValueInjector> _injectables;
    protected ObjectIdReader _objectIdReader;
    protected final Map<String, SettableBeanProperty> _properties = new LinkedHashMap();
    protected ValueInstantiator _valueInstantiator;

    public BeanDeserializerBuilder(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        this._beanDesc = beanDescription;
        this._context = deserializationContext;
        this._config = deserializationContext.mo12getConfig();
    }

    /* access modifiers changed from: protected */
    public Map<String, List<PropertyName>> _collectAliases(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this._config.getAnnotationIntrospector();
        HashMap hashMap = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List<PropertyName> findPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (findPropertyAliases != null && !findPropertyAliases.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(settableBeanProperty.getName(), findPropertyAliases);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    /* access modifiers changed from: protected */
    public void _fixAccess(Collection<SettableBeanProperty> collection) {
        for (SettableBeanProperty settableBeanProperty : collection) {
            settableBeanProperty.fixAccess(this._config);
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null) {
            settableAnyProperty._setter.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod != null) {
            annotatedMethod.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void addIgnorable(String str) {
        if (this._ignorableProps == null) {
            this._ignorableProps = new HashSet<>();
        }
        this._ignorableProps.add(str);
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty put = this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
        if (put != null && put != settableBeanProperty) {
            StringBuilder V0 = je.V0("Duplicate property '");
            V0.append(settableBeanProperty.getName());
            V0.append("' for ");
            V0.append(this._beanDesc.getType());
            throw new IllegalArgumentException(V0.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> build() {
        /*
            r13 = this;
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r0 = r13._properties
            java.util.Collection r0 = r0.values()
            r13._fixAccess(r0)
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r13._config
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r1 = r1.isEnabled(r2)
            java.util.Map r2 = r13._collectAliases(r0)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap
            r3.<init>(r1, r0, r2)
            r3.assignIndexes()
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r13._config
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r1 = r1.isEnabled(r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0041
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r0.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r4
            boolean r4 = r4.hasViews()
            if (r4 == 0) goto L_0x002d
            r12 = 1
            goto L_0x0042
        L_0x0041:
            r12 = r1
        L_0x0042:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r13._objectIdReader
            if (r0 == 0) goto L_0x0053
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty r0 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r1 = r13._objectIdReader
            com.fasterxml.jackson.databind.PropertyMetadata r2 = com.fasterxml.jackson.databind.PropertyMetadata.STD_REQUIRED
            r0.<init>(r1, r2)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r3 = r3.withProperty(r0)
        L_0x0053:
            r8 = r3
            com.fasterxml.jackson.databind.deser.BeanDeserializer r0 = new com.fasterxml.jackson.databind.deser.BeanDeserializer
            com.fasterxml.jackson.databind.BeanDescription r7 = r13._beanDesc
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r9 = r13._backRefProperties
            java.util.HashSet<java.lang.String> r10 = r13._ignorableProps
            boolean r11 = r13._ignoreAllUnknown
            r5 = r0
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder.build():com.fasterxml.jackson.databind.JsonDeserializer");
    }
}
