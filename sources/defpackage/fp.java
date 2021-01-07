package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;

/* access modifiers changed from: package-private */
/* renamed from: fp  reason: default package */
public final class fp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private fp(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static fp a(String str) {
        char c2;
        g.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String Q = f0.Q(split[i5].trim());
            Q.hashCode();
            switch (Q.hashCode()) {
                case 100571:
                    if (Q.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3556653:
                    if (Q.equals("text")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (Q.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (Q.equals("style")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                i2 = i5;
            } else if (c2 == 1) {
                i4 = i5;
            } else if (c2 == 2) {
                i = i5;
            } else if (c2 == 3) {
                i3 = i5;
            }
        }
        if (i == -1 || i2 == -1) {
            return null;
        }
        return new fp(i, i2, i3, i4, split.length);
    }
}
