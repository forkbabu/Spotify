package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import defpackage.xj;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class q implements qj {
    private static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern h = Pattern.compile("MPEGTS:(\\d+)");
    private final String a;
    private final e0 b;
    private final v c = new v();
    private rj d;
    private byte[] e = new byte[1024];
    private int f;

    public q(String str, e0 e0Var) {
        this.a = str;
        this.b = e0Var;
    }

    @RequiresNonNull({"output"})
    private zj e(long j) {
        zj s = this.d.s(0, 3);
        s.c(d0.w(null, "text/vtt", null, -1, 0, this.a, null, j));
        this.d.q();
        return s;
    }

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        int i;
        this.d.getClass();
        int c2 = (int) njVar.c();
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            if (c2 != -1) {
                i = c2;
            } else {
                i = bArr.length;
            }
            this.e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int g2 = njVar.g(bArr2, i3, bArr2.length - i3);
        if (g2 != -1) {
            int i4 = this.f + g2;
            this.f = i4;
            if (c2 == -1 || i4 != c2) {
                return 0;
            }
        }
        v vVar = new v(this.e);
        yp.e(vVar);
        long j = 0;
        long j2 = 0;
        for (String j3 = vVar.j(); !TextUtils.isEmpty(j3); j3 = vVar.j()) {
            if (j3.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = g.matcher(j3);
                if (matcher.find()) {
                    Matcher matcher2 = h.matcher(j3);
                    if (matcher2.find()) {
                        j2 = yp.d(matcher.group(1));
                        j = (Long.parseLong(matcher2.group(1)) * 1000000) / 90000;
                    } else {
                        throw new ParserException(je.x0("X-TIMESTAMP-MAP doesn't contain media timestamp: ", j3));
                    }
                } else {
                    throw new ParserException(je.x0("X-TIMESTAMP-MAP doesn't contain local timestamp: ", j3));
                }
            }
        }
        Matcher a2 = yp.a(vVar);
        if (a2 == null) {
            e(0);
        } else {
            long d2 = yp.d(a2.group(1));
            long b2 = this.b.b((((j + d2) - j2) * 90000) / 1000000);
            zj e2 = e(b2 - d2);
            this.c.I(this.e, this.f);
            e2.b(this.c, this.f);
            e2.d(b2, 1, this.f, 0, null);
        }
        return -1;
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.d = rjVar;
        rjVar.j(new xj.b(-9223372036854775807L, 0));
    }

    @Override // defpackage.qj
    public void c(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        njVar.f(this.e, 0, 6, false);
        this.c.I(this.e, 6);
        if (yp.b(this.c)) {
            return true;
        }
        njVar.f(this.e, 6, 3, false);
        this.c.I(this.e, 9);
        return yp.b(this.c);
    }
}
