package defpackage;

import android.view.View;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;

/* renamed from: mz9  reason: default package */
public final /* synthetic */ class mz9 implements View.OnClickListener {
    public final /* synthetic */ rz9 a;
    public final /* synthetic */ h b;
    public final /* synthetic */ e c;
    public final /* synthetic */ int f;

    public /* synthetic */ mz9(rz9 rz9, h hVar, e eVar, int i) {
        this.a = rz9;
        this.b = hVar;
        this.c = eVar;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.m0(this.b, this.c, this.f, view);
    }
}
