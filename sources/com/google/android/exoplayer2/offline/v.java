package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.n;
import com.google.android.exoplayer2.offline.q;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.d;
import com.google.android.exoplayer2.upstream.cache.i;
import com.google.android.exoplayer2.upstream.cache.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class v implements q {
    private final m a;
    private final Cache b;
    private final d c;
    private final i d;
    private final PriorityTaskManager e;
    private final AtomicBoolean f = new AtomicBoolean();

    private static final class a implements k.a {
        private final q.a a;

        public a(q.a aVar) {
            this.a = aVar;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.a
        public void a(long j, long j2, long j3) {
            ((n.e) this.a).g(j, j2, (j == -1 || j == 0) ? -1.0f : (((float) j2) * 100.0f) / ((float) j));
        }
    }

    public v(Uri uri, String str, r rVar) {
        this.a = new m(uri, 0, -1, str, 4);
        this.b = rVar.c();
        this.c = rVar.a();
        this.d = rVar.d();
        this.e = rVar.e();
    }

    @Override // com.google.android.exoplayer2.offline.q
    public void a(q.a aVar) {
        this.e.a(-1000);
        try {
            k.b(this.a, this.b, this.d, this.c, new byte[131072], this.e, -1000, new a(aVar), this.f, true);
        } finally {
            this.e.c(-1000);
        }
    }

    @Override // com.google.android.exoplayer2.offline.q
    public void cancel() {
        this.f.set(true);
    }

    @Override // com.google.android.exoplayer2.offline.q
    public void remove() {
        k.f(this.a, this.b, this.d);
    }
}
