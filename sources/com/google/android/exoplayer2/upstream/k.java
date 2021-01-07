package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public interface k {

    public interface a {
        k a();
    }

    long a(m mVar);

    void b(a0 a0Var);

    Map<String, List<String>> c();

    void close();

    Uri getUri();

    int read(byte[] bArr, int i, int i2);
}
