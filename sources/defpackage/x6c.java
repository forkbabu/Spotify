package defpackage;

import androidx.core.widget.c;
import com.google.common.base.Optional;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.skippable.view.SkippableAdTextView;
import com.spotify.music.features.ads.skippable.view.a;
import com.spotify.rxjava2.q;
import io.reactivex.g;

/* renamed from: x6c  reason: default package */
public class x6c implements a.AbstractC0213a {
    private final uec a;
    private final g<Optional<Long>> b;
    private final q c = new q();
    private a d;
    private boolean e;

    public x6c(uec uec, g<Optional<Long>> gVar) {
        this.a = uec;
        this.b = gVar;
    }

    public static void a(x6c x6c, Optional optional) {
        x6c.getClass();
        if (optional.isPresent()) {
            boolean z = ((Long) optional.get()).longValue() > 0;
            x6c.e = z;
            if (z) {
                x6c.d.setDelayedSkippableAdCallToActionText(((Long) optional.get()).longValue());
                ((SkippableAdTextView) x6c.d).setClickable(false);
                return;
            }
            SkippableAdTextView skippableAdTextView = (SkippableAdTextView) x6c.d;
            skippableAdTextView.setText(skippableAdTextView.getContext().getString(C0707R.string.skippable_ad_non_delayed_cta));
            skippableAdTextView.setVisibility(0);
            c.n(skippableAdTextView, R.style.TextAppearance_Encore_BalladBold);
            ((SkippableAdTextView) x6c.d).setClickable(true);
            return;
        }
        ((SkippableAdTextView) x6c.d).j();
    }

    public void b() {
        if (!this.e) {
            this.c.a(this.a.a().subscribe());
        }
    }

    public void c(a aVar) {
        this.d = aVar;
        aVar.setListener(this);
        this.c.a(this.b.subscribe(new o6c(this)));
    }

    public void d() {
        this.c.c();
    }
}
