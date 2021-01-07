package com.google.common.hash;

import com.google.common.base.MoreObjects;
import com.google.common.hash.HashCode;
import java.io.Serializable;
import java.util.zip.Checksum;

/* access modifiers changed from: package-private */
public final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final ImmutableSupplier<? extends Checksum> checksumSupplier;
    private final String toString;

    private final class ChecksumHasher extends AbstractByteHasher {
        private final Checksum checksum;

        ChecksumHasher(Checksum checksum2, AnonymousClass1 r3) {
            checksum2.getClass();
            this.checksum = checksum2;
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.checksum.getValue();
            if (ChecksumHashFunction.this.bits == 32) {
                int i = (int) value;
                int i2 = HashCode.a;
                return new HashCode.IntHashCode(i);
            }
            int i3 = HashCode.a;
            return new HashCode.LongHashCode(value);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b) {
            this.checksum.update(b);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i, int i2) {
            this.checksum.update(bArr, i, i2);
        }
    }

    ChecksumHashFunction(ImmutableSupplier<? extends Checksum> immutableSupplier, int i, String str) {
        this.checksumSupplier = immutableSupplier;
        MoreObjects.checkArgument(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        str.getClass();
        this.toString = str;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bits;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new ChecksumHasher((Checksum) this.checksumSupplier.get(), null);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.toString;
    }
}
