package com.spotify.music.filterandsort.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.C0707R;

public final /* synthetic */ class c implements DialogInterface.OnShowListener {
    public final /* synthetic */ FilterAndSortBottomSheetFragment a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ c(FilterAndSortBottomSheetFragment filterAndSortBottomSheetFragment, Dialog dialog) {
        this.a = filterAndSortBottomSheetFragment;
        this.b = dialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        FilterAndSortBottomSheetFragment filterAndSortBottomSheetFragment = this.a;
        Dialog dialog = this.b;
        if (filterAndSortBottomSheetFragment.j4().getResources().getConfiguration().orientation == 2) {
            BottomSheetBehavior o = BottomSheetBehavior.o((FrameLayout) dialog.findViewById(C0707R.id.design_bottom_sheet));
            o.x(3);
            o.w(true);
        }
    }
}
