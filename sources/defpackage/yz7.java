package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.spotify.inappmessaging.j;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.follow.m;
import com.spotify.music.playlist.service.b;
import com.spotify.music.playlist.service.c;

/* renamed from: yz7  reason: default package */
public final /* synthetic */ class yz7 implements j {
    public final /* synthetic */ t8a a;
    public final /* synthetic */ m b;
    public final /* synthetic */ b c;
    public final /* synthetic */ Activity d;

    public /* synthetic */ yz7(t8a t8a, m mVar, b bVar, Activity activity) {
        this.a = t8a;
        this.b = mVar;
        this.c = bVar;
        this.d = activity;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        t8a t8a = this.a;
        m mVar = this.b;
        b bVar = this.c;
        Activity activity = this.d;
        if (l0.c(str2, LinkType.ALBUM, LinkType.TRACK, LinkType.SHOW_SHOW)) {
            t8a.a(str2, str2, true);
        } else if (l0.b(str2, LinkType.ARTIST)) {
            mVar.e(str2, true);
        } else if (l0.c(str2, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
            ((c) bVar).a(str2);
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
    }
}
