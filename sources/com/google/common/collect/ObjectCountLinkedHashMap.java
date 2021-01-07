package com.google.common.collect;

import java.util.Arrays;

class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    ObjectCountLinkedHashMap(int i) {
        super(i, 1.0f);
    }

    private int getSuccessor(int i) {
        return (int) this.links[i];
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

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
        int i = this.firstEntry;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int i, float f) {
        super.init(i, f);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int i, K k, int i2, int i3) {
        super.insertEntry(i, k, i2, i3);
        setSucceeds(this.lastEntry, i);
        setSucceeds(i, -2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int i) {
        int i2 = this.size - 1;
        long[] jArr = this.links;
        setSucceeds((int) (jArr[i] >>> 32), (int) jArr[i]);
        if (i < i2) {
            setSucceeds((int) (this.links[i2] >>> 32), i);
            setSucceeds(i, getSuccessor(i2));
        }
        super.moveLastEntry(i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int i) {
        int i2 = (int) this.links[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int i, int i2) {
        return i == this.size ? i2 : i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int i) {
        super.resizeEntries(i);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.links = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }
}
