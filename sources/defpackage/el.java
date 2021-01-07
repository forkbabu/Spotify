package defpackage;

import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: el  reason: default package */
public final class el {
    private final fl a = new fl();
    private final v b = new v(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    el() {
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            fl flVar = this.a;
            if (i5 >= flVar.d) {
                break;
            }
            int[] iArr = flVar.g;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public fl b() {
        return this.a;
    }

    public v c() {
        return this.b;
    }

    public boolean d(nj njVar) {
        int i;
        g.m(njVar != null);
        if (this.e) {
            this.e = false;
            this.b.F();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.a(njVar, true)) {
                    return false;
                }
                fl flVar = this.a;
                int i2 = flVar.e;
                if ((flVar.b & 1) == 1 && this.b.c() == 0) {
                    i2 += a(0);
                    i = this.d + 0;
                } else {
                    i = 0;
                }
                njVar.l(i2);
                this.c = i;
            }
            int a2 = a(this.c);
            int i3 = this.c + this.d;
            if (a2 > 0) {
                v vVar = this.b;
                if (vVar.a.length < vVar.c() + a2) {
                    v vVar2 = this.b;
                    vVar2.a = Arrays.copyOf(vVar2.a, vVar2.c() + a2);
                }
                v vVar3 = this.b;
                njVar.i(vVar3.a, vVar3.c(), a2, false);
                v vVar4 = this.b;
                vVar4.J(vVar4.c() + a2);
                this.e = this.a.g[i3 + -1] != 255;
            }
            if (i3 == this.a.d) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.F();
        this.c = -1;
        this.e = false;
    }

    public void f() {
        v vVar = this.b;
        byte[] bArr = vVar.a;
        if (bArr.length != 65025) {
            vVar.a = Arrays.copyOf(bArr, Math.max(65025, vVar.c()));
        }
    }
}
