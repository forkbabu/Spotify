package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.view.j0;

final class f0 extends j0.c {
    private final boolean a;
    private final MusicPagesModel.LoadingState b;
    private final boolean c;

    f0(boolean z, MusicPagesModel.LoadingState loadingState, boolean z2) {
        this.a = z;
        if (loadingState != null) {
            this.b = loadingState;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null loadingState");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.view.j0.c
    public boolean a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.view.j0.c
    public MusicPagesModel.LoadingState b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.view.j0.c
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0.c)) {
            return false;
        }
        j0.c cVar = (j0.c) obj;
        if (this.a == cVar.c() && this.b.equals(cVar.b()) && this.c == cVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HeaderUpdateParams{textFilterVisible=");
        V0.append(this.a);
        V0.append(", loadingState=");
        V0.append(this.b);
        V0.append(", isSongsShuffleOnly=");
        return je.P0(V0, this.c, "}");
    }
}
