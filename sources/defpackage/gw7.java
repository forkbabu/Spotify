package defpackage;

import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: gw7  reason: default package */
public final /* synthetic */ class gw7 implements View.OnClickListener {
    public final /* synthetic */ kw7 a;
    public final /* synthetic */ PlayerTrack b;

    public /* synthetic */ gw7(kw7 kw7, PlayerTrack playerTrack) {
        this.a = kw7;
        this.b = playerTrack;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, view);
    }
}
