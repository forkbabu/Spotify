package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: d52  reason: default package */
public final class d52 implements i52 {
    public static final d52 b = new d52();

    private d52() {
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return !str.isEmpty();
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
            if (charAt == '?' || charAt == '#') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
