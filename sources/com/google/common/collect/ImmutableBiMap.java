package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        /* renamed from: put */
        public Builder<K, V> mo51put(K k, V v) {
            super.mo51put((Builder<K, V>) k, (K) v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableMap.Builder putAll(Map map) {
            super.putAll(map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            if (this.size == 0) {
                return RegularImmutableBiMap.EMPTY;
            }
            this.entriesUsed = true;
            return new RegularImmutableBiMap(this.alternatingKeysAndValues, this.size);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        /* renamed from: put  reason: collision with other method in class */
        public ImmutableMap.Builder mo51put(Object obj, Object obj2) {
            super.mo51put((Builder<K, V>) obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableMap.Builder putAll(Iterable iterable) {
            super.putAll(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableMap.Builder put(Map.Entry entry) {
            super.put(entry);
            return this;
        }
    }

    private static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Object readResolve() {
            return createMap(new Builder());
        }
    }

    ImmutableBiMap() {
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v) {
        Collections2.checkEntryNotNull(k, v);
        return new RegularImmutableBiMap(new Object[]{k, v}, 1);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.BiMap
    @Deprecated
    public V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    /* renamed from: inverse */
    public abstract ImmutableBiMap<V, K> mo68inverse();

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        Collections2.checkEntryNotNull(k, v);
        Collections2.checkEntryNotNull(k2, v2);
        Collections2.checkEntryNotNull(k3, v3);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    /* renamed from: values */
    public ImmutableSet<V> mo50values() {
        return mo68inverse().keySet();
    }
}
