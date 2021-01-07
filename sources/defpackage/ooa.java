package defpackage;

import android.text.SpannableString;
import android.text.style.URLSpan;
import defpackage.soa;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

/* renamed from: ooa  reason: default package */
public final class ooa implements joa {
    private final soa.a a;

    /* renamed from: ooa$a */
    private static final class a {
        private final Object a;
        private final int b;
        private final int c;
        private final int d;

        public a(Object obj, int i, int i2, int i3) {
            h.e(obj, "span");
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.d;
        }

        public final Object c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }
    }

    public ooa(soa.a aVar) {
        h.e(aVar, "urlSpanFactory");
        this.a = aVar;
    }

    @Override // defpackage.joa
    public CharSequence a(CharSequence charSequence) {
        h.e(charSequence, "original");
        SpannableString spannableString = new SpannableString(charSequence);
        Object[] spans = spannableString.getSpans(0, charSequence.length(), Object.class);
        h.d(spans, "spannableString.getSpans….length, Any::class.java)");
        ArrayList<a> arrayList = new ArrayList(spans.length);
        for (Object obj : spans) {
            h.d(obj, "span");
            arrayList.add(new a(obj, spannableString.getSpanStart(obj), spannableString.getSpanEnd(obj), spannableString.getSpanFlags(obj)));
        }
        r3.a(spannableString, 3);
        Object[] spans2 = spannableString.getSpans(0, charSequence.length(), URLSpan.class);
        h.d(spans2, "spannableString.getSpans…gth, URLSpan::class.java)");
        for (Object obj2 : spans2) {
            URLSpan uRLSpan = (URLSpan) obj2;
            soa.a aVar = this.a;
            h.d(uRLSpan, "span");
            String url = uRLSpan.getURL();
            h.d(url, "span.url");
            soa a2 = aVar.a(url);
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(a2, spanStart, spanEnd, spanFlags);
        }
        for (a aVar2 : arrayList) {
            spannableString.setSpan(aVar2.c(), aVar2.d(), aVar2.a(), aVar2.b());
        }
        return spannableString;
    }
}
