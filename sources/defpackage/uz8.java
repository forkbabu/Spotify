package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.SummaryIntroStoryResponse;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: uz8  reason: default package */
public final class uz8 implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final SummaryIntroStoryResponse f;
    private final ez8 n;

    public uz8(Activity activity, Picasso picasso, a aVar, SummaryIntroStoryResponse summaryIntroStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(summaryIntroStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = summaryIntroStoryResponse;
        this.n = ez8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String t = this.f.t();
            h.d(t, "remoteData.previewUrl");
            Uri g = yy8.g(t);
            h.d(g, "remoteData.previewUrl.toUri()");
            String p = this.f.p();
            h.d(p, "remoteData.cardBackgroundColor");
            int d = yy8.d(p);
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
            Gradient r = this.f.r();
            h.d(r, "remoteData.gradient");
            WrappedGradient h2 = yy8.h(r);
            ColoredText x = this.f.x();
            h.d(x, "remoteData.textTitle");
            String i2 = x.i();
            h.d(i2, "remoteData.textTitle.text");
            ColoredText x2 = this.f.x();
            h.d(x2, "remoteData.textTitle");
            String l2 = x2.l();
            h.d(l2, "remoteData.textTitle.textColor");
            int d2 = yy8.d(l2);
            ColoredText w = this.f.w();
            h.d(w, "remoteData.textTagline");
            String i3 = w.i();
            h.d(i3, "remoteData.textTagline.text");
            ColoredText w2 = this.f.w();
            h.d(w2, "remoteData.textTagline");
            String l3 = w2.l();
            h.d(l3, "remoteData.textTagline.textColor");
            int d3 = yy8.d(l3);
            String n2 = this.f.n();
            h.d(n2, "remoteData.backgroundColor1");
            int d4 = yy8.d(n2);
            ColoredText v = this.f.v();
            h.d(v, "remoteData.textLine1");
            String i4 = v.i();
            h.d(i4, "remoteData.textLine1.text");
            ColoredText v2 = this.f.v();
            h.d(v2, "remoteData.textLine1");
            String l4 = v2.l();
            h.d(l4, "remoteData.textLine1.textColor");
            int d5 = yy8.d(l4);
            String o = this.f.o();
            h.d(o, "remoteData.backgroundColor2");
            int d6 = yy8.d(o);
            String s = this.f.s();
            h.d(s, "remoteData.id");
            tz8 tz8 = new tz8(g, d, c2, c3, c4, c5, h2, i2, d2, i3, d3, d4, i4, d5, d6, s);
            a aVar = this.c;
            ShareConfiguration u = this.f.u();
            h.d(u, "remoteData.shareConfiguration");
            String l5 = u.l();
            h.d(l5, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration u2 = this.f.u();
            h.d(u2, "remoteData.shareConfiguration");
            List<String> i5 = u2.i();
            h.d(i5, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new sz8(activity, tz8, aVar.c(l5, i5), this.n));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
