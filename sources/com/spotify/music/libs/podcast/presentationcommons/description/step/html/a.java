package com.spotify.music.libs.podcast.presentationcommons.description.step.html;

import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import defpackage.soa;
import kotlin.jvm.internal.h;

public final class a implements joa {
    private final d a;
    private final soa.a b;

    public a(d dVar, soa.a aVar) {
        h.e(dVar, "customTagHandler");
        h.e(aVar, "podcastUrlSpanFactory");
        this.a = dVar;
        this.b = aVar;
    }

    @Override // defpackage.joa
    public CharSequence a(CharSequence charSequence) {
        Spanned spanned;
        h.e(charSequence, "original");
        String a2 = this.a.a(charSequence);
        d dVar = this.a;
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(a2, 0, null, dVar);
        } else {
            spanned = Html.fromHtml(a2, null, dVar);
        }
        if (spanned != null) {
            Spannable spannable = (Spannable) spanned;
            Object[] spans = spannable.getSpans(0, spannable.length(), RelativeSizeSpan.class);
            h.d(spans, "spannable.getSpans(0, sp…tiveSizeSpan::class.java)");
            for (Object obj : spans) {
                RelativeSizeSpan relativeSizeSpan = (RelativeSizeSpan) obj;
                int spanStart = spannable.getSpanStart(relativeSizeSpan);
                int spanEnd = spannable.getSpanEnd(relativeSizeSpan);
                spannable.removeSpan(relativeSizeSpan);
                spannable.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
            }
            Object[] spans2 = spannable.getSpans(0, spannable.length(), QuoteSpan.class);
            h.d(spans2, "spannable.getSpans(0, sp…h, QuoteSpan::class.java)");
            for (Object obj2 : spans2) {
                spannable.removeSpan((QuoteSpan) obj2);
            }
            Object[] spans3 = spannable.getSpans(0, spannable.length(), URLSpan.class);
            h.d(spans3, "spannable.getSpans(0, sp…gth, URLSpan::class.java)");
            for (Object obj3 : spans3) {
                URLSpan uRLSpan = (URLSpan) obj3;
                int spanStart2 = spannable.getSpanStart(uRLSpan);
                int spanEnd2 = spannable.getSpanEnd(uRLSpan);
                spannable.removeSpan(uRLSpan);
                soa.a aVar = this.b;
                h.d(uRLSpan, "span");
                String url = uRLSpan.getURL();
                h.d(url, "span.url");
                spannable.setSpan(aVar.a(url), spanStart2, spanEnd2, 33);
            }
            return spannable;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.text.Spannable");
    }
}
