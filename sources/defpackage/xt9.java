package defpackage;

import com.spotify.http.clienttoken.g;

/* renamed from: xt9  reason: default package */
public final class xt9 implements fjf<wt9> {
    private final wlf<g> a;

    public xt9(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wt9(this.a.get());
    }
}
