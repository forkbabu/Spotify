package com.spotify.music.podcastentityrow;

import com.spotify.music.features.addtoplaylist.d;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final q a = new q();
    private final ih0 b;
    private final d c;
    private final rbb d;

    static final class a implements io.reactivex.functions.a {
        final /* synthetic */ e a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        a(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.d.b(this.b, this.c);
        }
    }

    static final class b<T> implements g<Throwable> {
        final /* synthetic */ e a;

        b(e eVar) {
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            this.a.d.a();
        }
    }

    public e(ih0 ih0, d dVar, rbb rbb) {
        h.e(ih0, "listenLaterEndpoint");
        h.e(dVar, "addToPlaylistNavigator");
        h.e(rbb, "yourEpisodesAddSnackbar");
        this.b = ih0;
        this.c = dVar;
        this.d = rbb;
    }

    @Override // com.spotify.music.podcastentityrow.d
    public void a() {
        this.a.c();
    }

    @Override // com.spotify.music.podcastentityrow.d
    public void b(String str, boolean z, String str2) {
        h.e(str, "episodeUri");
        h.e(str2, "viewUri");
        List<String> t = kotlin.collections.d.t(str);
        if (z) {
            this.c.a(t, str2, str2);
        } else {
            this.a.a(this.b.e(t).subscribe(new a(this, str, str2), new b(this)));
        }
    }
}
