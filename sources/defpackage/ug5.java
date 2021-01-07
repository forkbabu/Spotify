package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.podcast.loader.h;
import com.spotify.music.libs.podcast.loader.i;
import com.spotify.playlist.models.Episode;
import defpackage.o1e;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: ug5  reason: default package */
public class ug5 {
    private final i a;
    private final String b;
    private final SortOption c;
    private final boolean d;
    private final y e;

    ug5(i iVar, String str, SortOption sortOption, boolean z, y yVar) {
        this.a = iVar;
        this.b = str;
        this.c = sortOption;
        this.d = z;
        this.e = yVar;
    }

    public s<com.spotify.playlist.models.i<Episode>> a() {
        o1e a2 = new o1e.b(new gh5(), this.e).a();
        h hVar = new h(this.a, this.b, false);
        hVar.b().g(false, true, false);
        hVar.b().i(this.c);
        hVar.b().h(0, 20);
        if (this.d) {
            hVar.b().a("syncProgress");
        }
        return hVar.d().z(200, TimeUnit.MILLISECONDS, this.e).q(a2);
    }
}
