package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: s20  reason: default package */
public final class s20 {
    public static final com.google.gson.w<String> A;
    public static final com.google.gson.w<BigDecimal> B = new h();
    public static final com.google.gson.w<BigInteger> C = new i();
    public static final com.google.gson.x D;
    public static final com.google.gson.w<StringBuilder> E;
    public static final com.google.gson.x F;
    public static final com.google.gson.w<StringBuffer> G;
    public static final com.google.gson.x H;
    public static final com.google.gson.w<URL> I;
    public static final com.google.gson.x J;
    public static final com.google.gson.w<URI> K;
    public static final com.google.gson.x L;
    public static final com.google.gson.w<InetAddress> M;
    public static final com.google.gson.x N;
    public static final com.google.gson.w<UUID> O;
    public static final com.google.gson.x P;
    public static final com.google.gson.w<Currency> Q;
    public static final com.google.gson.x R;
    public static final com.google.gson.x S = new r();
    public static final com.google.gson.w<Calendar> T;
    public static final com.google.gson.x U;
    public static final com.google.gson.w<Locale> V;
    public static final com.google.gson.x W;
    public static final com.google.gson.w<com.google.gson.p> X;
    public static final com.google.gson.x Y;
    public static final com.google.gson.x Z = new w();
    public static final com.google.gson.w<Class> a;
    public static final com.google.gson.x b;
    public static final com.google.gson.w<BitSet> c;
    public static final com.google.gson.x d;
    public static final com.google.gson.w<Boolean> e;
    public static final com.google.gson.w<Boolean> f = new a0();
    public static final com.google.gson.x g;
    public static final com.google.gson.w<Number> h;
    public static final com.google.gson.x i;
    public static final com.google.gson.w<Number> j;
    public static final com.google.gson.x k;
    public static final com.google.gson.w<Number> l;
    public static final com.google.gson.x m;
    public static final com.google.gson.w<AtomicInteger> n;
    public static final com.google.gson.x o;
    public static final com.google.gson.w<AtomicBoolean> p;
    public static final com.google.gson.x q;
    public static final com.google.gson.w<AtomicIntegerArray> r;
    public static final com.google.gson.x s;
    public static final com.google.gson.w<Number> t = new b();
    public static final com.google.gson.w<Number> u = new c();
    public static final com.google.gson.w<Number> v = new d();
    public static final com.google.gson.w<Number> w;
    public static final com.google.gson.x x;
    public static final com.google.gson.w<Character> y;
    public static final com.google.gson.x z;

