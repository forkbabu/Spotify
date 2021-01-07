package com.spotify.music.features.yourlibraryx.effecthandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.features.yourlibraryx.bottomsheet.YourLibraryXSortBottomSheetFragment;
import com.spotify.music.features.yourlibraryx.domain.j;
import kotlin.jvm.internal.h;

public final class d {
    private final Fragment a;

    public d(Fragment fragment) {
        h.e(fragment, "fragment");
        this.a = fragment;
    }

    public final void a(j jVar) {
        h.e(jVar, "pickerData");
        h.e(jVar, "pickerData");
        Bundle bundle = new Bundle();
        bundle.putParcelable("PICKER_DATA", jVar);
        YourLibraryXSortBottomSheetFragment yourLibraryXSortBottomSheetFragment = new YourLibraryXSortBottomSheetFragment();
        yourLibraryXSortBottomSheetFragment.r4(bundle);
        yourLibraryXSortBottomSheetFragment.Y4(this.a.E2(), null);
    }
}
