package com.spotify.mobile.android.util.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class Lifecycle$Listeners implements k {
    private final List<l> a = new ArrayList();
    private l b;
    private Object c;

    /* access modifiers changed from: private */
    public enum Event implements qg0<l> {
        ON_START {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.qg0
            public void accept(l lVar) {
                lVar.onStart();
            }
        },
        ON_STOP {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.qg0
            public void accept(l lVar) {
                lVar.onStop();
            }
        },
        ON_RESUME {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.qg0
            public void accept(l lVar) {
                lVar.onResume();
            }
        },
        ON_PAUSE {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.qg0
            public void accept(l lVar) {
                lVar.onPause();
            }
        },
        ON_DESTROY {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.qg0
            public void accept(l lVar) {
                lVar.onDestroy();
            }
        };

        Event(j jVar) {
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Event.");
            V0.append(name());
            return V0.toString();
        }
    }

    private void a(qg0<l> qg0) {
        this.c = qg0;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                l lVar = this.a.get(size);
                this.b = lVar;
                qg0.accept(lVar);
            } else {
                this.b = null;
                this.c = null;
                return;
            }
        }
    }

    public void b(int i, int i2, Intent intent) {
        a(new n(i, i2, intent));
    }

    public void c(Bundle bundle) {
        a(new r(bundle));
    }

    public void d(Menu menu) {
        a(new o(menu));
    }

    public void e() {
        a(Event.ON_DESTROY);
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean e1(l lVar) {
        l lVar2 = this.b;
        if (lVar2 == null || lVar == lVar2) {
            return this.a.remove(lVar);
        }
        throw new IllegalArgumentException(je.G0(je.V0("Removing a listener (other than the one being notified) during "), this.c, " is not supported."));
    }

    public void f() {
        a(Event.ON_PAUSE);
    }

    public void g(Bundle bundle) {
        a(new q(bundle));
    }

    public void h() {
        a(Event.ON_RESUME);
    }

    public void i(Bundle bundle) {
        a(new p(bundle));
    }

    public void j() {
        a(Event.ON_START);
    }

    public void k() {
        a(Event.ON_STOP);
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean y0(l lVar) {
        lVar.getClass();
        return !this.a.contains(lVar) && this.a.add(lVar);
    }
}
