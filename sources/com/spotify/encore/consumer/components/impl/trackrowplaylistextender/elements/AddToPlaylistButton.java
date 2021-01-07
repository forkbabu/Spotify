package com.spotify.encore.consumer.components.impl.trackrowplaylistextender.elements;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.elements.AddToPlaylist;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.quickactions.ActionIconUtils;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class AddToPlaylistButton extends StateListAnimatorImageButton implements AddToPlaylist {
    private static final float ANIMATION_UPDATE_THRESHOLD = 0.2f;
    public static final Companion Companion = new Companion(null);
    private ValueAnimator addButtonAnimation;
    private final Drawable addToPlaylistDrawable;
    private final Drawable checkDrawable;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public AddToPlaylistButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public AddToPlaylistButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddToPlaylistButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Drawable getDrawable(boolean z) {
        SpotifyIconDrawable iconDrawable = ActionIconUtils.getIconDrawable(getContext(), z ? SpotifyIconV2.CHECK : SpotifyIconV2.ADD_TO_PLAYLIST, R.color.encore_accessory_white);
        h.d(iconDrawable, "ActionIconUtils.getIconD…accessory_white\n        )");
        return iconDrawable;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new AddToPlaylistButton$onEvent$1(this, nmf));
    }

    @Override // com.spotify.encore.Item
    public /* bridge */ /* synthetic */ void render(Object obj) {
        render(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToPlaylistButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.addToPlaylistDrawable = getDrawable(false);
        this.checkDrawable = getDrawable(true);
        render(false);
    }

    public void render(boolean z) {
        setImageDrawable(z ? this.checkDrawable : this.addToPlaylistDrawable);
        setContentDescription(getResources().getString(z ? R.string.add_active_button_content_description : R.string.add_button_content_description));
    }
}
