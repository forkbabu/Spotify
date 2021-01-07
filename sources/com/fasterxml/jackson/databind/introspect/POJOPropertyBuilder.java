package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final AnnotationIntrospector.ReferenceProperty NOT_REFEFERENCE_PROP = new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, "");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected transient PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected transient AnnotationIntrospector.ReferenceProperty _referenceInfo;
    protected Linked<AnnotatedMethod> _setters;

    /* access modifiers changed from: protected */
    public static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.value = t;
            this.next = linked;
            PropertyName propertyName2 = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            this.name = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        /* access modifiers changed from: protected */
        public Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            if (linked2 == null) {
                return withNext(linked);
            }
            return withNext(linked2.append(linked));
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit));
            if (this.next == null) {
                return format;
            }
            StringBuilder Z0 = je.Z0(format, ", ");
            Z0.append(this.next.toString());
            return Z0.toString();
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> trimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                if (trimByVisibility.name == null) {
                    return withNext(null);
                }
                return withNext(trimByVisibility);
            } else if (trimByVisibility.name != null) {
                return trimByVisibility;
            } else {
                boolean z = this.isVisible;
                if (z == trimByVisibility.isVisible) {
                    return withNext(trimByVisibility);
                }
                return z ? withNext(null) : trimByVisibility;
            }
        }

        public Linked<T> withNext(Linked<T> linked) {
            if (linked == this.next) {
                return this;
            }
            return new Linked<>(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutIgnored() {
            Linked<T> withoutIgnored;
            if (this.isMarkedIgnored) {
                Linked<T> linked = this.next;
                if (linked == null) {
                    return null;
                }
                return linked.withoutIgnored();
            }
            Linked<T> linked2 = this.next;
            return (linked2 == null || (withoutIgnored = linked2.withoutIgnored()) == this.next) ? this : withNext(withoutIgnored);
        }

        public Linked<T> withoutNext() {
            if (this.next == null) {
                return this;
            }
            return new Linked<>(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> linked = this.next;
            Linked<T> withoutNonVisible = linked == null ? null : linked.withoutNonVisible();
            return this.isVisible ? withNext(withoutNonVisible) : withoutNonVisible;
        }
    }

    protected static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T>, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T extends com.fasterxml.jackson.databind.introspect.AnnotatedMember> */
        @Override // java.util.Iterator
        public Object next() {
            Linked<T> linked = this.next;
            if (linked != null) {
                T t = linked.value;
                this.next = (Linked<T>) linked.next;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: private */
    public interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName;
        this._forSerialization = z;
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) linked.value.withAnnotations(annotationMap);
        Linked<T> linked2 = linked.next;
        if (linked2 != null) {
            linked = linked.withNext(_applyAnnotations(linked2, annotationMap));
        }
        return annotatedMember == linked.value ? linked : new Linked<>(annotatedMember, linked.next, linked.name, linked.isNameExplicit, linked.isVisible, linked.isMarkedIgnored);
    }

    private void _explode(Collection<PropertyName> collection, Map<PropertyName, POJOPropertyBuilder> map, Linked<?> linked) {
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.next) {
            PropertyName propertyName = linked2.name;
            if (linked2.isNameExplicit && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked2.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked2.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked2.withNext(pOJOPropertyBuilder._setters);
                } else if (linked == this._ctorParameters) {
                    pOJOPropertyBuilder._ctorParameters = linked2.withNext(pOJOPropertyBuilder._ctorParameters);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (linked2.isVisible) {
                StringBuilder V0 = je.V0("Conflicting/ambiguous property name definitions (implicit name '");
                V0.append(this._name);
                V0.append("'): found multiple explicit names: ");
                V0.append(collection);
                V0.append(", but also implicit accessor: ");
                V0.append(linked2);
                throw new IllegalStateException(V0.toString());
            }
        }
    }

    private Set<PropertyName> _findExplicitNames(Linked<? extends AnnotatedMember> linked, Set<PropertyName> set) {
        while (linked != null) {
            if (linked.isNameExplicit && linked.name != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(linked.name);
            }
            linked = linked.next;
        }
        return set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap annotationMap = linked.value._annotations;
        Linked<T> linked2 = linked.next;
        return linked2 != null ? AnnotationMap.merge(annotationMap, _getAllAnnotations(linked2)) : annotationMap;
    }

    private AnnotationMap _mergeAnnotations(int i, Linked<? extends AnnotatedMember>... linkedArr) {
        Linked<? extends AnnotatedMember> linked = linkedArr[i];
        AnnotationMap annotationMap = linked.value._annotations;
        Linked<T> linked2 = linked.next;
        if (linked2 != null) {
            annotationMap = AnnotationMap.merge(annotationMap, _getAllAnnotations(linked2));
        }
        do {
            i++;
            if (i >= linkedArr.length) {
                return annotationMap;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.merge(annotationMap, _mergeAnnotations(i, linkedArr));
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        return linked == null ? linked : linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        return linked == null ? linked : linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        return linked == null ? linked : linked.trimByVisibility();
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        if (linked == null) {
            return linked2;
        }
        if (linked2 == null) {
            return linked;
        }
        Linked<T> linked3 = linked.next;
        if (linked3 == null) {
            return linked.withNext(linked2);
        }
        return linked.withNext(linked3.append(linked2));
    }

    /* access modifiers changed from: protected */
    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public boolean anyIgnorals() {
        return _anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters);
    }

    public boolean anyVisible() {
        return _anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        POJOPropertyBuilder pOJOPropertyBuilder2 = pOJOPropertyBuilder;
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder2._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder2._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder2.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldDeserialize() {
        return (this._ctorParameters == null && this._setters == null && this._fields == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        _explode(collection, hashMap, this._fields);
        _explode(collection, hashMap, this._getters);
        _explode(collection, hashMap, this._setters);
        _explode(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> _findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, null))));
        return _findExplicitNames == null ? Collections.emptySet() : _findExplicitNames;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JsonInclude.Value findInclusion() {
        JsonInclude.Value value;
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            value = null;
        } else {
            value = annotationIntrospector.findPropertyInclusion(accessor);
        }
        return value == null ? JsonInclude.Value.empty() : value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new WithMember<ObjectIdInfo>() {
            /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass8 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
                ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
                return findObjectIdInfo != null ? POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo) : findObjectIdInfo;
            }
        });
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = NOT_REFEFERENCE_PROP;
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = this._referenceInfo;
        if (referenceProperty2 == null) {
            AnnotationIntrospector.ReferenceProperty referenceProperty3 = (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new WithMember<AnnotationIntrospector.ReferenceProperty>() {
                /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass2 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
                public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                    return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
                }
            });
            if (referenceProperty3 != null) {
                referenceProperty = referenceProperty3;
            }
            this._referenceInfo = referenceProperty;
            return referenceProperty3;
        } else if (referenceProperty2 == referenceProperty) {
            return null;
        } else {
            return referenceProperty2;
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new WithMember<Class<?>[]>() {
            /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotations(WithMember<T> withMember) {
        Linked<AnnotatedField> linked;
        Linked<AnnotatedMethod> linked2;
        T t = null;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked3 = this._getters;
            if (linked3 != null) {
                t = withMember.withMember(linked3.value);
            }
        } else {
            Linked<AnnotatedParameter> linked4 = this._ctorParameters;
            if (linked4 != null) {
                t = withMember.withMember(linked4.value);
            }
            if (t == null && (linked2 = this._setters) != null) {
                t = withMember.withMember(linked2.value);
            }
        }
        return (t != null || (linked = this._fields) == null) ? t : withMember.withMember(linked.value);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        do {
            T t = linked.value;
            if (t._owner instanceof AnnotatedConstructor) {
                return t;
            }
            linked = linked.next;
        } while (linked != null);
        return this._ctorParameters.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        if (linked == null) {
            return ClassUtil.emptyIterator();
        }
        return new MemberIterator(linked);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        T t = linked.value;
        for (Linked<T> linked2 = linked.next; linked2 != null; linked2 = linked2.next) {
            T t2 = linked2.value;
            Class<?> declaringClass = t.getDeclaringClass();
            Class<?> declaringClass2 = t2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    t = t2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            StringBuilder V0 = je.V0("Multiple fields representing property \"");
            V0.append(getName());
            V0.append("\": ");
            V0.append(t.getFullName());
            V0.append(" vs ");
            V0.append(t2.getFullName());
            throw new IllegalArgumentException(V0.toString());
        }
        return t;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getFullName() {
        return this._name;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getGetter() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked<T> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = linked.value.getDeclaringClass();
            Class<?> declaringClass2 = linked2.value.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            int _getterPriority = _getterPriority(linked2.value);
            int _getterPriority2 = _getterPriority(linked.value);
            if (_getterPriority != _getterPriority2) {
                if (_getterPriority >= _getterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                StringBuilder V0 = je.V0("Conflicting getter definitions for property \"");
                V0.append(getName());
                V0.append("\": ");
                V0.append(linked.value.getFullName());
                V0.append(" vs ");
                V0.append(linked2.value.getFullName());
                throw new IllegalArgumentException(V0.toString());
            }
        }
        this._getters = linked.withoutNext();
        return linked.value;
    }

    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyMetadata getMetadata() {
        Nulls nulls;
        Boolean findMergeInfo;
        if (this._metadata == null) {
            Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
                /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass4 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
                public Boolean withMember(AnnotatedMember annotatedMember) {
                    return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
                }
            });
            String str = (String) fromMemberAnnotations(new WithMember<String>() {
                /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass5 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
                public String withMember(AnnotatedMember annotatedMember) {
                    return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
                }
            });
            Integer num = (Integer) fromMemberAnnotations(new WithMember<Integer>() {
                /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass6 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
                public Integer withMember(AnnotatedMember annotatedMember) {
                    return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
                }
            });
            String str2 = (String) fromMemberAnnotations(new WithMember<String>() {
                /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass7 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
                public String withMember(AnnotatedMember annotatedMember) {
                    return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
                }
            });
            if (bool == null && num == null && str2 == null) {
                PropertyMetadata propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                if (str != null) {
                    propertyMetadata = propertyMetadata.withDescription(str);
                }
                this._metadata = propertyMetadata;
            } else {
                this._metadata = PropertyMetadata.construct(bool, str, num, str2);
            }
            if (!this._forSerialization) {
                PropertyMetadata propertyMetadata2 = this._metadata;
                AnnotatedMember primaryMember = getPrimaryMember();
                AnnotatedMember accessor = getAccessor();
                Nulls nulls2 = null;
                boolean z = true;
                if (primaryMember != null) {
                    AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                    if (annotationIntrospector != null) {
                        if (!(accessor == null || (findMergeInfo = annotationIntrospector.findMergeInfo(primaryMember)) == null)) {
                            z = false;
                            if (findMergeInfo.booleanValue()) {
                                propertyMetadata2 = propertyMetadata2.withMergeInfo(PropertyMetadata.MergeInfo.createForPropertyOverride(accessor));
                            }
                        }
                        JsonSetter.Value findSetterInfo = this._annotationIntrospector.findSetterInfo(primaryMember);
                        if (findSetterInfo != null) {
                            nulls2 = findSetterInfo.nonDefaultValueNulls();
                            nulls = findSetterInfo.nonDefaultContentNulls();
                            if (z || nulls2 == null || nulls == null) {
                                this._config.getConfigOverride(getRawPrimaryType()).getClass();
                            }
                        }
                    }
                    nulls = null;
                    this._config.getConfigOverride(getRawPrimaryType()).getClass();
                } else {
                    nulls = null;
                }
                if (z || nulls2 == null || nulls == null) {
                    JsonSetter.Value defaultSetterInfo = this._config.getDefaultSetterInfo();
                    if (nulls2 == null) {
                        nulls2 = defaultSetterInfo.nonDefaultValueNulls();
                    }
                    if (nulls == null) {
                        nulls = defaultSetterInfo.nonDefaultContentNulls();
                    }
                    if (z) {
                        if (Boolean.TRUE.equals(this._config.getDefaultMergeable()) && accessor != null) {
                            propertyMetadata2 = propertyMetadata2.withMergeInfo(PropertyMetadata.MergeInfo.createForDefaults(accessor));
                        }
                    }
                }
                if (!(nulls2 == null && nulls == null)) {
                    propertyMetadata2 = propertyMetadata2.withNulls(nulls2, nulls);
                }
                this._metadata = propertyMetadata2;
            }
        }
        return this._metadata;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember constructorParameter = getConstructorParameter();
        if (constructorParameter == null && (constructorParameter = getSetter()) == null) {
            constructorParameter = getField();
        }
        return constructorParameter == null ? getAccessor() : constructorParameter;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            AnnotatedMethod getter = getGetter();
            if (getter != null) {
                return getter.getType();
            }
            AnnotatedField field = getField();
            if (field == null) {
                return TypeFactory.unknownType();
            }
            return field.getType();
        }
        Annotated constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        if (constructorParameter == null && (constructorParameter = getGetter()) == null) {
            return TypeFactory.unknownType();
        }
        return constructorParameter.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getSetter() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked<T> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = linked.value.getDeclaringClass();
            Class<?> declaringClass2 = linked2.value.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            T t = linked2.value;
            T t2 = linked.value;
            int _setterPriority = _setterPriority(t);
            int _setterPriority2 = _setterPriority(t2);
            if (_setterPriority != _setterPriority2) {
                if (_setterPriority >= _setterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                if (annotationIntrospector != null) {
                    AnnotatedMethod resolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, t2, t);
                    if (resolveSetterConflict != t2) {
                        if (resolveSetterConflict != t) {
                        }
                        linked = linked2;
                        linked2 = linked2.next;
                    } else {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), linked.value.getFullName(), linked2.value.getFullName()));
            }
        }
        this._setters = linked.withoutNext();
        return linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        if (getPrimaryMember() == null || (annotationIntrospector = this._annotationIntrospector) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasField() {
        return this._fields != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasSetter() {
        return this._setters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyIncluded() {
        return _anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyNamed() {
        return _anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            /* class com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass3 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public JsonProperty.Access removeNonVisible(boolean z) {
        JsonProperty.Access access;
        Linked<AnnotatedParameter> linked;
        Linked<AnnotatedMethod> linked2;
        Linked<AnnotatedField> linked3;
        Linked<AnnotatedMethod> linked4;
        Linked<AnnotatedMethod> linked5;
        Linked<AnnotatedField> linked6;
        Linked<AnnotatedParameter> linked7;
        Linked<AnnotatedMethod> linked8;
        JsonProperty.Access access2 = JsonProperty.Access.AUTO;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null || (!this._forSerialization ? ((linked = this._ctorParameters) == null || (access = annotationIntrospector.findPropertyAccess(linked.value)) == null || access == access2) && (((linked2 = this._setters) == null || (access = this._annotationIntrospector.findPropertyAccess(linked2.value)) == null || access == access2) && (((linked3 = this._fields) == null || (access = this._annotationIntrospector.findPropertyAccess(linked3.value)) == null || access == access2) && ((linked4 = this._getters) == null || (access = this._annotationIntrospector.findPropertyAccess(linked4.value)) == null || access == access2))) : ((linked5 = this._getters) == null || (access = annotationIntrospector.findPropertyAccess(linked5.value)) == null || access == access2) && (((linked6 = this._fields) == null || (access = this._annotationIntrospector.findPropertyAccess(linked6.value)) == null || access == access2) && (((linked7 = this._ctorParameters) == null || (access = this._annotationIntrospector.findPropertyAccess(linked7.value)) == null || access == access2) && ((linked8 = this._setters) == null || (access = this._annotationIntrospector.findPropertyAccess(linked8.value)) == null || access == access2))))) {
            access = null;
        }
        if (access != null) {
            access2 = access;
        }
        int ordinal = access2.ordinal();
        if (ordinal == 1) {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (ordinal == 2) {
            this._getters = null;
            if (this._forSerialization) {
                this._fields = null;
            }
        } else if (ordinal != 3) {
            this._getters = _removeNonVisible(this._getters);
            this._ctorParameters = _removeNonVisible(this._ctorParameters);
            if (!z || this._getters == null) {
                this._fields = _removeNonVisible(this._fields);
                this._setters = _removeNonVisible(this._setters);
            }
        }
        return access2;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("[Property '");
        V0.append(this._name);
        V0.append("'; ctors: ");
        V0.append(this._ctorParameters);
        V0.append(", field(s): ");
        V0.append(this._fields);
        V0.append(", getter(s): ");
        V0.append(this._getters);
        V0.append(", setter(s): ");
        V0.append(this._setters);
        V0.append("]");
        return V0.toString();
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }

    protected POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }
}
