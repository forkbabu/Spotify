package defpackage;

import android.content.DialogInterface;
import com.spotify.playlist.models.j;

/* renamed from: aj3  reason: default package */
public final /* synthetic */ class aj3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ jj3 a;
    public final /* synthetic */ j b;

    public /* synthetic */ aj3(jj3 jj3, j jVar) {
        this.a = jj3;
        this.b = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.e(this.b, dialogInterface);
    }
}
