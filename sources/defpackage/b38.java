package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

/* renamed from: b38  reason: default package */
public abstract class b38 {
    private final PlayerStateCompat a;
    private final int b;
    private final int c;
    private boolean d;
    private LegacyPlayerState e;
    private final Player.PlayerStateObserver f = new a();

    /* renamed from: b38$a */
    class a implements Player.PlayerStateObserver {
        a() {
        }

        @Override // com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
        public void onPlayerStateReceived(LegacyPlayerState legacyPlayerState) {
            if (b38.this.e != null) {
                b38 b38 = b38.this;
                if (!b38.f(b38.e, legacyPlayerState)) {
                    return;
                }
            }
            b38.this.g(legacyPlayerState);
            b38.this.e = legacyPlayerState;
        }
    }

    protected b38(PlayerStateCompat playerStateCompat) {
        this.a = playerStateCompat;
        this.b = 0;
        this.c = 0;
    }

    protected static boolean e(LegacyPlayerState legacyPlayerState, LegacyPlayerState legacyPlayerState2) {
        return !rw.equal(legacyPlayerState.entityUri(), legacyPlayerState2.entityUri());
    }

    public void c() {
        if (!this.d) {
            this.d = true;
            this.a.subscribe(this.f, this.b, this.c);
        }
    }

    public void d() {
        if (this.d) {
            this.d = false;
            this.a.unsubscribe(this.f);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean f(LegacyPlayerState legacyPlayerState, LegacyPlayerState legacyPlayerState2);

    /* access modifiers changed from: protected */
    public abstract void g(LegacyPlayerState legacyPlayerState);

    protected b38(PlayerStateCompat playerStateCompat, int i, int i2) {
        this.a = playerStateCompat;
        this.b = i;
        this.c = i2;
    }
}
