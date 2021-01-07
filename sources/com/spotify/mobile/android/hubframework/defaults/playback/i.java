package com.spotify.mobile.android.hubframework.defaults.playback;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.defaults.l;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class i implements l.a {
    private final g<PlayerState> a;
    private final y b;
    private final Set<h61> c = new HashSet();
    private b d = EmptyDisposable.INSTANCE;
    protected PlayerState e;

    public i(g<PlayerState> gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.l.a
    @Deprecated
    public boolean a(s81 s81) {
        String str;
        PlayerState playerState = this.e;
        a91 target = s81.target();
        if (target != null) {
            str = target.uri();
        } else {
            o81 o81 = (o81) s81.events().get("click");
            str = o81 != null ? o81.data().string("uri") : null;
        }
        if (playerState == null || str == null) {
            return false;
        }
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 237 || ordinal == 273) {
            return TextUtils.equals(str, playerState.track().transform(b.a).orNull());
        }
        return TextUtils.equals(playerState.contextUri(), str);
    }

    @Deprecated
    public void b(h61 h61) {
        Set<h61> set = this.c;
        h61.getClass();
        set.add(h61);
    }

    @Deprecated
    public void c(b61 b61) {
        b(b61.e());
        b(b61.g());
        b(b61.h());
    }

    public /* synthetic */ void d(PlayerState playerState) {
        this.e = playerState;
        for (h61 h61 : this.c) {
            h61.a();
        }
    }

    @Deprecated
    public void e(h61 h61) {
        Set<h61> set = this.c;
        h61.getClass();
        set.remove(h61);
    }

    @Deprecated
    public void f(b61 b61) {
        e(b61.e());
        e(b61.g());
        e(b61.h());
    }

    @Deprecated
    public void g() {
        if (this.d.d()) {
            this.d = this.a.u(e.a).Q(this.b).subscribe(new d(this));
        }
    }

    @Deprecated
    public void h() {
        this.d.dispose();
    }
}
