package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: b52  reason: default package */
public final class b52 implements i52 {
    public static final b52 b = new b52();

    private b52() {
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return str.length() == 22;
    }

    @Override // defpackage.i52
    public boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
