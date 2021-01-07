package com.spotify.music.libs.connect;

import android.view.KeyEvent;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.instrumentation.g;
import com.spotify.libs.connect.volume.controllers.l;

public abstract class v extends ss2 {
    public ConnectManager G;
    public cs0 H;
    l I;
    protected g J;
    private a K;

    public interface a {
        void a(float f);
    }

    public void U0(a aVar) {
        this.K = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean V0(float f) {
        if (!this.H.i()) {
            return false;
        }
        this.I.g(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.ss2, androidx.appcompat.app.g, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.G.e() || !this.H.i() || this.G.o() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            a aVar = this.K;
            if (aVar != null) {
                aVar.a(this.I.e());
            }
            return true;
        } else if (i != 25) {
            return super.onKeyDown(i, keyEvent);
        } else {
            a aVar2 = this.K;
            if (aVar2 != null) {
                aVar2.a(this.I.c());
            }
            return true;
        }
    }
}
