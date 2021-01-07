package com.spotify.music.homecomponents.commands;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.music.homecomponents.dialogs.showmore.ShowMoreBottomSheetFragment;
import com.spotify.music.homecomponents.dialogs.showmore.a;
import kotlin.jvm.internal.h;

public final class b implements a71 {
    private final o a;

    public b(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        h.e(o81, "command");
        h.e(n61, "event");
        BottomSheetDialogFragment bottomSheetDialogFragment = null;
        a aVar = new a(null, null, null, 7);
        o oVar = this.a;
        h.e(aVar, "bottomSheetData");
        h.e(oVar, "fragmentManager");
        Fragment U = oVar.U("BottomSheetDialogFragment");
        if (U instanceof BottomSheetDialogFragment) {
            bottomSheetDialogFragment = U;
        }
        BottomSheetDialogFragment bottomSheetDialogFragment2 = bottomSheetDialogFragment;
        if (bottomSheetDialogFragment2 != null) {
            bottomSheetDialogFragment2.M4();
        }
        ShowMoreBottomSheetFragment showMoreBottomSheetFragment = new ShowMoreBottomSheetFragment();
        Bundle D2 = showMoreBottomSheetFragment.D2();
        if (D2 != null) {
            D2.putParcelable("BottomSheetDialogFragment.showMoreBottomSheetData", aVar);
        }
        showMoreBottomSheetFragment.Y4(oVar, "BottomSheetDialogFragment");
    }
}
