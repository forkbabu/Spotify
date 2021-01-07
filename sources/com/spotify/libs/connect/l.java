package com.spotify.libs.connect;

import android.app.Service;
import android.content.Context;
import defpackage.eg0;

@Deprecated
public class l extends eg0<ConnectManager> {

    public interface a extends eg0.b<ConnectManager> {
    }

    l(Context context, Class<? extends Service> cls, a aVar, fg0 fg0) {
        super(context, cls, aVar, context.getClass().getSimpleName(), fg0);
    }

    @Override // defpackage.eg0
    public void i() {
        if (l()) {
            n();
        } else {
            super.i();
        }
    }

    public ConnectManager r() {
        return (ConnectManager) k();
    }
}
