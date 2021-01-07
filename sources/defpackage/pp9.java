package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: pp9  reason: default package */
public final class pp9 implements fjf<op9> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<m71> c;

    public pp9(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<m71> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new op9(this.a.get(), this.b.get(), this.c.get());
    }
}
