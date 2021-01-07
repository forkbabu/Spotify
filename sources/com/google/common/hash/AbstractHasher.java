package com.google.common.hash;

import java.nio.charset.Charset;

abstract class AbstractHasher implements Hasher {
    AbstractHasher() {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    public abstract Hasher mo79putBytes(byte[] bArr, int i, int i2);

    public abstract Hasher putChar(char c);

    @Override // com.google.common.hash.Hasher
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return mo81putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            putChar(charSequence.charAt(i));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    public Hasher mo81putBytes(byte[] bArr) {
        return mo79putBytes(bArr, 0, bArr.length);
    }
}
