package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: g52  reason: default package */
public final class g52 implements i52 {
    public static final g52 b = new g52();

    private g52() {
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return true;
    }

    @Override // defpackage.i52
    public boolean b(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            if (str.charAt(i) == '#') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
