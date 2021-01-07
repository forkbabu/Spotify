package com.spotify.music.lyrics.share.common.closebutton;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.a;
import kotlin.jvm.internal.h;

public final class CloseButton extends AppCompatImageButton {
    public CloseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        a aVar = new a(context, SpotifyIconV2.ARROW_LEFT, (float) getResources().getDimensionPixelSize(C0707R.dimen.std_16dp), (float) getResources().getDimensionPixelSize(C0707R.dimen.std_32dp), androidx.core.content.a.b(context, R.color.black_40), androidx.core.content.a.b(context, R.color.white));
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(aVar);
    }
}
