package com.spotify.music.spotlets.radio.service;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import io.reactivex.s;

public class c0 extends eg0<RadioActionsService.a> {
    private final RadioStateObserver i;

    public c0(Context context, RadioStateObserver radioStateObserver, String str, fg0 fg0) {
        super(context, RadioActionsService.class, str, fg0);
        this.i = radioStateObserver;
    }

    @Override // defpackage.eg0
    public void j() {
        if (l()) {
            RadioActionsService.this.c.d().l(this.i);
        }
        super.j();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.eg0
    public void o() {
        RadioActionsService.this.c.d().e(this.i);
    }

    public s<RadioStationModel> r(c cVar) {
        RadioActionsService.a aVar = (RadioActionsService.a) k();
        StationEntitySession h = RadioActionsService.this.c.d().h(cVar);
        if (h != null) {
            return s.i0(h.getRadioStationModel());
        }
        String d = agd.d(cVar.toString());
        d.getClass();
        return RadioActionsService.this.c.e(d);
    }
}
