package com.google.common.hash;

import com.google.common.hash.HashCode;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
public final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    private static final long serialVersionUID = 0;
    private final int seed;

    private static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private long h1;
        private long h2;
        private int length = 0;

        Murmur3_128Hasher(int i) {
            super(16);
            long j = (long) i;
            this.h1 = j;
            this.h2 = j;
        }

        private static long fmix64(long j) {
            long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
            long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
            return j3 ^ (j3 >>> 33);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j = this.h1;
            int i = this.length;
            long j2 = j ^ ((long) i);
            this.h1 = j2;
            long j3 = this.h2 ^ ((long) i);
            this.h2 = j3;
            long j4 = j2 + j3;
            this.h1 = j4;
            this.h2 = j3 + j4;
            this.h1 = fmix64(j4);
            long fmix64 = fmix64(this.h2);
            this.h2 = fmix64;
            long j5 = this.h1 + fmix64;
            this.h1 = j5;
            this.h2 = fmix64 + j5;
            byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.h1).putLong(this.h2).array();
            int i2 = HashCode.a;
            return new HashCode.BytesHashCode(array);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            long rotateLeft = (Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L) ^ this.h1;
            this.h1 = rotateLeft;
            long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
            this.h1 = rotateLeft2;
            long j3 = this.h2;
            long j4 = rotateLeft2 + j3;
            this.h1 = j4;
            this.h1 = (j4 * 5) + 1390208809;
            long rotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * -8663945395140668459L) ^ j3;
            this.h2 = rotateLeft3;
            long rotateLeft4 = Long.rotateLeft(rotateLeft3, 31);
            this.h2 = rotateLeft4;
            long j5 = rotateLeft4 + this.h1;
            this.h2 = j5;
            this.h2 = (j5 * 5) + 944331445;
            this.length += 16;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            long j9;
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            this.length = byteBuffer.remaining() + this.length;
            long j15 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j2 = 0;
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 2:
                    j3 = 0;
                    j2 = j3 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 3:
                    j4 = 0;
                    j3 = j4 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j2 = j3 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 4:
                    j5 = 0;
                    j4 = j5 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j3 = j4 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j2 = j3 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 5:
                    j6 = 0;
                    j5 = j6 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j4 = j5 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j3 = j4 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j2 = j3 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 6:
                    j7 = 0;
                    j6 = j7 ^ (((long) (byteBuffer.get(5) & 255)) << 40);
                    j5 = j6 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j4 = j5 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j3 = j4 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j2 = j3 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 7:
                    j7 = (((long) (byteBuffer.get(6) & 255)) << 48) ^ 0;
                    j6 = j7 ^ (((long) (byteBuffer.get(5) & 255)) << 40);
                    j5 = j6 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j4 = j5 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j3 = j4 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j2 = j3 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j = ((long) (byteBuffer.get(0) & 255)) ^ j2;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 8:
                    j8 = 0;
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 9:
                    j9 = 0;
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 10:
                    j10 = 0;
                    j9 = j10 ^ (((long) (byteBuffer.get(9) & 255)) << 8);
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 11:
                    j11 = 0;
                    j10 = j11 ^ (((long) (byteBuffer.get(10) & 255)) << 16);
                    j9 = j10 ^ (((long) (byteBuffer.get(9) & 255)) << 8);
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 12:
                    j12 = 0;
                    j11 = j12 ^ (((long) (byteBuffer.get(11) & 255)) << 24);
                    j10 = j11 ^ (((long) (byteBuffer.get(10) & 255)) << 16);
                    j9 = j10 ^ (((long) (byteBuffer.get(9) & 255)) << 8);
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 13:
                    j13 = 0;
                    j12 = j13 ^ (((long) (byteBuffer.get(12) & 255)) << 32);
                    j11 = j12 ^ (((long) (byteBuffer.get(11) & 255)) << 24);
                    j10 = j11 ^ (((long) (byteBuffer.get(10) & 255)) << 16);
                    j9 = j10 ^ (((long) (byteBuffer.get(9) & 255)) << 8);
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 14:
                    j14 = 0;
                    j13 = j14 ^ (((long) (byteBuffer.get(13) & 255)) << 40);
                    j12 = j13 ^ (((long) (byteBuffer.get(12) & 255)) << 32);
                    j11 = j12 ^ (((long) (byteBuffer.get(11) & 255)) << 24);
                    j10 = j11 ^ (((long) (byteBuffer.get(10) & 255)) << 16);
                    j9 = j10 ^ (((long) (byteBuffer.get(9) & 255)) << 8);
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                case 15:
                    j14 = (((long) (byteBuffer.get(14) & 255)) << 48) ^ 0;
                    j13 = j14 ^ (((long) (byteBuffer.get(13) & 255)) << 40);
                    j12 = j13 ^ (((long) (byteBuffer.get(12) & 255)) << 32);
                    j11 = j12 ^ (((long) (byteBuffer.get(11) & 255)) << 24);
                    j10 = j11 ^ (((long) (byteBuffer.get(10) & 255)) << 16);
                    j9 = j10 ^ (((long) (byteBuffer.get(9) & 255)) << 8);
                    j8 = j9 ^ ((long) (byteBuffer.get(8) & 255));
                    j = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
                    this.h2 ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * -8663945395140668459L;
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_128HashFunction) || this.seed != ((Murmur3_128HashFunction) obj).seed) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    @Override // java.lang.Object
    public String toString() {
        return je.B0(je.V0("Hashing.murmur3_128("), this.seed, ")");
    }
}
