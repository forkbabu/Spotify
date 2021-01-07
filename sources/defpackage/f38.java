package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

/* renamed from: f38  reason: default package */
public class f38 extends d38 {
    private RadioStationModel A;
    private String B;
    private final c x;
    private final ifd y;
    private final yn0 z;

    public f38(Context context, c cVar, ViewGroup viewGroup, int i, int i2, boolean z2, ifd ifd, yn0 yn0, Player player, PlayerStateCompat playerStateCompat, nfd nfd, boolean z3) {
        super(context, cVar, viewGroup, i, i2, e38.p, e38.q, d38.v, d38.w, C0707R.string.actionbar_item_start_radio, C0707R.id.actionbar_item_start_radio, z2, player, playerStateCompat, nfd, z3);
        this.x = cVar;
        this.y = ifd;
        this.z = yn0;
    }

    @Override // defpackage.e38
    public boolean r(String str) {
        String str2 = this.B;
        return str2 != null && rw.equal(str2, str);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.e38
    public void v(nfd nfd) {
        RadioStationModel radioStationModel = this.A;
        if (radioStationModel != null && this.B != null) {
            nfd.a(radioStationModel, this.x, this.y, this.z);
        }
    }

    public void x(RadioStationModel radioStationModel) {
        this.A = radioStationModel;
        String[] strArr = radioStationModel.seeds;
        this.B = (strArr == null || strArr.length <= 0) ? null : agd.c(strArr[0]);
        q();
    }
}
