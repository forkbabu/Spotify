package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.e;
import com.spotify.android.flags.j;
import com.spotify.mobile.android.service.feature.k;
import com.spotify.mobile.android.service.feature.v;
import com.spotify.mobile.android.ui.fragments.logic.p;

/* renamed from: jab  reason: default package */
public class jab extends v {
    @Deprecated
    public static final j c;
    @Deprecated
    public static final j d;
    @Deprecated
    public static final e e = new e("video-cdn-sampling", new p("video-cdn-sampling"), Overridable.ALWAYS);

    static {
        Overridable overridable = Overridable.DEBUG;
        k.g("streaming-rules", overridable);
        Overridable overridable2 = Overridable.NEVER;
        c = k.g("widevine-license-url", overridable2);
        d = k.g("video-manifest-url", overridable2);
        k.e("video-device-blacklisted", overridable);
    }
}
