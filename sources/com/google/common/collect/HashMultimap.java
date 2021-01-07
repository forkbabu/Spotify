package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* JADX WARN: Failed to parse class signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;><TKTV> */
public final class HashMultimap extends AbstractSetMultimap {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey = 2;

    private HashMultimap() {
        super(new CompactHashMap(12));
        MoreObjects.checkArgument(true);
        this.expectedValuesPerKey = 2;
    }

    public static <K, V> HashMultimap<K, V> create() {
        return new HashMultimap();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int readInt = objectInputStream.readInt();
        setMap(new CompactHashMap(12));
        Collections2.populateMultimap(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Collections2.writeMultimap(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: createCollection */
    public Collection mo75createCollection() {
        return new CompactHashSet(this.expectedValuesPerKey);
    }
}
