package com.google.common.hash;

import java.nio.charset.Charset;

public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Override // com.google.common.hash.PrimitiveSink
    /* renamed from: putByte */
    Hasher mo78putByte(byte b);

    @Override // com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    Hasher mo81putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    Hasher mo79putBytes(byte[] bArr, int i, int i2);

    Hasher putString(CharSequence charSequence, Charset charset);

    Hasher putUnencodedChars(CharSequence charSequence);
}
