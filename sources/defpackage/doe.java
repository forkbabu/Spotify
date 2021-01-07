package defpackage;

import com.spotify.superbird.ota.model.f;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.subjects.c;

/* renamed from: doe  reason: default package */
public final class doe implements fjf<g<f>> {
    private final wlf<c<f>> a;

    public doe(wlf<c<f>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().Y0(BackpressureStrategy.BUFFER);
    }
}
