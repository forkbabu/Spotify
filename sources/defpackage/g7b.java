package defpackage;

import com.spotify.libs.search.offline.model.OfflineResults;
import io.reactivex.z;

/* renamed from: g7b  reason: default package */
public class g7b implements f7b {
    private final lz0 a;

    public g7b(lz0 lz0) {
        this.a = lz0;
    }

    @Override // defpackage.f7b
    public z<d7b<OfflineResults>> a(s7b s7b) {
        return this.a.a(s7b.c()).A(new e7b(s7b));
    }
}
