package com.spotify.music.nowplayingmini.empty;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.nowplayingmini.ui.seekbar.FadingSeekBarView;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.ifd;

public class EmptyModeFragment extends LifecycleListenableFragment implements ifd.b, mfd {
    private static Drawable K4(Context context, int i, SpotifyIconV2 spotifyIconV2) {
        int b = a.b(context, R.color.gray_70);
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(i);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, dimensionPixelSize);
        spotifyIconDrawable.r(b);
        spotifyIconDrawable.w(dimensionPixelSize);
        return spotifyIconDrawable;
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGSIDEBAR;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplayingmini_empty, viewGroup, false);
        ((ImageView) inflate.findViewById(C0707R.id.cover_art_view)).setImageDrawable(K4(inflate.getContext(), C0707R.dimen.track_placeholder, SpotifyIconV2.TRACK));
        PreviousButton previousButton = (PreviousButton) inflate.findViewById(C0707R.id.previous_button);
        PlayPauseButton playPauseButton = (PlayPauseButton) inflate.findViewById(C0707R.id.play_pause_button);
        FadingSeekBarView fadingSeekBarView = (FadingSeekBarView) inflate.findViewById(C0707R.id.seek_bar_view);
        playPauseButton.e();
        playPauseButton.setEnabled(false);
        ((NextButton) inflate.findViewById(C0707R.id.next_button)).setEnabled(false);
        if (fadingSeekBarView != null) {
            fadingSeekBarView.setSeekingEnabled(false);
        }
        if (previousButton != null) {
            previousButton.setEnabled(false);
            ((TextView) inflate.findViewById(C0707R.id.connect_devices)).setCompoundDrawablesWithIntrinsicBounds(K4(inflate.getContext(), C0707R.dimen.connect_icon, SpotifyIconV2.DEVICE_OTHER), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            ((ImageView) inflate.findViewById(C0707R.id.connect_devices)).setImageDrawable(K4(inflate.getContext(), C0707R.dimen.secondary_button_size, SpotifyIconV2.DEVICE_OTHER));
        }
        return inflate;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.J0;
    }
}
