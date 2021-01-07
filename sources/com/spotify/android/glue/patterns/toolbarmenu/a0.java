package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;

public interface a0 {
    void a(String str, SpotifyIconV2 spotifyIconV2, boolean z, boolean z2);

    g0 b(int i, CharSequence charSequence, Drawable drawable);

    void c(String str, SpotifyIconV2 spotifyIconV2, boolean z);

    b0 d(int i, CharSequence charSequence);

    b0 e(int i, int i2);

    void f();

    void g(View.OnClickListener onClickListener);

    Context getContext();

    void h(String str);

    void i(String str);

    g0 j(int i, int i2, Drawable drawable);
}
