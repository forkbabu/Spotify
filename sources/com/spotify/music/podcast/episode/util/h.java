package com.spotify.music.podcast.episode.util;

import android.content.Context;
import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.libs.collection.played.a;

public class h {
    private final a a;
    private final SnackbarManager b;
    private final String c;

    public h(a aVar, SnackbarManager snackbarManager, Context context) {
        this.a = aVar;
        this.b = snackbarManager;
        this.c = context.getString(C0707R.string.snackbar_undo);
    }

    public /* synthetic */ void a(String str, View view) {
        this.a.b(str);
        this.b.dismiss();
    }

    public void b(String str) {
        this.b.show(SnackbarConfiguration.builder((int) C0707R.string.snackbar_mark_as_played).actionText(this.c).onClickListener(new a(this, str)).build());
    }

    public void c() {
        je.e(C0707R.string.snackbar_mark_as_unplayed, this.b);
    }
}
