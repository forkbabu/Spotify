package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.a;
import com.spotify.paste.widgets.internal.b;
import com.spotify.paste.widgets.internal.c;

/* access modifiers changed from: package-private */
/* renamed from: q90  reason: default package */
public abstract class q90 implements p90 {
    private final View a;
    private final a b;

    protected q90(View view) {
        this.a = view;
        this.b = new a((ViewGroup) view.findViewById(C0707R.id.accessory));
    }

    @Override // defpackage.p90
    public View W1() {
        return this.b.d();
    }

    @Override // defpackage.p90
    public void g1(boolean z) {
        this.b.e(z);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        View view = this.a;
        if (view instanceof b) {
            ((b) view).setActive(z);
        }
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        View view = this.a;
        if (view instanceof c) {
            ((c) view).setAppearsDisabled(z);
        }
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.b.f(view);
        this.b.g();
    }
}
