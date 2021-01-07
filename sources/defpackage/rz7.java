package defpackage;

import android.app.Activity;
import com.spotify.inappmessaging.j;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: rz7  reason: default package */
public final /* synthetic */ class rz7 implements j {
    public final /* synthetic */ a02 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ rz7(a02 a02, Activity activity) {
        this.a = a02;
        this.b = activity;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        a02 a02 = this.a;
        Activity activity = this.b;
        a02.getClass();
        zz1 zz1 = new zz1(activity);
        c cVar = ViewUris.Z0;
        zz1.a();
    }
}
