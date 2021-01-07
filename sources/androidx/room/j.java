package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class j implements s7, r7 {
    static final TreeMap<Integer, j> r = new TreeMap<>();
    private volatile String a;
    final long[] b;
    final double[] c;
    final String[] f;
    final byte[][] n;
    private final int[] o;
    final int p;
    int q;

    private j(int i) {
        this.p = i;
        int i2 = i + 1;
        this.o = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.f = new String[i2];
        this.n = new byte[i2][];
    }

    public static j d(String str, int i) {
        TreeMap<Integer, j> treeMap = r;
        synchronized (treeMap) {
            Map.Entry<Integer, j> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                j value = ceilingEntry.getValue();
                value.a = str;
                value.q = i;
                return value;
            }
            j jVar = new j(i);
            jVar.a = str;
            jVar.q = i;
            return jVar;
        }
    }

    @Override // defpackage.r7
    public void H(int i, double d) {
        this.o[i] = 3;
        this.c[i] = d;
    }

    @Override // defpackage.r7
    public void O1(int i) {
        this.o[i] = 1;
    }

    @Override // defpackage.s7
    public String a() {
        return this.a;
    }

    @Override // defpackage.r7
    public void a1(int i, String str) {
        this.o[i] = 4;
        this.f[i] = str;
    }

    @Override // defpackage.s7
    public void b(r7 r7Var) {
        for (int i = 1; i <= this.q; i++) {
            int i2 = this.o[i];
            if (i2 == 1) {
                r7Var.O1(i);
            } else if (i2 == 2) {
                r7Var.t1(i, this.b[i]);
            } else if (i2 == 3) {
                r7Var.H(i, this.c[i]);
            } else if (i2 == 4) {
                r7Var.a1(i, this.f[i]);
            } else if (i2 == 5) {
                r7Var.y1(i, this.n[i]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void f() {
        TreeMap<Integer, j> treeMap = r;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.p), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.r7
    public void t1(int i, long j) {
        this.o[i] = 2;
        this.b[i] = j;
    }

    @Override // defpackage.r7
    public void y1(int i, byte[] bArr) {
        this.o[i] = 5;
        this.n[i] = bArr;
    }
}
