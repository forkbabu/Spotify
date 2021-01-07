package com.spotify.music.carmode.nowplaying.common.view.optout.sheet;

import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.optout.sheet.g;
import com.spotify.music.libs.carmodeengine.util.t;
import com.spotify.music.libs.carmodeengine.util.y;

public class f implements g.a {
    private g a;
    private final so2 b;
    private final k5a c;
    private final y d;
    private final t e;

    public f(k5a k5a, so2 so2, y yVar, t tVar) {
        this.c = k5a;
        this.b = so2;
        this.d = yVar;
        this.e = tVar;
    }

    public void a() {
        ((CarModeOptOutBottomSheetDialogFragment) this.a).M4();
    }

    public void b() {
        this.c.d();
        this.e.b();
        this.b.a();
    }

    public void c(g gVar) {
        this.a = gVar;
        CarModeOptOutBottomSheetDialogFragment carModeOptOutBottomSheetDialogFragment = (CarModeOptOutBottomSheetDialogFragment) gVar;
        carModeOptOutBottomSheetDialogFragment.d5(this);
        carModeOptOutBottomSheetDialogFragment.e5(this.d.c().d().booleanValue() ? C0707R.string.car_mode_npv_opt_out_us_en_title : C0707R.string.car_mode_npv_opt_out_global_title);
    }
}
