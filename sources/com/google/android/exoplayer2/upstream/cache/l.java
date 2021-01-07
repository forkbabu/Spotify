package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.g;
import java.io.File;
import java.util.TreeSet;

/* access modifiers changed from: package-private */
public final class l {
    public final int a;
    public final String b;
    private final TreeSet<v> c = new TreeSet<>();
    private q d;
    private boolean e;

    public l(int i, String str, q qVar) {
        this.a = i;
        this.b = str;
        this.d = qVar;
    }

    public void a(v vVar) {
        this.c.add(vVar);
    }

    public boolean b(p pVar) {
        q qVar = this.d;
        q a2 = qVar.a(pVar);
        this.d = a2;
        return !a2.equals(qVar);
    }

    public long c(long j, long j2) {
        v e2 = e(j);
        boolean z = true;
        if (!e2.f) {
            long j3 = e2.c;
            if (j3 != -1) {
                z = false;
            }
            if (z) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = e2.b + e2.c;
        if (j5 < j4) {
            for (v vVar : this.c.tailSet(e2, false)) {
                long j6 = vVar.b;
                if (j6 > j5) {
                    break;
                }
                j5 = Math.max(j5, j6 + vVar.c);
                if (j5 >= j4) {
                    break;
                }
            }
        }
        return Math.min(j5 - j, j2);
    }

    public q d() {
        return this.d;
    }

    public v e(long j) {
        v k = v.k(this.b, j);
        v floor = this.c.floor(k);
        if (floor != null && floor.b + floor.c > j) {
            return floor;
        }
        v ceiling = this.c.ceiling(k);
        if (ceiling == null) {
            return v.l(this.b, j);
        }
        return v.i(this.b, j, ceiling.b - j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a != lVar.a || !this.b.equals(lVar.b) || !this.c.equals(lVar.c) || !this.d.equals(lVar.d)) {
            return false;
        }
        return true;
    }

    public TreeSet<v> f() {
        return this.c;
    }

    public boolean g() {
        return this.c.isEmpty();
    }

    public boolean h() {
        return this.e;
    }

    public int hashCode() {
        return this.d.hashCode() + je.Y0(this.b, this.a * 31, 31);
    }

    public boolean i(j jVar) {
        if (!this.c.remove(jVar)) {
            return false;
        }
        jVar.n.delete();
        return true;
    }

    public v j(v vVar, long j, boolean z) {
        g.m(this.c.remove(vVar));
        File file = vVar.n;
        if (z) {
            File m = v.m(file.getParentFile(), this.a, vVar.b, j);
            if (file.renameTo(m)) {
                file = m;
            } else {
                String str = "Failed to rename " + file + " to " + m;
            }
        }
        v g = vVar.g(file, j);
        this.c.add(g);
        return g;
    }

    public void k(boolean z) {
        this.e = z;
    }
}
