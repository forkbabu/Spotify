package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.offline.n;
import com.google.android.exoplayer2.offline.q;
import com.google.android.exoplayer2.offline.t;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.d;
import com.google.android.exoplayer2.upstream.cache.i;
import com.google.android.exoplayer2.upstream.cache.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class w<M extends t<M>> implements q {
    private final m a;
    private final Cache b;
    private final d c;
    private final d d;
    private final i e;
    private final PriorityTaskManager f;
    private final ArrayList<x> g;
    private final AtomicBoolean h = new AtomicBoolean();

    private static final class a implements k.a {
        private final q.a a;
        private final long b;
        private final int c;
        private long d;
        private int e;

        public a(q.a aVar, long j, int i, long j2, int i2) {
            this.a = aVar;
            this.b = j;
            this.c = i;
            this.d = j2;
            this.e = i2;
        }

        private float b() {
            long j = this.b;
            if (j != -1 && j != 0) {
                return (((float) this.d) * 100.0f) / ((float) j);
            }
            int i = this.c;
            if (i != 0) {
                return (((float) this.e) * 100.0f) / ((float) i);
            }
            return -1.0f;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.a
        public void a(long j, long j2, long j3) {
            long j4 = this.d + j3;
            this.d = j4;
            ((n.e) this.a).g(this.b, j4, b());
        }

        public void c() {
            this.e++;
            ((n.e) this.a).g(this.b, this.d, b());
        }
    }

    protected static class b implements Comparable<b> {
        public final long a;
        public final m b;

        public b(long j, m mVar) {
            this.a = j;
            this.b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return f0.f(this.a, bVar.a);
        }
    }

    public w(Uri uri, List<x> list, r rVar) {
        this.a = b(uri);
        this.g = new ArrayList<>(list);
        this.b = rVar.c();
        this.c = rVar.a();
        this.d = rVar.b();
        this.e = rVar.d();
        this.f = rVar.e();
    }

    protected static m b(Uri uri) {
        return new m(uri, 0, -1, null, 1);
    }

    private void e(m mVar) {
        k.f(mVar, this.b, this.e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: com.google.android.exoplayer2.offline.w<M extends com.google.android.exoplayer2.offline.t<M>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.offline.q
    public final void a(q.a aVar) {
        this.f.a(-1000);
        try {
            t c2 = c(this.c, this.a);
            if (!this.g.isEmpty()) {
                c2 = (t) c2.a(this.g);
            }
            List<b> d2 = d(this.c, c2, false);
            int size = d2.size();
            long j = 0;
            long j2 = 0;
            int i = 0;
            for (int size2 = d2.size() - 1; size2 >= 0; size2--) {
                Pair<Long, Long> c3 = k.c(d2.get(size2).b, this.b, this.e);
                long longValue = ((Long) c3.first).longValue();
                long longValue2 = ((Long) c3.second).longValue();
                j2 += longValue2;
                if (longValue != -1) {
                    if (longValue == longValue2) {
                        i++;
                        d2.remove(size2);
                    }
                    if (j != -1) {
                        j += longValue;
                    }
                } else {
                    j = -1;
                }
            }
            Collections.sort(d2);
            a aVar2 = new a(aVar, j, size, j2, i);
            byte[] bArr = new byte[131072];
            for (int i2 = 0; i2 < d2.size(); i2++) {
                k.b(d2.get(i2).b, this.b, this.e, this.c, bArr, this.f, -1000, aVar2, this.h, true);
                if (aVar2 != null) {
                    aVar2.c();
                }
            }
        } finally {
            this.f.c(-1000);
        }
    }

    /* access modifiers changed from: protected */
    public abstract M c(com.google.android.exoplayer2.upstream.k kVar, m mVar);

    @Override // com.google.android.exoplayer2.offline.q
    public void cancel() {
        this.h.set(true);
    }

    /* access modifiers changed from: protected */
    public abstract List<b> d(com.google.android.exoplayer2.upstream.k kVar, M m, boolean z);

    @Override // com.google.android.exoplayer2.offline.q
    public final void remove() {
        try {
            List<b> d2 = d(this.d, c(this.d, this.a), true);
            for (int i = 0; i < d2.size(); i++) {
                e(d2.get(i).b);
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            e(this.a);
            throw th;
        }
        e(this.a);
    }
}
