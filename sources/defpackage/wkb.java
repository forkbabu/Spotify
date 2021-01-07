package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;

/* access modifiers changed from: package-private */
/* renamed from: wkb  reason: default package */
public final class wkb extends hlb {
    private final Intent a;
    private final c b;
    private final SessionState c;

    wkb(Intent intent, c cVar, SessionState sessionState) {
        if (intent != null) {
            this.a = intent;
            if (cVar != null) {
                this.b = cVar;
                if (sessionState != null) {
                    this.c = sessionState;
                    return;
                }
                throw new NullPointerException("Null sessionState");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null intent");
    }

    @Override // defpackage.hlb, defpackage.glb.c
    public Intent a() {
        return this.a;
    }

    @Override // defpackage.hlb
    public c c() {
        return this.b;
    }

    @Override // defpackage.hlb
    public SessionState d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hlb)) {
            return false;
        }
        hlb hlb = (hlb) obj;
        if (!this.a.equals(hlb.a()) || !this.b.equals(hlb.c()) || !this.c.equals(hlb.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("RouterInput{intent=");
        V0.append(this.a);
        V0.append(", flags=");
        V0.append(this.b);
        V0.append(", sessionState=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
