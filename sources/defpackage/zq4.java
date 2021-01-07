package defpackage;

import android.view.View;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: zq4  reason: default package */
public final /* synthetic */ class zq4 implements View.OnClickListener {
    public final /* synthetic */ dr4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ GaiaDevice c;
    public final /* synthetic */ int f;

    public /* synthetic */ zq4(dr4 dr4, boolean z, GaiaDevice gaiaDevice, int i) {
        this.a = dr4;
        this.b = z;
        this.c = gaiaDevice;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, this.c, this.f, view);
    }
}
