package defpackage;

import android.view.View;
import com.spotify.playlist.models.j;
import defpackage.zh3;

/* renamed from: xh3  reason: default package */
public final /* synthetic */ class xh3 implements View.OnClickListener {
    public final /* synthetic */ zh3.b a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    public /* synthetic */ xh3(zh3.b bVar, j jVar, int i) {
        this.a = bVar;
        this.b = jVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zh3.b bVar = this.a;
        zh3.this.f.a(this.b, this.c);
    }
}
