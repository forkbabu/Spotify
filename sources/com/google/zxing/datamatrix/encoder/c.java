package com.google.zxing.datamatrix.encoder;

/* access modifiers changed from: package-private */
public class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f--;
        int c = c(hVar.c(), sb2);
        hVar.j();
        return c;
    }

    static void f(h hVar, StringBuilder sb) {
        int charAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        hVar.r(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.h()) {
                break;
            }
            char c = hVar.c();
            hVar.f++;
            int c2 = c(c, sb);
            int a = hVar.a() + ((sb.length() / 3) << 1);
            hVar.p(a);
            int a2 = hVar.g().a() - a;
            if (hVar.h()) {
                if (sb.length() % 3 == 0 && j.h(hVar.d(), hVar.f, d()) != d()) {
                    hVar.n(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a2 < 2 || a2 > 2)) {
                    c2 = b(hVar, sb, sb2, c2);
                }
                while (sb.length() % 3 == 1 && ((c2 <= 3 && a2 != 1) || c2 > 3)) {
                    c2 = b(hVar, sb, sb2, c2);
                }
            }
        }
        e(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    public int c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c - 128), sb) + 2;
        } else {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
    }

    public int d() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public void e(h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = hVar.a() + ((sb.length() / 3) << 1);
        hVar.p(a);
        int a2 = hVar.g().a() - a;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                f(hVar, sb);
            }
            if (hVar.h()) {
                hVar.q(254);
            }
        } else if (a2 == 1 && length == 1) {
            while (sb.length() >= 3) {
                f(hVar, sb);
            }
            if (hVar.h()) {
                hVar.q(254);
            }
            hVar.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                f(hVar, sb);
            }
            if (a2 > 0 || hVar.h()) {
                hVar.q(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.n(0);
    }
}
