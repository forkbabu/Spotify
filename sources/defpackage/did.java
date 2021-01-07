package defpackage;

import android.content.Context;

/* renamed from: did  reason: default package */
public class did {
    private final Context a;
    private final yyd b;
    private final hid c;
    private final jwc d;
    private final oq0 e;

    public did(Context context, yyd yyd, hid hid, jwc jwc, oq0 oq0) {
        this.a = context;
        this.b = yyd;
        this.c = hid;
        this.d = jwc;
        this.e = oq0;
    }

    public mhd a() {
        cid cid = new cid(this.c);
        return this.b.c() ? new kid(this.a, cid, this.d, this.c, this.e) : cid;
    }
}
