package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class ByteQuadsCanonicalizer {
    private int _count;
    private final boolean _failOnDoS;
    private int[] _hashArea;
    private boolean _hashShared;
    private int _hashSize;
    private boolean _intern;
    private int _longNameOffset;
    private String[] _names;
    private transient boolean _needRehash;
    private final ByteQuadsCanonicalizer _parent;
    private int _secondaryStart;
    private final int _seed;
    private int _spilloverEnd;
    private final AtomicReference<TableInfo> _tableInfo;
    private int _tertiaryShift;
    private int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i, boolean z, int i2, boolean z2) {
        this._parent = null;
        this._seed = i2;
        this._intern = z;
        this._failOnDoS = z2;
        int i3 = 16;
        if (i < 16) {
            i = 16;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i));
    }

    private final int _calcOffset(int i) {
        return (i & (this._hashSize - 1)) << 2;
    }

    static int _calcTertiaryShift(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    private int _findOffsetForAdd(int i) {
        int i2 = (i & (this._hashSize - 1)) << 2;
        int[] iArr = this._hashArea;
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this._secondaryStart + ((i2 >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i2 >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this._spilloverEnd;
        int i9 = i8 + 4;
        this._spilloverEnd = i9;
        int i10 = this._hashSize;
        if (i9 >= (i10 << 3)) {
            if (!this._failOnDoS || i10 <= 1024) {
                this._needRehash = true;
            } else {
                StringBuilder V0 = je.V0("Spill-over slots in symbol table with ");
                V0.append(this._count);
                V0.append(" entries, hash area of ");
                V0.append(this._hashSize);
                V0.append(" slots is now full (all ");
                throw new IllegalStateException(je.B0(V0, this._hashSize >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
            }
        }
        return i8;
    }

    private final int _spilloverStart() {
        int i = this._hashSize;
        return (i << 3) - i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean _verifyLongName(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6._hashArea
            r1 = 0
            r2 = 1
            switch(r8) {
                case 4: goto L_0x003e;
                case 5: goto L_0x0030;
                case 6: goto L_0x0022;
                case 7: goto L_0x0014;
                case 8: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0068
        L_0x0008:
            r8 = r7[r1]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0011
            return r1
        L_0x0011:
            r9 = r3
            r8 = 1
            goto L_0x0015
        L_0x0014:
            r8 = 0
        L_0x0015:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0020
            return r1
        L_0x0020:
            r9 = r4
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x002e
            return r1
        L_0x002e:
            r9 = r4
            goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x003c
            return r1
        L_0x003c:
            r9 = r4
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x004a
            return r1
        L_0x004a:
            int r9 = r8 + 1
            r8 = r7[r8]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r8 == r4) goto L_0x0055
            return r1
        L_0x0055:
            int r8 = r9 + 1
            r9 = r7[r9]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r9 == r3) goto L_0x0060
            return r1
        L_0x0060:
            r7 = r7[r8]
            r8 = r0[r4]
            if (r7 == r8) goto L_0x0067
            return r1
        L_0x0067:
            return r2
        L_0x0068:
            r0 = 0
        L_0x0069:
            int r3 = r0 + 1
            r0 = r7[r0]
            int[] r4 = r6._hashArea
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            if (r3 < r8) goto L_0x007a
            r1 = 1
        L_0x0079:
            return r1
        L_0x007a:
            r0 = r3
            r9 = r5
            goto L_0x0069
            switch-data {4->0x003e, 5->0x0030, 6->0x0022, 7->0x0014, 8->0x0008, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private void _verifyNeedForRehash() {
        if (this._count > (this._hashSize >> 1)) {
            int _spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
            int i = this._count;
            if (_spilloverStart <= ((i + 1) >> 7)) {
                double d = (double) this._hashSize;
                Double.isNaN(d);
                if (((double) i) <= d * 0.8d) {
                    return;
                }
            }
            this._needRehash = true;
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return new ByteQuadsCanonicalizer(64, true, (((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1, true);
    }

    private void nukeSymbols(boolean z) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    public String addName(String str, int[] iArr, int i) {
        int i2;
        if (this._hashShared) {
            int[] iArr2 = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
            _verifyNeedForRehash();
        }
        int i3 = 3;
        if (this._needRehash) {
            this._needRehash = false;
            this._hashShared = false;
            int[] iArr3 = this._hashArea;
            String[] strArr2 = this._names;
            int i4 = this._hashSize;
            int i5 = this._count;
            int i6 = i4 + i4;
            int i7 = this._spilloverEnd;
            if (i6 > 65536) {
                nukeSymbols(true);
            } else {
                this._hashArea = new int[(iArr3.length + (i4 << 3))];
                this._hashSize = i6;
                int i8 = i6 << 2;
                this._secondaryStart = i8;
                this._tertiaryStart = i8 + (i8 >> 1);
                this._tertiaryShift = _calcTertiaryShift(i6);
                this._names = new String[(strArr2.length << 1)];
                nukeSymbols(false);
                int[] iArr4 = new int[16];
                int i9 = 0;
                int i10 = 0;
                while (i9 < i7) {
                    int i11 = iArr3[i9 + 3];
                    if (i11 != 0) {
                        i10++;
                        String str2 = strArr2[i9 >> 2];
                        if (i11 == 1) {
                            iArr4[0] = iArr3[i9];
                            addName(str2, iArr4, 1);
                        } else if (i11 == 2) {
                            iArr4[0] = iArr3[i9];
                            iArr4[1] = iArr3[i9 + 1];
                            addName(str2, iArr4, 2);
                        } else if (i11 != i3) {
                            if (i11 > iArr4.length) {
                                iArr4 = new int[i11];
                            }
                            System.arraycopy(iArr3, iArr3[i9 + 1], iArr4, 0, i11);
                            addName(str2, iArr4, i11);
                        } else {
                            iArr4[0] = iArr3[i9];
                            iArr4[1] = iArr3[i9 + 1];
                            iArr4[2] = iArr3[i9 + 2];
                            addName(str2, iArr4, 3);
                        }
                    }
                    i9 += 4;
                    i3 = 3;
                }
                if (i10 != i5) {
                    throw new IllegalStateException(je.s0("Failed rehash(): old count=", i5, ", copyCount=", i10));
                }
            }
        }
        String intern = this._intern ? InternCache.instance.intern(str) : str;
        if (i == 1) {
            int i12 = iArr[0] ^ this._seed;
            int i13 = i12 + (i12 >>> 16);
            int i14 = i13 ^ (i13 << 3);
            i2 = _findOffsetForAdd(i14 + (i14 >>> 12));
            int[] iArr5 = this._hashArea;
            iArr5[i2] = iArr[0];
            iArr5[i2 + 3] = 1;
        } else if (i == 2) {
            i2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr6 = this._hashArea;
            iArr6[i2] = iArr[0];
            iArr6[i2 + 1] = iArr[1];
            iArr6[i2 + 3] = 2;
        } else if (i != 3) {
            int calcHash = calcHash(iArr, i);
            i2 = _findOffsetForAdd(calcHash);
            int[] iArr7 = this._hashArea;
            iArr7[i2] = calcHash;
            int i15 = this._longNameOffset;
            int i16 = i15 + i;
            if (i16 > iArr7.length) {
                this._hashArea = Arrays.copyOf(this._hashArea, Math.max(i16 - iArr7.length, Math.min(4096, this._hashSize)) + this._hashArea.length);
            }
            System.arraycopy(iArr, 0, this._hashArea, i15, i);
            this._longNameOffset += i;
            int[] iArr8 = this._hashArea;
            iArr8[i2 + 1] = i15;
            iArr8[i2 + 3] = i;
        } else {
            i2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr9 = this._hashArea;
            iArr9[i2] = iArr[0];
            iArr9[i2 + 1] = iArr[1];
            iArr9[i2 + 2] = iArr[2];
            iArr9[i2 + 3] = 3;
        }
        this._names[i2 >> 2] = intern;
        this._count++;
        _verifyNeedForRehash();
        return intern;
    }

    public int calcHash(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = this._seed ^ ((i2 * 33) + (i3 ^ (i3 >>> 9)));
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public String findName(int i, int i2) {
        int _calcOffset = _calcOffset(calcHash(i, i2));
        int[] iArr = this._hashArea;
        int i3 = iArr[_calcOffset + 3];
        if (i3 == 2) {
            if (i == iArr[_calcOffset] && i2 == iArr[_calcOffset + 1]) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this._names[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((_calcOffset >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i == iArr[i8] && i2 == iArr[i8 + 1] && 2 == i10) {
                return this._names[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i == iArr[_spilloverStart] && i2 == iArr[_spilloverStart + 1] && 2 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public ByteQuadsCanonicalizer makeChild(int i) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), this._tableInfo.get());
    }

    public void release() {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._parent;
        if (byteQuadsCanonicalizer != null && (!this._hashShared)) {
            TableInfo tableInfo = new TableInfo(this);
            byteQuadsCanonicalizer.getClass();
            int i = tableInfo.count;
            TableInfo tableInfo2 = byteQuadsCanonicalizer._tableInfo.get();
            if (i != tableInfo2.count) {
                if (i > 6000) {
                    tableInfo = TableInfo.createInitial(64);
                }
                byteQuadsCanonicalizer._tableInfo.compareAndSet(tableInfo2, tableInfo);
            }
            this._hashShared = true;
        }
    }

    public String toString() {
        int i = this._secondaryStart;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this._hashArea[i3] != 0) {
                i2++;
            }
        }
        int i4 = this._tertiaryStart;
        int i5 = 0;
        for (int i6 = this._secondaryStart + 3; i6 < i4; i6 += 4) {
            if (this._hashArea[i6] != 0) {
                i5++;
            }
        }
        int i7 = this._tertiaryStart + 3;
        int i8 = this._hashSize + i7;
        int i9 = 0;
        while (i7 < i8) {
            if (this._hashArea[i7] != 0) {
                i9++;
            }
            i7 += 4;
        }
        int _spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
        int i10 = this._hashSize << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i9), Integer.valueOf(_spilloverStart), Integer.valueOf(i2 + i5 + i9 + _spilloverStart), Integer.valueOf(i11));
    }

    public int calcHash(int i, int i2, int i3) {
        int i4 = i ^ this._seed;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public int calcHash(int[] iArr, int i) {
        if (i >= 4) {
            int i2 = iArr[0] ^ this._seed;
            int i3 = i2 + (i2 >>> 9) + iArr[1];
            int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
            int i5 = i4 + (i4 >>> 4);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = iArr[i6];
                i5 += i7 ^ (i7 >> 21);
            }
            int i8 = i5 * 65599;
            int i9 = i8 + (i8 >>> 19);
            return (i9 << 5) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z, int i, boolean z2, TableInfo tableInfo) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i;
        this._intern = z;
        this._failOnDoS = z2;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i2 = tableInfo.size;
        this._hashSize = i2;
        int i3 = i2 << 2;
        this._secondaryStart = i3;
        this._tertiaryStart = i3 + (i3 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._needRehash = false;
        this._hashShared = true;
    }

    /* access modifiers changed from: private */
    public static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.size = i;
            this.count = i2;
            this.tertiaryShift = i3;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i4;
            this.longNameOffset = i5;
        }

        public static TableInfo createInitial(int i) {
            int i2 = i << 3;
            return new TableInfo(i, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i), new int[i2], new String[(i << 1)], i2 - i, i2);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    public String findName(int i, int i2, int i3) {
        int _calcOffset = _calcOffset(calcHash(i, i2, i3));
        int[] iArr = this._hashArea;
        int i4 = iArr[_calcOffset + 3];
        if (i4 == 3) {
            if (i == iArr[_calcOffset] && iArr[_calcOffset + 1] == i2 && iArr[_calcOffset + 2] == i3) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this._names[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this._tertiaryStart;
        int i8 = this._tertiaryShift;
        int i9 = i7 + ((_calcOffset >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i == iArr[i9] && i2 == iArr[i9 + 1] && i3 == iArr[i9 + 2] && 3 == i11) {
                return this._names[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i == iArr[_spilloverStart] && i2 == iArr[_spilloverStart + 1] && i3 == iArr[_spilloverStart + 2] && 3 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String findName(int[] iArr, int i) {
        if (i >= 4) {
            int calcHash = calcHash(iArr, i);
            int _calcOffset = _calcOffset(calcHash);
            int[] iArr2 = this._hashArea;
            int i2 = iArr2[_calcOffset + 3];
            if (calcHash == iArr2[_calcOffset] && i2 == i && _verifyLongName(iArr, i, iArr2[_calcOffset + 1])) {
                return this._names[_calcOffset >> 2];
            }
            if (i2 == 0) {
                return null;
            }
            int i3 = this._secondaryStart + ((_calcOffset >> 3) << 2);
            int i4 = iArr2[i3 + 3];
            if (calcHash == iArr2[i3] && i4 == i && _verifyLongName(iArr, i, iArr2[i3 + 1])) {
                return this._names[i3 >> 2];
            }
            int i5 = this._tertiaryStart;
            int i6 = this._tertiaryShift;
            int i7 = i5 + ((_calcOffset >> (i6 + 2)) << i6);
            int[] iArr3 = this._hashArea;
            int i8 = (1 << i6) + i7;
            while (i7 < i8) {
                int i9 = iArr3[i7 + 3];
                if (calcHash == iArr3[i7] && i == i9 && _verifyLongName(iArr, i, iArr3[i7 + 1])) {
                    return this._names[i7 >> 2];
                }
                if (i9 == 0) {
                    return null;
                }
                i7 += 4;
            }
            for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
                if (calcHash == iArr3[_spilloverStart] && i == iArr3[_spilloverStart + 3] && _verifyLongName(iArr, i, iArr3[_spilloverStart + 1])) {
                    return this._names[_spilloverStart >> 2];
                }
            }
            return null;
        } else if (i == 1) {
            return findName(iArr[0]);
        } else {
            if (i != 2) {
                return i != 3 ? "" : findName(iArr[0], iArr[1], iArr[2]);
            }
            return findName(iArr[0], iArr[1]);
        }
    }

    public String findName(int i) {
        int i2 = this._seed ^ i;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        int _calcOffset = _calcOffset(i4 + (i4 >>> 12));
        int[] iArr = this._hashArea;
        int i5 = iArr[_calcOffset + 3];
        if (i5 == 1) {
            if (iArr[_calcOffset] == i) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 1) {
            if (iArr[i6] == i) {
                return this._names[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this._tertiaryStart;
        int i9 = this._tertiaryShift;
        int i10 = i8 + ((_calcOffset >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i == iArr[i10] && 1 == i12) {
                return this._names[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i == iArr[_spilloverStart] && 1 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }
}
