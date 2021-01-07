package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.skippable.view.SkippableAdTextView;
import com.spotify.music.features.ads.skippable.view.a;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: eqb  reason: default package */
public class eqb {
    private final g<Optional<Long>> a;
    private final p b = new p();
    private ys3 c;
    private a d;

    public eqb(g<Optional<Long>> gVar) {
        this.a = gVar;
    }

    public static void a(eqb eqb, Optional optional) {
        eqb.getClass();
        if (optional.isPresent()) {
            boolean z = ((Long) optional.get()).longValue() > 0;
            eqb.c.a(z);
            if (z) {
                eqb.d.setDelayedSkippableAdCallToActionText(((Long) optional.get()).longValue());
            } else {
                ((SkippableAdTextView) eqb.d).j();
            }
        } else {
            ((SkippableAdTextView) eqb.d).j();
        }
    }

    public void b(a aVar, ys3 ys3) {
        this.d = aVar;
        this.c = ys3;
        ((SkippableAdTextView) aVar).setClickable(false);
        this.b.b(this.a.subscribe(new lpb(this)));
    }

    public void c() {
        this.b.a();
    }
}
