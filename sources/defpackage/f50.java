package defpackage;

import com.spotify.music.features.ads.model.Ad;
import java.io.InputStream;

/* renamed from: f50  reason: default package */
public class f50 {
    protected static int f;
    private InputStream a;
    private int b;
    private int c;
    int d;
    protected v40 e = new v40(50);

    public f50(InputStream inputStream) {
        this.a = inputStream;
        this.b = inputStream.read();
        this.c = inputStream.read();
    }

    private void a() {
        this.b = this.c;
        this.c = this.a.read();
        this.d = 0;
    }

    private int j() {
        int i = 0;
        while (c() == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + e(i));
    }

    private void l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(f - this.e.c());
        int length = 8 - valueOf.length();
        sb.append("@" + valueOf);
        for (int i = 0; i < length; i++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - this.e.c();
        for (int i2 = 0; i2 < length2; i2++) {
            sb.append(' ');
        }
        sb.append(this.e);
        sb.append(" (" + str2 + ")");
        this.e.b();
        sb.toString();
    }

    public boolean b() {
        if (this.d == 8) {
            a();
        }
        int i = 1 << ((8 - this.d) - 1);
        int i2 = this.b;
        boolean z = (((i << 1) - 1) & i2) == i;
        if (i2 == -1 || (this.c == -1 && z)) {
            return false;
        }
        return true;
    }

    public int c() {
        if (this.d == 8) {
            a();
            if (this.b == -1) {
                return -1;
            }
        }
        int i = this.b;
        int i2 = this.d;
        int i3 = (i >> (7 - i2)) & 1;
        this.d = i2 + 1;
        this.e.a(i3 == 0 ? '0' : '1');
        f++;
        return i3;
    }

    public boolean d(String str) {
        boolean z = c() != 0;
        l(str, z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        return z;
    }

    public long e(int i) {
        if (i <= 64) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 1) | ((long) c());
            }
            return j;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public long f(int i, String str) {
        long e2 = e(i);
        l(str, String.valueOf(e2));
        return e2;
    }

    public int g(String str) {
        int j = j();
        int i = j & 1;
        int i2 = ((j >> 1) + i) * ((i << 1) - 1);
        l(str, String.valueOf(i2));
        return i2;
    }

    public void h() {
        c();
        e(8 - this.d);
    }

    public int i(int i, String str) {
        long e2 = e(i);
        l(str, String.valueOf(e2));
        return (int) e2;
    }

    public int k(String str) {
        int j = j();
        l(str, String.valueOf(j));
        return j;
    }
}
