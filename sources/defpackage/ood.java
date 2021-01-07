package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: ood  reason: default package */
public final class ood {
    public static boolean a(SessionState sessionState) {
        return sessionState.loggedIn() && !TextUtils.isEmpty(sessionState.currentUser()) && !TextUtils.isEmpty(sessionState.countryCode()) && !TextUtils.isEmpty(sessionState.productType());
    }
}
