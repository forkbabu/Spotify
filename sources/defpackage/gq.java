package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.upstream.f;
import java.util.List;

/* renamed from: gq  reason: default package */
public interface gq {

    /* renamed from: gq$b */
    public interface b {
        gq[] a(a[] aVarArr, f fVar);
    }

    void a();

    int b();

    boolean c(int i, long j);

    d0 d(int i);

    int e(int i);

    void f(float f);

    Object g();

    void h();

    int i(int i);

    e0 j();

    void k();

    int l(long j, List<? extends po> list);

    int length();

    void m(long j, long j2, long j3, List<? extends po> list, qo[] qoVarArr);

    int n();

    d0 o();

    int p();

    /* renamed from: gq$a */
    public static final class a {
        public final e0 a;
        public final int[] b;
        public final int c;
        public final Object d;

        public a(e0 e0Var, int... iArr) {
            this.a = e0Var;
            this.b = iArr;
            this.c = 0;
            this.d = null;
        }

        public a(e0 e0Var, int[] iArr, int i, Object obj) {
            this.a = e0Var;
            this.b = iArr;
            this.c = i;
            this.d = obj;
        }
    }
}
