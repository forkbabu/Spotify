package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;

/* renamed from: rl4  reason: default package */
public class rl4 implements ll4 {
    @Override // defpackage.ll4
    public boolean a(Uri uri) {
        return !ImmutableSet.of("http", Constants.SCHEME).contains(uri.getScheme().toLowerCase(Locale.ENGLISH)) || "open.spotify.com".equals(uri.getHost());
    }
}
