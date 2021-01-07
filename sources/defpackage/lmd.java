package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.follow.m;
import com.spotify.music.libs.viewuri.c;

/* renamed from: lmd  reason: default package */
public class lmd {
    private final o0 a;
    private final m b;
    private final jmd c;

    lmd(o0 o0Var, m mVar, jmd jmd) {
        this.a = o0Var;
        this.b = mVar;
        this.c = jmd;
    }

    public /* synthetic */ void a(boolean z, c cVar, String str) {
        boolean z2 = !z;
        this.c.a(cVar.toString(), str, z2);
        this.a.a(z2 ? SpotifyIconV2.CHECK : SpotifyIconV2.X, z2 ? C0707R.string.toast_following : C0707R.string.toast_unfollowing, 0);
        this.b.e(str, z2);
    }
}
