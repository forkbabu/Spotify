package com.spotify.mobile.android.service.media;

import android.content.Context;
import com.spotify.base.java.logging.Logger;

public class z1 extends eg0<v1> {
    private final String i;
    private final y2 j;
    private hg0<v1> k;

    public z1(Context context, String str, fg0 fg0, y2 y2Var) {
        super(context, ExternalIntegrationService.class, j.a, str, fg0);
        Logger.g("ExternalIntegrationServiceClient for %s has been created.", str);
        this.j = y2Var;
        this.i = str;
    }

    @Override // defpackage.eg0
    public void i() {
        super.i();
        this.j.a(this.i, this);
    }

    @Override // defpackage.eg0
    public void j() {
        super.j();
        hg0<v1> hg0 = this.k;
        if (hg0 != null) {
            hg0.onDisconnected();
            this.k = null;
        }
        this.j.c(this.i);
    }

    @Override // defpackage.eg0
    public void p(hg0<v1> hg0) {
        super.p(hg0);
        this.k = hg0;
    }
}
