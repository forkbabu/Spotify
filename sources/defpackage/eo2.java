package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.NextButton;
import com.spotify.music.carmode.nowplaying.common.view.PreviousButton;
import com.spotify.music.nowplaying.ads.view.nextbutton.c;
import defpackage.cqd;

/* renamed from: eo2  reason: default package */
public class eo2 implements cqd.a {
    private final no2 a;
    private final c b;
    private PreviousButton c;
    private NextButton d;

    public eo2(no2 no2, c cVar) {
        this.a = no2;
        this.b = cVar;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_car_ads_mode_player, viewGroup, false);
        this.a.c(inflate);
        this.c = (PreviousButton) inflate.findViewById(C0707R.id.previous_button);
        this.d = (NextButton) inflate.findViewById(C0707R.id.next_button);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.a.d();
        this.c.setEnabled(false);
        this.b.e(this.d);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.a.e();
        this.b.f();
    }
}
