package defpackage;

import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.text.h;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* access modifiers changed from: package-private */
/* renamed from: wo  reason: default package */
public abstract class wo implements e {
    private final ArrayDeque<b> a = new ArrayDeque<>();
    private final ArrayDeque<h> b;
    private final PriorityQueue<b> c;
    private b d;
    private long e;
    private long f;

    /* access modifiers changed from: private */
    /* renamed from: wo$b */
    public static final class b extends g implements Comparable<b> {
        private long p;

        private b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            if (isEndOfStream() == bVar2.isEndOfStream()) {
                long j = this.c - bVar2.c;
                if (j == 0) {
                    j = this.p - bVar2.p;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            } else if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }

        b(a aVar) {
        }
    }

    /* renamed from: wo$c */
    private final class c extends h {
        c(a aVar) {
        }

        @Override // defpackage.gj
        public final void release() {
            wo.this.m(this);
        }
    }

    public wo() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b(null));
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c(null));
        }
        this.c = new PriorityQueue<>();
    }

    private void l(b bVar) {
        bVar.clear();
        this.a.add(bVar);
    }

    @Override // com.google.android.exoplayer2.text.e
    public void a(long j) {
        this.e = j;
    }

    /* access modifiers changed from: protected */
    public abstract d f();

    @Override // defpackage.dj
    public void flush() {
        this.f = 0;
        this.e = 0;
        while (!this.c.isEmpty()) {
            l(this.c.poll());
        }
        b bVar = this.d;
        if (bVar != null) {
            l(bVar);
            this.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(g gVar);

    /* renamed from: h */
    public g e() {
        com.google.android.exoplayer2.util.g.m(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b pollFirst = this.a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public h b() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && this.c.peek().c <= this.e) {
            b poll = this.c.poll();
            if (poll.isEndOfStream()) {
                h pollFirst = this.b.pollFirst();
                pollFirst.addFlag(4);
                l(poll);
                return pollFirst;
            }
            g(poll);
            if (j()) {
                d f2 = f();
                if (!poll.isDecodeOnly()) {
                    h pollFirst2 = this.b.pollFirst();
                    pollFirst2.k(poll.c, f2, Long.MAX_VALUE);
                    l(poll);
                    return pollFirst2;
                }
            }
            l(poll);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean j();

    /* renamed from: k */
    public void c(g gVar) {
        com.google.android.exoplayer2.util.g.a(gVar == this.d);
        if (gVar.isDecodeOnly()) {
            l(this.d);
        } else {
            b bVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            bVar.p = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public void m(h hVar) {
        hVar.clear();
        this.b.add(hVar);
    }
}
