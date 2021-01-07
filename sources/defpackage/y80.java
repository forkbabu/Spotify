package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.android.dac.engine.view.binders.common.NotFoundComponentBinder;

/* renamed from: y80  reason: default package */
public final class y80 implements fjf<a<?>> {
    private final w80 a;

    public y80(w80 w80) {
        this.a = w80;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.a.getClass();
        return new NotFoundComponentBinder();
    }
}
