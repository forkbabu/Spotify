package defpackage;

import android.widget.CompoundButton;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: jw7  reason: default package */
public final /* synthetic */ class jw7 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ nw7 a;
    public final /* synthetic */ PlayerTrack b;
    public final /* synthetic */ sx7 c;

    public /* synthetic */ jw7(nw7 nw7, PlayerTrack playerTrack, sx7 sx7) {
        this.a = nw7;
        this.b = playerTrack;
        this.c = sx7;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.g(this.b, this.c, compoundButton, z);
    }
}
