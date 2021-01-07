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
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class AutomatedMessagingHeaderView extends ConstraintLayout {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final TextView f;

    public AutomatedMessagingHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void C(String str, Picasso picasso) {
        h.e(str, "iconUrl");
        Context context = getContext();
        h.d(context, "context");
        SpotifyIconDrawable b2 = h45.b(context, 24, SpotifyIconV2.NOTIFICATIONS);
        if (str.length() == 0) {
            str = "/";
        }
        if (picasso != null) {
            z m = picasso.m(str);
            m.x(new cwd());
            m.t(b2);
            m.g(b2);
            m.n(this.a, null);
        }
    }

    public final void D(String str) {
        h.e(str, ContextTrack.Metadata.KEY_SUBTITLE);
        this.c.setText(str);
    }

    public final void E(String str) {
        h.e(str, "timestamp");
        this.f.setText(str);
    }

    public final void G(String str) {
        h.e(str, "title");
        this.b.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutomatedMessagingHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(context, C0707R.layout.automated_messaging_header_view, this);
        View G = q4.G(this, C0707R.id.icon);
        h.d(G, "ViewCompat.requireViewById(this, R.id.icon)");
        this.a = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.title);
        h.d(G2, "ViewCompat.requireViewById(this, R.id.title)");
        this.b = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.subtitle);
        h.d(G3, "ViewCompat.requireViewById(this, R.id.subtitle)");
        this.c = (TextView) G3;
        View G4 = q4.G(this, C0707R.id.timestamp);
        h.d(G4, "ViewCompat.requireViewById(this, R.id.timestamp)");
        this.f = (TextView) G4;
    }
}
