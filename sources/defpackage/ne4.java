package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.libs.podcast.download.f0;
import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

/* access modifiers changed from: package-private */
/* renamed from: ne4  reason: default package */
public class ne4 {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: ne4$b */
    public static class b {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final boolean e;
        private String f;

        b(c cVar, String str, cqe cqe, String str2, boolean z) {
            this.a = str;
            this.b = cqe.f().getID();
            this.c = str2;
            this.d = f0.b(cVar);
            this.e = z;
        }

        /* access modifiers changed from: package-private */
        public ne4 a() {
            String str;
            if (!this.f.isEmpty()) {
                str = this.f;
            } else {
                String str2 = this.a;
                if (cg4.c(str2) || cg4.b(str2)) {
                    String[] split = this.a.split(":");
                    str = split[split.length - 1];
                } else {
                    str = "";
                }
            }
            return new ne4(str, this.b, this.d, this.c, this.e ? "application:nft" : null, null, null);
        }

        public b b() {
            this.f = "";
            return this;
        }
    }

    ne4(String str, String str2, boolean z, String str3, String str4, String str5, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    /* access modifiers changed from: package-private */
    public z<HubsJsonViewModel> a(cf4 cf4) {
        return cf4.b(this.a, this.b, this.c, this.d, this.e, null);
    }

    /* access modifiers changed from: package-private */
    public z<v<e0>> b(cf4 cf4) {
        return cf4.a(this.a, this.b, this.c, this.d, this.e, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowseRequest{mPage='");
        je.A(V0, this.a, '\'', ", mTimezone='");
        je.A(V0, this.b, '\'', ", mIsPodcastsEnabled=");
        V0.append(this.c);
        V0.append(", mLocale='");
        je.A(V0, this.d, '\'', ", mSignal='");
        V0.append(this.e);
        V0.append('\'');
        V0.append(", mOffset='");
        V0.append((String) null);
        V0.append('\'');
        V0.append('}');
        return V0.toString();
    }
}
