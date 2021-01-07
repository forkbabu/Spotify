package com.spotify.music.offlinetrials.limited.uicomponents;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.offlinetrials.limited.uicomponents.t;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class TrackDownloadButton extends AppCompatImageButton implements t {
    private t.a a;

    public TrackDownloadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.t
    public void d() {
        setVisibility(0);
    }

    public void g(View view) {
        t.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.t
    public void setDownloadState(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? C0707R.string.content_description_download : C0707R.string.content_description_undownload));
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.t
    public void setListener(t.a aVar) {
        this.a = aVar;
    }

    public TrackDownloadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        context2.getClass();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0707R.dimen.button_drawable_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DOWNLOADED;
        ColorStateList c = a.c(context2, C0707R.color.btn_download_green);
        float f = (float) dimensionPixelSize;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context2, spotifyIconV2, f);
        spotifyIconDrawable.s(c);
        SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.DOWNLOAD;
        ColorStateList c2 = a.c(context2, C0707R.color.btn_download_white);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, spotifyIconV22, f);
        spotifyIconDrawable2.s(c2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, spotifyIconDrawable2);
        setImageDrawable(stateListDrawable);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.content_description_download));
        setOnClickListener(new b(this));
    }
}
