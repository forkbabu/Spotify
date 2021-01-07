package defpackage;

import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.music.carmode.navigation.domain.p;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import io.reactivex.f;
import kotlin.jvm.internal.h;

/* renamed from: nn2  reason: default package */
public final class nn2 implements xs2 {
    final /* synthetic */ f a;

    nn2(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.xs2
    public void a(Fragment fragment, String str) {
        Optional optional;
        Optional optional2;
        h.e(fragment, "currentFragment");
        h.e(str, "viewUri");
        if (fragment instanceof NavigationItem) {
            optional = Optional.of(((NavigationItem) fragment).k0());
        } else {
            optional = Optional.absent();
        }
        ifd a2 = kfd.a(fragment);
        if (fragment instanceof x) {
            optional2 = Optional.of((x) fragment);
        } else {
            optional2 = Optional.absent();
        }
        this.a.onNext(p.g(optional, a2, optional2));
    }
}
