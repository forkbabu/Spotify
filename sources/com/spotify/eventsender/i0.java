package com.spotify.eventsender;

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import com.spotify.eventsender.k0;
import java.io.IOException;
import java.util.List;

/* access modifiers changed from: package-private */
public class i0 implements Runnable {
    private final List<l0> a;
    private final b0 b;
    private final kl0 c;

    i0(List<l0> list, b0 b0Var, kl0 kl0) {
        this.a = list;
        this.b = b0Var;
        this.c = kl0;
    }

    @Override // java.lang.Runnable
    public void run() {
        k0 k0Var;
        try {
            this.b.a();
            for (l0 l0Var : this.a) {
                List<c0> list = l0Var.get();
                while (true) {
                    if (!list.isEmpty()) {
                        try {
                            k0Var = l0Var.a().a(list);
                        } catch (IOException e) {
                            this.c.b("Error publishing events: %s", e.getMessage());
                            k0.a a2 = k0.a();
                            a2.c(true);
                            k0Var = a2.a();
                        }
                        ImmutableSet set = FluentIterable.from(k0Var.b()).filter(new i(list)).transform(new h(list)).toSet();
                        kl0 kl0 = this.c;
                        kl0.d(set.size() + " Events to be deleted from DB: " + Joiner.on(" ").join(set));
                        l0Var.b(set);
                        if (k0Var.c()) {
                            this.c.d("Backoff requested");
                            return;
                        }
                        list = l0Var.get();
                    }
                }
            }
            this.c.d("No more events to sync");
        } catch (Throwable th) {
            this.c.a(th, "Exception during periodic event sync");
        }
    }
}
