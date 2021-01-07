package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.BasicStoryResponse;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: lz8  reason: default package */
public final class lz8 implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final BasicStoryResponse f;
    private final ez8 n;

    public lz8(Activity activity, Picasso picasso, a aVar, BasicStoryResponse basicStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(basicStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = basicStoryResponse;
        this.n = ez8;
    }

    private final Integer a(String str) {
        if (!h.a(str, "")) {
            return Integer.valueOf(Color.parseColor(str));
        }
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String q = this.f.q();
            h.d(q, "remoteData.previewUrl");
            Uri g = yy8.g(q);
            String h = this.f.h();
            h.d(h, "remoteData.backgroundColor");
            int d = yy8.d(h);
            Gradient r = this.f.r();
            h.d(r, "remoteData.screenBackgroundGradient");
            WrappedGradient h2 = yy8.h(r);
            String i = this.f.i();
            h.d(i, "remoteData.backgroundImageUrl");
            Bitmap j = h.a(i, "") ^ true ? this.b.m(i).j() : null;
            Paragraph u = this.f.u();
            h.d(u, "remoteData.title");
            a09 f2 = yy8.f(u);
            String t = this.f.t();
            h.d(t, "remoteData.subtitle");
            Paragraph o = this.f.o();
            h.d(o, "remoteData.description");
            a09 f3 = yy8.f(o);
            String p = this.f.p();
            h.d(p, "remoteData.id");
            String m = this.f.m();
            h.d(m, "remoteData.backgroundImgColor");
            Integer a2 = a(m);
            ColoredText l = this.f.l();
            h.d(l, "remoteData.backgroundImgAltText");
            String i2 = l.i();
            h.d(i2, "remoteData.backgroundImgAltText.text");
            ColoredText l2 = this.f.l();
            h.d(l2, "remoteData.backgroundImgAltText");
            String l3 = l2.l();
            h.d(l3, "remoteData.backgroundImgAltText.textColor");
            kz8 kz8 = new kz8(g, d, h2, j, f2, t, f3, p, a2, i2, a(l3));
            a aVar = this.c;
            ShareConfiguration s = this.f.s();
            h.d(s, "remoteData.shareConfiguration");
            String l4 = s.l();
            h.d(l4, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration s2 = this.f.s();
            h.d(s2, "remoteData.shareConfiguration");
            List<String> i3 = s2.i();
            h.d(i3, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new jz8(activity, kz8, aVar.c(l4, i3), this.n));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
