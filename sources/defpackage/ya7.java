package defpackage;

import com.spotify.corex.transcripts.proto.Transcript;
import com.spotify.playlist.models.e;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: ya7  reason: default package */
public final class ya7 {
    private final za7 a;

    /* access modifiers changed from: package-private */
    /* renamed from: ya7$a */
    public static final class a<T, R> implements l<Transcript, ab7> {
        final /* synthetic */ e.b a;

        a(e.b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ab7 apply(Transcript transcript) {
            Transcript transcript2 = transcript;
            h.e(transcript2, "it");
            return new ab7(this.a, transcript2);
        }
    }

    public ya7(za7 za7) {
        h.e(za7, "endpoint");
        this.a = za7;
    }

    public final z<ab7> a(e.b bVar) {
        h.e(bVar, "episodeTranscriptItem");
        z<R> A = this.a.a(bVar.a()).A(new a(bVar));
        h.d(A, "endpoint.transcript(epis…sodeTranscriptItem, it) }");
        return A;
    }
}
