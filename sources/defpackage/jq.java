package defpackage;

import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.v0;

/* renamed from: jq  reason: default package */
public abstract class jq {
    private a a;
    private f b;

    /* renamed from: jq$a */
    public interface a {
        void a();
    }

    /* access modifiers changed from: protected */
    public final f a() {
        f fVar = this.b;
        fVar.getClass();
        return fVar;
    }

    public final void b(a aVar, f fVar) {
        this.a = aVar;
        this.b = fVar;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public abstract void d(Object obj);

    public abstract kq e(q0[] q0VarArr, f0 f0Var, t.a aVar, v0 v0Var);
}
