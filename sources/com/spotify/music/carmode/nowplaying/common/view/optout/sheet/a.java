package com.spotify.music.carmode.nowplaying.common.view.optout.sheet;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final /* synthetic */ class a implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public /* synthetic */ a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i = CarModeOptOutBottomSheetDialogFragment.y0;
        bottomSheetBehavior.x(3);
    }
}
