package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX WARN: Failed to parse class signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;><TKTV> */
public final class ArrayListMultimap extends AbstractListMultimap {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey = 3;

    private ArrayListMultimap() {
        super(new CompactHashMap(12));
        Collections2.checkNonnegative(3, "expectedValuesPerKey");
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int readInt = objectInputStream.readInt();
        setMap(new CompactHashMap());
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
        return new ArrayList(this.expectedValuesPerKey);
    }
}
