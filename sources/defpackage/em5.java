package defpackage;

import android.view.View;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.features.languagepicker.model.g;
import defpackage.dm5;

/* renamed from: em5  reason: default package */
public class em5 extends e<g> {
    private final dm5.a C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public em5(View view, dm5.a aVar) {
        super(view);
        view.getClass();
        this.C = aVar;
    }

    /* renamed from: u0 */
    public void h0(g gVar, int i) {
        this.a.setOnClickListener(new am5(this));
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        int w = w();
        dm5.a aVar = this.C;
        if (aVar == null || w == -1) {
            return false;
        }
        return aVar.c(w);
    }
}
