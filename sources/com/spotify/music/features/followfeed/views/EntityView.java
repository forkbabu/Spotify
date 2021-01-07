package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class EntityView extends ConstraintLayout {
    private ImageView a;
    private View b;
    private TextView c;
    private TextView f;
    private ImageView n;
    private com.spotify.paste.widgets.internal.a o;

    static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
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

    static final class c implements View.OnClickListener {
        final /* synthetic */ cmf a;

        c(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    public EntityView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int G(int i) {
        return androidx.core.content.a.b(getContext(), i);
    }

    public final void C(String str, Picasso picasso) {
        h.e(str, "imageUrl");
        Context context = getContext();
        h.d(context, "context");
        SpotifyIconDrawable b2 = h45.b(context, 72, SpotifyIconV2.ALBUM);
        if (str.length() == 0) {
            str = "image/noUrl";
        }
        if (picasso != null) {
            z m = picasso.m(str);
            m.t(b2);
            m.g(b2);
            m.n(this.a, null);
        }
    }

    public final void D(String str, String str2, boolean z, boolean z2, boolean z3) {
        int i;
        h.e(str, "titleText");
        h.e(str2, "subtitleText");
        this.c.setText(str);
        if (z3) {
            i = G(R.color.green_light);
        } else {
            i = G(R.color.white);
        }
        this.c.setTextColor(i);
        float f2 = 1.0f;
        this.c.setAlpha(z2 ? 0.5f : 1.0f);
        TextView textView = this.f;
        textView.setText(str2);
        textView.setTextColor(G(R.color.gray_70));
        if (z2) {
            f2 = 0.5f;
        }
        textView.setAlpha(f2);
        TextLabelUtil.b(textView.getContext(), textView, z);
    }

    public final void E(boolean z) {
        Context context = getContext();
        h.d(context, "context");
        com.spotify.paste.graphics.drawable.c c2 = z ? h45.c(context) : h45.d(context);
        int i = z ? C0707R.string.content_description_pause_button : C0707R.string.content_description_play_button;
        ImageView imageView = this.n;
        imageView.setImageDrawable(c2);
        imageView.setContentDescription(imageView.getContext().getString(i));
    }

    public final void setContextMenuClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.o.d().setOnClickListener(new a(cmf));
    }

    public final void setMetadataViewClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.b.setOnClickListener(new b(cmf));
    }

    public final void setPlayButtonClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.n.setOnClickListener(new c(cmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(context, C0707R.layout.entity_view, this);
        View G = q4.G(this, C0707R.id.accessory);
        h.d(G, "ViewCompat.requireViewBy…up>(this, R.id.accessory)");
        com.spotify.paste.widgets.internal.a aVar = new com.spotify.paste.widgets.internal.a((ViewGroup) G);
        this.o = aVar;
        aVar.f(p42.a(context));
        View G2 = q4.G(this, C0707R.id.entity_image);
        h.d(G2, "ViewCompat.requireViewBy…(this, R.id.entity_image)");
        this.a = (ImageView) G2;
        View G3 = q4.G(this, C0707R.id.entity_metadata_view);
        h.d(G3, "ViewCompat.requireViewBy….id.entity_metadata_view)");
        this.b = G3;
        View G4 = q4.G(this, C0707R.id.entity_title);
        h.d(G4, "ViewCompat.requireViewBy…(this, R.id.entity_title)");
        this.c = (TextView) G4;
        View G5 = q4.G(this, C0707R.id.entity_subtitle);
        h.d(G5, "ViewCompat.requireViewBy…is, R.id.entity_subtitle)");
        this.f = (TextView) G5;
        View G6 = q4.G(this, C0707R.id.entity_play_button);
        h.d(G6, "ViewCompat.requireViewBy… R.id.entity_play_button)");
        this.n = (ImageView) G6;
    }
}
