package defpackage;

import android.app.Activity;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.libs.assistedcuration.adapter.a;
import com.spotify.music.libs.assistedcuration.presenter.AssistedCurationContentPresenter;
import com.spotify.music.preview.v;

/* renamed from: d2a  reason: default package */
public final class d2a implements fjf<c2a> {
    private final wlf<Activity> a;
    private final wlf<SnackbarManager> b;
    private final wlf<AssistedCurationContentPresenter.a> c;
    private final wlf<a.AbstractC0280a> d;
    private final wlf<v.a> e;

    public d2a(wlf<Activity> wlf, wlf<SnackbarManager> wlf2, wlf<AssistedCurationContentPresenter.a> wlf3, wlf<a.AbstractC0280a> wlf4, wlf<v.a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c2a(this.a, this.b, this.c, this.d, this.e);
    }
}
