package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.view.k0;

final class g0 extends k0.c {
    private final MusicPagesModel.LoadingState a;
    private final boolean b;

    g0(MusicPagesModel.LoadingState loadingState, boolean z) {
        if (loadingState != null) {
            this.a = loadingState;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null loadingState");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.view.k0.c
    public boolean a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.view.k0.c
    public MusicPagesModel.LoadingState b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0.c)) {
            return false;
        }
        k0.c cVar = (k0.c) obj;
        if (!this.a.equals(cVar.b()) || this.b != cVar.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoadingStateUpdateParams{loadingState=");
        V0.append(this.a);
        V0.append(", hasFocus=");
        return je.P0(V0, this.b, "}");
    }
}
