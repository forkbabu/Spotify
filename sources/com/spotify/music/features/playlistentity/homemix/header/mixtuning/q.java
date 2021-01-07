package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import android.content.Context;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;

public class q extends HomeMixTuningButton {
    public q(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.playlistentity.homemix.header.mixtuning.HomeMixTuningButton
    public ViewGroup.LayoutParams c() {
        CoordinatorLayout.e eVar = new CoordinatorLayout.e(-2, -2);
        eVar.i(C0707R.id.button_play);
        eVar.d = 8388629;
        eVar.c = 8388629;
        eVar.j(new HeaderSecondaryButtonBehavior());
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.playlistentity.homemix.header.mixtuning.HomeMixTuningButton
    public int getButtonId() {
        return C0707R.id.button_upbeat;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.playlistentity.homemix.header.mixtuning.HomeMixTuningButton
    public SpotifyIconV2 getIcon() {
        return SpotifyIconV2.MIX;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.playlistentity.homemix.header.mixtuning.HomeMixTuningButton
    public String getIconContentDescription() {
        return getContext().getString(C0707R.string.home_mix_tuning_button_upbeat_content_description);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.playlistentity.homemix.header.mixtuning.HomeMixTuningButton
    public String getLabel() {
        return getContext().getString(C0707R.string.home_mix_upbeat_label);
    }
}
