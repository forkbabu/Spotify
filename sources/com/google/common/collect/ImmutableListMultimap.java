package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.common.collect.ImmutableMap$Builder */
        /* JADX WARN: Multi-variable type inference failed */
        public ImmutableListMultimap<K, V> build() {
            Set<Map.Entry<K, Collection<V>>> entrySet = this.builderMap.entrySet();
            if (entrySet.isEmpty()) {
                return EmptyImmutableListMultimap.INSTANCE;
            }
            ImmutableMap.Builder builder = new ImmutableMap.Builder(entrySet.size());
            int i = 0;
            for (Map.Entry<K, Collection<V>> entry : entrySet) {
                K key = entry.getKey();
                ImmutableList copyOf = ImmutableList.copyOf((Collection) entry.getValue());
                if (!copyOf.isEmpty()) {
                    builder.mo51put(key, copyOf);
                    i += copyOf.size();
                }
            }
            return new ImmutableListMultimap<>(builder.build(), i);
        }

        public Builder<K, V> putAll(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection<V> collection = this.builderMap.get(k);
                if (collection != null) {
                    for (V v : iterable) {
                        Collections2.checkEntryNotNull(k, v);
                        collection.add(v);
                    }
                } else {
                    Iterator<? extends V> it = iterable.iterator();
                    if (it.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Collections2.checkEntryNotNull(k, next);
                            arrayList.add(next);
                        }
                        this.builderMap.put(k, arrayList);
                    }
                }
                return this;
            }
            StringBuilder V0 = je.V0("null key in entry: null=");
            V0.append(Collections2.toString(iterable));
            throw new NullPointerException(V0.toString());
        }
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.common.collect.ImmutableMap$Builder */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    int i3 = ImmutableList.a;
                    ImmutableList.Builder builder2 = new ImmutableList.Builder();
                    for (int i4 = 0; i4 < readInt2; i4++) {
                        builder2.mo53add((ImmutableList.Builder) objectInputStream.readObject());
                    }
                    builder.mo51put(readObject, builder2.build());
                    i += readInt2;
                } else {
                    throw new InvalidObjectException(je.p0("Invalid value count ", readInt2));
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((Serialization$FieldSetter<ImmutableMultimap>) this, (Object) builder.build());
                ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((Serialization$FieldSetter<ImmutableMultimap>) this, i);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            throw new InvalidObjectException(je.p0("Invalid key count ", readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Collections2.writeMultimap(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    public ImmutableList<V> mo44get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        if (immutableList != null) {
            return immutableList;
        }
        int i = ImmutableList.a;
        return (ImmutableList<V>) RegularImmutableList.EMPTY;
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList<TV;>; */
    @Deprecated
    public ImmutableList removeAll() {
        throw new UnsupportedOperationException();
    }
}
