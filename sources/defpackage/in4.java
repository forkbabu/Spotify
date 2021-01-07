package defpackage;

import android.view.View;
import com.spotify.libs.connect.model.a;
import defpackage.ln4;

/* renamed from: in4  reason: default package */
public final /* synthetic */ class in4 implements View.OnClickListener {
    public final /* synthetic */ ln4 a;
    public final /* synthetic */ ln4.b b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int f;

    public /* synthetic */ in4(ln4 ln4, ln4.b bVar, a aVar, int i) {
        this.a = ln4;
        this.b = bVar;
        this.c = aVar;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, this.c, this.f, view);
    }
}
