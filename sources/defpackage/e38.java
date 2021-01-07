package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.libs.glue.custom.playbutton.d;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

/* renamed from: e38  reason: default package */
public abstract class e38 {
    public static final SpotifyIconV2 p = SpotifyIconV2.PLAY;
    public static final SpotifyIconV2 q = SpotifyIconV2.PAUSE;
    private final nfd a;
    private final Player b;
    private View c;
    private c d;
    private Button e;
    private final Context f;
    private final int g;
    private final int h;
    private final SpotifyIconV2 i;
    private final SpotifyIconV2 j;
    private final ViewGroup k;
    private final b38 l;
    private String m;
    private final View.OnClickListener n = new a();
    private boolean o;

    /* renamed from: e38$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e38 e38 = e38.this;
            if (!e38.r(e38.m)) {
                e38 e382 = e38.this;
                e382.v(e382.a);
            } else if (e38.this.o) {
                e38.this.b.resume();
            } else {
                e38.this.b.pause();
            }
        }
    }

    /* renamed from: e38$b */
    class b extends b38 {
        b(PlayerStateCompat playerStateCompat) {
            super(playerStateCompat);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public boolean f(LegacyPlayerState legacyPlayerState, LegacyPlayerState legacyPlayerState2) {
            if (b38.e(legacyPlayerState, legacyPlayerState2)) {
                return true;
            }
            if (legacyPlayerState.isPaused() != legacyPlayerState2.isPaused()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public void g(LegacyPlayerState legacyPlayerState) {
            e38.this.o = legacyPlayerState.isPaused();
            e38.this.m = legacyPlayerState.entityUri();
            e38.this.q();
        }
    }

    public e38(Context context, com.spotify.music.libs.viewuri.c cVar, ViewGroup viewGroup, int i2, int i3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, Player player, PlayerStateCompat playerStateCompat, nfd nfd, boolean z) {
        cVar.getClass();
        context.getClass();
        this.f = context;
        this.g = i2;
        this.h = i3;
        this.a = nfd;
        player.getClass();
        this.b = player;
        this.k = viewGroup;
        this.i = spotifyIconV2;
        this.j = spotifyIconV22;
        this.l = new b(playerStateCompat);
        if (z) {
            c a2 = new d().a(context);
            this.d = a2;
            a2.b(false);
        }
    }

    public void g() {
        this.l.c();
    }

    /* access modifiers changed from: protected */
    public View h() {
        c cVar = this.d;
        if (cVar != null) {
            return cVar.getView();
        }
        return x42.a(this.f, this.k, this.i, this.g);
    }

    public void i() {
        this.l.d();
    }

    /* access modifiers changed from: protected */
    public final View.OnClickListener j() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final Context k() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final SpotifyIconV2 l() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final int m() {
        return this.h;
    }

    public final View n(boolean z) {
        if (this.c == null || z) {
            View h2 = h();
            this.c = h2;
            if (this.d == null) {
                this.e = (Button) h2;
            }
            q();
            if (this.m == null) {
                this.c.setVisibility(4);
            }
            s();
        }
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final SpotifyIconV2 o() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public final int p() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void q() {
        if (this.c != null) {
            if (!r(this.m)) {
                u();
            } else if (this.o) {
                u();
            } else {
                t();
            }
            if (this.c.getVisibility() != 0) {
                bd0.e(this.c);
            }
            if (this.c.getParent() != null) {
                this.c.getParent().requestLayout();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean r(String str);

    /* access modifiers changed from: protected */
    public void s() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.setOnClickListener(this.n);
            return;
        }
        Button button = this.e;
        if (button != null) {
            button.setOnClickListener(this.n);
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(false);
            return;
        }
        Button button = this.e;
        if (button != null) {
            Context context = this.f;
            x42.b(context, button, this.j, context.getString(this.h));
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.b(false);
            return;
        }
        Button button = this.e;
        if (button != null) {
            Context context = this.f;
            x42.b(context, button, this.i, context.getString(this.g));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void v(nfd nfd);
}
