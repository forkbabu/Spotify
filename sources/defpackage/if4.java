package defpackage;

import com.spotify.music.connection.l;
import io.reactivex.functions.c;
import io.reactivex.k;
import io.reactivex.s;

/* renamed from: if4  reason: default package */
public final class if4 implements fjf<hf4> {
    private final wlf<l> a;
    private final wlf<s<we4>> b;
    private final wlf<he4> c;
    private final wlf<k<b91, b91>> d;
    private final wlf<c<b91, b91, b91>> e;

    public if4(wlf<l> wlf, wlf<s<we4>> wlf2, wlf<he4> wlf3, wlf<k<b91, b91>> wlf4, wlf<c<b91, b91, b91>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hf4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
