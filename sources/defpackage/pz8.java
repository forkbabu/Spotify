package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.IntroStoryResponse;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: pz8  reason: default package */
public final class pz8 implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final IntroStoryResponse f;
    private final ez8 n;

    public pz8(Activity activity, Picasso picasso, a aVar, IntroStoryResponse introStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(introStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = introStoryResponse;
        this.n = ez8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String p = this.f.p();
            h.d(p, "remoteData.previewUrl");
            Uri g = yy8.g(p);
            h.d(g, "remoteData.previewUrl.toUri()");
            String h = this.f.h();
            h.d(h, "remoteData.artistImage1");
            Bitmap c2 = yy8.c(h, this.b);
            h.d(c2, "remoteData.artistImage1.toBitmap(picasso)");
            String i = this.f.i();
            h.d(i, "remoteData.artistImage2");
            Bitmap c3 = yy8.c(i, this.b);
            h.d(c3, "remoteData.artistImage2.toBitmap(picasso)");
            String l = this.f.l();
            h.d(l, "remoteData.artistImage3");
            Bitmap c4 = yy8.c(l, this.b);
            h.d(c4, "remoteData.artistImage3.toBitmap(picasso)");
            String m = this.f.m();
            h.d(m, "remoteData.artistImage4");
            Bitmap c5 = yy8.c(m, this.b);
            h.d(c5, "remoteData.artistImage4.toBitmap(picasso)");
            String x = this.f.x();
            h.d(x, "remoteData.textTitle");
            String u = this.f.u();
            h.d(u, "remoteData.textLine1");
            String v = this.f.v();
            h.d(v, "remoteData.textLine2");
            String w = this.f.w();
            h.d(w, "remoteData.textTagline");
            String t = this.f.t();
            h.d(t, "remoteData.textColor");
            int d = yy8.d(t);
            String r = this.f.r();
            h.d(r, "remoteData.textBackgroundColor");
            int d2 = yy8.d(r);
            Gradient s = this.f.s();
            h.d(s, "remoteData.textBackgroundGradient");
            WrappedGradient h2 = yy8.h(s);
            String o = this.f.o();
            h.d(o, "remoteData.id");
            oz8 oz8 = new oz8(g, c2, c3, c4, c5, x, w, u, v, d, d2, h2, o);
            a aVar = this.c;
            ShareConfiguration q = this.f.q();
            h.d(q, "remoteData.shareConfiguration");
            String l2 = q.l();
            h.d(l2, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration q2 = this.f.q();
            h.d(q2, "remoteData.shareConfiguration");
            List<String> i2 = q2.i();
            h.d(i2, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new nz8(activity, oz8, aVar.c(l2, i2), this.n));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
