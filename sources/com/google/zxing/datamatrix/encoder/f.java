package com.google.zxing.datamatrix.encoder;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* access modifiers changed from: package-private */
public final class f implements g {
    f() {
    }

    private static String b(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << '\f') + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 8) & BitmapRenderer.ALPHA_VISIBLE);
            char c3 = (char) (i2 & BitmapRenderer.ALPHA_VISIBLE);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & BitmapRenderer.ALPHA_VISIBLE));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        com.google.zxing.datamatrix.encoder.j.c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        throw null;
     */
    @Override // com.google.zxing.datamatrix.encoder.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.zxing.datamatrix.encoder.h r10) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.encoder.f.a(com.google.zxing.datamatrix.encoder.h):void");
    }
}
