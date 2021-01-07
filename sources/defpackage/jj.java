package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a0;
import okhttp3.d;
import okhttp3.e;

/* renamed from: jj  reason: default package */
public final class jj extends HttpDataSource.a {
    private final e.a b;
    private final String c;
    private final a0 d = null;
    private final d e = null;

    public jj(e.a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.a
    public HttpDataSource c(HttpDataSource.b bVar) {
        ij ijVar = new ij(this.b, this.c, this.e, bVar);
        a0 a0Var = this.d;
        if (a0Var != null) {
            ijVar.b(a0Var);
        }
        return ijVar;
    }
}
