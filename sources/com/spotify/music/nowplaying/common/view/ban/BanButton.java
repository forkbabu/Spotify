package com.spotify.music.nowplaying.common.view.ban;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.ban.g;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class BanButton extends AppCompatImageButton implements g {
    private g.a a;

    public BanButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((e) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.ban.g
    public void setBanState(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? C0707R.string.player_content_description_unban : C0707R.string.player_content_description_ban));
    }

    @Override // com.spotify.music.nowplaying.common.view.ban.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    public BanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        context2.getClass();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
        float f = (float) dimensionPixelSize;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context2, spotifyIconV2, f);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, spotifyIconV2, f);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context2, spotifyIconV2, f);
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context2, spotifyIconV2, f);
        SpotifyIconDrawable spotifyIconDrawable5 = new SpotifyIconDrawable(context2, spotifyIconV2, f);
        int i2 = R.color.red;
        spotifyIconDrawable.r(a.b(context2, i2));
        spotifyIconDrawable2.r(a.b(context2, i2));
        spotifyIconDrawable3.r(a.b(context2, R.color.white_50));
        spotifyIconDrawable4.r(a.b(context2, R.color.white));
        spotifyIconDrawable5.r(a.b(context2, R.color.white_30));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable5);
        stateListDrawable.addState(new int[0], spotifyIconDrawable4);
        setImageDrawable(stateListDrawable);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_ban));
        setOnClickListener(new a(this));
    }
}
