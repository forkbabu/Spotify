package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class CharsToNameCanonicalizer {
    private Bucket[] _buckets;
    private boolean _canonicalize;
    private final int _flags;
    private boolean _hashShared;
    private int _indexMask;
    private int _longestCollisionList;
    private BitSet _overflows;
    private final CharsToNameCanonicalizer _parent;
    private final int _seed;
    private int _size;
    private int _sizeThreshold;
    private String[] _symbols;
    private final AtomicReference<TableInfo> _tableInfo;

    /* access modifiers changed from: package-private */
    public static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i, int i2) {
            if (this.symbol.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.symbol.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(int i) {
        this._parent = null;
        this._seed = i;
        this._canonicalize = true;
        this._flags = -1;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(new TableInfo(0, 0, new String[64], new Bucket[32]));
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return new CharsToNameCanonicalizer((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    public int _hashToIndex(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this._indexMask;
    }

    public int calcHash(String str) {
        int length = str.length();
        int i = this._seed;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public String findSymbol(char[] cArr, int i, int i2, int i3) {
        String str;
        if (i2 < 1) {
            return "";
        }
        if (!this._canonicalize) {
            return new String(cArr, i, i2);
        }
        int _hashToIndex = _hashToIndex(i3);
        String str2 = this._symbols[_hashToIndex];
        if (str2 != null) {
            if (str2.length() == i2) {
                int i4 = 0;
                while (str2.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str2;
                    }
                }
            }
            Bucket bucket = this._buckets[_hashToIndex >> 1];
            if (bucket != null) {
                String has = bucket.has(cArr, i, i2);
                if (has != null) {
                    return has;
                }
                Bucket bucket2 = bucket.next;
                while (true) {
                    if (bucket2 == null) {
                        str = null;
                        break;
                    }
                    str = bucket2.has(cArr, i, i2);
                    if (str != null) {
                        break;
                    }
                    bucket2 = bucket2.next;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        if (this._hashShared) {
            String[] strArr = this._symbols;
            this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
            Bucket[] bucketArr = this._buckets;
            this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            String[] strArr2 = this._symbols;
            int length = strArr2.length;
            int i5 = length + length;
            if (i5 > 65536) {
                this._size = 0;
                this._canonicalize = false;
                this._symbols = new String[64];
                this._buckets = new Bucket[32];
                this._indexMask = 63;
                this._hashShared = false;
            } else {
                Bucket[] bucketArr2 = this._buckets;
                this._symbols = new String[i5];
                this._buckets = new Bucket[(i5 >> 1)];
                this._indexMask = i5 - 1;
                this._sizeThreshold = i5 - (i5 >> 2);
                int i6 = 0;
                int i7 = 0;
                for (String str3 : strArr2) {
                    if (str3 != null) {
                        i6++;
                        int _hashToIndex2 = _hashToIndex(calcHash(str3));
                        String[] strArr3 = this._symbols;
                        if (strArr3[_hashToIndex2] == null) {
                            strArr3[_hashToIndex2] = str3;
                        } else {
                            int i8 = _hashToIndex2 >> 1;
                            Bucket[] bucketArr3 = this._buckets;
                            Bucket bucket3 = new Bucket(str3, bucketArr3[i8]);
                            bucketArr3[i8] = bucket3;
                            i7 = Math.max(i7, bucket3.length);
                        }
                    }
                }
                int i9 = length >> 1;
                for (int i10 = 0; i10 < i9; i10++) {
                    for (Bucket bucket4 = bucketArr2[i10]; bucket4 != null; bucket4 = bucket4.next) {
                        i6++;
                        String str4 = bucket4.symbol;
                        int _hashToIndex3 = _hashToIndex(calcHash(str4));
                        String[] strArr4 = this._symbols;
                        if (strArr4[_hashToIndex3] == null) {
                            strArr4[_hashToIndex3] = str4;
                        } else {
                            int i11 = _hashToIndex3 >> 1;
                            Bucket[] bucketArr4 = this._buckets;
                            Bucket bucket5 = new Bucket(str4, bucketArr4[i11]);
                            bucketArr4[i11] = bucket5;
                            i7 = Math.max(i7, bucket5.length);
                        }
                    }
                }
                this._longestCollisionList = i7;
                this._overflows = null;
                if (i6 != this._size) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this._size), Integer.valueOf(i6)));
                }
            }
            int i12 = this._seed;
            int i13 = i2 + i;
            for (int i14 = i; i14 < i13; i14++) {
                i12 = (i12 * 33) + cArr[i14];
            }
            if (i12 == 0) {
                i12 = 1;
            }
            _hashToIndex = _hashToIndex(i12);
        }
        String str5 = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str5 = InternCache.instance.intern(str5);
        }
        this._size++;
        String[] strArr5 = this._symbols;
        if (strArr5[_hashToIndex] == null) {
            strArr5[_hashToIndex] = str5;
        } else {
            int i15 = _hashToIndex >> 1;
            Bucket[] bucketArr5 = this._buckets;
            Bucket bucket6 = new Bucket(str5, bucketArr5[i15]);
            int i16 = bucket6.length;
            if (i16 > 100) {
                BitSet bitSet = this._overflows;
                if (bitSet == null) {
                    BitSet bitSet2 = new BitSet();
                    this._overflows = bitSet2;
                    bitSet2.set(i15);
                } else if (!bitSet.get(i15)) {
                    this._overflows.set(i15);
                } else if (!JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                    this._canonicalize = false;
                } else {
                    StringBuilder V0 = je.V0("Longest collision chain in symbol table (of size ");
                    V0.append(this._size);
                    V0.append(") now exceeds maximum, ");
                    V0.append(100);
                    V0.append(" -- suspect a DoS attack based on hash collisions");
                    throw new IllegalStateException(V0.toString());
                }
                this._symbols[i15 + i15] = bucket6.symbol;
                this._buckets[i15] = null;
                this._size -= bucket6.length;
                this._longestCollisionList = -1;
            } else {
                bucketArr5[i15] = bucket6;
                this._longestCollisionList = Math.max(i16, this._longestCollisionList);
            }
        }
        return str5;
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild(int i) {
        return new CharsToNameCanonicalizer(this, i, this._seed, this._tableInfo.get());
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if ((!this._hashShared) && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            TableInfo tableInfo = new TableInfo(this);
            charsToNameCanonicalizer.getClass();
            int i = tableInfo.size;
            TableInfo tableInfo2 = charsToNameCanonicalizer._tableInfo.get();
            if (i != tableInfo2.size) {
                if (i > 12000) {
                    tableInfo = new TableInfo(0, 0, new String[64], new Bucket[32]);
                }
                charsToNameCanonicalizer._tableInfo.compareAndSet(tableInfo2, tableInfo);
            }
            this._hashShared = true;
        }
    }

    /* access modifiers changed from: private */
    public static final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(int i, int i2, String[] strArr, Bucket[] bucketArr) {
            this.size = i;
            this.longestCollisionList = i2;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i, int i2, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._seed = i2;
        this._tableInfo = null;
        this._flags = i;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = tableInfo.symbols;
        this._symbols = strArr;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = strArr.length;
        this._sizeThreshold = length - (length >> 2);
        this._indexMask = length - 1;
        this._hashShared = true;
    }
}
