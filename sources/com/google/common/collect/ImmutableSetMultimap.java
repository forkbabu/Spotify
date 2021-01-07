package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 0;

    private static final class SetFieldSettersHolder {
        static final Serialization$FieldSetter<ImmutableSetMultimap> EMPTY_SET_FIELD_SETTER = Collections2.getFieldSetter(ImmutableSetMultimap.class, "emptySet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.common.collect.ImmutableMap$Builder */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        Object obj;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableSet.Builder builder2 = comparator == null ? new ImmutableSet.Builder() : new ImmutableSortedSet.Builder(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.mo53add((ImmutableSet.Builder) objectInputStream.readObject());
                    }
                    ImmutableSet build = builder2.build();
                    if (build.size() == readInt2) {
                        builder.mo51put(readObject, build);
                        i += readInt2;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
                    }
                } else {
                    throw new InvalidObjectException(je.p0("Invalid value count ", readInt2));
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((Serialization$FieldSetter<ImmutableMultimap>) this, (Object) builder.build());
                ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((Serialization$FieldSetter<ImmutableMultimap>) this, i);
                Serialization$FieldSetter<ImmutableSetMultimap> serialization$FieldSetter = SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER;
                if (comparator == null) {
                    int i4 = ImmutableSet.a;
                    obj = RegularImmutableSet.EMPTY;
                } else {
                    obj = ImmutableSortedSet.emptySet(comparator);
                }
                serialization$FieldSetter.set((Serialization$FieldSetter<ImmutableSetMultimap>) this, obj);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            throw new InvalidObjectException(je.p0("Invalid key count ", readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
        Collections2.writeMultimap(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: get */
    public ImmutableSet<V> mo44get(K k) {
        return (ImmutableSet) MoreObjects.firstNonNull((ImmutableSet) this.map.get(k), null);
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/Object;)Lcom/google/common/collect/ImmutableSet<TV;>; */
    @Deprecated
    public ImmutableSet removeAll() {
        throw new UnsupportedOperationException();
    }
}
