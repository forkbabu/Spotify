package com.google.common.hash;

import com.google.common.base.MoreObjects;
import com.google.common.hash.HashCode;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    private static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        SerializedForm(String str, int i, String str2, AnonymousClass1 r4) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    MessageDigestHashFunction(String str, String str2) {
        boolean z;
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        this.bytes = messageDigest.getDigestLength();
        this.toString = str2;
        try {
            messageDigest.clone();
            z = true;
        } catch (CloneNotSupportedException unused) {
            z = false;
        }
        this.supportsClone = z;
    }

    private static MessageDigest getMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bytes * 8;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.supportsClone) {
            try {
                return new MessageDigestHasher((MessageDigest) this.prototype.clone(), this.bytes, null);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MessageDigestHasher(getMessageDigest(this.prototype.getAlgorithm()), this.bytes, null);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.toString;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString, null);
    }

    private static final class MessageDigestHasher extends AbstractByteHasher {
        private final int bytes;
        private final MessageDigest digest;
        private boolean done;

        MessageDigestHasher(MessageDigest messageDigest, int i, AnonymousClass1 r3) {
            this.digest = messageDigest;
            this.bytes = i;
        }

        private void checkNotDone() {
            MoreObjects.checkState(!this.done, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            checkNotDone();
            this.done = true;
            if (this.bytes == this.digest.getDigestLength()) {
                byte[] digest2 = this.digest.digest();
                int i = HashCode.a;
                return new HashCode.BytesHashCode(digest2);
            }
            byte[] copyOf = Arrays.copyOf(this.digest.digest(), this.bytes);
            int i2 = HashCode.a;
            return new HashCode.BytesHashCode(copyOf);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b) {
            checkNotDone();
            this.digest.update(b);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i, int i2) {
            checkNotDone();
            this.digest.update(bArr, i, i2);
        }
    }

    MessageDigestHashFunction(String str, int i, String str2) {
        str2.getClass();
        this.toString = str2;
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        boolean z = true;
        if (i >= 4 && i <= digestLength) {
            this.bytes = i;
            try {
                messageDigest.clone();
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.supportsClone = z;
            return;
        }
        throw new IllegalArgumentException(MoreObjects.lenientFormat("bytes (%s) must be >= 4 and < %s", Integer.valueOf(i), Integer.valueOf(digestLength)));
    }
}
