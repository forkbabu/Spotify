package defpackage;

import android.view.View;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogActivity;
import com.spotify.music.freetiercommon.models.a;
import defpackage.q45;

/* renamed from: n45  reason: default package */
public final /* synthetic */ class n45 implements View.OnClickListener {
    public final /* synthetic */ q45.a a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;

    public /* synthetic */ n45(q45.a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q45.a aVar = this.a;
        ((FreeTierAllSongsDialogActivity) q45.this.f).j1(this.b, this.c);
    }
}
