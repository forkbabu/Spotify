package com.spotify.music.features.go.protocol;

import defpackage.me5;
import java.util.List;

public abstract class a<T extends me5> {
    public boolean a(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || bArr[0] != c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T b(List<String> list);

    /* access modifiers changed from: protected */
    public abstract int c();
}
