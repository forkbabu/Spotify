package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.voicebutton.CarModeVoiceSearchButton;
import com.spotify.music.carmode.nowplaying.common.view.voicebutton.c;
import com.spotify.music.carmode.nowplaying.podcast.view.SeekBackwardButton;
import com.spotify.music.carmode.nowplaying.podcast.view.SeekForwardButton;
import com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.PlaybackSpeedButton;
import com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;
import defpackage.cqd;

/* renamed from: kq2  reason: default package */
public class kq2 implements cqd.a {
    private final no2 a;
    private final h b;
    private final g c;
    private final c d;
    private final d e;
    private SeekBackwardButton f;
    private SeekForwardButton g;
    private CarModeVoiceSearchButton h;
    private PlaybackSpeedButton i;

    public kq2(no2 no2, h hVar, g gVar, c cVar, d dVar) {
        this.a = no2;
        this.b = hVar;
        this.c = gVar;
        this.d = cVar;
        this.e = dVar;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_car_podcast_mode_player, viewGroup, false);
        this.a.c(inflate);
        this.f = (SeekBackwardButton) q4.G(inflate, C0707R.id.seek_backward_button);
        this.g = (SeekForwardButton) q4.G(inflate, C0707R.id.seek_forward_button);
        this.h = (CarModeVoiceSearchButton) q4.G(inflate, C0707R.id.voice_search_button);
        this.i = (PlaybackSpeedButton) q4.G(inflate, C0707R.id.playback_speed_button);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.a.d();
        this.b.d(this.f);
        this.c.d(this.g);
        this.d.b(this.h);
        this.e.d(this.i);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.a.e();
        this.b.e();
        this.c.e();
        this.d.c();
        this.e.e();
    }
}
