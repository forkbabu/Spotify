package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.x;
import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.PlaybackSpeedMenuDialog;

/* renamed from: dq2  reason: default package */
public class dq2 implements nq2 {
    private final c a;

    public dq2(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.nq2
    public void a(int i) {
        int i2 = PlaybackSpeedMenuDialog.x0;
        Bundle bundle = new Bundle();
        bundle.putInt("background_color", i);
        PlaybackSpeedMenuDialog playbackSpeedMenuDialog = new PlaybackSpeedMenuDialog();
        playbackSpeedMenuDialog.r4(bundle);
        c cVar = this.a;
        cVar.getClass();
        x i3 = cVar.v0().i();
        i3.d(playbackSpeedMenuDialog, "PlaybackSpeedMenuDialog");
        i3.i();
    }
}
