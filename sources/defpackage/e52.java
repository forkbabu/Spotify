package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: e52  reason: default package */
public final class e52 implements i52 {
    public static final e52 b = new e52();

    private e52() {
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return str.length() == 16;
    }

    @Override // defpackage.i52
    public boolean b(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
