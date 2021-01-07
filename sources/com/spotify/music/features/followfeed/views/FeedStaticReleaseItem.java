package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class FeedStaticReleaseItem extends LinearLayout {
    private Picasso a;
    private ArtistHeaderView b;
    private StaticReleaseCardView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedStaticReleaseItem(Context context, Picasso picasso) {
        super(context);
        h.e(context, "context");
        this.a = picasso;
        d();
    }

    private final void d() {
        setOrientation(1);
        View inflate = LinearLayout.inflate(getContext(), C0707R.layout.feed_static_item_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View G = q4.G(inflate, C0707R.id.artist_header_view);
        h.d(G, "ViewCompat.requireViewBy… R.id.artist_header_view)");
        this.b = (ArtistHeaderView) G;
        View G2 = q4.G(inflate, C0707R.id.static_entity_card_view);
        h.d(G2, "ViewCompat.requireViewBy….static_entity_card_view)");
        this.c = (StaticReleaseCardView) G2;
    }

    public final ArtistHeaderView a(String str, String str2, String str3, int i) {
        je.x(str, "artistName", str2, "imageUrl", str3, "releaseDate");
        ArtistHeaderView artistHeaderView = this.b;
        if (artistHeaderView != null) {
            artistHeaderView.G(str);
            artistHeaderView.C(str2, this.a);
            artistHeaderView.E(str3);
            artistHeaderView.D(i);
            return artistHeaderView;
        }
        h.k("artistHeaderView");
        throw null;
    }

    public final EntityView b(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        je.x(str, "title", str2, ContextTrack.Metadata.KEY_SUBTITLE, str3, "imageUrl");
        StaticReleaseCardView staticReleaseCardView = this.c;
        if (staticReleaseCardView != null) {
            return staticReleaseCardView.o(str, str2, z, z2, str3, z3, this.a);
        }
        h.k("staticReleaseCardView");
        throw null;
    }

    public final void c(boolean z, boolean z2) {
        StaticReleaseCardView staticReleaseCardView = this.c;
        if (staticReleaseCardView != null) {
            staticReleaseCardView.p(z, z2);
        } else {
            h.k("staticReleaseCardView");
            throw null;
        }
    }

    public final void setEntityClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        StaticReleaseCardView staticReleaseCardView = this.c;
        if (staticReleaseCardView != null) {
            staticReleaseCardView.setEntityMetadataViewClickListener(cmf);
        } else {
            h.k("staticReleaseCardView");
            throw null;
        }
    }

    public final void setEntityContextMenuClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        StaticReleaseCardView staticReleaseCardView = this.c;
        if (staticReleaseCardView != null) {
            staticReleaseCardView.setEntityContextMenuClickListener(cmf);
        } else {
            h.k("staticReleaseCardView");
            throw null;
        }
    }

    public final void setHeaderArtistClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        ArtistHeaderView artistHeaderView = this.b;
        if (artistHeaderView != null) {
            artistHeaderView.setArtistClickListener(cmf);
        } else {
            h.k("artistHeaderView");
            throw null;
        }
    }

    public final void setMoreArtistsClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        ArtistHeaderView artistHeaderView = this.b;
        if (artistHeaderView != null) {
            artistHeaderView.setMoreArtistsClickListener(cmf);
        } else {
            h.k("artistHeaderView");
            throw null;
        }
    }

    public final void setPlayButtonClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        StaticReleaseCardView staticReleaseCardView = this.c;
        if (staticReleaseCardView != null) {
            staticReleaseCardView.setPlayButtonClickListener(cmf);
        } else {
            h.k("staticReleaseCardView");
            throw null;
        }
    }

    public FeedStaticReleaseItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public FeedStaticReleaseItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
