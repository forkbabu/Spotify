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
import com.spotify.music.carmode.nowplaying.def.view.ShuffleButton;
import com.spotify.music.carmode.nowplaying.def.view.repeat.CarModeRepeatButton;
import com.spotify.music.carmode.nowplaying.def.view.repeat.b;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.nowplaying.ui.components.controls.next.f;
import com.spotify.nowplaying.ui.components.controls.previous.e;
import com.spotify.nowplaying.ui.components.shuffle.d;
import defpackage.cqd;

/* renamed from: hp2  reason: default package */
public class hp2 implements cqd.a {
    private final no2 a;
    private final e b;
    private final f c;
    private final d d;
    private final g e;
    private final c f;
    private final b g;
    private PreviousButton h;
    private NextButton i;
    private ShuffleButton j;
    private HeartButton k;
    private CarModeVoiceSearchButton l;
    private CarModeRepeatButton m;

    public hp2(no2 no2, e eVar, f fVar, d dVar, g gVar, c cVar, b bVar) {
        this.a = no2;
        this.b = eVar;
        this.c = fVar;
        this.d = dVar;
        this.e = gVar;
        this.f = cVar;
        this.g = bVar;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_car_default_mode_player, viewGroup, false);
        this.a.c(inflate);
        this.h = (PreviousButton) inflate.findViewById(C0707R.id.previous_button);
        this.i = (NextButton) inflate.findViewById(C0707R.id.next_button);
        this.j = (ShuffleButton) inflate.findViewById(C0707R.id.shuffle_button);
        this.k = (HeartButton) inflate.findViewById(C0707R.id.heart_button);
        this.l = (CarModeVoiceSearchButton) inflate.findViewById(C0707R.id.voice_search_button);
        this.m = (CarModeRepeatButton) inflate.findViewById(C0707R.id.repeat_button);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.a.d();
        this.b.d(this.h);
        this.c.c(this.i);
        this.d.c(this.j);
        this.e.c(this.k);
        this.f.b(this.l);
        this.g.d(this.m);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.a.e();
        this.b.e();
        this.c.d();
        this.d.d();
        this.e.d();
        this.f.c();
        this.g.a();
    }
}
