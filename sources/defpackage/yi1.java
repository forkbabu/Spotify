package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import com.spotify.remoteconfig.x4;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: yi1  reason: default package */
public class yi1 implements qh1 {
    private final p a;
    private final PlaylistMetadataDecorationPolicy b;
    private final FolderMetadataDecorationPolicy c;
    private final x4 d;
    private final o e;
    private final Context f;
    private final s<String> g;

    public yi1(Context context, p pVar, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, x4 x4Var, o oVar, s<String> sVar) {
        this.f = context;
        this.a = pVar;
        this.b = playlistMetadataDecorationPolicy;
        this.c = folderMetadataDecorationPolicy;
        this.e = oVar;
        this.g = sVar;
        this.d = x4Var;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        Optional<String> optional;
        String str = map.get("type");
        if (str == null) {
            return z.q(new IllegalStateException());
        }
        boolean equals = str.equals("premium");
        RootlistRequestPayload.a builder = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder2 = FolderRequestPolicy.builder();
        builder2.c(this.b);
        builder2.b(this.c);
        builder.b(builder2.a());
        RootlistRequestPayload a2 = builder.a();
        if (browserParams.h().contains(":folder:")) {
            optional = Optional.fromNullable(l0.z(browserParams.h()).g());
        } else {
            optional = Optional.absent();
        }
        p.a.C0375a b2 = p.a.b();
        b2.e(a2);
        b2.a(browserParams.n() ? null : Boolean.TRUE);
        return s.n(this.a.b(optional, b2.b()).P(), this.g, new og1(this, browserParams, equals, optional)).N0(1).B0();
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    public List c(BrowserParams browserParams, boolean z, Optional optional, f fVar, String str) {
        boolean z2 = !optional.isPresent();
        ArrayList arrayList = new ArrayList(fVar.getItems().size());
        if (z2) {
            Context context = this.f;
            boolean z3 = browserParams.l() && this.d.a() && z;
            String B = l0.a(str).B();
            if (TextUtils.isEmpty(B)) {
                B = "spotify:collection:tracks";
            }
            a aVar = new a();
            aVar.f(1);
            Bundle b2 = aVar.b();
            b bVar = new b(B);
            bVar.c(z3 ? MediaBrowserItem.ActionType.BROWSABLE : MediaBrowserItem.ActionType.PLAYABLE);
            bVar.j(Uri.parse("https://misc.scdn.co/liked-songs/liked-songs-300.png"));
            bVar.r(context.getString(C0707R.string.collection_liked_songs_title));
            bVar.i(b2);
            arrayList.add(bVar.a());
        }
        for (j jVar : fVar.getItems()) {
            if (!jVar.s()) {
                arrayList.add(this.e.h(jVar, browserParams.l() && this.d.a() && (z || (jVar.v() != null && jVar.v().booleanValue())), PlayOriginReferrer.LIBRARY));
            } else if (jVar.e() != null) {
                arrayList.add(this.e.f(jVar.e()));
            }
        }
        return arrayList;
    }
}
