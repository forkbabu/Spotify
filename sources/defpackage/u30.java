package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: u30  reason: default package */
public class u30 {
    k50 a = k50.j;
    List<x30> b = new LinkedList();

    public static long b(long j, long j2) {
        return j2 == 0 ? j : b(j2, j % j2);
    }

    public void a(x30 x30) {
        x30 x302;
        long j = x30.n1().j();
        Iterator<x30> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                x302 = null;
                break;
            }
            x30 next = it.next();
            if (next.n1().j() == j) {
                x302 = next;
                break;
            }
        }
        if (x302 != null) {
            y30 n1 = x30.n1();
            long j2 = 0;
            for (x30 x303 : this.b) {
                if (j2 < x303.n1().j()) {
                    j2 = x303.n1().j();
                }
            }
            n1.s(j2 + 1);
        }
        this.b.add(x30);
    }

    public k50 c() {
        return this.a;
    }

    public long d() {
        long g = this.b.iterator().next().n1().g();
        for (x30 x30 : this.b) {
            long g2 = x30.n1().g();
            if (g == 0) {
                g = g2;
            } else {
                g = b(g, g2 % g);
            }
        }
        return g;
    }

    public List<x30> e() {
        return this.b;
    }

    public void f(k50 k50) {
        this.a = k50;
    }

    public String toString() {
        String str = "Movie{ ";
        for (x30 x30 : this.b) {
            str = String.valueOf(str) + "track_" + x30.n1().j() + " (" + x30.getHandler() + ") ";
        }
        return String.valueOf(str) + '}';
    }
}
