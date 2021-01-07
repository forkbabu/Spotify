package com.spotify.music.features.tasteonboarding;

import com.adjust.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

public class g {
    private final cqe a;
    private final jz1 b;

    public g(cqe cqe, jz1 jz1) {
        this.a = cqe;
        this.b = jz1;
    }

    public void a() {
        this.b.a(new da1(null, PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER.toString(), ViewUris.R.toString(), null, -1, null, Constants.DEEPLINK, "show", (double) this.a.d()));
    }

    public void b() {
        this.b.a(new da1(null, PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER.toString(), ViewUris.R.toString(), null, -1, null, Constants.DEEPLINK, FreeSpaceBox.TYPE, (double) this.a.d()));
    }
}
