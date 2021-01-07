package com.google.zxing.datamatrix.encoder;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* access modifiers changed from: package-private */
public final class b implements g {
    b() {
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder S0 = je.S0(0);
        while (true) {
            if (!hVar.h()) {
                break;
            }
            S0.append(hVar.c());
            hVar.f++;
            if (j.h(hVar.d(), hVar.f, 5) != 5) {
                hVar.n(0);
                break;
            }
        }
        int length = S0.length() - 1;
        int a = hVar.a() + length + 1;
        hVar.p(a);
        boolean z = hVar.g().a() - a > 0;
        if (hVar.h() || z) {
            if (length <= 249) {
                S0.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                S0.setCharAt(0, (char) ((length / 250) + 249));
                S0.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = S0.length();
        for (int i = 0; i < length2; i++) {
            int a2 = (((hVar.a() + 1) * 149) % BitmapRenderer.ALPHA_VISIBLE) + 1 + S0.charAt(i);
            if (a2 > 255) {
                a2 -= 256;
            }
            hVar.q((char) a2);
        }
    }
}
