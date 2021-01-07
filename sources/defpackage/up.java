package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: up  reason: default package */
public final class up {
    private String a = "";
    private String b = "";
    private List<String> c = Collections.emptyList();
    private String d = "";
    private String e = null;
    private int f;
    private boolean g = false;
    private int h;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;

    private static int u(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int b() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.n;
    }

    public int e(String str, String str2, String[] strArr, String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int u = u(u(u(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (u == -1 || !Arrays.asList(strArr).containsAll(this.c)) {
            return 0;
        }
        return (this.c.size() * 4) + u;
    }

    public int f() {
        int i2 = this.l;
        if (i2 == -1 && this.m == -1) {
            return -1;
        }
        int i3 = 0;
        int i4 = i2 == 1 ? 1 : 0;
        if (this.m == 1) {
            i3 = 2;
        }
        return i4 | i3;
    }

    public boolean g() {
        return this.i;
    }

    public boolean h() {
        return this.g;
    }

    public boolean i() {
        return this.j == 1;
    }

    public boolean j() {
        return this.k == 1;
    }

    public up k(int i2) {
        this.h = i2;
        this.i = true;
        return this;
    }

    public up l(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public up m(int i2) {
        this.f = i2;
        this.g = true;
        return this;
    }

    public up n(String str) {
        this.e = f0.Q(str);
        return this;
    }

    public up o(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public void p(String[] strArr) {
        this.c = Arrays.asList(strArr);
    }

    public void q(String str) {
        this.a = str;
    }

    public void r(String str) {
        this.b = str;
    }

    public void s(String str) {
        this.d = str;
    }

    public up t(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }
}
