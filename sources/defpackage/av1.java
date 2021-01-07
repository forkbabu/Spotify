package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.h;
import com.spotify.mobile.android.sso.k;
import io.reactivex.a0;
import io.reactivex.z;
import java.net.HttpCookie;
import java.util.Locale;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.y;

/* renamed from: av1  reason: default package */
public class av1 {
    private final y a;

    public av1(xu1 xu1) {
        this.a = xu1.a();
    }

    static k a(d0 d0Var) {
        ErrorMessage errorMessage;
        String str = "";
        if (d0Var.p() || d0Var.m()) {
            if (d0Var.m()) {
                str = d0Var.i("Location", str);
            }
            return h.a(Uri.parse(str));
        }
        Logger.d("AccountsPrefligtRequest failed with status code: %s", Integer.valueOf(d0Var.f()));
        if (d0Var.a() != null) {
            str = d0Var.a().m();
            d0Var.a().close();
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (lowerCase.contains("invalid app identifier")) {
            errorMessage = ErrorMessage.ACCOUNTS_INVALID_APP_ID;
        } else if (lowerCase.contains("invalid_request")) {
            errorMessage = ErrorMessage.ACCOUNTS_INVALID_REQUEST;
        } else if (lowerCase.contains("invalid_client")) {
            errorMessage = ErrorMessage.ACCOUNTS_INVALID_CLIENT;
        } else {
            errorMessage = ErrorMessage.ACCOUNTS_UNKNOWN_ERROR;
        }
        return k.a(errorMessage, str, null);
    }

    public void b(AuthorizationRequest authorizationRequest, HttpCookie httpCookie, a0 a0Var) {
        String uri = wu1.a(authorizationRequest).toString();
        y yVar = this.a;
        a0.a aVar = new a0.a();
        aVar.j(uri);
        aVar.e("Accept", "text/html");
        aVar.e("Cookie", httpCookie.toString());
        yVar.b(aVar.b()).h1(new zu1(this, a0Var));
    }

    public z<k> c(AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return z.g(new vu1(this, authorizationRequest, httpCookie));
    }
}
