package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StaticReleaseCardView extends CardView {
    private EntityView s;
    private View t;

    public StaticReleaseCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final EntityView o(String str, String str2, boolean z, boolean z2, String str3, boolean z3, Picasso picasso) {
        je.x(str, "title", str2, ContextTrack.Metadata.KEY_SUBTITLE, str3, "imageUrl");
        EntityView entityView = this.s;
        entityView.C(str3, picasso);
        entityView.D(str, str2, z, z2, z3);
        entityView.E(false);
        return entityView;
    }

    public final void p(boolean z, boolean z2) {
        if (z2) {
            this.s.E(z);
        } else {
            this.t.setVisibility(4);
        }
    }

    public final void setEntityContextMenuClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.s.setContextMenuClickListener(cmf);
    }

    public final void setEntityMetadataViewClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.s.setMetadataViewClickListener(cmf);
    }

    public final void setPlayButtonClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.s.setPlayButtonClickListener(cmf);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StaticReleaseCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        View inflate = FrameLayout.inflate(context, C0707R.layout.static_release_card, this);
        setCardBackgroundColor(getResources().getColor(R.color.gray_15));
        setRadius(getResources().getDimension(C0707R.dimen.feed_item_release_corner_radius));
        View G = q4.G(inflate, C0707R.id.item_entity_view);
        h.d(G, "ViewCompat.requireViewBy…t, R.id.item_entity_view)");
        EntityView entityView = (EntityView) G;
        this.s = entityView;
        View G2 = q4.G(entityView, C0707R.id.entity_play_button);
        h.d(G2, "ViewCompat.requireViewBy… R.id.entity_play_button)");
        this.t = G2;
    }
}
