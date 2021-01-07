package com.spotify.music.libs.mediabrowserservice;

import android.os.ResultReceiver;
import io.reactivex.functions.g;

public final /* synthetic */ class k0 implements g {
    public final /* synthetic */ ResultReceiver a;

    public /* synthetic */ k0(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ResultReceiver resultReceiver = this.a;
        bja bja = (bja) obj;
        if (resultReceiver != null) {
            resultReceiver.send(bja.a(), bja.b());
        }
    }
}
