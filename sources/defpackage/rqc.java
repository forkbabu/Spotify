package defpackage;

import android.text.Spannable;
import android.text.style.URLSpan;

/* renamed from: rqc  reason: default package */
public class rqc {
    private final b a;

    /* renamed from: rqc$a */
    public static class a {
    }

    /* renamed from: rqc$b */
    public interface b {
        void a(String str);
    }

    public rqc(b bVar) {
        this.a = bVar;
    }

    public Spannable a(Spannable spannable) {
        r3.a(spannable, 3);
        b bVar = this.a;
        spannable.getClass();
        bVar.getClass();
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        for (Object obj : spans) {
            if (obj instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj;
                Object qqc = new qqc(uRLSpan.getURL(), bVar, uRLSpan);
                int spanStart = spannable.getSpanStart(uRLSpan);
                int spanEnd = spannable.getSpanEnd(uRLSpan);
                int spanFlags = spannable.getSpanFlags(uRLSpan);
                spannable.removeSpan(uRLSpan);
                spannable.setSpan(qqc, spanStart, spanEnd, spanFlags);
            }
        }
        return spannable;
    }
}
