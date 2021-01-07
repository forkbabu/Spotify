package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.HeartButton;
import com.spotify.music.carmode.nowplaying.common.view.NextButton;
import com.spotify.music.carmode.nowplaying.common.view.PreviousButton;
import com.spotify.music.carmode.nowplaying.common.view.voicebutton.CarModeVoiceSearchButton;
import com.spotify.music.carmode.nowplaying.common.view.voicebutton.c;
import com.spotify.music.carmode.nowplaying.feedback.view.LocalBanButton;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.nowplaying.ui.components.controls.next.f;
import com.spotify.nowplaying.ui.components.controls.previous.e;
import defpackage.cqd;

/* renamed from: vp2  reason: default package */
public class vp2 implements cqd.a {
    private final no2 a;
    private final e b;
    private final f c;
    private final g d;
    private final com.spotify.music.nowplaying.common.view.ban.e e;
    private final c f;
    private PreviousButton g;
    private NextButton h;
    private HeartButton i;
    private LocalBanButton j;
    private CarModeVoiceSearchButton k;

    public vp2(no2 no2, e eVar, f fVar, g gVar, com.spotify.music.nowplaying.common.view.ban.e eVar2, c cVar) {
        this.a = no2;
        this.b = eVar;
        this.c = fVar;
        this.d = gVar;
        this.e = eVar2;
        this.f = cVar;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_car_feedback_mode_player, viewGroup, false);
        this.a.c(inflate);
        this.g = (PreviousButton) inflate.findViewById(C0707R.id.previous_button);
        this.h = (NextButton) inflate.findViewById(C0707R.id.next_button);
        this.i = (HeartButton) inflate.findViewById(C0707R.id.heart_button);
        this.j = (LocalBanButton) inflate.findViewById(C0707R.id.local_ban_button);
        this.k = (CarModeVoiceSearchButton) inflate.findViewById(C0707R.id.voice_search_button);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.a.d();
        this.b.d(this.g);
        this.c.c(this.h);
        this.d.c(this.i);
        this.e.c(this.j);
        this.f.b(this.k);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.a.e();
        this.b.e();
        this.c.d();
        this.d.d();
        this.e.d();
        this.f.c();
    }
}
