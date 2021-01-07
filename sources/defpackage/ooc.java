package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.s;

/* renamed from: ooc  reason: default package */
public class ooc implements z3<Integer> {
    private final SpeedControlInteractor b;

    public ooc(SpeedControlInteractor speedControlInteractor) {
        this.b = speedControlInteractor;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<Integer>> a(y3<Integer> y3Var) {
        return this.b.a().j0(new eoc(y3Var));
    }
}
