package defpackage;

import com.spotify.music.libs.podcast.download.a0;
import com.spotify.playlist.models.Episode;
import java.util.List;

/* renamed from: a12  reason: default package */
public final /* synthetic */ class a12 implements a0.b {
    public final /* synthetic */ b22 a;
    public final /* synthetic */ Episode b;

    public /* synthetic */ a12(b22 b22, Episode episode) {
        this.a = b22;
        this.b = episode;
    }

    @Override // com.spotify.music.libs.podcast.download.a0.b
    public final void a(List list) {
        this.a.g(this.b, list);
    }
}
