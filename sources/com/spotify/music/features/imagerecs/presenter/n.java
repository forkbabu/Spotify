package com.spotify.music.features.imagerecs.presenter;

import com.spotify.base.java.logging.Logger;
import io.reactivex.a0;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;

class n implements f {
    final /* synthetic */ a0 a;

    n(o oVar, a0 a0Var) {
        this.a = a0Var;
    }

    @Override // okhttp3.f
    public void onFailure(e eVar, IOException iOException) {
        Logger.l("Error while uploading image %s", iOException.getLocalizedMessage());
        this.a.onError(iOException);
    }

    @Override // okhttp3.f
    public void onResponse(e eVar, d0 d0Var) {
        if (!d0Var.p()) {
            Logger.l("Failed to upload image to google", new Object[0]);
            this.a.onSuccess(Boolean.FALSE);
            return;
        }
        this.a.onSuccess(Boolean.TRUE);
    }
}
