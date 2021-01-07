package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.b;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d implements c {
    private List<String> a;
    private final Matcher b;
    private final CharSequence c;

    public static final class a extends b<String> {
        final /* synthetic */ d a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.a = dVar;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractCollection
        public int d() {
            return ((Matcher) d.c(this.a)).groupCount() + 1;
        }

        @Override // kotlin.collections.b, java.util.List
        public Object get(int i) {
            String group = ((Matcher) d.c(this.a)).group(i);
            return group != null ? group : "";
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public d(Matcher matcher, CharSequence charSequence) {
        h.e(matcher, "matcher");
        h.e(charSequence, "input");
        this.b = matcher;
        this.c = charSequence;
    }

    public static final MatchResult c(d dVar) {
        return dVar.b;
    }

    @Override // kotlin.text.c
    public List<String> a() {
        if (this.a == null) {
            this.a = new a(this);
        }
        List<String> list = this.a;
        h.c(list);
        return list;
    }

    @Override // kotlin.text.c
    public jnf b() {
        Matcher matcher = this.b;
        return knf.e(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.c
    public c next() {
        int end = this.b.end() + (this.b.end() == this.b.start() ? 1 : 0);
        if (end > this.c.length()) {
            return null;
        }
        Matcher matcher = this.b.pattern().matcher(this.c);
        h.d(matcher, "matcher.pattern().matcher(input)");
        CharSequence charSequence = this.c;
        if (!matcher.find(end)) {
            return null;
        }
        return new d(matcher, charSequence);
    }
}
