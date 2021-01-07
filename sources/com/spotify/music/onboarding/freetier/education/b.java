package com.spotify.music.onboarding.freetier.education;

import com.google.common.collect.EvictingQueue;
import com.spotify.music.onboarding.freetier.education.SkipLimitEducationPolicy;
import kotlin.jvm.internal.h;

public final class b implements SkipLimitEducationPolicy {
    private final EvictingQueue<Long> a;
    private final m9c b;
    private final cqe c;

    public b(m9c m9c, cqe cqe) {
        h.e(m9c, "prefs");
        h.e(cqe, "clock");
        this.b = m9c;
        this.c = cqe;
        EvictingQueue<Long> create = EvictingQueue.create(3);
        h.d(create, "EvictingQueue.create(SKIP_THRESHOLD)");
        this.a = create;
    }

    @Override // com.spotify.music.onboarding.freetier.education.SkipLimitEducationPolicy
    public SkipLimitEducationPolicy.Result a() {
        long b2 = this.c.b();
        this.a.add(Long.valueOf(b2));
        if (!this.b.b()) {
            this.b.a();
            return SkipLimitEducationPolicy.Result.SHOW_FIRST_SKIP_LIMIT_MESSAGE;
        }
        if (this.a.size() == 3) {
            Long peek = this.a.peek();
            h.d(peek, "skipTimeStamps.peek()");
            if (b2 - peek.longValue() < ((long) 10000)) {
                this.a.clear();
                return SkipLimitEducationPolicy.Result.SHOW_SUBSEQUENT_SKIP_LIMIT_MESSAGE;
            }
        }
        return SkipLimitEducationPolicy.Result.NO_MESSAGE;
    }
}
