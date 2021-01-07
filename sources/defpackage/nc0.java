package defpackage;

import android.view.View;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.mobile.android.util.ui.m;

/* renamed from: nc0  reason: default package */
public abstract class nc0 extends m implements qc0, tc0 {
    private final View a;
    private final TransformationSet b;

    public nc0(View view) {
        view.getClass();
        this.a = view;
        this.b = l70.d(view);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f) {
        this.b.a(f);
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
