package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.markasplayed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.markasplayed.MarkAsPlayedButton;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class MarkAsPlayedButtonView extends StateListAnimatorImageButton implements MarkAsPlayedButton {
    public MarkAsPlayedButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MarkAsPlayedButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MarkAsPlayedButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new MarkAsPlayedButtonView$onEvent$1(nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarkAsPlayedButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK, context.getResources().getDimension(R.dimen.episode_quick_action_icon_size));
        spotifyIconDrawable.s(a.c(context, com.spotify.encore.consumer.elements.R.color.encore_accessory));
        setImageDrawable(spotifyIconDrawable);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public void render(MarkAsPlayedButton.Model model) {
        h.e(model, "model");
        Context context = getContext();
        h.d(context, "context");
        setContentDescription(context.getResources().getString(R.string.content_description_mark_as_played, model.getEpisodeName()));
    }
}
