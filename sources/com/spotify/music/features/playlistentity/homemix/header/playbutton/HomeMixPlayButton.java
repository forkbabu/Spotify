package com.spotify.music.features.playlistentity.homemix.header.playbutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

public class HomeMixPlayButton extends StateListAnimatorImageButton {
    private Drawable a;
    private Drawable b;
    private boolean c;

    public HomeMixPlayButton(Context context) {
        super(context);
        i();
    }

    private int g(int i) {
        return a.b(getContext(), i);
    }

    private Drawable h(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        return new com.spotify.paste.spotifyicon.a(context, spotifyIconV2, (float) getResources().getDimensionPixelSize(C0707R.dimen.play_icon_size), (float) getResources().getDimensionPixelSize(C0707R.dimen.play_button_size), i, g(R.color.white));
    }

    private void i() {
        setId(C0707R.id.button_play);
        Context context = getContext();
        this.a = h(context, SpotifyIconV2.PLAY, g(C0707R.color.cat_accessory_green_default));
        this.b = h(context, SpotifyIconV2.PAUSE, g(C0707R.color.cat_accessory_green_default));
    }

    private void l() {
        setBackgroundDrawable(this.c ? this.a : this.b);
    }

    public void j() {
        this.c = false;
        l();
    }

    public void k() {
        this.c = true;
        l();
    }

    public void setColor(int i) {
        this.a = h(getContext(), SpotifyIconV2.PLAY, i);
        this.b = h(getContext(), SpotifyIconV2.PAUSE, i);
        l();
    }

    public HomeMixPlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i();
    }
}
