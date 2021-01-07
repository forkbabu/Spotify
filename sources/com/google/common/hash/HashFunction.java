package com.google.common.hash;

import java.nio.charset.Charset;

public interface HashFunction {
    int bits();

    HashCode hashBytes(byte[] bArr);

    HashCode hashString(CharSequence charSequence, Charset charset);

    HashCode hashUnencodedChars(CharSequence charSequence);

    Hasher newHasher();

    Hasher newHasher(int i);
}
