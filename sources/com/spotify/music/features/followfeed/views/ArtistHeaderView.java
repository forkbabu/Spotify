package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Arrays;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistHeaderView extends ConstraintLayout {
    private final TextView a;
    private final ImageView b;
    private final TextView c;
    private final TextView f;

    /* access modifiers changed from: package-private */
    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((cmf) this.b).invoke();
            } else if (i == 1) {
                ((cmf) this.b).invoke();
            } else {
                throw null;
            }
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ cmf a;

        b(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    public ArtistHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void C(String str, Picasso picasso) {
        h.e(str, "imageUrl");
        Context context = getContext();
        h.d(context, "context");
        SpotifyIconDrawable b2 = h45.b(context, 24, SpotifyIconV2.ARTIST);
        if (str.length() == 0) {
            str = "/";
        }
        if (picasso != null) {
            z m = picasso.m(str);
            m.x(new cwd());
            m.t(b2);
            m.g(b2);
            m.n(this.b, null);
        }
    }

    public final void D(int i) {
        if (i > 1) {
            String string = getContext().getString(C0707R.string.follow_feed_more_artists_header);
            h.d(string, "context.getString(R.stri…feed_more_artists_header)");
            String str = String.valueOf(' ') + string;
            TextView textView = this.f;
            String format = String.format(str, Arrays.copyOf(new Object[]{String.valueOf(i - 1)}, 1));
            h.d(format, "java.lang.String.format(format, *args)");
            textView.setText(format);
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    public final void E(String str) {
        h.e(str, "date");
        this.c.setText(str);
    }

    public final void G(String str) {
        h.e(str, "name");
        this.a.setText(str);
    }

    public final void setArtistClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.b.setOnClickListener(new a(0, cmf));
        this.a.setOnClickListener(new a(1, cmf));
    }

    public final void setMoreArtistsClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.f.setOnClickListener(new b(cmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArtistHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(context, C0707R.layout.artist_header_view, this);
        View G = q4.G(this, C0707R.id.feed_item_artist_name);
        h.d(G, "ViewCompat.requireViewBy…id.feed_item_artist_name)");
        this.a = (TextView) G;
        View G2 = q4.G(this, C0707R.id.feed_item_artist_avatar);
        h.d(G2, "ViewCompat.requireViewBy….feed_item_artist_avatar)");
        this.b = (ImageView) G2;
        View G3 = q4.G(this, C0707R.id.feed_item_release_date);
        h.d(G3, "ViewCompat.requireViewBy…d.feed_item_release_date)");
        this.c = (TextView) G3;
        View G4 = q4.G(this, C0707R.id.feed_item_more_artists);
        h.d(G4, "ViewCompat.requireViewBy…d.feed_item_more_artists)");
        this.f = (TextView) G4;
    }
}
