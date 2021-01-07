package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public class ObjectCountHashMap<K> {
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    class MapEntry extends Multisets$AbstractEntry<K> {
        final K key;
        int lastKnownIndex;

        MapEntry(int i) {
            this.key = (K) ObjectCountHashMap.this.keys[i];
            this.lastKnownIndex = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
            if (defpackage.rw.equal(r4.key, r2.keys[r0]) != false) goto L_0x0021;
         */
        @Override // com.google.common.collect.Multiset.Entry
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int getCount() {
            /*
                r4 = this;
                int r0 = r4.lastKnownIndex
                r1 = -1
                if (r0 == r1) goto L_0x0017
                com.google.common.collect.ObjectCountHashMap r2 = com.google.common.collect.ObjectCountHashMap.this
                int r3 = r2.size
                if (r0 >= r3) goto L_0x0017
                K r3 = r4.key
                java.lang.Object[] r2 = r2.keys
                r0 = r2[r0]
                boolean r0 = defpackage.rw.equal(r3, r0)
                if (r0 != 0) goto L_0x0021
            L_0x0017:
                com.google.common.collect.ObjectCountHashMap r0 = com.google.common.collect.ObjectCountHashMap.this
                K r2 = r4.key
                int r0 = r0.indexOf(r2)
                r4.lastKnownIndex = r0
            L_0x0021:
                int r0 = r4.lastKnownIndex
                if (r0 != r1) goto L_0x0027
                r0 = 0
                goto L_0x002d
            L_0x0027:
                com.google.common.collect.ObjectCountHashMap r1 = com.google.common.collect.ObjectCountHashMap.this
                int[] r1 = r1.values
                r0 = r1[r0]
            L_0x002d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ObjectCountHashMap.MapEntry.getCount():int");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public K getElement() {
            return this.key;
        }
    }

    ObjectCountHashMap() {
        init(3, 1.0f);
    }

    private static int getHash(long j) {
        return (int) (j >>> 32);
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long swapNext(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    /* access modifiers changed from: package-private */
    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.values[indexOf];
    }

    /* access modifiers changed from: package-private */
    public K getKey(int i) {
        MoreObjects.checkElementIndex(i, this.size, "index");
        return (K) this.keys[i];
    }

    /* access modifiers changed from: package-private */
    public int getValue(int i) {
        MoreObjects.checkElementIndex(i, this.size, "index");
        return this.values[i];
    }

    /* access modifiers changed from: package-private */
    public int indexOf(Object obj) {
        int smearedHash = Collections2.smearedHash(obj);
        int i = this.table[hashTableMask() & smearedHash];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == smearedHash && rw.equal(obj, this.keys[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void init(int i, float f) {
        boolean z = false;
        MoreObjects.checkArgument(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        MoreObjects.checkArgument(z, "Illegal load factor");
        int closedTableSize = Collections2.closedTableSize(i, (double) f);
        int[] iArr = new int[closedTableSize];
        Arrays.fill(iArr, -1);
        this.table = iArr;
        this.loadFactor = f;
        this.keys = new Object[i];
        this.values = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.entries = jArr;
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * f));
    }

    /* access modifiers changed from: package-private */
    public void insertEntry(int i, K k, int i2, int i3) {
        this.entries[i] = (((long) i3) << 32) | 4294967295L;
        this.keys[i] = k;
        this.values[i] = i2;
    }

    /* access modifiers changed from: package-private */
    public void moveLastEntry(int i) {
        int i2 = this.size - 1;
        if (i < i2) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[i2];
            int[] iArr = this.values;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.entries;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr2 = this.table;
            int i3 = iArr2[hash];
            if (i3 == i2) {
                iArr2[hash] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.entries;
                long j2 = jArr2[i3];
                int i4 = (int) j2;
                if (i4 == i2) {
                    jArr2[i3] = swapNext(j2, i);
                    return;
                }
                i3 = i4;
            }
        } else {
            this.keys[i] = null;
            this.values[i] = 0;
            this.entries[i] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public int nextIndex(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int nextIndexAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int put(K k, int i) {
        if (i > 0) {
            long[] jArr = this.entries;
            Object[] objArr = this.keys;
            int[] iArr = this.values;
            int smearedHash = Collections2.smearedHash(k);
            int hashTableMask = hashTableMask() & smearedHash;
            int i2 = this.size;
            int[] iArr2 = this.table;
            int i3 = iArr2[hashTableMask];
            if (i3 == -1) {
                iArr2[hashTableMask] = i2;
            } else {
                while (true) {
                    long j = jArr[i3];
                    if (getHash(j) != smearedHash || !rw.equal(k, objArr[i3])) {
                        int i4 = (int) j;
                        if (i4 == -1) {
                            jArr[i3] = swapNext(j, i2);
                            break;
                        }
                        i3 = i4;
                    } else {
                        int i5 = iArr[i3];
                        iArr[i3] = i;
                        return i5;
                    }
                }
            }
            if (i2 != Integer.MAX_VALUE) {
                int i6 = i2 + 1;
                int length = this.entries.length;
                if (i6 > length) {
                    int max = Math.max(1, length >>> 1) + length;
                    if (max < 0) {
                        max = Integer.MAX_VALUE;
                    }
                    if (max != length) {
                        resizeEntries(max);
                    }
                }
                insertEntry(i2, k, i, smearedHash);
                this.size = i6;
                if (i2 >= this.threshold) {
                    int[] iArr3 = this.table;
                    int length2 = iArr3.length * 2;
                    if (iArr3.length >= 1073741824) {
                        this.threshold = Integer.MAX_VALUE;
                    } else {
                        int i7 = ((int) (((float) length2) * this.loadFactor)) + 1;
                        int[] iArr4 = new int[length2];
                        Arrays.fill(iArr4, -1);
                        long[] jArr2 = this.entries;
                        int i8 = length2 - 1;
                        for (int i9 = 0; i9 < this.size; i9++) {
                            int hash = getHash(jArr2[i9]);
                            int i10 = hash & i8;
                            int i11 = iArr4[i10];
                            iArr4[i10] = i9;
                            jArr2[i9] = (((long) hash) << 32) | (4294967295L & ((long) i11));
                        }
                        this.threshold = i7;
                        this.table = iArr4;
                    }
                }
                this.modCount++;
                return 0;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        throw new IllegalArgumentException("count must be positive but was: " + i);
    }

    public int remove(Object obj) {
        return remove(obj, Collections2.smearedHash(obj));
    }

    /* access modifiers changed from: package-private */
    public int removeEntry(int i) {
        return remove(this.keys[i], getHash(this.entries[i]));
    }

    /* access modifiers changed from: package-private */
    public void resizeEntries(int i) {
        this.keys = Arrays.copyOf(this.keys, i);
        this.values = Arrays.copyOf(this.values, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.entries = copyOf;
    }

    /* access modifiers changed from: package-private */
    public void setValue(int i, int i2) {
        MoreObjects.checkElementIndex(i, this.size, "index");
        this.values[i] = i2;
    }

    private int remove(Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) != i || !rw.equal(obj, this.keys[i2])) {
                int i4 = (int) this.entries[i2];
                if (i4 == -1) {
                    return 0;
                }
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.values[i2];
                if (i3 == -1) {
                    this.table[hashTableMask] = (int) this.entries[i2];
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], (int) jArr[i2]);
                }
                moveLastEntry(i2);
                this.size--;
                this.modCount++;
                return i5;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.common.collect.ObjectCountHashMap<K> */
    /* JADX WARN: Multi-variable type inference failed */
    ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size, 1.0f);
        int firstIndex = objectCountHashMap.firstIndex();
        while (firstIndex != -1) {
            put(objectCountHashMap.getKey(firstIndex), objectCountHashMap.getValue(firstIndex));
            firstIndex = objectCountHashMap.nextIndex(firstIndex);
        }
    }

    ObjectCountHashMap(int i) {
        init(i, 1.0f);
    }

    ObjectCountHashMap(int i, float f) {
        init(i, f);
    }
}
