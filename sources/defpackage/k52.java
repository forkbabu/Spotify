package defpackage;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: k52  reason: default package */
public final class k52 implements i52 {
    public static final k52 b = new k52();

    private k52() {
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return !str.isEmpty();
    }

    @Override // defpackage.i52
    public boolean b(String str) {
        String decode = Uri.decode(str);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= decode.length()) {
                return true;
            }
            char charAt = decode.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
