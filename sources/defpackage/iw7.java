package defpackage;

import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: iw7  reason: default package */
public final /* synthetic */ class iw7 implements View.OnClickListener {
    public final /* synthetic */ nw7 a;
    public final /* synthetic */ PlayerTrack b;

    public /* synthetic */ iw7(nw7 nw7, PlayerTrack playerTrack) {
        this.a = nw7;
        this.b = playerTrack;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.f(this.b, view);
    }
}
