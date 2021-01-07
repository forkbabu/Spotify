package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.squareup.picasso.a0;
import com.squareup.picasso.l;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: swd  reason: default package */
public final class swd implements fjf<rwd> {
    private final wlf<Context> a;
    private final wlf<l> b;
    private final wlf<List<a0>> c;
    private final wlf<Optional<ExecutorService>> d;

    public swd(wlf<Context> wlf, wlf<l> wlf2, wlf<List<a0>> wlf3, wlf<Optional<ExecutorService>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rwd(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
