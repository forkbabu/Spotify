package com.spotify.music.lyrics.share.common.sharebutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class ShareButton extends AppCompatButton implements a {
    public ShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(getContext(), SpotifyIconV2.SHARE_ANDROID, (float) nud.g((float) 10, getResources())), (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
