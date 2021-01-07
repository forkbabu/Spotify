package defpackage;

import android.view.View;
import com.spotify.libs.connect.model.a;

/* renamed from: hn4  reason: default package */
public final /* synthetic */ class hn4 implements View.OnClickListener {
    public final /* synthetic */ ln4 a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;

    public /* synthetic */ hn4(ln4 ln4, a aVar, int i) {
        this.a = ln4;
        this.b = aVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, this.c, view);
    }
}
