package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.g;
import defpackage.fj;
import defpackage.gj;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: hj  reason: default package */
public abstract class hj<I extends fj, O extends gj, E extends Exception> implements dj<I, O, E> {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    /* renamed from: hj$a */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            hj.f(hj.this);
        }
    }

    protected hj(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = new g();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i3 = 0; i3 < this.h; i3++) {
            this.f[i3] = g();
        }
        a aVar = new a();
        this.a = aVar;
        aVar.start();
    }

    static void f(hj hjVar) {
        hjVar.getClass();
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (hjVar.i());
    }

    private boolean i() {
        I removeFirst;
        O o;
        boolean z;
        synchronized (this.b) {
            while (!this.l) {
                if (!this.c.isEmpty() && this.h > 0) {
                    break;
                }
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            removeFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i2 = this.h - 1;
            this.h = i2;
            o = oArr[i2];
            z = this.k;
            this.k = false;
        }
        if (removeFirst.isEndOfStream()) {
            o.addFlag(4);
        } else {
            if (removeFirst.isDecodeOnly()) {
                o.addFlag(Integer.MIN_VALUE);
            }
            try {
                this.j = h(removeFirst, o, z);
            } catch (RuntimeException e2) {
                this.j = new SubtitleDecoderException("Unexpected decode error", e2);
            } catch (OutOfMemoryError e3) {
                this.j = new SubtitleDecoderException("Unexpected decode error", e3);
            }
            if (this.j != null) {
                synchronized (this.b) {
                }
                return false;
            }
        }
        synchronized (this.b) {
            if (this.k) {
                o.release();
            } else if (o.isDecodeOnly()) {
                this.m++;
                o.release();
            } else {
                o.skippedOutputBufferCount = this.m;
                this.m = 0;
                this.d.addLast(o);
            }
            l(removeFirst);
        }
        return true;
    }

    private void j() {
        if (!this.c.isEmpty() && this.h > 0) {
            this.b.notify();
        }
    }

    private void k() {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    private void l(I i2) {
        i2.clear();
        I[] iArr = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // defpackage.dj
    public Object b() {
        O o;
        synchronized (this.b) {
            k();
            if (this.d.isEmpty()) {
                o = null;
            } else {
                o = this.d.removeFirst();
            }
        }
        return o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.ArrayDeque<I extends fj> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dj
    public void c(Object obj) {
        fj fjVar = (fj) obj;
        synchronized (this.b) {
            k();
            com.google.android.exoplayer2.util.g.a(fjVar == this.i);
            this.c.addLast(fjVar);
            j();
            this.i = null;
        }
    }

    @Override // defpackage.dj
    public void d() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.dj
    public Object e() {
        I i2;
        synchronized (this.b) {
            k();
            com.google.android.exoplayer2.util.g.m(this.i == null);
            int i3 = this.g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.e;
                int i4 = i3 - 1;
                this.g = i4;
                i2 = iArr[i4];
            }
            this.i = i2;
        }
        return i2;
    }

    @Override // defpackage.dj
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            I i2 = this.i;
            if (i2 != null) {
                l(i2);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                l(this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                this.d.removeFirst().release();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract O g();

    /* access modifiers changed from: protected */
    public abstract E h(I i2, O o, boolean z);

    /* access modifiers changed from: protected */
    public void m(O o) {
        synchronized (this.b) {
            o.clear();
            O[] oArr = this.f;
            int i2 = this.h;
            this.h = i2 + 1;
            oArr[i2] = o;
            j();
        }
    }

    /* access modifiers changed from: protected */
    public final void n(int i2) {
        com.google.android.exoplayer2.util.g.m(this.g == this.e.length);
        for (I i3 : this.e) {
            i3.l(i2);
        }
    }
}
