package defpackage;

import com.spotify.android.flags.c;
import io.reactivex.g;

/* renamed from: xfd  reason: default package */
public final class xfd implements fjf<wfd> {
    private final wlf<g<c>> a;

    public xfd(wlf<g<c>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wfd(this.a.get());
    }
}
