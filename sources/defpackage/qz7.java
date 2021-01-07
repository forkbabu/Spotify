package defpackage;

import com.spotify.inappmessaging.j;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.follow.m;
import com.spotify.music.playlist.service.b;
import com.spotify.music.playlist.service.c;

/* renamed from: qz7  reason: default package */
public final /* synthetic */ class qz7 implements j {
    public final /* synthetic */ t8a a;
    public final /* synthetic */ d28 b;
    public final /* synthetic */ m c;
    public final /* synthetic */ b d;

    public /* synthetic */ qz7(t8a t8a, d28 d28, m mVar, b bVar) {
        this.a = t8a;
        this.b = d28;
        this.c = mVar;
        this.d = bVar;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        t8a t8a = this.a;
        d28 d28 = this.b;
        m mVar = this.c;
        b bVar = this.d;
        if (l0.c(str2, LinkType.ALBUM, LinkType.TRACK, LinkType.SHOW_SHOW)) {
            t8a.a(str2, str2, true);
            d28.e(str, str2);
        } else if (l0.b(str2, LinkType.ARTIST)) {
            mVar.e(str2, true);
            d28.d(str, str2);
        } else if (l0.c(str2, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
            ((c) bVar).a(str2);
            d28.d(str, str2);
        }
    }
}
