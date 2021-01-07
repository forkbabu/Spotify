package defpackage;

import android.content.DialogInterface;
import com.google.common.base.Optional;
import com.spotify.playlist.models.j;

/* renamed from: zi3  reason: default package */
public final /* synthetic */ class zi3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ jj3 a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Optional c;

    public /* synthetic */ zi3(jj3 jj3, j jVar, Optional optional) {
        this.a = jj3;
        this.b = jVar;
        this.c = optional;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(this.b, this.c, dialogInterface, i);
    }
}
