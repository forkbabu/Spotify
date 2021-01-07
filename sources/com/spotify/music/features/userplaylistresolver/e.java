package com.spotify.music.features.userplaylistresolver;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.ui.activity.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.userplaylistresolver.api.IntentToUriV1Response;
import com.spotify.music.features.userplaylistresolver.api.b;
import com.spotify.music.navigation.t;
import io.reactivex.disposables.a;
import io.reactivex.y;

public class e {
    private final Context a;
    private final y b;
    b c;
    private final c d;
    private final t e;
    private final SnackbarManager f;
    private final a g = new a();

    public e(Context context, y yVar, b bVar, t tVar, c cVar, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = yVar;
        this.c = bVar;
        this.e = tVar;
        this.d = cVar;
        this.f = snackbarManager;
    }

    public /* synthetic */ void a(IntentToUriV1Response intentToUriV1Response) {
        this.d.a();
        this.e.d(intentToUriV1Response.a());
    }

    public void b(Throwable th) {
        this.d.a();
        this.f.show(SnackbarConfiguration.builder(this.a.getString(C0707R.string.resolve_user_playlist_error_message)).build());
    }

    public void c(String str) {
        this.g.b(this.c.a(com.spotify.music.features.userplaylistresolver.api.c.create(str)).B(this.b).subscribe(new a(this), new b(this)));
    }
}
