package com.spotify.music.features.california.feature;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class CaliforniaViewBinderImpl$placeholder$2 extends Lambda implements cmf<SpotifyIconDrawable> {
    final /* synthetic */ CaliforniaViewBinderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CaliforniaViewBinderImpl$placeholder$2(CaliforniaViewBinderImpl californiaViewBinderImpl) {
        super(0);
        this.this$0 = californiaViewBinderImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public SpotifyIconDrawable invoke() {
        Context context = this.this$0.e().getContext();
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SPOTIFYLOGO;
        Context context2 = this.this$0.e().getContext();
        h.d(context2, "rootView.context");
        return new SpotifyIconDrawable(context, spotifyIconV2, (float) context2.getResources().getDimensionPixelSize(C0707R.dimen.size_album_art));
    }
}
