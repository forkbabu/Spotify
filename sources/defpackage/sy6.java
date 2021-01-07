package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;

/* renamed from: sy6  reason: default package */
public class sy6 implements ry6 {
    private final jzc a;

    public sy6(jzc jzc) {
        this.a = jzc;
    }

    @Override // defpackage.ry6
    public void a(Context context, j jVar) {
        p m = jVar.m();
        m.getClass();
        String a2 = m.a();
        String c = q.c(jVar.c(), Covers.Size.NORMAL);
        SpotifyUri spotifyUri = new SpotifyUri(SpotifyUri.Kind.PLAYLIST_V2, new SpotifyUri(jVar.getUri()).h(), null);
        this.a.c(pzc.b(!TextUtils.isEmpty(c) ? Uri.parse(c) : Uri.EMPTY, jVar.j(), context.getString(C0707R.string.share_by_owner, a2), spotifyUri.toString()).build(), rzc.a, C0707R.string.integration_id_context_menu);
    }
}
