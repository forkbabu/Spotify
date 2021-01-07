package defpackage;

import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.music.inappmessaging.b;
import com.spotify.music.onboarding.freetier.education.SkipLimitEducationPolicy;
import com.spotify.music.onboarding.freetier.education.a;
import kotlin.jvm.internal.h;

/* renamed from: k9c  reason: default package */
public final class k9c implements a {
    private final SkipLimitEducationPolicy a;
    private final b b;

    public k9c(SkipLimitEducationPolicy skipLimitEducationPolicy, b bVar) {
        h.e(skipLimitEducationPolicy, "skipLimitEducationPolicy");
        h.e(bVar, "messageRequester");
        this.a = skipLimitEducationPolicy;
        this.b = bVar;
    }

    @Override // com.spotify.music.onboarding.freetier.education.a
    public void a() {
        if (this.a.a() != SkipLimitEducationPolicy.Result.NO_MESSAGE) {
            this.b.b(MessageRequest.a("player", "skip_track", "v1"));
        }
    }
}
