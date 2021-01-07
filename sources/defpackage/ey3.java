package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentImages;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableImage;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.x;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.C0707R;
import com.spotify.music.libs.collection.model.c;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import defpackage.b91;
import defpackage.o81;
import defpackage.p81;
import defpackage.r81;
import defpackage.s81;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: ey3  reason: default package */
public class ey3 {
    private final Context a;
    private final boolean b;

    public ey3(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    private static Map<String, o81> b(String str, p81 p81, c cVar) {
        a header = cVar.getHeader();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        o81.a e = z81.b().e("playFromContext");
        p81.a p = z81.a().p("uri", str);
        p81.a a2 = z81.a();
        p81.a p2 = z81.a().p("uri", header.getUri());
        a header2 = cVar.getHeader();
        List items = cVar.getItems();
        int size = items.size();
        p81[] p81Arr = new p81[size];
        for (int i = 0; i < size; i++) {
            p81Arr[i] = z81.a().p("uri", ((o) items.get(i)).getUri()).e("metadata", z81.a().p("artist_uri", header2.c().getUri()).p("album_uri", header2.getUri()).d()).d();
        }
        builder.mo51put("click", e.a(p.e("player", a2.e("context", p2.f("pages", new p81[]{z81.a().f("tracks", p81Arr).d()}).d()).e("options", p81).d()).d()).c());
        return builder.build();
    }

    private static String c(o oVar) {
        return oVar.getArtists().size() > 0 ? oVar.getArtists().get(0).f() : "";
    }

    private static p81 d(String str, int i, String str2) {
        p81.a p = z81.a().p("ui:group", str).j("ui:index_in_block", i).p("ui:source", str2);
        return p.p("interaction:item_id", str + '_' + i).d();
    }

    public b91 a(c cVar) {
        a header = cVar.getHeader();
        List items = cVar.getItems();
        b91.a m = HubsImmutableViewModel.builder().k("album-entity-view").m(header.g());
        if (items.isEmpty()) {
            return m.g();
        }
        ArrayList arrayList = new ArrayList(items.size() + 2);
        a header2 = cVar.getHeader();
        s81.a z = HubsImmutableComponentModel.builder().o("freetier:entityTopContainer", "").z(z81.h().a(header2.g()).d(this.a.getString(C0707R.string.album_header_album_by_format, header2.c().f())).build());
        r81.a f = z81.f();
        String c = q.c(header2.e(), Covers.Size.LARGE);
        s81.a u = z.u(f.g(HubsImmutableImage.builder().g((!TextUtils.isEmpty(c) ? Uri.parse(c) : Uri.EMPTY).toString()).f("album").c()).b());
        a header3 = cVar.getHeader();
        ArrayList arrayList2 = new ArrayList(1);
        p81 d = z81.a().e("player_options_override", z81.a().b("shuffling_context", true).d()).d();
        s81.a builder = HubsImmutableComponentModel.builder();
        String id = HubsGlueComponent.SHUFFLE_BUTTON.id();
        HubsComponentCategory hubsComponentCategory = HubsComponentCategory.ROW;
        arrayList2.add(builder.o(id, hubsComponentCategory.d()).z(HubsImmutableComponentText.builder().a(this.a.getString(C0707R.string.header_shuffle_play)).build()).h(d("album-entity-view-header-button", 0, "")).g(b(header3.getUri(), d, cVar)).l());
        arrayList.add(u.m(arrayList2).h(d("album-entity-view-header", 0, "")).k("uri", header2.getUri()).l());
        String str = "glue:subtitleStyle";
        arrayList.add(HubsImmutableComponentModel.builder().o("row:downloadToggle", hubsComponentCategory.d()).z(z81.h().a(header.g()).d(header.c().f()).build()).u(HubsImmutableComponentImages.builder().b()).d(str, "metadata").f("click", z81.b().e("download").d(z81.a().b("download", true).d()).c()).l());
        if (this.b) {
            int i = 0;
            while (i < items.size()) {
                o oVar = (o) items.get(i);
                a header4 = cVar.getHeader();
                String d2 = x.d(oVar);
                p81 d3 = z81.a().e("skip_to", z81.a().p(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, oVar.getUri()).j("page_index", 0).d()).d();
                s81.a u2 = je.J("album-entity-view-track-list_row", i, z81.c()).o("consumerMobile:albumTrackRow", HubsComponentCategory.ROW.d()).z(z81.h().a(oVar.getName()).d(d2).build()).u(z81.f().b());
                p81.a p = z81.a().p(str, "metadata");
                if (oVar.isExplicit()) {
                    p = p.p("label", "explicit");
                }
                s81.a h = u2.c(p.d()).h(d("album-entity-view-track-list", i, ""));
                p81.a p2 = z81.a().p("uri", oVar.getUri()).p("preview_id", oVar.getPreviewId());
                if (oVar.isExplicit()) {
                    p2 = p2.b("explicit", true);
                }
                arrayList.add(h.j(p2.d()).f("rightAccessoryClick", z81.b().e("contextMenu").b("uri", oVar.getUri()).c()).g(b(header4.getUri(), d3, cVar)).l());
                i++;
                str = str;
            }
        } else {
            Context context = this.a;
            a header5 = cVar.getHeader();
            p81[] p81Arr = new p81[items.size()];
            for (int i2 = 0; i2 < items.size(); i2++) {
                o oVar2 = (o) items.get(i2);
                p81Arr[i2] = z81.a().p("trackName", oVar2.getName()).p("artistName", c(oVar2)).p("albumName", header5.g()).p("trackUri", oVar2.getUri()).p("trackImageUri", q.c(header5.e(), Covers.Size.NORMAL)).b("isExplicit", oVar2.isExplicit()).d();
            }
            p81 d4 = z81.a().p("title", header5.g()).p("uri", header5.getUri()).f("tracks", p81Arr).d();
            s81.a o = z81.c().s("album-entity-view-track-cloud").o(HubsGlue2TrackCloud.TRACK_CLOUD.id(), HubsComponentCategory.ROW.d());
            String string = context.getString(C0707R.string.ellipsis_and_more);
            p81[] p81Arr2 = new p81[items.size()];
            HashSet hashSet = new HashSet(items.size());
            int i3 = 0;
            while (i3 < items.size()) {
                o oVar3 = (o) items.get(i3);
                p81Arr2[i3] = z81.a().p("trackName", oVar3.getName()).p("artistName", c(oVar3)).d();
                hashSet.add(c(oVar3));
                i3++;
                items = items;
            }
            arrayList.add(o.c(z81.a().b("showArtists", hashSet.size() > 1).j("maxLines", 4).p("ellipsis", string).b("shuffle", true).f("tracks", p81Arr2).d()).f("click", z81.b().e("freetier:trackCloudShowAllSongs").a(d4).c()).h(d("album-entity-view-track-cloud", 0, "")).l());
        }
        return m.e(arrayList).h(z81.a().b("created-from-album-entity", true).d()).g();
    }
}
