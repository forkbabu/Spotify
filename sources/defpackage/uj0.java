package defpackage;

import com.google.protobuf.u;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: uj0  reason: default package */
public class uj0 {
    private final vj0 a;

    protected uj0(vj0 vj0) {
        this.a = vj0;
    }

    /* access modifiers changed from: protected */
    public z<byte[]> q(String str, String str2, u uVar) {
        return this.a.b(str, str2, uVar.toByteArray());
    }

    /* access modifiers changed from: protected */
    public s<byte[]> r(String str, String str2, u uVar) {
        return this.a.a(str, str2, uVar.toByteArray());
    }
}
