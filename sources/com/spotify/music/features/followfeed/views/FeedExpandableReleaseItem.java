package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.hubs.components.c;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class FeedExpandableReleaseItem extends LinearLayout {
    private Picasso a;
    private ArtistHeaderView b;
    private ExpandableReleaseCardView c;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cmf cmf = this.a;
            if (cmf != null) {
                f fVar = (f) cmf.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedExpandableReleaseItem(Context context, Picasso picasso) {
        super(context);
        h.e(context, "context");
        this.a = picasso;
        h();
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
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            return expandableReleaseCardView.o(str, str2, z, z2, str3, z3, this.a);
        }
        h.k("expandableReleaseCardView");
        throw null;
    }

    public final void c(int i, boolean z) {
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.p(i, z);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void d(int i, boolean z) {
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.q(i, z);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void e(boolean z) {
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.r(z);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void f(int i) {
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.s(i);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void g(List<i45> list) {
        h.e(list, "tracks");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.t(list);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void h() {
        setOrientation(1);
        View inflate = LinearLayout.inflate(getContext(), C0707R.layout.feed_expandable_item_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View G = q4.G(inflate, C0707R.id.artist_header_view);
        h.d(G, "ViewCompat.requireViewBy… R.id.artist_header_view)");
        this.b = (ArtistHeaderView) G;
        View G2 = q4.G(inflate, C0707R.id.feed_expandable_card_view);
        h.d(G2, "ViewCompat.requireViewBy…eed_expandable_card_view)");
        this.c = (ExpandableReleaseCardView) G2;
    }

    public final void i() {
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.u();
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void setEntityClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.setEntityMetadataViewClickListener(cmf);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void setEntityContextMenuClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.setEntityContextMenuClickListener(cmf);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void setExpandingListener(nmf<? super Boolean, f> nmf) {
        h.e(nmf, "expandingConsumer");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.setExpandingListener(nmf);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void setFooterClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.setFooterClickListener(cmf);
        } else {
            h.k("expandableReleaseCardView");
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
        ArtistHeaderView artistHeaderView = this.b;
        if (artistHeaderView != null) {
            artistHeaderView.setOnClickListener(new a(cmf));
        } else {
            h.k("artistHeaderView");
            throw null;
        }
    }

    public final void setPlayButtonClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.setPlayButtonClickListener(cmf);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public final void setTrackRowClickListener(c.a aVar) {
        h.e(aVar, "clickListener");
        ExpandableReleaseCardView expandableReleaseCardView = this.c;
        if (expandableReleaseCardView != null) {
            expandableReleaseCardView.setTrackRowClickListener(aVar);
        } else {
            h.k("expandableReleaseCardView");
            throw null;
        }
    }

    public FeedExpandableReleaseItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    public FeedExpandableReleaseItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h();
    }
}
