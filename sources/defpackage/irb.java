package defpackage;

import android.view.View;
import com.spotify.libs.connect.picker.view.e;

/* renamed from: irb  reason: default package */
public final /* synthetic */ class irb implements View.OnClickListener {
    public final /* synthetic */ orb a;
    public final /* synthetic */ e.a b;

    public /* synthetic */ irb(orb orb, e.a aVar) {
        this.a = orb;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, view);
    }
}
