package defpackage;

import com.spotify.music.features.nowplayingbar.domain.ContentType;
import com.spotify.music.features.nowplayingbar.domain.a;

/* access modifiers changed from: package-private */
/* renamed from: ut5  reason: default package */
public final class ut5 extends vt5 {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final ContentType d;
    private final a e;

    ut5(String str, boolean z, boolean z2, ContentType contentType, a aVar) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            if (contentType != null) {
                this.d = contentType;
                if (aVar != null) {
                    this.e = aVar;
                    return;
                }
                throw new NullPointerException("Null connectState");
            }
            throw new NullPointerException("Null contentType");
        }
        throw new NullPointerException("Null currentTrackUri");
    }

    @Override // defpackage.vt5
    public a a() {
        return this.e;
    }

    @Override // defpackage.vt5
    public ContentType b() {
        return this.d;
    }

    @Override // defpackage.vt5
    public boolean d() {
        return this.b;
    }

    @Override // defpackage.vt5
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vt5)) {
            return false;
        }
        vt5 vt5 = (vt5) obj;
        if (!this.a.equals(vt5.e()) || this.b != vt5.d() || this.c != vt5.f() || !this.d.equals(vt5.b()) || !this.e.equals(vt5.a())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vt5
    public boolean f() {
        return this.c;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("NowPlayingBarLoggingModel{currentTrackUri=");
        V0.append(this.a);
        V0.append(", currentTrackIsInCollection=");
        V0.append(this.b);
        V0.append(", isPlaying=");
        V0.append(this.c);
        V0.append(", contentType=");
        V0.append(this.d);
        V0.append(", connectState=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
