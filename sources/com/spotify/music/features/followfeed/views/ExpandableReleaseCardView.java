package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.hubs.components.c;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ExpandableReleaseCardView extends CardView {
    private final EntityView s;
    private final FooterView t;

    public ExpandableReleaseCardView(Context context, AttributeSet attributeSet) {
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

    public final void p(int i, boolean z) {
        this.t.f(i, z);
    }

    public final void q(int i, boolean z) {
        this.t.g(i, z);
    }

    public final void r(boolean z) {
        this.s.E(z);
    }

    public final void s(int i) {
        this.t.h(i);
    }

    public final void setEntityContextMenuClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.s.setContextMenuClickListener(cmf);
    }

    public final void setEntityMetadataViewClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.s.setMetadataViewClickListener(cmf);
    }

    public final void setExpandingListener(nmf<? super Boolean, f> nmf) {
        h.e(nmf, "expandingConsumer");
        this.t.setExpandingListener(nmf);
    }

    public final void setFooterClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.t.setFooterClickListener(cmf);
    }

    public final void setPlayButtonClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.s.setPlayButtonClickListener(cmf);
    }

    public final void setTrackRowClickListener(c.a aVar) {
        h.e(aVar, "clickListener");
        this.t.setTrackRowClickListener(aVar);
    }

    public final void t(List<i45> list) {
        h.e(list, "tracks");
        this.t.i(list);
    }

    public final void u() {
        this.t.m();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableReleaseCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        View inflate = FrameLayout.inflate(context, C0707R.layout.expandable_release_card_view, this);
        setCardBackgroundColor(getResources().getColor(R.color.gray_15));
        setRadius(getResources().getDimension(C0707R.dimen.feed_item_release_corner_radius));
        View G = q4.G(inflate, C0707R.id.item_entity_view);
        h.d(G, "ViewCompat.requireViewBy…t, R.id.item_entity_view)");
        this.s = (EntityView) G;
        View G2 = q4.G(inflate, C0707R.id.item_footer_view);
        h.d(G2, "ViewCompat.requireViewBy…t, R.id.item_footer_view)");
        this.t = (FooterView) G2;
    }
}
