package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.a;
import com.spotify.android.glue.patterns.header.transformations.d;
import com.spotify.android.glue.patterns.header.transformations.f;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.mc7;
import defpackage.urc;

/* renamed from: pc7  reason: default package */
public class pc7 implements mc7 {
    private ColorDrawable A;
    private View a;
    private TextView b;
    private TextView c;
    private Button f;
    private ProgressBar n;
    private ImageView o;
    private ImageView p;
    private final Resources q;
    private final Picasso r;
    private final Interpolator s = new AccelerateInterpolator(2.0f);
    private final urc t;
    private final ajf<u> u;
    private final ajf<mc7.a> v;
    private final ajf<urc.b> w;
    private TransformationSet x;
    private SpotifyIconDrawable y;
    private SpotifyIconDrawable z;

    public pc7(Resources resources, urc urc, Picasso picasso, ajf<u> ajf, ajf<mc7.a> ajf2, ajf<urc.b> ajf3) {
        this.q = resources;
        this.u = ajf;
        this.r = picasso;
        this.t = urc;
        this.v = ajf2;
        this.w = ajf3;
    }

    @Override // defpackage.mc7
    public void B1(LayoutInflater layoutInflater, ViewGroup viewGroup, AppBarLayout appBarLayout) {
        this.a = layoutInflater.inflate(C0707R.layout.header_podcast_episode, viewGroup, false);
        this.t.e(this.w.get());
        View view = this.a;
        d<f> d = new f(0.0f, 1.0f).c().d(1.0f, 0.0f);
        d.e(ta0.a);
        this.x = d.f(a.b(view, View.ALPHA)).c().b();
        Context context = this.a.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK_ALT_FILL, (float) this.q.getDimensionPixelSize(C0707R.dimen.played_icon_size));
        this.y = spotifyIconDrawable;
        spotifyIconDrawable.r(androidx.core.content.a.b(context, R.color.green));
        this.z = new SpotifyIconDrawable(context, SpotifyIconV2.PODCASTS, (float) this.q.getDimensionPixelSize(C0707R.dimen.podcast_placeholder));
        this.b = (TextView) this.a.findViewById(C0707R.id.txt_title);
        this.f = (Button) this.a.findViewById(C0707R.id.btn_podcast_name);
        this.c = (TextView) this.a.findViewById(C0707R.id.txt_subtitle);
        this.n = (ProgressBar) this.a.findViewById(C0707R.id.progress_bar);
        this.o = (ImageView) this.a.findViewById(C0707R.id.img_podcast_cover_art);
        this.p = (ImageView) this.a.findViewById(C0707R.id.img_played);
        this.u.get().o(0.0f);
        bvd b2 = dvd.b(this.o);
        b2.f(this.o);
        b2.a();
        bvd c2 = dvd.c(this.f);
        c2.g(this.f);
        c2.a();
        appBarLayout.addView(this.a);
        appBarLayout.a(new hc7(this));
        mc0 c3 = lc0.c(this.a.getContext(), -11316397);
        this.A = (ColorDrawable) c3.getDrawable(0);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        appBarLayout.setBackground(c3);
    }

    @Override // defpackage.mc7
    public void T1(rc7 rc7) {
        if (rc7.p() == 1) {
            int n2 = rc7.n();
            this.n.setMax(rc7.j());
            this.n.setVisibility(0);
            this.n.setProgress(n2);
        } else {
            this.n.setVisibility(8);
        }
        if (rc7.p() == 2) {
            this.p.setImageDrawable(this.y);
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
        this.b.setText(rc7.r());
        this.c.setText(rc7.q());
        this.f.setText(rc7.l());
        this.u.get().setTitle(rc7.r());
        z m = this.r.m(rc7.k());
        m.t(this.z);
        m.g(this.z);
        m.v(C0707R.dimen.podcast_cover_art_size, C0707R.dimen.podcast_cover_art_size).o(this.t.f());
        this.f.setOnClickListener(new gc7(this, rc7));
        this.o.setContentDescription(rc7.l());
        this.o.setOnClickListener(new ic7(this, rc7));
        TextLabelUtil.b(this.c.getContext(), this.c, rc7.h());
    }

    @Override // defpackage.mc7
    public void U0(int i) {
        ColorDrawable colorDrawable = this.A;
        if (colorDrawable != null) {
            colorDrawable.setColor(i);
        }
    }

    public void b(AppBarLayout appBarLayout, int i) {
        float abs = ((float) Math.abs(i)) / ((float) this.a.getHeight());
        this.u.get().o(this.s.getInterpolation(abs));
        this.x.a(abs);
    }

    public /* synthetic */ void c(rc7 rc7, View view) {
        this.v.get().a(rc7.m());
    }

    public /* synthetic */ void d(rc7 rc7, View view) {
        this.v.get().b(rc7.m());
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.mc7
    public void j0(Drawable drawable) {
        this.o.setImageDrawable(drawable);
    }

    @Override // defpackage.mc7
    public void w0(Bitmap bitmap) {
        this.o.setImageDrawable(new com.spotify.paste.graphics.drawable.d(bitmap, this.q.getDimension(C0707R.dimen.podcast_cover_art_corner_radius)));
    }
}
