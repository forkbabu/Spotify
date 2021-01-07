package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.encore.Element;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class EpisodeRowQuickActionElement<T extends EpisodeRowQuickAction> extends FrameLayout implements Element<T, T> {
    private T quickAction;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EpisodeRowQuickActionElement(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        if (view != null) {
            view.setDuplicateParentStateEnabled(true);
        }
    }

    public final T getQuickAction() {
        return this.quickAction;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super T, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new EpisodeRowQuickActionElement$onEvent$1(this, nmf));
    }

    public final void setQuickAction(T t) {
        this.quickAction = t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpisodeRowQuickActionElement(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
