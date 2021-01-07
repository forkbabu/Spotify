package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.ListData;
import com.spotify.wrapped2020.v1.proto.RankedItem;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.SingleData;
import com.spotify.wrapped2020.v1.proto.SummaryShareCardColorScheme;
import com.spotify.wrapped2020.v1.proto.SummaryShareCardData;
import com.spotify.wrapped2020.v1.proto.SummaryShareStoryResponse;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;

public final class h implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final SummaryShareStoryResponse f;
    private final ez8 n;

    public h(Activity activity, Picasso picasso, a aVar, SummaryShareStoryResponse summaryShareStoryResponse, ez8 ez8) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(picasso, "picasso");
        kotlin.jvm.internal.h.e(aVar, "sharePayloadProviderFactory");
        kotlin.jvm.internal.h.e(summaryShareStoryResponse, "remoteData");
        kotlin.jvm.internal.h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = summaryShareStoryResponse;
        this.n = ez8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String n2 = this.f.n();
            kotlin.jvm.internal.h.d(n2, "remoteData.previewUrl");
            Uri g = yy8.g(n2);
            String h = this.f.h();
            kotlin.jvm.internal.h.d(h, "remoteData.backgroundColor");
            int d = yy8.d(h);
            SummaryShareCardData i = this.f.i();
            String h2 = i.h();
            kotlin.jvm.internal.h.d(h2, "artistImageUrl");
            Bitmap c2 = yy8.c(h2, this.b);
            kotlin.jvm.internal.h.d(c2, "artistImageUrl.toBitmap(picasso)");
            String q = i.q();
            kotlin.jvm.internal.h.d(q, "textHashTag");
            ListData r = i.r();
            kotlin.jvm.internal.h.d(r, "topLeftData");
            String l = r.l();
            kotlin.jvm.internal.h.d(l, "topLeftData.title");
            ListData s = i.s();
            kotlin.jvm.internal.h.d(s, "topRightData");
            String l2 = s.l();
            kotlin.jvm.internal.h.d(l2, "topRightData.title");
            SingleData m = i.m();
            kotlin.jvm.internal.h.d(m, "bottomRightData");
            String l3 = m.l();
            kotlin.jvm.internal.h.d(l3, "bottomRightData.title");
            SingleData l4 = i.l();
            kotlin.jvm.internal.h.d(l4, "bottomLeftData");
            String l5 = l4.l();
            kotlin.jvm.internal.h.d(l5, "bottomLeftData.title");
            ListData r2 = i.r();
            kotlin.jvm.internal.h.d(r2, "topLeftData");
            List<RankedItem> h3 = r2.h();
            kotlin.jvm.internal.h.d(h3, "topLeftData.dataList");
            ArrayList arrayList = new ArrayList(d.e(h3, 10));
            Iterator<T> it = h3.iterator();
            while (it.hasNext()) {
                try {
                    T next = it.next();
                    kotlin.jvm.internal.h.d(next, "it");
                    String i2 = next.i();
                    kotlin.jvm.internal.h.d(i2, "it.rank");
                    String h4 = next.h();
                    kotlin.jvm.internal.h.d(h4, "it.content");
                    arrayList.add(new b(i2, h4));
                    it = it;
                    g = g;
                } catch (IOException unused) {
                    return lx1.a.a;
                }
            }
            ListData s2 = i.s();
            kotlin.jvm.internal.h.d(s2, "topRightData");
            List<RankedItem> h5 = s2.h();
            kotlin.jvm.internal.h.d(h5, "topRightData.dataList");
            ArrayList arrayList2 = new ArrayList(d.e(h5, 10));
            for (Iterator<T> it2 = h5.iterator(); it2.hasNext(); it2 = it2) {
                T next2 = it2.next();
                kotlin.jvm.internal.h.d(next2, "it");
                String i3 = next2.i();
                kotlin.jvm.internal.h.d(i3, "it.rank");
                String h6 = next2.h();
                kotlin.jvm.internal.h.d(h6, "it.content");
                arrayList2.add(new b(i3, h6));
            }
            SingleData m2 = i.m();
            kotlin.jvm.internal.h.d(m2, "bottomRightData");
            String h7 = m2.h();
            kotlin.jvm.internal.h.d(h7, "bottomRightData.data");
            SingleData l6 = i.l();
            kotlin.jvm.internal.h.d(l6, "bottomLeftData");
            String h8 = l6.h();
            kotlin.jvm.internal.h.d(h8, "bottomLeftData.data");
            Gradient i4 = i.i();
            kotlin.jvm.internal.h.d(i4, "backgroundGradient");
            WrappedGradient h9 = yy8.h(i4);
            Gradient p = i.p();
            kotlin.jvm.internal.h.d(p, "imageBackgroundGradient");
            c cVar = new c(c2, q, l, l2, l3, l5, arrayList, arrayList2, h7, h8, h9, yy8.h(p));
            try {
                SummaryShareCardData i5 = this.f.i();
                kotlin.jvm.internal.h.d(i5, "remoteData.data");
                List<SummaryShareCardColorScheme> n3 = i5.n();
                kotlin.jvm.internal.h.d(n3, "remoteData.data.colorSchemesList");
                ArrayList arrayList3 = new ArrayList(d.e(n3, 10));
                for (T t : n3) {
                    kotlin.jvm.internal.h.d(t, "it");
                    String m3 = t.m();
                    kotlin.jvm.internal.h.d(m3, "it.primaryTextColor");
                    int d2 = yy8.d(m3);
                    String n4 = t.n();
                    kotlin.jvm.internal.h.d(n4, "it.secondaryTextColor");
                    int d3 = yy8.d(n4);
                    String l7 = t.l();
                    kotlin.jvm.internal.h.d(l7, "it.footerTextColor");
                    int d4 = yy8.d(l7);
                    String h10 = t.h();
                    kotlin.jvm.internal.h.d(h10, "it.backgroundColor");
                    int d5 = yy8.d(h10);
                    String i6 = t.i();
                    kotlin.jvm.internal.h.d(i6, "it.footerBackgroundColor");
                    int d6 = yy8.d(i6);
                    String o = t.o();
                    kotlin.jvm.internal.h.d(o, "it.shareScheme");
                    arrayList3.add(new e(d2, d3, d4, d5, d6, o));
                }
                String q2 = this.f.q();
                kotlin.jvm.internal.h.d(q2, "remoteData.textShare");
                String p2 = this.f.p();
                kotlin.jvm.internal.h.d(p2, "remoteData.textReplay");
                String m4 = this.f.m();
                kotlin.jvm.internal.h.d(m4, "remoteData.id");
                ShareConfiguration o2 = this.f.o();
                kotlin.jvm.internal.h.d(o2, "remoteData.shareConfiguration");
                String l8 = o2.l();
                kotlin.jvm.internal.h.d(l8, "remoteData.shareConfiguration.shareStoryType");
                return new lx1.b(new SummaryShareStory(activity, new g(g, d, cVar, arrayList3, q2, p2, m4, l8), this.c, this.n));
            } catch (IOException unused2) {
                return lx1.a.a;
            }
        } catch (IOException unused3) {
            return lx1.a.a;
        }
    }
}
