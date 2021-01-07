package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import com.spotify.music.features.tasteonboarding.logging.b;
import com.spotify.remoteconfig.v5;
import io.reactivex.s;

/* renamed from: vp8  reason: default package */
public class vp8 {
    private final kp8 a;
    private final cqe b;
    private final b c;
    private final b d;
    private final v5 e;

    public vp8(kp8 kp8, cqe cqe, b bVar, b bVar2, v5 v5Var) {
        this.a = kp8;
        this.b = cqe;
        this.c = bVar;
        this.d = bVar2;
        this.e = v5Var;
    }

    public s<ArtistSearchResponse> a(String str) {
        return this.a.c(str);
    }

    public s<ArtistSearchResponse> b(String str) {
        if (this.e.c()) {
            return this.a.b(str, String.valueOf(this.b.d()), this.c.a(), this.d.a());
        }
        return this.a.a(str, String.valueOf(this.b.d()), this.c.a(), this.d.a());
    }
}
