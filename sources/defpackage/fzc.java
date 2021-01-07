package defpackage;

import com.spotify.remoteconfig.sa;

/* renamed from: fzc  reason: default package */
public final class fzc implements fjf<y3e> {
    private final wlf<sa> a;

    public fzc(wlf<sa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        sa saVar = this.a.get();
        saVar.getClass();
        return new uyc(saVar);
    }
}
