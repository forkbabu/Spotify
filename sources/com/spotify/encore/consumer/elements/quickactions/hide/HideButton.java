package com.spotify.encore.consumer.elements.quickactions.hide;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.quickactions.ActionIconUtils;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class HideButton extends StateListAnimatorImageButton implements Hide {
    private final SpotifyIconDrawable hiddenDrawable;
    private boolean isHidden;
    private final SpotifyIconDrawable notHiddenDrawable;

    public HideButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public HideButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HideButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final SpotifyIconDrawable getDrawableForHiddenState(Context context, boolean z) {
        SpotifyIconDrawable iconDrawable = ActionIconUtils.getIconDrawable(context, SpotifyIconV2.BLOCK, z ? R.color.encore_accessory_white : R.color.encore_accessory);
        h.d(iconDrawable, "ActionIconUtils.getIconD…otifyIconV2.BLOCK, color)");
        return iconDrawable;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new HideButton$onEvent$1(this, nmf));
    }

    @Override // com.spotify.encore.Item
    public /* bridge */ /* synthetic */ void render(Object obj) {
        render(((Boolean) obj).booleanValue());
    }

    public final void setHidden(boolean z) {
        this.isHidden = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HideButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.hiddenDrawable = getDrawableForHiddenState(context, true);
        SpotifyIconDrawable drawableForHiddenState = getDrawableForHiddenState(context, false);
        this.notHiddenDrawable = drawableForHiddenState;
        setImageDrawable(drawableForHiddenState);
    }

    public void render(boolean z) {
        int i;
        this.isHidden = z;
        setImageDrawable(z ? this.hiddenDrawable : this.notHiddenDrawable);
        if (this.isHidden) {
            i = R.string.hidden_active_button_content_description;
        } else {
            i = R.string.hidden_button_content_description;
        }
        setContentDescription(getResources().getString(i));
    }
}
