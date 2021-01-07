package defpackage;

import androidx.fragment.app.o;
import com.spotify.mobile.android.ui.activity.c;

/* renamed from: xs9  reason: default package */
public final class xs9 implements fjf<ws9> {
    private final wlf<o> a;
    private final wlf<c> b;
    private final wlf<Integer> c;

    public xs9(wlf<o> wlf, wlf<c> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ws9(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
