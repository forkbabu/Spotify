package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.features.browse.component.findcard.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.remoteconfig.q8;
import defpackage.w51;
import java.util.Map;

/* renamed from: cb4  reason: default package */
public final class cb4 implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<v> b;
    private final wlf<c.a> c;
    private final wlf<Map<String, a71>> d;
    private final wlf<c64> e;
    private final wlf<a> f;
    private final wlf<b84> g;
    private final wlf<h64> h;
    private final wlf<p64> i;
    private final wlf<a94> j;
    private final wlf<ema> k;
    private final wlf<h74> l;
    private final wlf<u94> m;
    private final wlf<q8> n;
    private final wlf<jhb> o;
    private final wlf<ehb> p;
    private final wlf<d94> q;
    private final wlf<r84> r;

    public cb4(wlf<Activity> wlf, wlf<v> wlf2, wlf<c.a> wlf3, wlf<Map<String, a71>> wlf4, wlf<c64> wlf5, wlf<a> wlf6, wlf<b84> wlf7, wlf<h64> wlf8, wlf<p64> wlf9, wlf<a94> wlf10, wlf<ema> wlf11, wlf<h74> wlf12, wlf<u94> wlf13, wlf<q8> wlf14, wlf<jhb> wlf15, wlf<ehb> wlf16, wlf<d94> wlf17, wlf<r84> wlf18) {
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
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.b.get();
        q8 q8Var = this.n.get();
        jhb jhb = this.o.get();
        ehb ehb = this.p.get();
        w51.b b2 = vVar.a(this.a.get(), this.c.get()).a(this.d.get()).b();
        b2.j(C0707R.id.find_card_category, "find:categoryCard", this.e.get());
        b2.j(C0707R.id.find_card, "find:card", this.f.get());
        b2.j(C0707R.id.find_header, "find:header", this.g.get());
        b2.j(C0707R.id.find_search_field, "find:searchField", this.h.get());
        b2.j(C0707R.id.find_tertiary_button, "find:tertiaryButton", this.i.get());
        b2.j(C0707R.id.find_inline_empty_state, "find:inlineEmptyState", this.j.get());
        b2.j(C0707R.id.podcast_indexed_image_row, "podcast:indexedImageRow", this.k.get());
        b2.j(C0707R.id.browse_editorial_header, "find:imageHeader", this.l.get());
        b2.j(C0707R.id.browse_topic, "find:topic", this.m.get());
        b2.j(C0707R.id.browse_promo_component, "find:promo", this.q.get());
        b2.j(C0707R.id.browse_text_header, "find:textHeader", this.r.get());
        if (q8Var.a()) {
            b2.j(C0707R.id.marketing_formats_slide_header, "marketing-format:slide-header", jhb);
            b2.j(C0707R.id.marketing_formats_blurb, "marketing-format:blurb-card", ehb);
        }
        return b2.a();
    }
}
