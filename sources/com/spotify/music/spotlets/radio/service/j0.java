package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Arrays;

public class j0 {
    private RadioStationModel a = null;
    private n0 b = new n0(new RadioStationTracksModel(new PlayerTrack[0], ""), ViewUris.c);
    private String c;
    private PlayerTrack d = null;
    private boolean e = false;

    public ThumbState a() {
        String str;
        n0 n0Var = this.b;
        PlayerTrack playerTrack = this.d;
        if (playerTrack == null) {
            str = "";
        } else {
            str = playerTrack.uri();
        }
        return n0Var.a(str);
    }

    public boolean b() {
        return agd.i(this.c);
    }

    public boolean c() {
        RadioStationModel radioStationModel;
        return b() && ((radioStationModel = this.a) == null || !radioStationModel.isMyContext(this.c));
    }

    public boolean d() {
        return b() && this.e;
    }

    /* access modifiers changed from: package-private */
    public boolean e(String str, PlayerTrack playerTrack, int i) {
        String str2;
        boolean z = !rw.equal(str, this.c);
        String str3 = "";
        if (playerTrack == null) {
            str2 = str3;
        } else {
            str2 = playerTrack.uid();
        }
        PlayerTrack playerTrack2 = this.d;
        if (playerTrack2 != null) {
            str3 = playerTrack2.uid();
        }
        boolean z2 = z | (!rw.equal(str2, str3));
        this.c = str;
        this.d = playerTrack;
        if (z2) {
            this.b.b(playerTrack, i);
        }
        return z2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (rw.equal(this.a, j0Var.a) && rw.equal(this.d, j0Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f(RadioStationModel radioStationModel, n0 n0Var) {
        this.a = radioStationModel;
        this.b = n0Var;
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        this.e = z;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0014: APUT  (r0v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r1v2 java.lang.String) */
    public int hashCode() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = this.a;
        PlayerTrack playerTrack = this.d;
        if (playerTrack == null) {
            str = "";
        } else {
            str = playerTrack.uri();
        }
        objArr[1] = str;
        objArr[2] = Boolean.FALSE;
        return Arrays.hashCode(objArr);
    }
}
