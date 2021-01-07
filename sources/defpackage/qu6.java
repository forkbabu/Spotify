package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.playlist.models.j;

/* renamed from: qu6  reason: default package */
public final /* synthetic */ class qu6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ av6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ j c;

    public /* synthetic */ qu6(av6 av6, Context context, j jVar) {
        this.a = av6;
        this.b = context;
        this.c = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.g(this.b, this.c, dialogInterface, i);
    }
}
