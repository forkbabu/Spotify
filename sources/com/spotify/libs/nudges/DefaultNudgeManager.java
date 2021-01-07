package com.spotify.libs.nudges;

import android.view.View;
import defpackage.rv0;
import kotlin.Pair;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultNudgeManager implements qv0 {
    private Pair<? extends ov0, ? extends View> a;
    private Pair<? extends ov0, ? extends View> b;
    private final rv0 c;

    public DefaultNudgeManager(rv0 rv0) {
        h.e(rv0, "nudgeSnackBarOrchestrator");
        this.c = rv0;
        rv0.a(new nmf<rv0.a, f>(this) {
            /* class com.spotify.libs.nudges.DefaultNudgeManager.AnonymousClass1 */
            final /* synthetic */ DefaultNudgeManager this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public f invoke(rv0.a aVar) {
                rv0.a aVar2 = aVar;
                h.e(aVar2, "it");
                if (h.a(aVar2, rv0.a.C0679a.a)) {
                    Pair pair = this.this$0.a;
                    if (pair != null) {
                        this.this$0.g(pair);
                    }
                    this.this$0.a = null;
                } else if (h.a(aVar2, rv0.a.b.a) && this.this$0.b != null) {
                    DefaultNudgeManager defaultNudgeManager = this.this$0;
                    defaultNudgeManager.a = defaultNudgeManager.b;
                    this.this$0.dismiss();
                }
                return f.a;
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void g(Pair<? extends ov0, ? extends View> pair) {
        ((ov0) pair.c()).a((View) pair.d());
        ((ov0) pair.c()).b(new DefaultNudgeManager$showNudge$1(this));
        this.b = pair;
    }

    @Override // defpackage.qv0
    public void a(ov0 ov0, View view) {
        h.e(ov0, "nudge");
        h.e(view, "anchorView");
        Pair<? extends ov0, ? extends View> pair = new Pair<>(ov0, view);
        if (h.a(this.c.b(), rv0.a.C0679a.a)) {
            g(pair);
        } else {
            this.a = pair;
        }
    }

    @Override // defpackage.qv0
    public void dismiss() {
        Pair<? extends ov0, ? extends View> pair = this.b;
        ov0 ov0 = pair != null ? (ov0) pair.c() : null;
        if (ov0 != null) {
            ov0.b(null);
        }
        if (ov0 != null) {
            ov0.dismiss();
        }
        this.b = null;
    }
}
