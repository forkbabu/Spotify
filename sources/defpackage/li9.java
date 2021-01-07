package defpackage;

import android.view.View;
import com.spotify.music.filterandsort.bottomsheet.b;
import defpackage.ni9;

/* renamed from: li9  reason: default package */
public final /* synthetic */ class li9 implements View.OnClickListener {
    public final /* synthetic */ ni9.a a;
    public final /* synthetic */ int b;

    public /* synthetic */ li9(ni9.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ni9.a aVar = this.a;
        ((b) ni9.this.c).a(this.b);
    }
}
