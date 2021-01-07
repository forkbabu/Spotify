package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.error.EISError;
import com.spotify.mobile.android.service.media.error.c;
import com.spotify.voiceassistant.player.models.SearchResponse;

/* renamed from: mx8  reason: default package */
public class mx8 {
    private final c a;

    public mx8(c cVar) {
        this.a = cVar;
    }

    public void a() {
        this.a.b(EISError.SEARCH_FAILED);
    }

    public void b(SearchResponse searchResponse) {
        this.a.b((EISError) searchResponse.feedbackDetails().transform(vw8.a).or((Optional<V>) ((V) Optional.absent())).transform(qw8.a).or((Optional) EISError.SEARCH_FAILED));
    }

    public void c(Throwable th) {
        Logger.e(th, "Exception thrown during search", new Object[0]);
        this.a.b(EISError.SEARCH_FAILED);
    }
}
