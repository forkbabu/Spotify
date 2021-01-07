package defpackage;

import android.view.View;
import com.spotify.libs.connect.picker.view.e;

/* renamed from: u7c  reason: default package */
public final /* synthetic */ class u7c implements View.OnClickListener {
    public final /* synthetic */ y7c a;
    public final /* synthetic */ e.a b;

    public /* synthetic */ u7c(y7c y7c, e.a aVar) {
        this.a = y7c;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, view);
    }
}
