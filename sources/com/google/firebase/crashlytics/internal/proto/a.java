package com.google.firebase.crashlytics.internal.proto;

import com.adjust.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* access modifiers changed from: package-private */
public final class a {
    private final byte[] a;
    private volatile int b = 0;

    private a(byte[] bArr) {
        this.a = bArr;
    }

    public static a a(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return new a(bArr2);
    }

    public static a b(String str) {
        try {
            return new a(str.getBytes(Constants.ENCODING));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public void c(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    public InputStream d() {
        return new ByteArrayInputStream(this.a);
    }

    public int e() {
        return this.a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.b;
        if (i == 0) {
            byte[] bArr = this.a;
            int length = bArr.length;
            int i2 = length;
            for (byte b2 : bArr) {
                i2 = (i2 * 31) + b2;
            }
            i = i2 == 0 ? 1 : i2;
            this.b = i;
        }
        return i;
    }
}
