package defpackage;

import com.spotify.music.features.browse.localcache.f;
import com.spotify.music.features.browse.view.a;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: vf4  reason: default package */
public class vf4 {
    private final y a;
    private final f b;
    private final a c;

    public vf4(y yVar, f fVar, a aVar) {
        this.a = yVar;
        this.b = fVar;
        this.c = aVar;
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/spotify/music/connection/OfflineReason;)Lio/reactivex/z<Lb91;>; */
    public z a() {
        b91 d = this.c.d();
        return this.b.read().e(d).w().E(new uf4(d)).H(this.a);
    }
}
