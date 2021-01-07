package com.spotify.music.features.login.startview;

import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.C0707R;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ AppCompatImageView a;

    public /* synthetic */ c(AppCompatImageView appCompatImageView) {
        this.a = appCompatImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setImageResource(C0707R.drawable.start_screen_logo_smaller);
    }
}
