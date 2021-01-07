package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: mna  reason: default package */
public final class mna implements fjf<qna> {
    private final wlf<Cosmonaut> a;

    public mna(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qna qna = (qna) this.a.get().createCosmosService(qna.class);
        yif.g(qna, "Cannot return null from a non-@Nullable @Provides method");
        return qna;
    }
}
