package com.spotify.encore.consumer.elements.quickactions.ban;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.quickactions.ActionIconUtils;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class BanButton extends StateListAnimatorImageButton implements Ban {
    private final SpotifyIconDrawable banDrawable;
    private boolean banned;
    private final SpotifyIconDrawable bannedDrawable;

    public BanButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public BanButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BanButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final SpotifyIconDrawable getBanDrawable(Context context, boolean z) {
        SpotifyIconDrawable iconDrawable = ActionIconUtils.getIconDrawable(context, SpotifyIconV2.BAN, z ? R.color.encore_accessory_white : R.color.encore_accessory);
        h.d(iconDrawable, "ActionIconUtils.getIconD…SpotifyIconV2.BAN, color)");
        return iconDrawable;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new BanButton$onEvent$1(this, nmf));
    }

    @Override // com.spotify.encore.Item
    public /* bridge */ /* synthetic */ void render(Object obj) {
        render(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.bannedDrawable = getBanDrawable(context, true);
        SpotifyIconDrawable banDrawable2 = getBanDrawable(context, false);
        this.banDrawable = banDrawable2;
        setImageDrawable(banDrawable2);
    }

    public void render(boolean z) {
        this.banned = z;
        setImageDrawable(z ? this.bannedDrawable : this.banDrawable);
        setContentDescription(getResources().getString(this.banned ? R.string.ban_active_button_content_description : R.string.ban_button_content_description));
    }
}
