package com.spotify.music.homecomponents.dialogs.showmore;

import android.net.Uri;
import kotlin.jvm.internal.h;

public final class ShowMoreBottomSheetPresenterImpl implements b {
    private final d a;

    public ShowMoreBottomSheetPresenterImpl(d dVar) {
        h.e(dVar, "showMoreViewBinder");
        this.a = dVar;
    }

    public void a(a aVar) {
        h.e(aVar, "data");
        i c = aVar.c();
        boolean z = false;
        if (!(c.getImageUri().length() == 0)) {
            if (!(c.c().length() == 0)) {
                if (c.a().length() == 0) {
                    z = true;
                }
                if (!z) {
                    this.a.setTitle(c.c());
                    this.a.setSubtitle(c.b());
                    d dVar = this.a;
                    Uri parse = Uri.parse(c.getImageUri());
                    if (parse == null) {
                        parse = Uri.EMPTY;
                    }
                    h.d(parse, "Uri.parse(headerData.imageUri) ?: Uri.EMPTY");
                    dVar.K0(parse);
                    this.a.U(ShowMoreBottomSheetPresenterImpl$onStart$1.a);
                    this.a.W0(aVar.a().a());
                    this.a.R0(aVar.b().a());
                }
            }
        }
        this.a.R1();
        this.a.W0(aVar.a().a());
        this.a.R0(aVar.b().a());
    }
}
