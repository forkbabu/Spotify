package com.google.common.hash;

import com.adjust.sdk.Constants;
import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = ((int) System.currentTimeMillis());

    enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") {
            @Override // com.google.common.base.Supplier
            public Object get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") {
            @Override // com.google.common.base.Supplier
            public Object get() {
                return new Adler32();
            }
        };
        
        public final HashFunction hashFunction;

        private ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    /* access modifiers changed from: private */
    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        ConcatenatedHashFunction(HashFunction[] hashFunctionArr, AnonymousClass1 r8) {
            super(hashFunctionArr);
            for (HashFunction hashFunction : hashFunctionArr) {
                boolean z = hashFunction.bits() % 8 == 0;
                int bits = hashFunction.bits();
                if (!z) {
                    throw new IllegalArgumentException(MoreObjects.lenientFormat("the number of bits (%s) in hashFunction (%s) must be divisible by 8", Integer.valueOf(bits), hashFunction));
                }
            }
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
            int i = 0;
            for (HashFunction hashFunction : this.functions) {
                i += hashFunction.bits();
            }
            return i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConcatenatedHashFunction) {
                return Arrays.equals(this.functions, ((ConcatenatedHashFunction) obj).functions);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.functions);
        }
    }

    /* access modifiers changed from: private */
    public static class Md5Holder {
        static final HashFunction MD5 = new MessageDigestHashFunction(Constants.MD5, "Hashing.md5()");
    }

    /* access modifiers changed from: private */
    public static class Sha1Holder {
        static final HashFunction SHA_1 = new MessageDigestHashFunction(Constants.SHA1, "Hashing.sha1()");
    }

    private static class Sha256Holder {
        static final HashFunction SHA_256 = new MessageDigestHashFunction(Constants.SHA256, "Hashing.sha256()");
    }

    public static HashFunction crc32() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static HashFunction goodFastHash(int i) {
        MoreObjects.checkArgument(i > 0, "Number of bits must be positive");
        int i2 = (i + 31) & -32;
        if (i2 == 32) {
            return Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        if (i2 <= 128) {
            return Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        int i3 = (i2 + 127) / 128;
        HashFunction[] hashFunctionArr = new HashFunction[i3];
        hashFunctionArr[0] = Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int i4 = GOOD_FAST_HASH_SEED;
        for (int i5 = 1; i5 < i3; i5++) {
            i4 += 1500450271;
            hashFunctionArr[i5] = new Murmur3_128HashFunction(i4);
        }
        return new ConcatenatedHashFunction(hashFunctionArr, null);
    }

    @Deprecated
    public static HashFunction md5() {
        return Md5Holder.MD5;
    }

    public static HashFunction murmur3_128() {
        return Murmur3_128HashFunction.MURMUR3_128;
    }

    public static HashFunction murmur3_32() {
        return Murmur3_32HashFunction.MURMUR3_32;
    }

    @Deprecated
    public static HashFunction sha1() {
        return Sha1Holder.SHA_1;
    }

    public static HashFunction sha256() {
        return Sha256Holder.SHA_256;
    }
}
