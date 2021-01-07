package defpackage;

/* renamed from: glf  reason: default package */
public class glf<E> extends hlf<E> {
    public glf(int i) {
        super(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return h() == d();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        long d;
        e.getClass();
        long j = this.a;
        long e2 = e();
        do {
            d = d();
            if (d >= e2) {
                e2 = h() + j + 1;
                if (d >= e2) {
                    return false;
                }
                f(e2);
            }
        } while (!c(d, 1 + d));
        vlf.b(this.b, slf.a(d, j), e);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        E[] eArr = this.b;
        long j = this.p;
        long a = slf.a(j, this.a);
        E e = (E) vlf.a(eArr, a);
        if (e == null) {
            if (j == d()) {
                return null;
            }
            do {
                e = (E) vlf.a(eArr, a);
            } while (e == null);
        }
        return e;
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.p;
        long a = slf.a(j, this.a);
        E[] eArr = this.b;
        E e = (E) vlf.a(eArr, a);
        if (e == null) {
            if (j == d()) {
                return null;
            }
            do {
                e = (E) vlf.a(eArr, a);
            } while (e == null);
        }
        vlf.c(eArr, a, null);
        i(j + 1);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long h = h();
        while (true) {
            long d = d();
            long h2 = h();
            if (h == h2) {
                return (int) (d - h2);
            }
            h = h2;
        }
    }
}
