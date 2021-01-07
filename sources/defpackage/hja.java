package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Base64;
import androidx.media.b;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.a2;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.j2;
import com.spotify.music.libs.mediabrowserservice.p;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediasession.i0;
import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.functions.g;
import java.util.List;
import java.util.Set;

/* renamed from: hja  reason: default package */
public class hja extends r1 {
    private boolean q;

    public hja(String str, String str2, Context context, v1 v1Var, t2 t2Var, a2 a2Var, i0 i0Var, Set<Long> set, RootHintsParams rootHintsParams, j2 j2Var, d3 d3Var, yda yda, pea pea, asd asd, boolean z) {
        super(str, str2, context, v1Var, t2Var, a2Var, i0Var, set, rootHintsParams, j2Var, d3Var, yda, pea, z);
        this.a.b(asd.a().subscribe(new gja(this)));
    }

    public static void l(hja hja, AndroidDenylist androidDenylist) {
        hja.q = androidDenylist.packageNames().contains(Base64.encodeToString(bqd.a(hja.g.getBytes()), 2));
    }

    @Override // com.spotify.music.libs.mediabrowserservice.r1, com.spotify.music.libs.mediabrowserservice.n2
    public final void b(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        if (this.q) {
            e().x();
            String d = s1.d(str);
            if (this.o) {
                this.a.b(this.n.q(this.m, d).subscribe());
            }
            jVar.g(null);
            Logger.d("Failed to load children, package name is denied.", new Object[0]);
            return;
        }
        super.b(str, bundle, jVar);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.r1, com.spotify.music.libs.mediabrowserservice.n2
    public Set<Long> d() {
        return this.q ? ImmutableSet.of() : super.d();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.r1, com.spotify.music.libs.mediabrowserservice.n2
    public void f(String str, Bundle bundle, g<List<MediaBrowserCompat.MediaItem>> gVar) {
        if (this.q) {
            try {
                ((p) gVar).accept(null);
            } catch (Exception e) {
                Logger.d("Could not return value through callback, %s", e.getMessage());
            }
        } else {
            super.f(str, bundle, gVar);
        }
    }

    @Override // com.spotify.music.libs.mediabrowserservice.r1, com.spotify.music.libs.mediabrowserservice.n2
    public boolean h() {
        return !this.q;
    }
}
