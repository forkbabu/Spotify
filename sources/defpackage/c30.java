package defpackage;

import com.google.zxing.common.a;

/* renamed from: c30  reason: default package */
final class c30 extends h30 {
    private final short c;
    private final short d;

    c30(h30 h30, int i, int i2) {
        super(h30);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.h30
    public void a(a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.d(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        aVar.d(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.d(Math.min((int) s2, 31), 5);
                    } else {
                        aVar.d(s2 - 31, 5);
                    }
                }
                aVar.d(bArr[this.c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
