package androidx.media;

import android.text.TextUtils;

/* access modifiers changed from: package-private */
public class u {
    private String a;
    private int b;
    private int c;

    u(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.b == -1 || uVar.b == -1) {
            if (!TextUtils.equals(this.a, uVar.a) || this.c != uVar.c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.a, uVar.a) && this.b == uVar.b && this.c == uVar.c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return e2.p(this.a, Integer.valueOf(this.c));
    }
}
