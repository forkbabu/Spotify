package defpackage;

import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.util.f0;

/* renamed from: kq  reason: default package */
public final class kq {
    public final int a;
    public final r0[] b;
    public final hq c;
    public final Object d;

    public kq(r0[] r0VarArr, gq[] gqVarArr, Object obj) {
        this.b = r0VarArr;
        this.c = new hq(gqVarArr);
        this.d = obj;
        this.a = r0VarArr.length;
    }

    public boolean a(kq kqVar, int i) {
        if (kqVar != null && f0.a(this.b[i], kqVar.b[i]) && f0.a(this.c.a(i), kqVar.c.a(i))) {
            return true;
        }
        return false;
    }

    public boolean b(int i) {
        return this.b[i] != null;
    }
}
