package com.spotify.mobile.android.video.offline;

import android.util.Base64;

public class h0 {
    private final byte[] a;

    public h0(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
    }

    public String a() {
        return Base64.encodeToString(this.a, 0);
    }

    public byte[] b() {
        return (byte[]) this.a.clone();
    }
}
