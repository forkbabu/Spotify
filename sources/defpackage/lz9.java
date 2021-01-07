package defpackage;

import android.view.View;
import com.spotify.music.libs.assistedcuration.model.h;

/* renamed from: lz9  reason: default package */
public final /* synthetic */ class lz9 implements View.OnClickListener {
    public final /* synthetic */ pz9 a;
    public final /* synthetic */ h b;

    public /* synthetic */ lz9(pz9 pz9, h hVar) {
        this.a = pz9;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j0(this.b, view);
    }
}
