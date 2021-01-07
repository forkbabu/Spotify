package defpackage;

import com.google.android.exoplayer2.util.v;

/* renamed from: yo  reason: default package */
public final class yo {
    public static void a(long j, v vVar, zj[] zjVarArr) {
        while (true) {
            boolean z = true;
            if (vVar.a() > 1) {
                int c = c(vVar);
                int c2 = c(vVar);
                int b = vVar.b() + c2;
                if (c2 == -1 || c2 > vVar.a()) {
                    b = vVar.c();
                } else if (c == 4 && c2 >= 8) {
                    int x = vVar.x();
                    int D = vVar.D();
                    int h = D == 49 ? vVar.h() : 0;
                    int x2 = vVar.x();
                    if (D == 47) {
                        vVar.L(1);
                    }
                    boolean z2 = x == 181 && (D == 49 || D == 47) && x2 == 3;
                    if (D == 49) {
                        if (h != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        b(j, vVar, zjVarArr);
                    }
                }
                vVar.K(b);
            } else {
                return;
            }
        }
    }

    public static void b(long j, v vVar, zj[] zjVarArr) {
        int x = vVar.x();
        if ((x & 64) != 0) {
            vVar.L(1);
            int i = (x & 31) * 3;
            int b = vVar.b();
            for (zj zjVar : zjVarArr) {
                vVar.K(b);
                zjVar.b(vVar, i);
                zjVar.d(j, 1, i, 0, null);
            }
        }
    }

    private static int c(v vVar) {
        int i = 0;
        while (vVar.a() != 0) {
            int x = vVar.x();
            i += x;
            if (x != 255) {
                return i;
            }
        }
        return -1;
    }
}
