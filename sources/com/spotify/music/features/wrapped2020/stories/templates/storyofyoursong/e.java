package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.StoryOfYourSongStoryResponse;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class e implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final StoryOfYourSongStoryResponse f;
    private final ez8 n;

    public e(Activity activity, Picasso picasso, a aVar, StoryOfYourSongStoryResponse storyOfYourSongStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(storyOfYourSongStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = storyOfYourSongStoryResponse;
        this.n = ez8;
    }

    private final List<a> a(List<StoryOfYourSongStoryResponse.Statistic> list) {
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (T t : list) {
            ColoredText i = t.i();
            h.d(i, "stat.title");
            yz8 e = yy8.e(i);
            ColoredText h = t.h();
            h.d(h, "stat.subtitle");
            arrayList.add(new a(e, yy8.e(h)));
        }
        return arrayList;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String m = this.f.m();
            h.d(m, "remoteData.id");
            String p = this.f.p();
            h.d(p, "remoteData.previewUrl");
            Uri g = yy8.g(p);
            h.d(g, "remoteData.previewUrl.toUri()");
            String h = this.f.h();
            h.d(h, "remoteData.backgroundColor");
            int d = yy8.d(h);
            Paragraph o = this.f.o();
            h.d(o, "remoteData.introText");
            a09 f2 = yy8.f(o);
            String n2 = this.f.n();
            h.d(n2, "remoteData.imageUrl");
            Bitmap c2 = yy8.c(n2, this.b);
            h.d(c2, "remoteData.imageUrl.toBitmap(picasso)");
            Gradient i = this.f.i();
            h.d(i, "remoteData.backgroundGradient");
            WrappedGradient h2 = yy8.h(i);
            List<StoryOfYourSongStoryResponse.Statistic> r = this.f.r();
            h.d(r, "remoteData.statsList");
            List<a> a2 = a(r);
            ColoredText t = this.f.t();
            h.d(t, "remoteData.titleText");
            yz8 e = yy8.e(t);
            ColoredText s = this.f.s();
            h.d(s, "remoteData.subtitleText");
            b bVar = new b(m, g, d, f2, c2, h2, a2, e, yy8.e(s));
            a aVar = this.c;
            ShareConfiguration q = this.f.q();
            h.d(q, "remoteData.shareConfiguration");
            String l = q.l();
            h.d(l, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration q2 = this.f.q();
            h.d(q2, "remoteData.shareConfiguration");
            List<String> i2 = q2.i();
            h.d(i2, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new StoryOfYourSong(activity, bVar, aVar.c(l, i2), this.n));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
