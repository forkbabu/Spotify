package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.t;
import kotlin.jvm.internal.h;

/* renamed from: lif  reason: default package */
public final class lif implements v01<Destination.d> {
    final /* synthetic */ t a;

    lif(t tVar) {
        this.a = tVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination, android.app.Activity] */
    @Override // defpackage.v01
    public Intent b(Destination.d dVar, Activity activity) {
        h.e(dVar, "destination");
        h.e(activity, "sourceActivity");
        activity.setResult(-1);
        Intent intent = (Intent) activity.getIntent().getParcelableExtra("intent");
        if (intent == null) {
            intent = this.a.a(activity);
        }
        intent.setExtrasClassLoader(activity.getClassLoader());
        activity.finish();
        h.d(intent, "sourceIntent");
        return intent;
    }
}
