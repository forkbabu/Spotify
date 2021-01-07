package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.v;
import io.reactivex.a;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class k0 {
    private final Context a;
    private final String b;
    private final y c;
    private final SnackbarManager d;
    private final v e;

    k0(Context context, String str, y yVar, SnackbarManager snackbarManager, v vVar) {
        this.a = context;
        this.b = str;
        this.c = yVar;
        this.d = snackbarManager;
        this.e = vVar;
    }

    /* access modifiers changed from: package-private */
    public a a(boolean z, String str) {
        a aVar;
        if (z) {
            aVar = this.e.c(this.b);
        } else {
            aVar = this.e.d(this.b);
        }
        return aVar.A(this.c).p(new e(this, z, str));
    }

    public /* synthetic */ void b(boolean z, String str) {
        this.d.show(SnackbarConfiguration.builder(this.a.getString(z ? C0707R.string.playlist_header_snackbar_follow_playlist : C0707R.string.playlist_header_snackbar_unfollow_playlist, str)).build());
    }
}
