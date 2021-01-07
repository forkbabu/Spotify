package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.b2;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import com.spotify.player.model.PlayOrigin;
import com.spotify.remoteconfig.aj;
import defpackage.yda;
import kotlin.jvm.internal.h;

/* renamed from: s34  reason: default package */
public final class s34 implements u1 {
    private static final PlayOrigin i;
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final b2 f;
    private final pea g;
    private final aj h;

    static {
        ifd ifd = kfd.l;
        h.d(ifd, "FeatureIdentifiers.AVRCP");
        PlayOrigin.Builder builder = PlayOrigin.builder(ifd.getName());
        yn0 yn0 = bu9.c;
        h.d(yn0, "InternalReferrers.AVRCP");
        i = builder.referrerIdentifier(yn0.getName()).build();
    }

    public s34(Context context, k2 k2Var, d3 d3Var, b2 b2Var, pea pea, aj ajVar) {
        h.e(context, "mContext");
        h.e(k2Var, "mSearchResultResolverFactory");
        h.e(d3Var, "mItemFactory");
        h.e(b2Var, "mCallbackHandlerFactory");
        h.e(pea, "mRemoteActionsLogger");
        h.e(ajVar, "mProperties");
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = b2Var;
        this.g = pea;
        this.h = ajVar;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        h.e(str, "packageName");
        h.e(v1Var, "mediaServiceBinder");
        h.e(rootHintsParams, "rootHintsParams");
        yda c2 = c(str);
        return new r1(s1.a(str, "spotify_media_browser_root_avrcp"), str, this.c, v1Var, v1Var.Z1(c2), this.f.b(v1Var, i), new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_avrcp";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        h.e(str, "packageName");
        yda.b bVar = new yda.b("avrcp");
        bVar.r(str);
        bVar.l("unknown");
        bVar.q("media_session");
        bVar.s("bluetooth");
        yda k = bVar.k();
        h.d(k, "ExternalAccessoryDescrip…_BT)\n            .build()");
        return k;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        ImmutableSet immutableSet;
        h.e(str, "packageName");
        if (this.h.a()) {
            immutableSet = ImmutableSet.of("com.android.bluetooth");
            h.d(immutableSet, "ImmutableSet.of(AVRCP_PACKAGE_NAME)");
        } else {
            immutableSet = ImmutableSet.of();
            h.d(immutableSet, "ImmutableSet.of()");
        }
        return immutableSet.contains(str);
    }
}
