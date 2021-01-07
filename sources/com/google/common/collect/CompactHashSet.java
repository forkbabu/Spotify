package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    transient Object[] elements;
    private transient long[] entries;
    transient float loadFactor;
    transient int modCount;
    private transient int size;
    private transient int[] table;
    private transient int threshold;

    CompactHashSet() {
        init(3, 1.0f);
    }

    /* access modifiers changed from: private */
    public static int getHash(long j) {
        return (int) (j >>> 32);
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.common.collect.CompactHashSet<E> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private static long swapNext(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size);
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        long[] jArr = this.entries;
        Object[] objArr = this.elements;
        int smearedHash = Collections2.smearedHash(e);
        int hashTableMask = hashTableMask() & smearedHash;
        int i = this.size;
        int[] iArr = this.table;
        int i2 = iArr[hashTableMask];
        if (i2 == -1) {
            iArr[hashTableMask] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (getHash(j) == smearedHash && rw.equal(e, objArr[i2])) {
                    return false;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = swapNext(j, i);
                    break;
                }
                i2 = i3;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length = this.entries.length;
            if (i4 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max < 0) {
                    max = Integer.MAX_VALUE;
                }
                if (max != length) {
                    resizeEntries(max);
                }
            }
            insertEntry(i, e, smearedHash);
            this.size = i4;
            if (i >= this.threshold) {
                int[] iArr2 = this.table;
                int length2 = iArr2.length * 2;
                if (iArr2.length >= 1073741824) {
                    this.threshold = Integer.MAX_VALUE;
                } else {
                    int i5 = ((int) (((float) length2) * this.loadFactor)) + 1;
                    int[] iArr3 = new int[length2];
                    Arrays.fill(iArr3, -1);
                    long[] jArr2 = this.entries;
                    int i6 = length2 - 1;
                    for (int i7 = 0; i7 < this.size; i7++) {
                        int hash = getHash(jArr2[i7]);
                        int i8 = hash & i6;
                        int i9 = iArr3[i8];
                        iArr3[i8] = i7;
                        jArr2[i7] = (((long) hash) << 32) | (4294967295L & ((long) i9));
                    }
                    this.threshold = i5;
                    this.table = iArr3;
                }
            }
            this.modCount++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.modCount++;
        Arrays.fill(this.elements, 0, this.size, (Object) null);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int smearedHash = Collections2.smearedHash(obj);
        int i = this.table[hashTableMask() & smearedHash];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == smearedHash && rw.equal(obj, this.elements[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
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
        this.elements = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.entries = jArr;
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * f));
    }

    /* access modifiers changed from: package-private */
    public void insertEntry(int i, E e, int i2) {
        this.entries[i] = (((long) i2) << 32) | 4294967295L;
        this.elements[i] = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /* class com.google.common.collect.CompactHashSet.AnonymousClass1 */
            int expectedModCount;
            int index;
            int indexToRemove = -1;

            {
                this.expectedModCount = CompactHashSet.this.modCount;
                this.index = CompactHashSet.this.firstEntryIndex();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index >= 0;
            }

            @Override // java.util.Iterator
            public E next() {
                if (CompactHashSet.this.modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                } else if (hasNext()) {
                    int i = this.index;
                    this.indexToRemove = i;
                    CompactHashSet compactHashSet = CompactHashSet.this;
                    E e = (E) compactHashSet.elements[i];
                    this.index = compactHashSet.getSuccessor(i);
                    return e;
                } else {
                    throw new NoSuchElementException();
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                if (CompactHashSet.this.modCount == this.expectedModCount) {
                    MoreObjects.checkState(this.indexToRemove >= 0, "no calls to next() since the last call to remove()");
                    this.expectedModCount++;
                    CompactHashSet compactHashSet = CompactHashSet.this;
                    compactHashSet.remove(compactHashSet.elements[this.indexToRemove], CompactHashSet.getHash(compactHashSet.entries[this.indexToRemove]));
                    this.index = CompactHashSet.this.adjustAfterRemove(this.index, this.indexToRemove);
                    this.indexToRemove = -1;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void moveEntry(int i) {
        int size2 = size() - 1;
        if (i < size2) {
            Object[] objArr = this.elements;
            objArr[i] = objArr[size2];
            objArr[size2] = null;
            long[] jArr = this.entries;
            long j = jArr[size2];
            jArr[i] = j;
            jArr[size2] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr = this.table;
            int i2 = iArr[hash];
            if (i2 == size2) {
                iArr[hash] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.entries;
                long j2 = jArr2[i2];
                int i3 = (int) j2;
                if (i3 == size2) {
                    jArr2[i2] = swapNext(j2, i);
                    return;
                }
                i2 = i3;
            }
        } else {
            this.elements[i] = null;
            this.entries[i] = -1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return remove(obj, Collections2.smearedHash(obj));
    }

    /* access modifiers changed from: package-private */
    public void resizeEntries(int i) {
        this.elements = Arrays.copyOf(this.elements, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.entries = copyOf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return Arrays.copyOf(this.elements, this.size);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean remove(Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) != i || !rw.equal(obj, this.elements[i2])) {
                int i4 = (int) this.entries[i2];
                if (i4 == -1) {
                    return false;
                }
                i3 = i2;
                i2 = i4;
            } else {
                if (i3 == -1) {
                    this.table[hashTableMask] = (int) this.entries[i2];
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], (int) jArr[i2]);
                }
                moveEntry(i2);
                this.size--;
                this.modCount++;
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.elements;
        int i = this.size;
        MoreObjects.checkPositionIndexes(0, 0 + i, objArr.length);
        if (tArr.length < i) {
            tArr = (T[]) Collections2.newArray(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    CompactHashSet(int i) {
        init(i, 1.0f);
    }
}
