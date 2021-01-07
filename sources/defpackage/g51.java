package defpackage;

import com.google.common.hash.Hashing;
import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.i;
import com.spotify.android.flags.j;
import com.spotify.mobile.android.service.feature.k;
import com.spotify.mobile.android.service.feature.v;
import com.spotify.mobile.android.ui.fragments.logic.p;

/* renamed from: g51  reason: default package */
public class g51 extends v {
    @Deprecated
    public static final j c;
    public static final com.spotify.android.flags.a d = new a("shuffle_restricted", new p("streaming-rules"), Overridable.NEVER);
    @Deprecated
    public static final com.spotify.android.flags.a e;
    @Deprecated
    public static final com.spotify.android.flags.a f;
    @Deprecated
    public static final j g;

    /* renamed from: g51$a */
    static class a extends com.spotify.android.flags.a {
        a(String str, i iVar, Overridable overridable) {
            super(str, iVar, overridable);
        }

        /* Return type fixed from 'java.io.Serializable' to match base method */
        @Override // com.spotify.android.flags.a, com.spotify.android.flags.b
        public Boolean h(String str) {
            return g51.d(str);
        }

        @Override // com.spotify.android.flags.a
        public Boolean j(String str) {
            return g51.d(str);
        }
    }

    static {
        Overridable overridable = Overridable.DEBUG;
        k.e("on-demand", overridable);
        c = k.g("type", overridable);
        e = k.e("offline", overridable);
        f = k.e("limited-offline", overridable);
        g = k.g("on-demand-trial", overridable);
    }

    public static Boolean d(String str) {
        return Boolean.valueOf(str == null || Hashing.crc32().hashUnencodedChars(str).asInt() == 1929113152);
    }
}
