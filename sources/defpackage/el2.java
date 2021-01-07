package defpackage;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.builtinauth.model.a;
import java.util.Map;

/* renamed from: el2  reason: default package */
public final class el2 {
    public static AuthorizationRequest a(a aVar) {
        String d = aVar.d();
        Map<String, String> f = aVar.f();
        f.getClass();
        String str = f.get("redirect_uri");
        str.getClass();
        String str2 = str;
        ImmutableSet<String> b = b(aVar);
        return AuthorizationRequest.a(d, AuthorizationRequest.ResponseType.TOKEN, str2, aVar.e(), null, (String[]) b.toArray(new String[0]), false);
    }

    public static ImmutableSet<String> b(a aVar) {
        String str = aVar.f().get("scopes");
        if (str != null) {
            return ImmutableSet.copyOf(Splitter.on(",").omitEmptyStrings().split(str));
        }
        return ImmutableSet.of();
    }
}
