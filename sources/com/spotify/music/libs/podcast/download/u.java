package com.spotify.music.libs.podcast.download;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.podcast.download.c0;
import com.spotify.playlist.endpoints.p;

/* access modifiers changed from: package-private */
public final class u extends c0 {
    private final boolean a;
    private final ImmutableList<p.b> b;

    static final class b implements c0.a {
        private Boolean a;
        private ImmutableList<p.b> b;

        b() {
        }

        public c0 a() {
            String str = this.a == null ? " canDownloadBePerformed" : "";
            if (this.b == null) {
                str = je.x0(str, " containingPlaylists");
            }
            if (str.isEmpty()) {
                return new u(this.a.booleanValue(), this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c0.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public c0.a c(ImmutableList<p.b> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null containingPlaylists");
        }
    }

    u(boolean z, ImmutableList immutableList, a aVar) {
        this.a = z;
        this.b = immutableList;
    }

    @Override // com.spotify.music.libs.podcast.download.c0
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.music.libs.podcast.download.c0
    public ImmutableList<p.b> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.a != c0Var.a() || !this.b.equals(c0Var.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DownloadStateModel{canDownloadBePerformed=");
        V0.append(this.a);
        V0.append(", containingPlaylists=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
