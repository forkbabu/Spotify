package com.spotify.music.libs.accountlinkingnudges;

import com.spotify.music.libs.googleassistantaccountlinking.l;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<T> implements g<l> {
    final /* synthetic */ DefaultGoogleAccountLinkingNudgeAttacher a;

    c(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher) {
        this.a = defaultGoogleAccountLinkingNudgeAttacher;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(l lVar) {
        if (h.a(lVar, l.b.a)) {
            DefaultGoogleAccountLinkingNudgeAttacher.b(this.a).a();
        } else {
            DefaultGoogleAccountLinkingNudgeAttacher.f(this.a);
        }
    }
}
