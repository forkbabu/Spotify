package com.google.common.collect;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private final boolean accessOrder = false;
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    CompactLinkedHashMap() {
        super(3, 1.0f);
    }

    private int getPredecessor(int i) {
        return (int) (this.links[i] >>> 32);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstEntry = i2;
        } else {
            long[] jArr = this.links;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.lastEntry = i;
            return;
        }
        long[] jArr2 = this.links;
        jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i) {
        if (this.accessOrder) {
            long[] jArr = this.links;
            setSucceeds((int) (jArr[i] >>> 32), (int) jArr[i]);
            setSucceeds(this.lastEntry, i);
            setSucceeds(i, -2);
            this.modCount++;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i) {
        return (int) this.links[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public void init(int i, float f) {
        super.init(i, f);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i, K k, V v, int i2) {
        super.insertEntry(i, k, v, i2);
        setSucceeds(this.lastEntry, i);
        setSucceeds(i, -2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i) {
        int size = size() - 1;
        long[] jArr = this.links;
        setSucceeds((int) (jArr[i] >>> 32), (int) jArr[i]);
        if (i < size) {
            setSucceeds(getPredecessor(size), i);
            setSucceeds(i, getSuccessor(size));
        }
        super.moveLastEntry(i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i) {
        super.resizeEntries(i);
        this.links = Arrays.copyOf(this.links, i);
    }

    CompactLinkedHashMap(int i) {
        super(i, 1.0f);
    }
}
