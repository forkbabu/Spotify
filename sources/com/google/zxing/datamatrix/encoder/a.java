package com.google.zxing.datamatrix.encoder;

/* access modifiers changed from: package-private */
public final class a implements g {
    a() {
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        int i;
        String d = hVar.d();
        int i2 = hVar.f;
        int length = d.length();
        if (i2 < length) {
            char charAt = d.charAt(i2);
            i = 0;
            while (j.d(charAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = d.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = hVar.d().charAt(hVar.f);
            char charAt3 = hVar.d().charAt(hVar.f + 1);
            if (!j.d(charAt2) || !j.d(charAt3)) {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
            hVar.q((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
            hVar.f += 2;
            return;
        }
        char c = hVar.c();
        int h = j.h(hVar.d(), hVar.f, 0);
        if (h != 0) {
            if (h == 1) {
                hVar.q(230);
                hVar.n(1);
            } else if (h == 2) {
                hVar.q(239);
                hVar.n(2);
            } else if (h == 3) {
                hVar.q(238);
                hVar.n(3);
            } else if (h == 4) {
                hVar.q(240);
                hVar.n(4);
            } else if (h == 5) {
                hVar.q(231);
                hVar.n(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(h)));
            }
        } else if (j.e(c)) {
            hVar.q(235);
            hVar.q((char) ((c - 128) + 1));
            hVar.f++;
        } else {
            hVar.q((char) (c + 1));
            hVar.f++;
        }
    }
}
