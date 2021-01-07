package com.spotify.music.features.yourlibrary.musicpages.follow;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.follow.j;
import com.spotify.music.follow.resolver.f;
import io.reactivex.disposables.a;
import io.reactivex.y;

public class FollowCompanion implements m {
    private final f a;
    private final com.spotify.music.follow.m b;
    private final y c;
    private final a f = new a();

    public FollowCompanion(f fVar, com.spotify.music.follow.m mVar, y yVar, n nVar) {
        this.a = fVar;
        this.b = mVar;
        this.c = yVar;
        nVar.A().a(this);
    }

    public /* synthetic */ void a(boolean z, String str, j jVar) {
        this.b.g(jVar);
        if (jVar.g() != z) {
            this.b.e(str, z);
        }
    }

    public void b(String str, boolean z) {
        this.f.b(this.a.a(str).N0(1).o0(this.c).subscribe(new b(this, z, str), a.a));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.f.f();
    }
}
