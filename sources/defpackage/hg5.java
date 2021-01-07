package defpackage;

import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.i;

/* access modifiers changed from: package-private */
/* renamed from: hg5  reason: default package */
public final class hg5 extends ng5 {
    private final f a;
    private final i<Episode> b;
    private final d c;
    private final boolean d;

    hg5(f fVar, i<Episode> iVar, d dVar, boolean z) {
        if (fVar != null) {
            this.a = fVar;
            if (iVar != null) {
                this.b = iVar;
                if (dVar != null) {
                    this.c = dVar;
                    this.d = z;
                    return;
                }
                throw new NullPointerException("Null albums");
            }
            throw new NullPointerException("Null episodes");
        }
        throw new NullPointerException("Null playlists");
    }

    @Override // defpackage.ng5
    public d a() {
        return this.c;
    }

    @Override // defpackage.ng5
    public i<Episode> c() {
        return this.b;
    }

    @Override // defpackage.ng5
    public boolean d() {
        return this.d;
    }

    @Override // defpackage.ng5
    public f e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ng5)) {
            return false;
        }
        ng5 ng5 = (ng5) obj;
        if (!this.a.equals(ng5.e()) || !this.b.equals(ng5.c()) || !this.c.equals(ng5.a()) || this.d != ng5.d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeDownloadedContent{playlists=");
        V0.append(this.a);
        V0.append(", episodes=");
        V0.append(this.b);
        V0.append(", albums=");
        V0.append(this.c);
        V0.append(", isLikedSongsDownloaded=");
        return je.P0(V0, this.d, "}");
    }
}
