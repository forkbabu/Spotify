package com.google.android.video.exo;

import android.graphics.SurfaceTexture;

class a implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ b a;

    a(b bVar) {
        this.a = bVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.F1 = true;
        this.a.E1 = true;
    }
}
