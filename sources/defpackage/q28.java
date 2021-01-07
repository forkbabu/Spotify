package defpackage;

import android.app.Activity;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/* renamed from: q28  reason: default package */
public class q28 {
    private final String a;
    private final c b;
    private final p28 c;
    private final Random d;
    private final b38 e;

    /* renamed from: q28$a */
    class a extends b38 {
        a(PlayerStateCompat playerStateCompat, int i, int i2) {
            super(playerStateCompat, i, i2);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public boolean f(LegacyPlayerState legacyPlayerState, LegacyPlayerState legacyPlayerState2) {
            if (!b38.e(legacyPlayerState, legacyPlayerState2) && !(!rw.equal(legacyPlayerState.track(), legacyPlayerState2.track()))) {
                if (!((legacyPlayerState.reverse().length == legacyPlayerState2.reverse().length && legacyPlayerState.future().length == legacyPlayerState2.future().length) ? false : true)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public void g(LegacyPlayerState legacyPlayerState) {
            if (legacyPlayerState.entityUri().equals(agd.c(q28.this.a))) {
                q28.this.j(legacyPlayerState.track(), legacyPlayerState.reverse(), legacyPlayerState.future());
                q28.this.c.d(legacyPlayerState.track());
            }
        }
    }

    public q28(Activity activity, String str, com.spotify.music.libs.viewuri.c cVar, c cVar2, b42 b42, PlayerStateCompat playerStateCompat, long j) {
        this.a = str;
        this.b = cVar2;
        this.c = new p28(activity, cVar, cVar2, b42);
        this.d = new Random(j);
        this.e = new a(playerStateCompat, 10, 39);
    }

    private static PlayerTrack[] f(PlayerTrack... playerTrackArr) {
        for (PlayerTrack playerTrack : playerTrackArr) {
            if (i(playerTrack).booleanValue() || Boolean.valueOf(playerTrack.metadata().containsKey("is_queued")).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                for (PlayerTrack playerTrack2 : playerTrackArr) {
                    if (!i(playerTrack2).booleanValue() && !Boolean.valueOf(playerTrack2.metadata().containsKey("is_queued")).booleanValue()) {
                        arrayList.add(playerTrack2);
                    }
                }
                return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
            }
        }
        return playerTrackArr;
    }

    private static Boolean i(PlayerTrack playerTrack) {
        return Boolean.valueOf(MoreObjects.isNullOrEmpty(playerTrack.metadata().get("title")));
    }

    public void c(PlayerTrack[] playerTrackArr) {
        if (!z42.C(this.b)) {
            PlayerTrack[] playerTrackArr2 = new PlayerTrack[playerTrackArr.length];
            System.arraycopy(playerTrackArr, 0, playerTrackArr2, 0, playerTrackArr.length);
            Collections.shuffle(Arrays.asList(playerTrackArr2), this.d);
            this.c.addAll(playerTrackArr2);
            return;
        }
        this.c.addAll(playerTrackArr);
    }

    public void d() {
        this.e.c();
    }

    public void e() {
        this.e.d();
    }

    public PlayerTrack[] g() {
        PlayerTrack[] playerTrackArr = new PlayerTrack[this.c.getCount()];
        for (int i = 0; i < this.c.getCount(); i++) {
            playerTrackArr[i] = (PlayerTrack) this.c.getItem(i);
        }
        return playerTrackArr;
    }

    public p28 h() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void j(PlayerTrack playerTrack, PlayerTrack[] playerTrackArr, PlayerTrack[] playerTrackArr2) {
        if (!PlayerTrackUtil.isAd(playerTrack)) {
            if (playerTrack == null || f(playerTrack).length == 0) {
                Logger.n("Current track does not have any data. Discarding PlayerState event.", new Object[0]);
                return;
            }
            PlayerTrack[] f = f(playerTrackArr);
            PlayerTrack[] f2 = f(playerTrackArr2);
            if (z42.C(this.b)) {
                this.c.clear();
                PlayerTrack[] playerTrackArr3 = new PlayerTrack[(f.length + f2.length + 1)];
                System.arraycopy(f, 0, playerTrackArr3, 0, f.length);
                playerTrackArr3[f.length] = playerTrack;
                System.arraycopy(f2, 0, playerTrackArr3, f.length + 1, f2.length);
                c(playerTrackArr3);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(playerTrack.uid(), playerTrack);
            for (PlayerTrack playerTrack2 : f) {
                hashMap.put(playerTrack2.uid(), playerTrack2);
            }
            for (PlayerTrack playerTrack3 : f2) {
                hashMap.put(playerTrack3.uid(), playerTrack3);
            }
            for (int count = this.c.getCount() - 1; count >= 0; count--) {
                PlayerTrack playerTrack4 = (PlayerTrack) this.c.getItem(count);
                if (hashMap.containsKey(playerTrack4.uid())) {
                    hashMap.remove(playerTrack4.uid());
                } else {
                    this.c.remove(playerTrack4);
                }
            }
            for (PlayerTrack playerTrack5 : hashMap.values()) {
                p28 p28 = this.c;
                p28.insert(playerTrack5, this.d.nextInt(p28.getCount() + 1));
            }
        }
    }
}
