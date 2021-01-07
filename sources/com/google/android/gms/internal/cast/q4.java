package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.s4;
import com.google.android.gms.internal.cast.zzlo;
import java.io.IOException;

public abstract class q4<MessageType extends q4<MessageType, BuilderType>, BuilderType extends s4<MessageType, BuilderType>> implements z6 {
    protected int zzbmy = 0;

    public final byte[] a() {
        r5 r5Var = (r5) this;
        try {
            int e = r5Var.e();
            byte[] bArr = new byte[e];
            int i = zzlo.d;
            zzlo.a aVar = new zzlo.a(bArr, e);
            r5Var.d(aVar);
            if (aVar.N() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder U0 = je.U0(name.length() + 62 + 10, "Serializing ", name, " to a ", "byte array");
            U0.append(" threw an IOException (should never happen).");
            throw new RuntimeException(U0.toString(), e2);
        }
    }

    @Override // com.google.android.gms.internal.cast.z6
    public final zzlb f() {
        r5 r5Var = (r5) this;
        try {
            int e = r5Var.e();
            zzlb zzlb = zzlb.a;
            b5 b5Var = new b5(e, null);
            r5Var.d(b5Var.b());
            return b5Var.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder U0 = je.U0("ByteString".length() + name.length() + 62, "Serializing ", name, " to a ", "ByteString");
            U0.append(" threw an IOException (should never happen).");
            throw new RuntimeException(U0.toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }
}
