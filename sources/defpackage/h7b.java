package defpackage;

import com.spotify.libs.search.offline.model.OfflineResults;
import io.reactivex.z;

/* renamed from: h7b  reason: default package */
public class h7b implements f7b {
    @Override // defpackage.f7b
    public z<d7b<OfflineResults>> a(s7b s7b) {
        return z.z(d7b.c(s7b.c(), OfflineResults.empty(s7b.c())));
    }
}
