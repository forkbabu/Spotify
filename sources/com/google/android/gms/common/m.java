package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.d1;
import com.google.android.gms.common.internal.f1;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public abstract class m extends f1 {
    private int a;

    protected m(byte[] bArr) {
        g.c(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] F3(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] E3();

    @Override // com.google.android.gms.common.internal.d1
    public final a b() {
        return b.F3(E3());
    }

    @Override // com.google.android.gms.common.internal.d1
    public final int c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        a b;
        if (obj != null && (obj instanceof d1)) {
            try {
                d1 d1Var = (d1) obj;
                if (d1Var.c() == this.a && (b = d1Var.b()) != null) {
                    return Arrays.equals(E3(), (byte[]) b.E3(b));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a;
    }
}
