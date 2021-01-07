package defpackage;

import android.view.View;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: yq4  reason: default package */
public final /* synthetic */ class yq4 implements View.OnClickListener {
    public final /* synthetic */ dr4 a;
    public final /* synthetic */ GaiaDevice b;
    public final /* synthetic */ int c;

    public /* synthetic */ yq4(dr4 dr4, GaiaDevice gaiaDevice, int i) {
        this.a = dr4;
        this.b = gaiaDevice;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.k(this.b, this.c, view);
    }
}
