package defpackage;

import android.view.View;
import com.spotify.music.filterandsort.bottomsheet.a;
import defpackage.di9;
import defpackage.mi9;

/* renamed from: ki9  reason: default package */
public final /* synthetic */ class ki9 implements View.OnClickListener {
    public final /* synthetic */ mi9.a a;
    public final /* synthetic */ di9.b b;
    public final /* synthetic */ int c;

    public /* synthetic */ ki9(mi9.a aVar, di9.b bVar, int i) {
        this.a = aVar;
        this.b = bVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mi9.a aVar = this.a;
        ((a) mi9.this.c).a(this.b, this.c);
    }
}
