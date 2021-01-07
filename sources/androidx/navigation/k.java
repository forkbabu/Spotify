package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k {
    private static final Pattern i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final ArrayList<String> a = new ArrayList<>();
    private final Map<String, c> b = new HashMap();
    private Pattern c = null;
    private boolean d = false;
    private boolean e = false;
    private final String f;
    private Pattern g = null;
    private final String h;

    public static final class a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public k a() {
            return new k(this.a, this.b, this.c);
        }

        public a b(String str) {
            if (!str.isEmpty()) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static class b implements Comparable<b> {
        String a;
        String b;

        b(String str) {
            String[] split = str.split("/", -1);
            this.a = split[0];
            this.b = split[1];
        }

        /* renamed from: d */
        public int compareTo(b bVar) {
            int i = this.a.equals(bVar.a) ? 2 : 0;
            return this.b.equals(bVar.b) ? i + 1 : i;
        }
    }

    /* access modifiers changed from: private */
    public static class c {
        private String a;
        private ArrayList<String> b = new ArrayList<>();

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(String str) {
            this.b.add(str);
        }

        /* access modifiers changed from: package-private */
        public String b(int i) {
            return this.b.get(i);
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void d(String str) {
            this.a = str;
        }

        public int e() {
            return this.b.size();
        }
    }

    k(String str, String str2, String str3) {
        this.f = str2;
        this.h = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.e = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, compile);
                }
                this.d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    c cVar = new c();
                    int i2 = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                        sb2.append("(.+?)?");
                        i2 = matcher2.end();
                    }
                    if (i2 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i2)));
                    }
                    cVar.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.b.put(str4, cVar);
                }
            } else {
                this.d = a(str, sb, compile);
            }
            this.c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            b bVar = new b(str3);
            StringBuilder V0 = je.V0("^(");
            V0.append(bVar.a);
            V0.append("|[*]+)/(");
            V0.append(bVar.b);
            V0.append("|[*]+)$");
            this.g = Pattern.compile(V0.toString().replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException(je.y0("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
    }

    private boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i2 = 0;
        while (matcher.find()) {
            this.a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i2, matcher.start())));
            sb.append("(.+?)");
            i2 = matcher.end();
            z = false;
        }
        if (i2 < str.length()) {
            sb.append(Pattern.quote(str.substring(i2)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    private boolean f(Bundle bundle, String str, String str2, g gVar) {
        if (gVar != null) {
            t<?> b2 = gVar.b();
            try {
                b2.e(bundle, str, b2.d(str2));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }

    public String b() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public Bundle c(Uri uri, Map<String, g> map) {
        Matcher matcher;
        Matcher matcher2 = this.c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.a.size();
        int i2 = 0;
        while (i2 < size) {
            String str = this.a.get(i2);
            i2++;
            if (f(bundle, str, Uri.decode(matcher2.group(i2)), map.get(str))) {
                return null;
            }
        }
        if (this.e) {
            for (String str2 : this.b.keySet()) {
                c cVar = this.b.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                int i3 = 0;
                while (true) {
                    if (i3 < cVar.e()) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i3 + 1)) : null;
                        String b2 = cVar.b(i3);
                        g gVar = map.get(b2);
                        if (gVar != null && (decode == null || decode.replaceAll("[{}]", "").equals(b2))) {
                            if (gVar.a() != null) {
                                decode = gVar.a().toString();
                            } else if (gVar.d()) {
                                decode = null;
                            }
                        }
                        if (f(bundle, b2, decode, gVar)) {
                            return null;
                        }
                        i3++;
                    }
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public int d(String str) {
        if (this.h == null || !this.g.matcher(str).matches()) {
            return -1;
        }
        return new b(this.h).compareTo(new b(str));
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.d;
    }
}
