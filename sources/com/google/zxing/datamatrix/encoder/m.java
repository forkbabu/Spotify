package com.google.zxing.datamatrix.encoder;

/* access modifiers changed from: package-private */
public final class m extends c {
    m() {
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.h()) {
                break;
            }
            char c = hVar.c();
            hVar.f++;
            c(c, sb);
            if (sb.length() % 3 == 0) {
                c.f(hVar, sb);
                if (j.h(hVar.d(), hVar.f, 3) != 3) {
                    hVar.n(0);
                    break;
                }
            }
        }
        e(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.zxing.datamatrix.encoder.c
    public int c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            j.c(c);
            throw null;
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    public int d() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.zxing.datamatrix.encoder.c
    public void e(h hVar, StringBuilder sb) {
        hVar.o();
        int a = hVar.g().a() - hVar.a();
        hVar.f -= sb.length();
        if (hVar.f() > 1 || a > 1 || hVar.f() != a) {
            hVar.q(254);
        }
        if (hVar.e() < 0) {
            hVar.n(0);
        }
    }
}
