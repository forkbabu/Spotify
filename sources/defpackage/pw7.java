package defpackage;

import android.view.View;
import com.spotify.libs.connect.picker.view.e;

/* renamed from: pw7  reason: default package */
public final /* synthetic */ class pw7 implements View.OnClickListener {
    public final /* synthetic */ qw7 a;
    public final /* synthetic */ e.a b;

    public /* synthetic */ pw7(qw7 qw7, e.a aVar) {
        this.a = qw7;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, view);
    }
}
