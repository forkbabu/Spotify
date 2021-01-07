package com.spotify.encore.consumer.components.promo.impl.promocard.elements;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.spotify.encore.consumer.components.promo.api.promocard.elements.PlayButton;
import com.spotify.encore.consumer.components.promo.impl.R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlayButtonView extends StateListAnimatorImageButton implements PlayButton {
    public static final Companion Companion = new Companion(null);
    private static final int[] STATE_PAUSE = {R.attr.state_player_pausing};
    private static final int[] STATE_PLAY = {R.attr.state_player_playing};
    private boolean isPlaying;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PlayButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PlayButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void updateContentDescription() {
        String str;
        if (this.isPlaying) {
            str = getContext().getString(com.spotify.encore.consumer.elements.R.string.play_button_default_pause_content_description);
        } else {
            str = getContext().getString(com.spotify.encore.consumer.elements.R.string.play_button_default_play_content_description);
        }
        setContentDescription(str);
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] mergeDrawableStates = ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + 1), this.isPlaying ? STATE_PAUSE : STATE_PLAY);
        h.d(mergeDrawableStates, "mergeDrawableStates(drawableState, newState)");
        return mergeDrawableStates;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new PlayButtonView$onEvent$1(nmf));
    }

    @Override // com.spotify.encore.Item
    public /* bridge */ /* synthetic */ void render(Object obj) {
        render(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        updateContentDescription();
    }

    public void render(boolean z) {
        this.isPlaying = z;
        updateContentDescription();
        refreshDrawableState();
    }
}
