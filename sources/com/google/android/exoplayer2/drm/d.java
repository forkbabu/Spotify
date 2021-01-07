package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.util.m;

public final /* synthetic */ class d implements m.a {
    public final /* synthetic */ DefaultDrmSessionManager.MissingSchemeDataException a;

    public /* synthetic */ d(DefaultDrmSessionManager.MissingSchemeDataException missingSchemeDataException) {
        this.a = missingSchemeDataException;
    }

    @Override // com.google.android.exoplayer2.util.m.a
    public final void a(Object obj) {
        ((k) obj).o(this.a);
    }
}
