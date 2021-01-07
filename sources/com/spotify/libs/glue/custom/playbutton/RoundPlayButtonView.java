package com.spotify.libs.glue.custom.playbutton;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public class RoundPlayButtonView extends AppCompatImageButton implements zud {
    private final yud a = new yud(this);
    private Drawable b;
    private a c;
    private Drawable f;
    private a n;
    private IconState o;
    private boolean p;

    public enum IconState {
        PLAY,
        PAUSE
    }

    public RoundPlayButtonView(Context context) {
        super(context);
        j();
    }

    private int g(int i) {
        return a.b(getContext(), i);
    }

    private a h(SpotifyIconV2 spotifyIconV2) {
        Context context = getContext();
        int g = g(R.color.green);
        int g2 = g(R.color.white);
        return new a(new com.spotify.paste.spotifyicon.a(context, spotifyIconV2, (float) i(C0707R.dimen.play_icon_size), (float) i(C0707R.dimen.play_circle_size), g, g2), new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.SHUFFLE, (float) i(C0707R.dimen.badge_icon_size), (float) i(C0707R.dimen.badge_circle_size), g2, g), new Paint(1), i(C0707R.dimen.badge_position_offset), g(R.color.black_30), (float) i(C0707R.dimen.badge_shadow_radius));
    }

    private int i(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    private void j() {
        this.c = h(SpotifyIconV2.PLAY);
        a aVar = this.c;
        int i = R.color.black_30;
        this.b = new f(aVar, g(i));
        this.n = h(SpotifyIconV2.PAUSE);
        this.f = new f(this.n, g(i));
        dvd.a(this).a();
        setMinimumWidth(i(C0707R.dimen.play_circle_size));
        setMinimumHeight(i(C0707R.dimen.play_circle_size));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    /* access modifiers changed from: package-private */
    public String getLabelString() {
        if (this.o != IconState.PLAY) {
            return getContext().getString(C0707R.string.play_button_pause);
        }
        if (this.p) {
            return getContext().getString(C0707R.string.play_button_shuffle);
        }
        return getContext().getString(C0707R.string.play_button_play);
    }

    public IconState getMainIconState() {
        return this.o;
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.a.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.c();
    }

    public void setMainIconState(IconState iconState) {
        this.o = iconState;
        if (iconState == IconState.PLAY) {
            setBackgroundDrawable(this.b);
        } else if (iconState == IconState.PAUSE) {
            setBackgroundDrawable(this.f);
        }
    }

    public void setShowShuffleIcon(boolean z) {
        this.p = z;
        this.n.a(z);
        this.c.a(this.p);
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.a.d(lVar);
    }

    public RoundPlayButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j();
    }

    public RoundPlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j();
    }
}
