package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.t;
import com.google.android.exoplayer2.upstream.x;
import java.io.InputStream;
import java.util.List;

public final class u<T extends t<T>> implements x.a<T> {
    private final x.a<? extends T> a;
    private final List<x> b;

    public u(x.a<? extends T> aVar, List<x> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.x.a
    public Object a(Uri uri, InputStream inputStream) {
        t tVar = (t) this.a.a(uri, inputStream);
        List<x> list = this.b;
        return (list == null || list.isEmpty()) ? tVar : (t) tVar.a(this.b);
    }
}
