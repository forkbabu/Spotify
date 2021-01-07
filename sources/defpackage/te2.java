package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.builtinauth.authenticator.AccountsActivity;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.d0;
import com.spotify.music.builtinauth.authenticator.e0;
import defpackage.af2;
import io.reactivex.a0;
import io.reactivex.c0;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: te2  reason: default package */
public final class te2<T> implements c0<af2> {
    final /* synthetic */ ue2 a;
    final /* synthetic */ d0 b;

    /* renamed from: te2$a */
    public static final class a extends BroadcastReceiver {
        final /* synthetic */ a0 a;

        a(a0 a0Var) {
            this.a = a0Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: io.reactivex.a0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            h.e(context, "context");
            h.e(intent, "intent");
            AccountsActivity.e(context, this);
            e0 e0Var = (e0) intent.getParcelableExtra("result");
            if (e0Var.a) {
                this.a.onSuccess(new af2.b(e0Var.b.toString()));
                return;
            }
            String str = e0Var.b;
            if (str == null) {
                str = "";
            }
            this.a.onError(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_USER_NEEDS_AUTHORIZATION, str));
        }
    }

    te2(ue2 ue2, d0 d0Var) {
        this.a = ue2;
        this.b = d0Var;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0<af2> a0Var) {
        h.e(a0Var, "emitter");
        AccountsActivity.d(this.a.a, new a(a0Var));
        this.a.a.startActivity(AccountsActivity.c(this.a.a, this.b));
    }
}
