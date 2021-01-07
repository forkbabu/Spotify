package defpackage;

import com.spotify.music.preview.z;
import kotlin.jvm.internal.h;

/* renamed from: qh4  reason: default package */
public final class qh4 extends bh4 {
    private final z a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qh4(z zVar) {
        super(null);
        h.e(zVar, "previewPlayerState");
        this.a = zVar;
    }

    public final z a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof qh4) && h.a(this.a, ((qh4) obj).a);
        }
        return true;
    }

    public int hashCode() {
        z zVar = this.a;
        if (zVar != null) {
            return zVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreviewPlayerStateUpdated(previewPlayerState=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
