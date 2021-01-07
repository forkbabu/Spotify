package com.google.common.hash;

import com.google.common.base.MoreObjects;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public abstract class AbstractCompositeHashFunction extends AbstractHashFunction {
    final HashFunction[] functions;

    AbstractCompositeHashFunction(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            hashFunction.getClass();
        }
        this.functions = hashFunctionArr;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.functions.length;
        final Hasher[] hasherArr = new Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.functions[i].newHasher();
        }
        return new Hasher() {
            /* class com.google.common.hash.AbstractCompositeHashFunction.AnonymousClass1 */

            @Override // com.google.common.hash.Hasher
            public HashCode hash() {
                AbstractCompositeHashFunction abstractCompositeHashFunction = AbstractCompositeHashFunction.this;
                Hasher[] hasherArr = r2;
                int bits = ((Hashing.ConcatenatedHashFunction) abstractCompositeHashFunction).bits() / 8;
                byte[] bArr = new byte[bits];
                int length = hasherArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    HashCode hash = hasherArr[i].hash();
                    int[] iArr = {hash.bits() / 8, hash.bits() / 8};
                    MoreObjects.checkArgument(true);
                    int i3 = iArr[0];
                    for (int i4 = 1; i4 < 2; i4++) {
                        if (iArr[i4] < i3) {
                            i3 = iArr[i4];
                        }
                    }
                    int i5 = i2 + i3;
                    MoreObjects.checkPositionIndexes(i2, i5, bits);
                    hash.writeBytesToImpl(bArr, i2, i3);
                    i++;
                    i2 = i5;
                }
                int i6 = HashCode.a;
                return new HashCode.BytesHashCode(bArr);
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putByte */
            public Hasher mo78putByte(byte b) {
                for (Hasher hasher : r2) {
                    hasher.mo78putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public Hasher putString(CharSequence charSequence, Charset charset) {
                for (Hasher hasher : r2) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public Hasher putUnencodedChars(CharSequence charSequence) {
                for (Hasher hasher : r2) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putBytes */
            public Hasher mo81putBytes(byte[] bArr) {
                for (Hasher hasher : r2) {
                    hasher.mo81putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putByte  reason: collision with other method in class */
            public PrimitiveSink mo80putByte(byte b) {
                for (Hasher hasher : r2) {
                    hasher.mo78putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putBytes  reason: collision with other method in class */
            public PrimitiveSink mo81putBytes(byte[] bArr) {
                for (Hasher hasher : r2) {
                    hasher.mo81putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putBytes */
            public Hasher mo79putBytes(byte[] bArr, int i, int i2) {
                for (Hasher hasher : r2) {
                    hasher.mo79putBytes(bArr, i, i2);
                }
                return this;
            }
        };
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        MoreObjects.checkArgument(i >= 0);
        int length = this.functions.length;
        final Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.functions[i2].newHasher(i);
        }
        return new Hasher() {
            /* class com.google.common.hash.AbstractCompositeHashFunction.AnonymousClass1 */

            @Override // com.google.common.hash.Hasher
            public HashCode hash() {
                AbstractCompositeHashFunction abstractCompositeHashFunction = AbstractCompositeHashFunction.this;
                Hasher[] hasherArr = hasherArr;
                int bits = ((Hashing.ConcatenatedHashFunction) abstractCompositeHashFunction).bits() / 8;
                byte[] bArr = new byte[bits];
                int length = hasherArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    HashCode hash = hasherArr[i].hash();
                    int[] iArr = {hash.bits() / 8, hash.bits() / 8};
                    MoreObjects.checkArgument(true);
                    int i3 = iArr[0];
                    for (int i4 = 1; i4 < 2; i4++) {
                        if (iArr[i4] < i3) {
                            i3 = iArr[i4];
                        }
                    }
                    int i5 = i2 + i3;
                    MoreObjects.checkPositionIndexes(i2, i5, bits);
                    hash.writeBytesToImpl(bArr, i2, i3);
                    i++;
                    i2 = i5;
                }
                int i6 = HashCode.a;
                return new HashCode.BytesHashCode(bArr);
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putByte */
            public Hasher mo78putByte(byte b) {
                for (Hasher hasher : hasherArr) {
                    hasher.mo78putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public Hasher putString(CharSequence charSequence, Charset charset) {
                for (Hasher hasher : hasherArr) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public Hasher putUnencodedChars(CharSequence charSequence) {
                for (Hasher hasher : hasherArr) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putBytes */
            public Hasher mo81putBytes(byte[] bArr) {
                for (Hasher hasher : hasherArr) {
                    hasher.mo81putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putByte  reason: collision with other method in class */
            public PrimitiveSink mo80putByte(byte b) {
                for (Hasher hasher : hasherArr) {
                    hasher.mo78putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putBytes  reason: collision with other method in class */
            public PrimitiveSink mo81putBytes(byte[] bArr) {
                for (Hasher hasher : hasherArr) {
                    hasher.mo81putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            /* renamed from: putBytes */
            public Hasher mo79putBytes(byte[] bArr, int i, int i2) {
                for (Hasher hasher : hasherArr) {
                    hasher.mo79putBytes(bArr, i, i2);
                }
                return this;
            }
        };
    }
}
