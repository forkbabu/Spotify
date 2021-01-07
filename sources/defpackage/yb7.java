package defpackage;

import android.view.View;
import com.spotify.playlist.models.offline.a;

/* renamed from: yb7  reason: default package */
public final /* synthetic */ class yb7 implements View.OnClickListener {
    public final /* synthetic */ ec7 a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;

    public /* synthetic */ yb7(ec7 ec7, a aVar, String str) {
        this.a = ec7;
        this.b = aVar;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, this.c, view);
    }
}
