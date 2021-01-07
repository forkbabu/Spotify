package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.util.x;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import defpackage.b91;
import defpackage.p81;
import defpackage.s81;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o75  reason: default package */
public class o75 {
    private final Context a;

    public o75(Context context) {
        this.a = context;
    }

    private static Map<String, o81> b(li0 li0, p81 p81) {
        b a2 = li0.a();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        p81.a p = z81.a().p("uri", a2.getUri());
        List<o> b = li0.b();
        int size = b.size();
        p81[] p81Arr = new p81[size];
        for (int i = 0; i < size; i++) {
            p81Arr[i] = z81.a().p("uri", b.get(i).getUri()).d();
        }
        builder.mo51put("click", z81.b().e("playFromContext").a(z81.a().p("uri", a2.getUri()).e("player", z81.a().e("context", p.f("pages", new p81[]{z81.a().f("tracks", p81Arr).d()}).d()).e("options", p81).d()).d()).c());
        return builder.build();
    }

    private static p81 c(String str, int i, String str2) {
        p81.a p = z81.a().p("ui:group", str).j("ui:index_in_block", i).p("ui:source", str2);
        return p.p("interaction:item_id", str + '_' + i).d();
    }

    public b91 a(li0 li0) {
        ArrayList arrayList;
        b a2 = li0.a();
        b91.a m = z81.i().k("artist-entity-view").m(a2.f());
        b a3 = li0.a();
        String c = q.c(a3.d(), Covers.Size.LARGE);
        int i = 0;
        b91.a j = m.j(z81.c().s("artist-entity-view-header").o("header:fullBleed", "header").z(z81.h().a(a3.f()).d(this.a.getString(C0707R.string.artist_go_online_to_see_full_artist_page)).build()).u(z81.f().g(z81.e().g((!TextUtils.isEmpty(c) ? Uri.parse(c) : Uri.EMPTY).toString()).f("album").c()).b()).m(Collections.singletonList(z81.c().r("primary_buttons").o(HubsGlueComponent.SHUFFLE_BUTTON.id(), HubsComponentCategory.ROW.d()).z(z81.h().a(this.a.getString(C0707R.string.header_shuffle_play)).build()).h(c("artist-entity-view-header-button", 0, "")).g(b(li0, z81.a().e("player_options_override", z81.a().b("shuffling_context", true).d()).d())).l())).k("uri", a3.getUri()).l());
        List<o> b = li0.b();
        if (b.isEmpty()) {
            arrayList = new ArrayList(0);
        } else {
            ArrayList arrayList2 = new ArrayList(b.size() + 1);
            arrayList2.add(z81.c().s("artist-entity-view-top-tracks-combined").o("glue:sectionHeader", "header").y(z81.h().a(this.a.getString(C0707R.string.artist_downloaded_songs))).l());
            int i2 = 0;
            while (i2 < b.size()) {
                o oVar = b.get(i2);
                String d = x.d(oVar);
                p81 d2 = z81.a().e("skip_to", z81.a().p(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, oVar.getUri()).j("page_index", i).d()).d();
                s81.a u = je.J("artist-entity-view-top-tracks-combined_row", i2, z81.c()).o(HubsGlueRow.ENTITY.id(), HubsComponentCategory.ROW.d()).z(z81.h().a(oVar.getName()).d(d).build()).u(z81.f().b());
                p81.a p = z81.a().p("glue:subtitleStyle", "metadata");
                if (oVar.isExplicit()) {
                    p = p.p("label", "explicit");
                }
                s81.a h = u.c(p.d()).h(c("artist-entity-view-track-list", i2, ""));
                p81.a p2 = z81.a().p("uri", oVar.getUri()).p("preview_id", oVar.getPreviewId());
                if (oVar.isExplicit()) {
                    p2 = p2.b("explicit", true);
                }
                arrayList2.add(h.j(p2.d()).f("rightAccessoryClick", z81.b().e("contextMenu").b("uri", oVar.getUri()).c()).g(b(li0, d2)).l());
                i2++;
                i = 0;
            }
            arrayList = arrayList2;
        }
        return j.e(arrayList).h(z81.a().e("toolbarmenu", z81.a().p("share_uri", a2.getUri()).p("image_uri", q.c(a2.d(), Covers.Size.NORMAL)).p("title", a2.f()).d()).d()).g();
    }
}
