package defpackage;

import android.view.View;
import com.spotify.playlist.models.j;
import defpackage.zh3;

/* renamed from: yh3  reason: default package */
public final /* synthetic */ class yh3 implements View.OnClickListener {
    public final /* synthetic */ zh3.d a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    public /* synthetic */ yh3(zh3.d dVar, j jVar, int i) {
        this.a = dVar;
        this.b = jVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zh3.d dVar = this.a;
        zh3.this.f.a(this.b, this.c);
    }
}
