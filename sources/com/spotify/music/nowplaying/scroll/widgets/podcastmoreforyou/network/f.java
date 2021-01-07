package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.h;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class f {
    private final PodcastMoreForYouDataLoader a;

    static final class a<T, R> implements l<Throwable, h> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public h apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
            Logger.e(th2, "Fail to load more-for-you content for episode [%s]", this.a);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            return new h.a(message);
        }
    }

    public f(PodcastMoreForYouDataLoader podcastMoreForYouDataLoader) {
        kotlin.jvm.internal.h.e(podcastMoreForYouDataLoader, "podcastMoreForYouDataLoader");
        this.a = podcastMoreForYouDataLoader;
    }

    public final z<h> a(String str) {
        kotlin.jvm.internal.h.e(str, "episodeUri");
        z<h> E = this.a.a(str).E(new a(str));
        kotlin.jvm.internal.h.d(E, "podcastMoreForYouDataLoa….orEmpty())\n            }");
        return E;
    }
}
