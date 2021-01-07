package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.u2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.a2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.p;
import com.spotify.music.libs.mediabrowserservice.u1;
import com.spotify.music.libs.mediasession.i0;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: ska  reason: default package */
public class ska implements n2 {
    private static final List<MediaBrowserCompat.MediaItem> j = Collections.emptyList();
    private final a a = new a();
    private final v1 b;
    private final t2 c;
    private final i0 d;
    private final a2 e;
    private final String f;
    private final String g;
    private final b h;
    private boolean i;

    public ska(String str, String str2, Context context, v1 v1Var, t2 t2Var, a2 a2Var, i0 i0Var, oka oka) {
        Logger.b("MediaBrowserServiceSession created for %s", str);
        this.g = str;
        this.f = str2;
        this.b = v1Var;
        this.d = i0Var;
        this.c = t2Var;
        ((u2) t2Var).d();
        this.e = a2Var;
        this.h = oka.a().subscribe(new nka(this));
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public boolean a() {
        return false;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public void b(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        jVar.g(j);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public String c() {
        return this.g;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public Set<Long> d() {
        return this.i ? u1.a : ImmutableSet.of();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public void destroy() {
        Logger.b("MediaBrowserServiceSession %s is destroyed", this.f);
        this.a.f();
        ((u2) this.c).a();
        if (!this.h.d()) {
            this.h.dispose();
        }
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public a2 e() {
        return this.e;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public void f(String str, Bundle bundle, g<List<MediaBrowserCompat.MediaItem>> gVar) {
        try {
            ((p) gVar).accept(null);
        } catch (Exception e2) {
            Logger.d("Could not return value through callback, %s", e2.getMessage());
        }
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public i0 g() {
        return this.d;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public boolean h() {
        return this.i;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public String i() {
        return this.f;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public v1 j() {
        return this.b;
    }

    public /* synthetic */ void k(Boolean bool) {
        this.i = bool.booleanValue();
    }
}