    /* renamed from: s20$a */
    class a extends com.google.gson.w<AtomicIntegerArray> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public AtomicIntegerArray read(com.google.gson.stream.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.l()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.v()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            aVar.g();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            bVar.b();
            int length = atomicIntegerArray2.length();
            for (int i = 0; i < length; i++) {
                bVar.I((long) atomicIntegerArray2.get(i));
            }
            bVar.g();
        }
    }

    /* renamed from: s20$a0 */
    class a0 extends com.google.gson.w<Boolean> {
        a0() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Boolean read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return Boolean.valueOf(aVar.G());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Boolean bool) {
            String str;
            Boolean bool2 = bool;
            if (bool2 == null) {
                str = "null";
            } else {
                str = bool2.toString();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$b */
    class b extends com.google.gson.w<Number> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return Long.valueOf(aVar.w());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$b0 */
    class b0 extends com.google.gson.w<Number> {
        b0() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.v());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$c */
    class c extends com.google.gson.w<Number> {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.s());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$c0 */
    class c0 extends com.google.gson.w<Number> {
        c0() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.v());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$d */
    class d extends com.google.gson.w<Number> {
        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return Double.valueOf(aVar.s());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$d0 */
    class d0 extends com.google.gson.w<Number> {
        d0() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return Integer.valueOf(aVar.v());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$e */
    class e extends com.google.gson.w<Number> {
        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Number read(com.google.gson.stream.a aVar) {
            JsonToken J = aVar.J();
            int ordinal = J.ordinal();
            if (ordinal == 5 || ordinal == 6) {
                return new LazilyParsedNumber(aVar.G());
            }
            if (ordinal == 8) {
                aVar.D();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + J);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Number number) {
            bVar.M(number);
        }
    }

    /* renamed from: s20$e0 */
    class e0 extends com.google.gson.w<AtomicInteger> {
        e0() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public AtomicInteger read(com.google.gson.stream.a aVar) {
            try {
                return new AtomicInteger(aVar.v());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, AtomicInteger atomicInteger) {
            bVar.I((long) atomicInteger.get());
        }
    }

    /* renamed from: s20$f */
    class f extends com.google.gson.w<Character> {
        f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Character read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            String G = aVar.G();
            if (G.length() == 1) {
                return Character.valueOf(G.charAt(0));
            }
            throw new JsonSyntaxException(je.x0("Expecting character, got: ", G));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Character ch) {
            String str;
            Character ch2 = ch;
            if (ch2 == null) {
                str = null;
            } else {
                str = String.valueOf(ch2);
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$f0 */
    class f0 extends com.google.gson.w<AtomicBoolean> {
        f0() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public AtomicBoolean read(com.google.gson.stream.a aVar) {
            return new AtomicBoolean(aVar.r());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, AtomicBoolean atomicBoolean) {
            bVar.Q(atomicBoolean.get());
        }
    }

    /* renamed from: s20$g */
    class g extends com.google.gson.w<String> {
        g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public String read(com.google.gson.stream.a aVar) {
            JsonToken J = aVar.J();
            if (J == JsonToken.NULL) {
                aVar.D();
                return null;
            } else if (J == JsonToken.BOOLEAN) {
                return Boolean.toString(aVar.r());
            } else {
                return aVar.G();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, String str) {
            bVar.O(str);
        }
    }

    /* renamed from: s20$g0 */
    private static final class g0<T extends Enum<T>> extends com.google.gson.w<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public g0(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    d20 d20 = (d20) cls.getField(name).getAnnotation(d20.class);
                    if (d20 != null) {
                        name = d20.value();
                        for (String str : d20.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.w
        public Object read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return this.a.get(aVar.G());
            }
            aVar.D();
            return null;
        }

        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Object obj) {
            String str;
            Enum r3 = (Enum) obj;
            if (r3 == null) {
                str = null;
            } else {
                str = this.b.get(r3);
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$h */
    class h extends com.google.gson.w<BigDecimal> {
        h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public BigDecimal read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return new BigDecimal(aVar.G());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, BigDecimal bigDecimal) {
            bVar.M(bigDecimal);
        }
    }

    /* renamed from: s20$i */
    class i extends com.google.gson.w<BigInteger> {
        i() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public BigInteger read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return new BigInteger(aVar.G());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, BigInteger bigInteger) {
            bVar.M(bigInteger);
        }
    }

    /* renamed from: s20$j */
    class j extends com.google.gson.w<StringBuilder> {
        j() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public StringBuilder read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return new StringBuilder(aVar.G());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, StringBuilder sb) {
            String str;
            StringBuilder sb2 = sb;
            if (sb2 == null) {
                str = null;
            } else {
                str = sb2.toString();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$k */
    class k extends com.google.gson.w<Class> {
        k() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Class read(com.google.gson.stream.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Class cls) {
            throw new UnsupportedOperationException(je.l0(cls, je.V0("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }

    /* renamed from: s20$l */
    class l extends com.google.gson.w<StringBuffer> {
        l() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public StringBuffer read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return new StringBuffer(aVar.G());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, StringBuffer stringBuffer) {
            String str;
            StringBuffer stringBuffer2 = stringBuffer;
            if (stringBuffer2 == null) {
                str = null;
            } else {
                str = stringBuffer2.toString();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$m */
    class m extends com.google.gson.w<URL> {
        m() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public URL read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            String G = aVar.G();
            if ("null".equals(G)) {
                return null;
            }
            return new URL(G);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, URL url) {
            String str;
            URL url2 = url;
            if (url2 == null) {
                str = null;
            } else {
                str = url2.toExternalForm();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$n */
    class n extends com.google.gson.w<URI> {
        n() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public URI read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                String G = aVar.G();
                if ("null".equals(G)) {
                    return null;
                }
                return new URI(G);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, URI uri) {
            String str;
            URI uri2 = uri;
            if (uri2 == null) {
                str = null;
            } else {
                str = uri2.toASCIIString();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$o */
    class o extends com.google.gson.w<InetAddress> {
        o() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public InetAddress read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return InetAddress.getByName(aVar.G());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, InetAddress inetAddress) {
            String str;
            InetAddress inetAddress2 = inetAddress;
            if (inetAddress2 == null) {
                str = null;
            } else {
                str = inetAddress2.getHostAddress();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$p */
    class p extends com.google.gson.w<UUID> {
        p() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public UUID read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return UUID.fromString(aVar.G());
            }
            aVar.D();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, UUID uuid) {
            String str;
            UUID uuid2 = uuid;
            if (uuid2 == null) {
                str = null;
            } else {
                str = uuid2.toString();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$q */
    class q extends com.google.gson.w<Currency> {
        q() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Currency read(com.google.gson.stream.a aVar) {
            return Currency.getInstance(aVar.G());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Currency currency) {
            bVar.O(currency.getCurrencyCode());
        }
    }

    /* renamed from: s20$r */
    class r implements com.google.gson.x {

        /* renamed from: s20$r$a */
        class a extends com.google.gson.w<Timestamp> {
            final /* synthetic */ com.google.gson.w a;

            a(r rVar, com.google.gson.w wVar) {
                this.a = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.w
            public Timestamp read(com.google.gson.stream.a aVar) {
                Date date = (Date) this.a.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
            @Override // com.google.gson.w
            public void write(com.google.gson.stream.b bVar, Timestamp timestamp) {
                this.a.write(bVar, timestamp);
            }
        }

        r() {
        }

        @Override // com.google.gson.x
        public <T> com.google.gson.w<T> b(com.google.gson.j jVar, z20<T> z20) {
            if (z20.c() != Timestamp.class) {
                return null;
            }
            jVar.getClass();
            return new a(this, jVar.c(z20.a(Date.class)));
        }
    }

    /* renamed from: s20$s */
    class s extends com.google.gson.w<Calendar> {
        s() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Calendar read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            aVar.b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.J() != JsonToken.END_OBJECT) {
                String B = aVar.B();
                int v = aVar.v();
                if ("year".equals(B)) {
                    i = v;
                } else if ("month".equals(B)) {
                    i2 = v;
                } else if ("dayOfMonth".equals(B)) {
                    i3 = v;
                } else if ("hourOfDay".equals(B)) {
                    i4 = v;
                } else if ("minute".equals(B)) {
                    i5 = v;
                } else if ("second".equals(B)) {
                    i6 = v;
                }
            }
            aVar.h();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                bVar.r();
                return;
            }
            bVar.d();
            bVar.p("year");
            bVar.I((long) calendar2.get(1));
            bVar.p("month");
            bVar.I((long) calendar2.get(2));
            bVar.p("dayOfMonth");
            bVar.I((long) calendar2.get(5));
            bVar.p("hourOfDay");
            bVar.I((long) calendar2.get(11));
            bVar.p("minute");
            bVar.I((long) calendar2.get(12));
            bVar.p("second");
            bVar.I((long) calendar2.get(13));
            bVar.h();
        }
    }

    /* renamed from: s20$t */
    class t extends com.google.gson.w<Locale> {
        t() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Locale read(com.google.gson.stream.a aVar) {
            String str = null;
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.G(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Locale locale) {
            String str;
            Locale locale2 = locale;
            if (locale2 == null) {
                str = null;
            } else {
                str = locale2.toString();
            }
            bVar.O(str);
        }
    }

    /* renamed from: s20$u */
    class u extends com.google.gson.w<com.google.gson.p> {
        u() {
        }

        /* renamed from: a */
        public com.google.gson.p read(com.google.gson.stream.a aVar) {
            int ordinal = aVar.J().ordinal();
            if (ordinal == 0) {
                com.google.gson.m mVar = new com.google.gson.m();
                aVar.a();
                while (aVar.l()) {
                    mVar.f(read(aVar));
                }
                aVar.g();
                return mVar;
            } else if (ordinal == 2) {
                com.google.gson.r rVar = new com.google.gson.r();
                aVar.b();
                while (aVar.l()) {
                    rVar.f(aVar.B(), read(aVar));
                }
                aVar.h();
                return rVar;
            } else if (ordinal == 5) {
                return new com.google.gson.t(aVar.G());
            } else {
                if (ordinal == 6) {
                    return new com.google.gson.t(new LazilyParsedNumber(aVar.G()));
                }
                if (ordinal == 7) {
                    return new com.google.gson.t(Boolean.valueOf(aVar.r()));
                }
                if (ordinal == 8) {
                    aVar.D();
                    return com.google.gson.q.a;
                }
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: b */
        public void write(com.google.gson.stream.b bVar, com.google.gson.p pVar) {
            if (pVar == null || (pVar instanceof com.google.gson.q)) {
                bVar.r();
            } else if (pVar instanceof com.google.gson.t) {
                com.google.gson.t d = pVar.d();
                if (d.o()) {
                    bVar.M(d.k());
                } else if (d.l()) {
                    bVar.Q(d.f());
                } else {
                    bVar.O(d.e());
                }
            } else {
                boolean z = pVar instanceof com.google.gson.m;
                if (z) {
                    bVar.b();
                    if (z) {
                        Iterator<com.google.gson.p> it = ((com.google.gson.m) pVar).iterator();
                        while (it.hasNext()) {
                            write(bVar, it.next());
                        }
                        bVar.g();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + pVar);
                } else if (pVar instanceof com.google.gson.r) {
                    bVar.d();
                    for (Map.Entry<String, com.google.gson.p> entry : pVar.c().entrySet()) {
                        bVar.p(entry.getKey());
                        write(bVar, entry.getValue());
                    }
                    bVar.h();
                } else {
                    StringBuilder V0 = je.V0("Couldn't write ");
                    V0.append(pVar.getClass());
                    throw new IllegalArgumentException(V0.toString());
                }
            }
        }
    }

    /* renamed from: s20$v */
    class v extends com.google.gson.w<BitSet> {
        v() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r6.v() != 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
        @Override // com.google.gson.w
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet read(com.google.gson.stream.a r6) {
            /*
                r5 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.a()
                com.google.gson.stream.JsonToken r1 = r6.J()
                r2 = 0
            L_0x000d:
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r3) goto L_0x0066
                int r3 = r1.ordinal()
                r4 = 5
                if (r3 == r4) goto L_0x0041
                r4 = 6
                if (r3 == r4) goto L_0x003a
                r4 = 7
                if (r3 != r4) goto L_0x0023
                boolean r1 = r6.r()
                goto L_0x004e
            L_0x0023:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x003a:
                int r1 = r6.v()
                if (r1 == 0) goto L_0x004d
                goto L_0x004b
            L_0x0041:
                java.lang.String r1 = r6.G()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005a }
                if (r1 == 0) goto L_0x004d
            L_0x004b:
                r1 = 1
                goto L_0x004e
            L_0x004d:
                r1 = 0
            L_0x004e:
                if (r1 == 0) goto L_0x0053
                r0.set(r2)
            L_0x0053:
                int r2 = r2 + 1
                com.google.gson.stream.JsonToken r1 = r6.J()
                goto L_0x000d
            L_0x005a:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = defpackage.je.x0(r0, r1)
                r6.<init>(r0)
                throw r6
            L_0x0066:
                r6.g()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.v.read(com.google.gson.stream.a):java.lang.Object");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            bVar.b();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                bVar.I(bitSet2.get(i) ? 1 : 0);
            }
            bVar.g();
        }
    }

    /* renamed from: s20$w */
    class w implements com.google.gson.x {
        w() {
        }

        @Override // com.google.gson.x
        public <T> com.google.gson.w<T> b(com.google.gson.j jVar, z20<T> z20) {
            Class<? super Object> c = z20.c();
            if (!Enum.class.isAssignableFrom(c) || c == Enum.class) {
                return null;
            }
            if (!c.isEnum()) {
                c = c.getSuperclass();
            }
            return new g0(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s20$x */
    public class x implements com.google.gson.x {
        final /* synthetic */ Class a;
        final /* synthetic */ com.google.gson.w b;

        x(Class cls, com.google.gson.w wVar) {
            this.a = cls;
            this.b = wVar;
        }

        @Override // com.google.gson.x
        public <T> com.google.gson.w<T> b(com.google.gson.j jVar, z20<T> z20) {
            if (z20.c() == this.a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Factory[type=");
            V0.append(this.a.getName());
            V0.append(",adapter=");
            V0.append(this.b);
            V0.append("]");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s20$y */
    public class y implements com.google.gson.x {
        final /* synthetic */ Class a;
        final /* synthetic */ Class b;
        final /* synthetic */ com.google.gson.w c;

        y(Class cls, Class cls2, com.google.gson.w wVar) {
            this.a = cls;
            this.b = cls2;
            this.c = wVar;
        }

        @Override // com.google.gson.x
        public <T> com.google.gson.w<T> b(com.google.gson.j jVar, z20<T> z20) {
            Class<? super T> c2 = z20.c();
            if (c2 == this.a || c2 == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Factory[type=");
            V0.append(this.b.getName());
            V0.append("+");
            V0.append(this.a.getName());
            V0.append(",adapter=");
            V0.append(this.c);
            V0.append("]");
            return V0.toString();
        }
    }

    /* renamed from: s20$z */
    class z extends com.google.gson.w<Boolean> {
        z() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.w
        public Boolean read(com.google.gson.stream.a aVar) {
            JsonToken J = aVar.J();
            if (J == JsonToken.NULL) {
                aVar.D();
                return null;
            } else if (J == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.G()));
            } else {
                return Boolean.valueOf(aVar.r());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, Boolean bool) {
            bVar.J(bool);
        }
    }

    static {
        com.google.gson.w<Class> nullSafe = new k().nullSafe();
        a = nullSafe;
        b = new x(Class.class, nullSafe);
        com.google.gson.w<BitSet> nullSafe2 = new v().nullSafe();
        c = nullSafe2;
        d = new x(BitSet.class, nullSafe2);
        z zVar = new z();
        e = zVar;
        g = new y(Boolean.TYPE, Boolean.class, zVar);
        b0 b0Var = new b0();
        h = b0Var;
        i = new y(Byte.TYPE, Byte.class, b0Var);
        c0 c0Var = new c0();
        j = c0Var;
        k = new y(Short.TYPE, Short.class, c0Var);
        d0 d0Var = new d0();
        l = d0Var;
        m = new y(Integer.TYPE, Integer.class, d0Var);
        com.google.gson.w<AtomicInteger> nullSafe3 = new e0().nullSafe();
        n = nullSafe3;
        o = new x(AtomicInteger.class, nullSafe3);
        com.google.gson.w<AtomicBoolean> nullSafe4 = new f0().nullSafe();
        p = nullSafe4;
        q = new x(AtomicBoolean.class, nullSafe4);
        com.google.gson.w<AtomicIntegerArray> nullSafe5 = new a().nullSafe();
        r = nullSafe5;
        s = new x(AtomicIntegerArray.class, nullSafe5);
        e eVar = new e();
        w = eVar;
        x = new x(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new y(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        D = new x(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = new x(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new x(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new x(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new x(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = new u20(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = new x(UUID.class, pVar);
        com.google.gson.w<Currency> nullSafe6 = new q().nullSafe();
        Q = nullSafe6;
        R = new x(Currency.class, nullSafe6);
        s sVar = new s();
        T = sVar;
        U = new t20(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new x(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new u20(com.google.gson.p.class, uVar);
    }

    public static <TT> com.google.gson.x a(Class<TT> cls, com.google.gson.w<TT> wVar) {
        return new x(cls, wVar);
    }

    public static <TT> com.google.gson.x b(Class<TT> cls, Class<TT> cls2, com.google.gson.w<? super TT> wVar) {
        return new y(cls, cls2, wVar);
    }
}
