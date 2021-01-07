package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.QuizStoryResponse;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class f implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final QuizStoryResponse f;
    private final ez8 n;

    public f(Activity activity, Picasso picasso, a aVar, QuizStoryResponse quizStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(quizStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = quizStoryResponse;
        this.n = ez8;
    }

    private final List<a> a(List<QuizStoryResponse.Choice> list) {
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (T t : list) {
            String h = t.h();
            h.d(h, "choice.imageUrl");
            Bitmap c2 = yy8.c(h, this.b);
            h.d(c2, "choice.imageUrl.toBitmap(picasso)");
            String l = t.l();
            h.d(l, "choice.text");
            arrayList.add(new a(c2, l, t.i()));
        }
        return arrayList;
    }

    private final h d(QuizStoryResponse.SayThanks sayThanks) {
        String h = sayThanks.h();
        h.d(h, "sayThanks.buttonText");
        if (!(h.length() > 0)) {
            return null;
        }
        QuizStoryResponse.SayThanks t = this.f.t();
        h.d(t, "remoteData.sayThanks");
        Paragraph l = t.l();
        h.d(l, "remoteData.sayThanks.statisticText");
        String i = l.i();
        h.d(i, "remoteData.sayThanks.statisticText.text");
        QuizStoryResponse.SayThanks t2 = this.f.t();
        h.d(t2, "remoteData.sayThanks");
        Paragraph l2 = t2.l();
        h.d(l2, "remoteData.sayThanks.statisticText");
        List<String> n2 = l2.n();
        h.d(n2, "remoteData.sayThanks.statisticText.valuesList");
        QuizStoryResponse.SayThanks t3 = this.f.t();
        h.d(t3, "remoteData.sayThanks");
        Paragraph l3 = t3.l();
        h.d(l3, "remoteData.sayThanks.statisticText");
        String l4 = l3.l();
        h.d(l4, "remoteData.sayThanks.statisticText.textColor");
        int d = yy8.d(l4);
        QuizStoryResponse.SayThanks t4 = this.f.t();
        h.d(t4, "remoteData.sayThanks");
        Paragraph l5 = t4.l();
        h.d(l5, "remoteData.sayThanks.statisticText");
        String m = l5.m();
        h.d(m, "remoteData.sayThanks.statisticText.valuesColor");
        a09 a09 = new a09(i, n2, d, yy8.d(m));
        QuizStoryResponse.SayThanks t5 = this.f.t();
        h.d(t5, "remoteData.sayThanks");
        String m2 = t5.m();
        h.d(m2, "remoteData.sayThanks.twitterShareUrl");
        QuizStoryResponse.SayThanks t6 = this.f.t();
        h.d(t6, "remoteData.sayThanks");
        String h2 = t6.h();
        h.d(h2, "remoteData.sayThanks.buttonText");
        return new h(a09, m2, h2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String l = this.f.l();
            h.d(l, "remoteData.id");
            String p = this.f.p();
            h.d(p, "remoteData.previewUrl");
            Uri g = yy8.g(p);
            h.d(g, "remoteData.previewUrl.toUri()");
            String o = this.f.o();
            h.d(o, "remoteData.introTitleText");
            String n2 = this.f.n();
            h.d(n2, "remoteData.introSubtitleText");
            String r = this.f.r();
            h.d(r, "remoteData.promptText");
            List<QuizStoryResponse.Choice> h = this.f.h();
            h.d(h, "remoteData.choicesList");
            List<a> a2 = a(h);
            QuizStoryResponse.Result s = this.f.s();
            h.d(s, "remoteData.result");
            String h2 = s.h();
            h.d(h2, "remoteData.result.correctText");
            QuizStoryResponse.Result s2 = this.f.s();
            h.d(s2, "remoteData.result");
            String l2 = s2.l();
            h.d(l2, "remoteData.result.incorrectText");
            QuizStoryResponse.Result s3 = this.f.s();
            h.d(s3, "remoteData.result");
            String n3 = s3.n();
            h.d(n3, "remoteData.result.titleText");
            QuizStoryResponse.Result s4 = this.f.s();
            h.d(s4, "remoteData.result");
            Paragraph m = s4.m();
            h.d(m, "remoteData.result.statistic");
            String i = m.i();
            h.d(i, "remoteData.result.statistic.text");
            QuizStoryResponse.Result s5 = this.f.s();
            h.d(s5, "remoteData.result");
            Paragraph m2 = s5.m();
            h.d(m2, "remoteData.result.statistic");
            List<String> n4 = m2.n();
            h.d(n4, "remoteData.result.statistic.valuesList");
            QuizStoryResponse.Result s6 = this.f.s();
            h.d(s6, "remoteData.result");
            Paragraph m3 = s6.m();
            h.d(m3, "remoteData.result.statistic");
            String l3 = m3.l();
            h.d(l3, "remoteData.result.statistic.textColor");
            int d = yy8.d(l3);
            QuizStoryResponse.Result s7 = this.f.s();
            h.d(s7, "remoteData.result");
            Paragraph m4 = s7.m();
            h.d(m4, "remoteData.result.statistic");
            String m5 = m4.m();
            h.d(m5, "remoteData.result.statistic.valuesColor");
            g gVar = new g(h2, l2, n3, new a09(i, n4, d, yy8.d(m5)));
            String u = this.f.u();
            h.d(u, "remoteData.secondaryColor");
            int d2 = yy8.d(u);
            String x = this.f.x();
            h.d(x, "remoteData.tertiaryColor");
            int d3 = yy8.d(x);
            String q = this.f.q();
            h.d(q, "remoteData.primaryColor");
            int d4 = yy8.d(q);
            Gradient m6 = this.f.m();
            h.d(m6, "remoteData.imageBackgroundGradient");
            WrappedGradient h3 = yy8.h(m6);
            String v = this.f.v();
            h.d(v, "remoteData.secondaryPreviewUrl");
            Uri g2 = yy8.g(v);
            h.d(g2, "remoteData.secondaryPreviewUrl.toUri()");
            QuizStoryResponse.SayThanks t = this.f.t();
            h.d(t, "remoteData.sayThanks");
            b bVar = new b(l, g, o, n2, r, a2, gVar, d2, d3, d4, h3, g2, d(t));
            a aVar = this.c;
            ShareConfiguration w = this.f.w();
            h.d(w, "remoteData.shareConfiguration");
            String l4 = w.l();
            h.d(l4, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration w2 = this.f.w();
            h.d(w2, "remoteData.shareConfiguration");
            List<String> i2 = w2.i();
            h.d(i2, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new QuizStory(activity, bVar, aVar.c(l4, i2), this.n));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
