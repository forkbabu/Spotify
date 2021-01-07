package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.music.libs.podcast.download.c0;
import com.spotify.playlist.models.Episode;

/* renamed from: b12  reason: default package */
public final /* synthetic */ class b12 implements e {
    public final /* synthetic */ b22 a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ c0 c;

    public /* synthetic */ b12(b22 b22, Episode episode, c0 c0Var) {
        this.a = b22;
        this.b = episode;
        this.c = c0Var;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.d(this.b, this.c, bVar);
    }
}
