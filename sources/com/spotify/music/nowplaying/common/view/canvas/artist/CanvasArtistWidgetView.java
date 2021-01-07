package com.spotify.music.nowplaying.common.view.canvas.artist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.canvas.artist.j;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Locale;

public class CanvasArtistWidgetView extends FrameLayout implements j {
    public static final /* synthetic */ int r = 0;
    private final Runnable a;
    private final Runnable b;
    private View c;
    private View f;
    private TextView n;
    private ImageView o;
    private Picasso p;
    private j.a q;

    public CanvasArtistWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.common.view.canvas.artist.j
    public void a() {
        animate().cancel();
        x4 a2 = q4.a(this);
        a2.d(200);
        a2.e(ta0.b);
        a2.a(1.0f);
        a2.o(this.b);
        a2.j();
    }

    @Override // com.spotify.music.nowplaying.common.view.canvas.artist.j
    public void b() {
        animate().cancel();
        x4 a2 = q4.a(this);
        a2.d(200);
        a2.e(ta0.a);
        a2.a(0.0f);
        a2.n(this.a);
        a2.j();
    }

    public void c(View view) {
        j.a aVar = this.q;
        if (aVar != null) {
            ((h) aVar).d();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.canvas.artist.j
    public void setAvatar(String str) {
        z m = this.p.m(str);
        m.t(yc0.h(getContext()));
        m.g(yc0.h(getContext()));
        m.o(rwd.c(this.o));
    }

    @Override // com.spotify.music.nowplaying.common.view.canvas.artist.j
    public void setInsetBottom(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        this.f.setLayoutParams(marginLayoutParams);
    }

    @Override // com.spotify.music.nowplaying.common.view.canvas.artist.j
    public void setListener(j.a aVar) {
        this.q = aVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.canvas.artist.j
    public void setName(String str) {
        this.n.setText(String.format(Locale.US, getContext().getString(C0707R.string.canvas_uploaded_by_text), str));
    }

    public void setPicasso(Picasso picasso) {
        this.p = picasso;
    }

    public CanvasArtistWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new f(this);
        this.b = new d(this);
        FrameLayout.inflate(getContext(), C0707R.layout.canvas_artist_widget, this);
        this.c = q4.G(this, C0707R.id.gradient_background);
        this.f = q4.G(this, C0707R.id.artist_attribution);
        this.n = (TextView) q4.G(this, C0707R.id.canvas_uploaded_by_artist_text);
        this.o = (ImageView) q4.G(this, C0707R.id.canvas_artist_avatar);
        this.f.setOnClickListener(new e(this));
        q4.P(this.c, g.a);
    }
}
