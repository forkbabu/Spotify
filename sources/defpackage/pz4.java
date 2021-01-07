package defpackage;

import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageEpisodesResponse;
import defpackage.hz4;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: pz4  reason: default package */
public final class pz4 {
    public static final w<hz4, iz4> a(nmf<? super sy4, f> nmf, qz4 qz4, dz4 dz4) {
        h.e(nmf, "addPodcastAction");
        h.e(qz4, "podcastEpisodesEndpoint");
        h.e(dz4, "entitySelectorLogger");
        m f = i.f();
        z<EntitySelector$CarePackageEpisodesResponse> a = qz4.a();
        h.e(a, "podcastEpisodesResponse");
        f.h(hz4.b.class, new nz4(a));
        f.d(hz4.a.class, new oz4(dz4, nmf));
        return f.i();
    }
}
