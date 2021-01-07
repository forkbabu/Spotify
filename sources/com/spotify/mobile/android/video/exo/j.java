package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.f0;
import com.google.android.video.exo.e;
import java.util.Collections;
import java.util.List;

public class j {
    private final long a;
    private final long b;
    private final io c;
    private final long d;
    private final long e;
    private final d0 f;
    private final List<String> g;
    private final String h;
    private final String i;

    public j(long j, d0 d0Var, int i2, List<String> list, String str, String str2, long j2, long j3) {
        io ioVar;
        qj qjVar;
        this.e = j;
        this.f = d0Var;
        this.g = list;
        this.h = str;
        this.i = str2;
        this.d = j2;
        this.a = j2 * 1000000;
        this.b = u.a(j3);
        if (s.c(d0Var.r)) {
            ioVar = null;
        } else {
            String str3 = d0Var.q;
            str3.getClass();
            if (str3.startsWith("video/webm") || str3.startsWith("audio/webm")) {
                qjVar = new ek(0);
            } else {
                qjVar = new rk(0, null, null, null, Collections.emptyList());
            }
            ioVar = new io(qjVar, i2, d0Var);
        }
        this.c = ioVar;
    }

    public List<String> a() {
        return this.g;
    }

    public io b() {
        return this.c;
    }

    public d0 c() {
        return this.f;
    }

    public e d() {
        return new e(this.h.replace("{{profile_id}}", String.valueOf(this.e)), 0, -1);
    }

    public int e() {
        long j = this.b;
        long j2 = this.a;
        int i2 = f0.a;
        return (int) (((j + j2) - 1) / j2);
    }

    public long f(long j) {
        if (e() == -1 || j != ((long) (e() - 1))) {
            return this.d * 1000000;
        }
        return this.b - (j * this.a);
    }

    public int g(long j) {
        int i2;
        int e2 = e();
        if (e2 == 0 || (i2 = (int) (j / this.a)) < 0) {
            return 0;
        }
        if (e2 == -1) {
            return i2;
        }
        return Math.min(i2, e2 - 1);
    }

    public long h(long j) {
        return j * this.a;
    }

    public e i(long j) {
        return new e(this.i.replace("{{profile_id}}", String.valueOf(this.e)).replace("{{segment_timestamp}}", String.valueOf(j * this.d)), 0, -1);
    }
}
