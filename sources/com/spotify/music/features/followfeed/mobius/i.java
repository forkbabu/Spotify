package com.spotify.music.features.followfeed.mobius;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.ContextTrack;
import defpackage.b91;
import defpackage.p81;
import defpackage.s81;
import defpackage.v25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class i implements ea2<r25, b91> {
    private final p81 a(w25 w25, boolean z, boolean z2, int i) {
        List<j25> d = w25.d();
        String c = ((j25) d.j(d)).c();
        p81.a b = HubsImmutableComponentBundle.Companion.b().p("id", w25.a()).j("position", i).p("artist_uri", c).p("artist_name", ((j25) d.j(d)).a()).p("artist_image", ((j25) d.j(d)).b()).p("release_time", w25.i()).p("title", w25.k()).p(ContextTrack.Metadata.KEY_SUBTITLE, w25.j()).p("image_url", w25.g()).p(ContextTrack.Metadata.KEY_ENTITY_URI, w25.m()).b("explicit", w25.f()).b("appears_disabled", w25.f() && z).b("playing", w25.h()).b("expanded", w25.e()).b("track_active", w25.c()).b("can_play_on_demand", z2);
        List<b35> l = w25.l();
        ArrayList arrayList = new ArrayList(d.e(l, 10));
        for (T t : l) {
            p81.a b2 = HubsImmutableComponentBundle.Companion.b().p(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, t.f()).p("track_title", t.e()).b("track_playing", t.d()).b("track_appears_disabled", t.c() && z).b("explicit", t.c());
            List<j25> b3 = t.b();
            ArrayList arrayList2 = new ArrayList(d.e(b3, 10));
            Iterator<T> it = b3.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().a());
            }
            Object[] array = arrayList2.toArray(new String[0]);
            if (array != null) {
                arrayList.add(b2.q("artist_names", (String[]) array).d());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        Object[] array2 = arrayList.toArray(new p81[0]);
        if (array2 != null) {
            return b.f("track_bundles", (p81[]) array2).f("more_artist_bundles", b(w25.d())).d();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final p81[] b(List<j25> list) {
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (T t : list) {
            arrayList.add(HubsImmutableComponentBundle.Companion.b().p("artist_uri", t.c()).p("display_name", t.a()).p("image_url", t.b()).d());
        }
        Object[] array = arrayList.toArray(new p81[0]);
        if (array != null) {
            return (p81[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ea2
    public b91 apply(r25 r25) {
        s81 s81;
        r25 r252 = r25;
        h.e(r252, "model");
        b91.a k = z81.i().k("feed-hubs-model-id");
        List<p25> e = r252.e();
        boolean b = r252.b();
        boolean d = r252.d();
        boolean z = r252.f() instanceof v25.a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : e) {
            int i2 = i + 1;
            s81 s812 = null;
            if (i >= 0) {
                T t2 = t;
                if (t2 instanceof w25) {
                    T t3 = t2;
                    if (!b || !(!t3.l().isEmpty()) || t3.l().size() <= 1) {
                        s81 = je.I(HubsComponentCategory.ROW, "HubsComponentCategory.ROW.id", z81.c(), "feed:staticReleaseItem").p(a(t3, d, b, i)).l();
                    } else {
                        s81 = je.I(HubsComponentCategory.ROW, "HubsComponentCategory.ROW.id", z81.c(), "feed:expandableReleaseItem").p(a(t3, d, true, i)).l();
                    }
                    s812 = s81;
                } else if (t2 instanceof s25) {
                    T t4 = t2;
                    String d2 = t4.d();
                    p81 d3 = HubsImmutableComponentBundle.Companion.b().j("position", i).p("section_title", d2).f("artists", b(t4.c())).d();
                    s81.a s = z81.c().s("follow-recs-id");
                    String d4 = HubsComponentCategory.ROW.d();
                    h.d(d4, "HubsComponentCategory.ROW.id");
                    s812 = s.o("feed:followRecs", d4).p(d3).l();
                } else if (t2 instanceof k25) {
                    T t5 = t2;
                    HubsImmutableComponentBundle.b bVar = HubsImmutableComponentBundle.Companion;
                    p81 d5 = bVar.b().p("id", t5.a()).j("position", i).p("title", t5.f()).p(ContextTrack.Metadata.KEY_SUBTITLE, t5.e()).p("icon_url", t5.c()).p("delivery_time", t5.b()).e("item_context", bVar.b().p("uri", t5.d().d()).p("name", t5.d().b()).p("type", t5.d().c()).p("image_url", t5.d().a()).d()).d();
                    s81.a c = z81.c();
                    String d6 = HubsComponentCategory.ROW.d();
                    h.d(d6, "HubsComponentCategory.ROW.id");
                    s812 = c.o("feed:automatedMessagingItem", d6).p(d5).l();
                }
                if (s812 != null) {
                    arrayList.add(s812);
                }
                i = i2;
            } else {
                d.L();
                throw null;
            }
        }
        List W = d.W(arrayList);
        if (z) {
            s81.a c2 = z81.c();
            String d7 = HubsComponentCategory.ROW.d();
            h.d(d7, "HubsComponentCategory.ROW.id");
            ((ArrayList) W).add(c2.o("feed:loadingIndicator", d7).l());
        }
        return k.a(d.Q(W)).g();
    }
}
