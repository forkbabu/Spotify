package com.spotify.eventsender;

import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
public class f0 implements e0 {
    private final kl0 a;
    private final e0 b;

    f0(e0 e0Var, kl0 kl0) {
        this.a = kl0;
        this.b = e0Var;
    }

    @Override // com.spotify.eventsender.e0
    public Optional<String> a() {
        try {
            if (!b(this.b.a())) {
                return Optional.absent();
            }
            return this.b.a().transform(g.a);
        } catch (Exception unused) {
            this.a.d("Encountered error while trying to fetch event owner");
            return Optional.absent();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(Optional<String> optional) {
        return optional.isPresent() && !optional.get().isEmpty();
    }
}
