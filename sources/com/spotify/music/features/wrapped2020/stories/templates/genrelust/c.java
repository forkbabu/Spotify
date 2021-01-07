package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.app.Activity;
import android.net.Uri;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.TopGenresStoryResponse;
import defpackage.lx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class c implements cmf<lx1> {
    private final Activity a;
    private final a b;
    private final TopGenresStoryResponse c;
    private final ez8 f;

    public c(Activity activity, a aVar, TopGenresStoryResponse topGenresStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(topGenresStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = aVar;
        this.c = topGenresStoryResponse;
        this.f = ez8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        String str = "remoteData.shareConfiguration";
        try {
            Activity activity = this.a;
            String l = this.c.l();
            h.d(l, "remoteData.id");
            String r = this.c.r();
            h.d(r, "remoteData.previewUrl");
            Uri g = yy8.g(r);
            h.d(g, "remoteData.previewUrl.toUri()");
            String m = this.c.m();
            h.d(m, "remoteData.introBackgroundColor");
            int d = yy8.d(m);
            ColoredText q = this.c.q();
            h.d(q, "remoteData.introTitle");
            yz8 e = yy8.e(q);
            ColoredText p = this.c.p();
            h.d(p, "remoteData.introMessage");
            yz8 e2 = yy8.e(p);
            String o = this.c.o();
            h.d(o, "remoteData.introDataBackgroundColor");
            int d2 = yy8.d(o);
            Paragraph n = this.c.n();
            h.d(n, "remoteData.introData");
            a09 f2 = yy8.f(n);
            String t = this.c.t();
            h.d(t, "remoteData.topFiveBackgroundColor");
            int d3 = yy8.d(t);
            ColoredText u = this.c.u();
            h.d(u, "remoteData.topFiveTitle");
            yz8 e3 = yy8.e(u);
            List<TopGenresStoryResponse.TopGenresBlob> h = this.c.h();
            h.d(h, "remoteData.dancingBlobsList");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = h.iterator();
            while (it.hasNext()) {
                T next = it.next();
                h.d(next, "it");
                String i = next.i();
                h.d(i, "it.color");
                int d4 = yy8.d(i);
                ColoredText l2 = next.l();
                h.d(l2, "it.topLabel");
                yz8 e4 = yy8.e(l2);
                ColoredText h2 = next.h();
                h.d(h2, "it.bottomLabel");
                arrayList.add(new a(d4, e4, yy8.e(h2)));
                it = it;
                activity = activity;
                str = str;
            }
            b bVar = new b(l, g, d, e, e2, d2, f2, d3, e3, arrayList);
            a aVar = this.b;
            ShareConfiguration s = this.c.s();
            h.d(s, str);
            String l3 = s.l();
            h.d(l3, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration s2 = this.c.s();
            h.d(s2, str);
            List<String> i2 = s2.i();
            h.d(i2, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new GenrelustStory(activity, bVar, aVar.c(l3, i2), this.f));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
