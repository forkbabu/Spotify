package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class AutomatedMessagingEntityView extends CardView {
    private final ImageView s;
    private final TextView t;
    private final TextView u;

    public AutomatedMessagingEntityView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void o(String str, String str2) {
        h.e(str, "name");
        h.e(str2, "type");
        this.t.setText(str);
        this.u.setText(str2);
    }

    public final void p(String str, Picasso picasso) {
        h.e(str, "imageUrl");
        Context context = getContext();
        h.d(context, "context");
        SpotifyIconDrawable b = h45.b(context, 72, SpotifyIconV2.PLAYLIST);
        if (str.length() == 0) {
            str = "image/noUrl";
        }
        if (picasso != null) {
            z m = picasso.m(str);
            m.t(b);
            m.g(b);
            m.n(this.s, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutomatedMessagingEntityView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        FrameLayout.inflate(context, C0707R.layout.automated_messaging_entity_view, this);
        setCardBackgroundColor(getResources().getColor(R.color.gray_15));
        setRadius(getResources().getDimension(C0707R.dimen.feed_item_release_corner_radius));
        View G = q4.G(this, C0707R.id.image);
        h.d(G, "ViewCompat.requireViewById(this, R.id.image)");
        this.s = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.name);
        h.d(G2, "ViewCompat.requireViewById(this, R.id.name)");
        this.t = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.type);
        h.d(G3, "ViewCompat.requireViewById(this, R.id.type)");
        this.u = (TextView) G3;
    }
}
