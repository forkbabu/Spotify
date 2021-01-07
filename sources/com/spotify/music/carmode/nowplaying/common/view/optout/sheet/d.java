package com.spotify.music.carmode.nowplaying.common.view.optout.sheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

class d extends BottomSheetBehavior.d {
    final /* synthetic */ BottomSheetBehavior a;

    d(CarModeOptOutBottomSheetDialogFragment carModeOptOutBottomSheetDialogFragment, BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void a(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void b(View view, int i) {
        if (i == 4) {
            this.a.x(5);
        }
    }
}
