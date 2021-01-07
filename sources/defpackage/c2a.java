package defpackage;

import android.app.Activity;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.libs.assistedcuration.adapter.a;
import com.spotify.music.libs.assistedcuration.presenter.AssistedCurationContentPresenter;
import com.spotify.music.preview.v;
import defpackage.a2a;

/* renamed from: c2a  reason: default package */
public final class c2a implements a2a.a {
    private final wlf<Activity> a;
    private final wlf<SnackbarManager> b;
    private final wlf<AssistedCurationContentPresenter.a> c;
    private final wlf<a.AbstractC0280a> d;
    private final wlf<v.a> e;

    public c2a(wlf<Activity> wlf, wlf<SnackbarManager> wlf2, wlf<AssistedCurationContentPresenter.a> wlf3, wlf<a.AbstractC0280a> wlf4, wlf<v.a> wlf5) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.a2a.a
    public a2a a(com.spotify.instrumentation.a aVar, x1a x1a) {
        Activity activity = this.a.get();
        b(activity, 1);
        Activity activity2 = activity;
        SnackbarManager snackbarManager = this.b.get();
        b(snackbarManager, 2);
        SnackbarManager snackbarManager2 = snackbarManager;
        AssistedCurationContentPresenter.a aVar2 = this.c.get();
        b(aVar2, 3);
        AssistedCurationContentPresenter.a aVar3 = aVar2;
        a.AbstractC0280a aVar4 = this.d.get();
        b(aVar4, 4);
        a.AbstractC0280a aVar5 = aVar4;
        v.a aVar6 = this.e.get();
        b(aVar6, 5);
        b(aVar, 6);
        b(x1a, 7);
        return new b2a(activity2, snackbarManager2, aVar3, aVar5, aVar6, aVar, x1a);
    }
}
