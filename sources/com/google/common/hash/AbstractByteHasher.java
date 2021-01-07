package com.google.common.hash;

import com.google.common.base.MoreObjects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class AbstractByteHasher extends AbstractHasher {
    private final ByteBuffer scratch = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    AbstractByteHasher() {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putByte */
    public Hasher mo78putByte(byte b) {
        update(b);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher
    public Hasher putChar(char c) {
        this.scratch.putChar(c);
        try {
            update(this.scratch.array(), 0, 2);
            return this;
        } finally {
            this.scratch.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void update(byte b);

    /* access modifiers changed from: protected */
    public abstract void update(byte[] bArr, int i, int i2);

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putByte  reason: collision with other method in class */
    public PrimitiveSink mo78putByte(byte b) {
        update(b);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    public Hasher mo79putBytes(byte[] bArr, int i, int i2) {
        MoreObjects.checkPositionIndexes(i, i + i2, bArr.length);
        update(bArr, i, i2);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes  reason: collision with other method in class */
    public PrimitiveSink mo79putBytes(byte[] bArr, int i, int i2) {
        MoreObjects.checkPositionIndexes(i, i + i2, bArr.length);
        update(bArr, i, i2);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    public Hasher mo81putBytes(byte[] bArr) {
        bArr.getClass();
        update(bArr, 0, bArr.length);
        return this;
    }
}
