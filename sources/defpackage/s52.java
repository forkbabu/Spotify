package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: s52  reason: default package */
public class s52 {
    public static final Pattern k = Pattern.compile(":");
    public static final Pattern l = Pattern.compile("\\?");
    public static final Pattern m = Pattern.compile("#");
    public static final Pattern n = Pattern.compile("/");
    private final String a;
    private final List<String> b;
    private final Map<String, String> c;
    private final String d;
    private final LinkType e;
    private final boolean f;
    private final String g;
    private final String h;
    private final List<String> i;
    private final List<String> j;

    /* renamed from: s52$b */
    public static class b {
        private final String a;
        private final List<String> b = new ArrayList();
        private final Map<String, String> c = new LinkedHashMap();
        private String d;
        private LinkType e;
        private boolean f;
        private String g;
        private String h;
        private final List<String> i = new ArrayList();
        private final List<String> j = new ArrayList();

        public b(String str) {
            this.a = str;
        }

        public s52 k() {
            return new s52(this, null);
        }

        public b l(String str) {
            this.j.add(str);
            return this;
        }

        public b m(String str) {
            this.h = str;
            return this;
        }

        public b n(String str) {
            this.i.add(str);
            return this;
        }

        public b o(boolean z) {
            this.f = z;
            return this;
        }

        public b p(LinkType linkType) {
            this.e = linkType;
            return this;
        }

        public b q(String str) {
            this.g = str;
            return this;
        }

        public b r(String str) {
            this.b.add(str);
            return this;
        }

        public b s(String str) {
            this.d = str;
            return this;
        }
    }

    static {
        Pattern.compile("\\=|\\&");
    }

    s52(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
    }

    public List<String> a() {
        return this.i;
    }

    public List<String> b() {
        return this.b;
    }

    public boolean c(String str) {
        return new c.b(this.d).a(str);
    }

    public String toString() {
        StringBuilder V0 = je.V0("mLinkName = ");
        V0.append(this.a);
        V0.append(", pattern = ");
        V0.append(this.b);
        V0.append(", verifier = ");
        V0.append(this.d);
        V0.append(", mLinkType = ");
        V0.append(this.e);
        V0.append(", mParentLinkType = ");
        V0.append((Object) null);
        V0.append(", mIsPublic = ");
        V0.append(this.f);
        V0.append(", mOwner = ");
        V0.append(this.g);
        V0.append(", mDescription = ");
        V0.append(this.h);
        V0.append(", mExamples = ");
        V0.append(this.i);
        V0.append(", mCounterExamples = ");
        V0.append(this.j);
        V0.append('\n');
        return V0.toString();
    }
}
