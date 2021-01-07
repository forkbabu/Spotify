package defpackage;

import android.view.View;
import com.spotify.music.features.findfriends.model.UserModel;
import defpackage.l15;

/* renamed from: i15  reason: default package */
public final /* synthetic */ class i15 implements View.OnClickListener {
    public final /* synthetic */ l15.d a;
    public final /* synthetic */ UserModel b;
    public final /* synthetic */ int c;

    public /* synthetic */ i15(l15.d dVar, UserModel userModel, int i) {
        this.a = dVar;
        this.b = userModel;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l15.d dVar = this.a;
        l15.this.p.a(this.b, this.c);
    }
}
