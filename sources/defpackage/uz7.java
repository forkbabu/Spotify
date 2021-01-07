package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.inappmessaging.j;
import com.spotify.music.emailverify.EmailVerifyDispatcherService;
import kotlin.jvm.internal.h;

/* renamed from: uz7  reason: default package */
public final /* synthetic */ class uz7 implements j {
    public final /* synthetic */ d28 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ uz7(d28 d28, Activity activity) {
        this.a = d28;
        this.b = activity;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        d28 d28 = this.a;
        Activity activity = this.b;
        d28.h(str, str2);
        int i = EmailVerifyDispatcherService.o;
        h.e(activity, "context");
        activity.startService(new Intent(activity, EmailVerifyDispatcherService.class));
    }
}
