package defpackage;

import android.content.DialogInterface;
import com.spotify.playlist.models.j;
import java.util.List;

/* renamed from: yi3  reason: default package */
public final /* synthetic */ class yi3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ jj3 a;
    public final /* synthetic */ j b;
    public final /* synthetic */ List c;

    public /* synthetic */ yi3(jj3 jj3, j jVar, List list) {
        this.a = jj3;
        this.b = jVar;
        this.c = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d(this.b, this.c, dialogInterface, i);
    }
}
