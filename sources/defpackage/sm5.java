package defpackage;

import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import com.spotify.music.features.listeninghistory.datasource.d;

/* renamed from: sm5  reason: default package */
public final class sm5 implements fjf<rm5> {
    private final wlf<ListeningHistoryDataSource> a;
    private final wlf<d> b;

    public sm5(wlf<ListeningHistoryDataSource> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rm5(this.a.get(), this.b.get());
    }
}
