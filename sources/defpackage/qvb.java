package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.ban.DrivingBanButton;
import com.spotify.music.nowplaying.drivingmode.view.shuffle.DrivingShuffleButton;

/* renamed from: qvb  reason: default package */
public class qvb implements rvb {
    private final DrivingShuffleButton a;
    private final DrivingBanButton b;

    public qvb(DrivingShuffleButton drivingShuffleButton, DrivingBanButton drivingBanButton) {
        this.a = drivingShuffleButton;
        this.b = drivingBanButton;
    }

    @Override // defpackage.rvb
    public void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }

    @Override // defpackage.rvb
    public void b() {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }
}
