package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.podcastinteractivity.qna.datasource.b;
import kotlin.jvm.internal.h;

/* renamed from: utc  reason: default package */
public final class utc implements d {
    private final b a;

    public utc(b bVar) {
        h.e(bVar, "dataSource");
        this.a = bVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a(true);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a(false);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PodcastQnAPlugin";
    }
}
