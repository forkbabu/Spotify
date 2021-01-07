package defpackage;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: m10  reason: default package */
public final class m10 implements i10<m10> {
    private static final com.google.firebase.encoders.b<Object> e = j10.b();
    private static final d<String> f = k10.b();
    private static final d<Boolean> g = l10.b();
    private static final b h = new b(null);
    public static final /* synthetic */ int i = 0;
    private final Map<Class<?>, com.google.firebase.encoders.b<?>> a;
    private final Map<Class<?>, d<?>> b;
    private com.google.firebase.encoders.b<Object> c = e;
    private boolean d = false;

    /* access modifiers changed from: package-private */
    /* renamed from: m10$a */
    public class a implements com.google.firebase.encoders.a {
        a() {
        }

        @Override // com.google.firebase.encoders.a
        public void a(Object obj, Writer writer) {
            n10 n10 = new n10(writer, m10.this.a, m10.this.b, m10.this.c, m10.this.d);
            n10.g(obj, false);
            n10.i();
        }

        @Override // com.google.firebase.encoders.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: m10$b */
    private static final class b implements d<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        b(a aVar) {
        }

        @Override // com.google.firebase.encoders.d
        public void a(Object obj, Object obj2) {
            ((e) obj2).a(a.format((Date) obj));
        }
    }

    public m10() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public com.google.firebase.encoders.a e() {
        return new a();
    }

    public m10 f(boolean z) {
        this.d = z;
        return this;
    }

    public i10 g(Class cls, com.google.firebase.encoders.b bVar) {
        this.a.put(cls, bVar);
        this.b.remove(cls);
        return this;
    }

    public <T> m10 h(Class<T> cls, com.google.firebase.encoders.b<? super T> bVar) {
        this.a.put(cls, bVar);
        this.b.remove(cls);
        return this;
    }
}
