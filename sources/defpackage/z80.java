package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.android.dac.engine.view.binders.containers.list.VerticalListComponentBinder;
import kotlin.jvm.internal.h;

/* renamed from: z80  reason: default package */
public final class z80 implements fjf<a<?>> {
    private final w80 a;
    private final wlf<s80> b;

    public z80(w80 w80, wlf<s80> wlf) {
        this.a = w80;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w80 w80 = this.a;
        wlf<s80> wlf = this.b;
        w80.getClass();
        h.e(wlf, "dacResolverProvider");
        return new VerticalListComponentBinder(wlf);
    }
}
