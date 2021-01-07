package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource;

public final class s extends HttpDataSource.a {
    private final String b;
    private final a0 c;
    private final int d;
    private final int e;

    public s(String str, a0 a0Var) {
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
            this.c = a0Var;
            this.d = 8000;
            this.e = 8000;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.a
    public HttpDataSource c(HttpDataSource.b bVar) {
        r rVar = new r(this.b, this.d, this.e, false, bVar);
        a0 a0Var = this.c;
        if (a0Var != null) {
            rVar.b(a0Var);
        }
        return rVar;
    }
}
