package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.ss8;
import defpackage.w51;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: ts8  reason: default package */
public final class ts8 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<v> c;
    private final wlf<xr8> d;
    private final wlf<pr8> e;
    private final wlf<is8> f;
    private final wlf<fs8> g;
    private final wlf<as8> h;
    private final wlf<mr8> i;
    private final wlf<Map<String, a71>> j;

    public ts8(wlf<Context> wlf, wlf<c.a> wlf2, wlf<v> wlf3, wlf<xr8> wlf4, wlf<pr8> wlf5, wlf<is8> wlf6, wlf<fs8> wlf7, wlf<as8> wlf8, wlf<mr8> wlf9, wlf<Map<String, a71>> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        c.a aVar = this.b.get();
        v vVar = this.c.get();
        xr8 xr8 = this.d.get();
        pr8 pr8 = this.e.get();
        is8 is8 = this.f.get();
        fs8 fs8 = this.g.get();
        as8 as8 = this.h.get();
        mr8 mr8 = this.i.get();
        Map<String, a71> map = this.j.get();
        ss8.a aVar2 = ss8.a;
        h.e(context, "context");
        h.e(aVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(vVar, "spotifyHubsConfig");
        h.e(xr8, "episodeImageCardComponent");
        h.e(pr8, "topicHeaderComponent");
        h.e(is8, "sectionHeaderComponent");
        h.e(fs8, "relatedTopicsSectionHeaderComponent");
        h.e(as8, "episodeRowComponent");
        h.e(mr8, "chipComponent");
        h.e(map, "commandRegistry");
        w51.b b2 = vVar.a(context, aVar).a(map).b();
        b2.j(C0707R.id.episode_image_card, "topic:episodeImageCard", xr8);
        b2.j(C0707R.id.topic_header, "topic:header", pr8);
        b2.j(C0707R.id.section_header, "topic:sectionHeader", is8);
        b2.j(C0707R.id.section_header_related_topics, "topic:relatedTopicsSectionHeader", fs8);
        b2.j(C0707R.id.topic_chip, "topic:chip", mr8);
        b2.j(C0707R.id.episode_row, "podcast:episodeRow", as8);
        w51 a2 = b2.a();
        h.d(a2, "spotifyHubsConfig\n      …                ).build()");
        return a2;
    }
}
