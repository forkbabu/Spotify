package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.IconUtilsKt;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play.PlayElement;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlayElementView extends StateListAnimatorImageButton implements PlayElement {
    private final c pauseIcon;
    private final c playIcon;

    public PlayElementView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PlayElementView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayElementView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new PlayElementView$onEvent$1(nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayElementView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.playIcon = IconUtilsKt.createPlayIcon(context);
        this.pauseIcon = IconUtilsKt.createPauseIcon(context);
    }

    public void render(PlayElement.Model model) {
        h.e(model, "model");
        if (model.isPlaying()) {
            setImageDrawable(this.pauseIcon);
        } else {
            setImageDrawable(this.playIcon);
        }
        Resources resources = getResources();
        h.d(resources, "resources");
        setContentDescription(ContentDescriptionHelperKt.buildContentDescription(resources, model));
    }
}
