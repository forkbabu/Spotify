package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.k;
import com.spotify.music.builtinauth.authenticator.AccountsActivity;
import com.spotify.music.builtinauth.authenticator.d0;
import com.spotify.music.builtinauth.model.FieldValidator;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: os1  reason: default package */
public final class os1 extends yr1 {
    public static final /* synthetic */ int l = 0;
    private final Context f;
    private final FieldValidator g = new FieldValidator();
    private final y h;
    private final hl2 i;
    private b j = EmptyDisposable.INSTANCE;
    private BroadcastReceiver k;

    public os1(Context context, v1 v1Var, ff2.a aVar, y yVar, hl2 hl2) {
        super(v1Var, aVar);
        context.getClass();
        this.f = context;
        this.h = yVar;
        this.i = hl2;
    }

    private void o(ErrorMessage errorMessage, int i2) {
        Logger.l("TokenSubscriptionManager.onAuthFailedError %s", errorMessage);
        b(i2, new AppProtocol.TokenResponse(2, errorMessage.d().toLowerCase(Locale.getDefault()), null));
        j(i2);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        this.j.dispose();
        this.k = null;
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        AppProtocol.TokenRequest tokenRequest = (AppProtocol.TokenRequest) df2.b(2, AppProtocol.TokenRequest.class);
        try {
            this.g.e(tokenRequest, "params");
            this.g.e(tokenRequest.clientId, "client_id");
            this.g.e(tokenRequest.scopes, "scopes");
            this.g.a(tokenRequest.scopes, "scopes");
            AuthorizationRequest a = AuthorizationRequest.a(tokenRequest.clientId, AuthorizationRequest.ResponseType.TOKEN, tokenRequest.redirectUri, new ClientIdentity("", ""), null, (String[]) Arrays.asList(tokenRequest.scopes).toArray(new String[0]), false);
            this.j = this.i.a(a).o0(this.h).subscribe(new ur1(this, a, i2), tr1.a);
        } catch (FieldValidator.ValidationException e) {
            Logger.l("TokenSubscriptionManager.onSubscribed ERROR: %s", e.getMessage());
            b(i2, new AppProtocol.TokenResponse(2, e.getMessage(), null));
            j(i2);
        }
    }

    public void n(AuthorizationRequest authorizationRequest, int i2, u3 u3Var) {
        F f2 = u3Var.a;
        S s = u3Var.b;
        if (f2 == null) {
            o(ErrorMessage.UNKNOWN_RESPONSE_TYPE_ERROR, i2);
        } else if (f2 instanceof k.d) {
            o(f2.e(), i2);
        } else if ((f2 instanceof k.e) || (f2 instanceof k.c)) {
            d0 d0Var = new d0(authorizationRequest.b(), AuthorizationRequest.ResponseType.TOKEN, authorizationRequest.e(), authorizationRequest.c(), s, authorizationRequest.g());
            ns1 ns1 = new ns1(this, i2);
            this.k = ns1;
            AccountsActivity.d(this.f, ns1);
            this.f.startActivity(AccountsActivity.c(this.f, d0Var));
        } else {
            Logger.l("TokenSubscriptionManager.onSuccess", new Object[0]);
            b(i2, new AppProtocol.TokenResponse(0, null, f2.d()));
            j(i2);
        }
    }
}
