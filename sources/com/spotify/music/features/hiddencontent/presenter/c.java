package com.spotify.music.features.hiddencontent.presenter;

import com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter;
import com.spotify.playlist.models.o;

/* access modifiers changed from: package-private */
public final class c extends HiddenContentFragmentPresenter.a {
    private final o a;
    private final int b;
    private final boolean c;

    c(o oVar, int i, boolean z) {
        if (oVar != null) {
            this.a = oVar;
            this.b = i;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null track");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter.a
    public boolean a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter.a
    public int b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter.a
    public o c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HiddenContentFragmentPresenter.a)) {
            return false;
        }
        HiddenContentFragmentPresenter.a aVar = (HiddenContentFragmentPresenter.a) obj;
        if (this.a.equals(aVar.c()) && this.b == aVar.b() && this.c == aVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreviewActionParams{track=");
        V0.append(this.a);
        V0.append(", position=");
        V0.append(this.b);
        V0.append(", isFromImage=");
        return je.P0(V0, this.c, "}");
    }
}
