package defpackage;

import com.spotify.music.libs.podcast.download.c0;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.g;

/* renamed from: mg6  reason: default package */
public final /* synthetic */ class mg6 implements g {
    public final /* synthetic */ mh6 a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;

    public /* synthetic */ mg6(mh6 mh6, a aVar, String str) {
        this.a = mh6;
        this.b = aVar;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.w(this.b, this.c, (c0) obj);
    }
}
