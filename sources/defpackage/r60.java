package defpackage;

import android.text.TextUtils;

/* renamed from: r60  reason: default package */
public class r60 extends x60<r60> {
    private int b = 0;

    public r60(String str) {
        if (!TextUtils.isEmpty(str)) {
            c("controllerType", str);
            return;
        }
        throw new IllegalArgumentException("controller type not valid");
    }

    public r60 e(int i) {
        int i2 = i | this.b;
        this.b = i2;
        b("flags", i2);
        return this;
    }

    public r60 f(int i) {
        c("state", Integer.toString(i));
        return this;
    }
}
