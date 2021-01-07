package defpackage;

import com.spotify.corex.transcripts.proto.Transcript;
import com.spotify.playlist.models.e;
import kotlin.jvm.internal.h;

/* renamed from: ab7  reason: default package */
public final class ab7 {
    private final e.b a;
    private final Transcript b;

    public ab7(e.b bVar, Transcript transcript) {
        h.e(bVar, "metadata");
        h.e(transcript, "transcript");
        this.a = bVar;
        this.b = transcript;
    }

    public final e.b a() {
        return this.a;
    }

    public final Transcript b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab7)) {
            return false;
        }
        ab7 ab7 = (ab7) obj;
        return h.a(this.a, ab7.a) && h.a(this.b, ab7.b);
    }

    public int hashCode() {
        e.b bVar = this.a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Transcript transcript = this.b;
        if (transcript != null) {
            i = transcript.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TranscriptModel(metadata=");
        V0.append(this.a);
        V0.append(", transcript=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
