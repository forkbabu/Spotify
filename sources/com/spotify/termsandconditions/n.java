package com.spotify.termsandconditions;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import defpackage.i1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class n {
    private static final Pattern b = Pattern.compile("spotify:");
    private static final Pattern c = Pattern.compile("<a href=(\"[^\"]*\")[^<]*</a>");
    private k a = new i();

    /* access modifiers changed from: private */
    public class a extends URLSpan {
        public a(String str) {
            super(str);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            h hVar = new h(view.getContext(), getURL());
            if (hVar.c()) {
                n.this.a.a();
            } else if (hVar.b()) {
                n.this.a.b();
            } else if (hVar.d()) {
                n.this.a.d();
            } else {
                n.this.a.c();
            }
            i1.a aVar = new i1.a();
            aVar.c(-16777216);
            aVar.b(true);
            aVar.a().a(view.getContext(), Uri.parse(hVar.a()));
        }
    }

    public void b(k kVar) {
        if (kVar == null) {
            kVar = new i();
        }
        this.a = kVar;
    }

    public void c(TextView textView, String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Matcher matcher = c.matcher(str);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            sb.append((CharSequence) str, i, start);
            sb.append("<strong>");
            sb.append((CharSequence) str, start, end);
            sb.append("</strong>");
            i = end;
        }
        sb.append((CharSequence) str, i, str.length());
        String replaceAll = b.matcher(sb.toString()).replaceAll("com.spotify.mobile.android.tos:spotify:");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Spanned m = z42.m(replaceAll);
        URLSpan[] uRLSpanArr = (URLSpan[]) m.getSpans(0, m.length(), URLSpan.class);
        if (!(uRLSpanArr == null || uRLSpanArr.length == 0)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m);
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = m.getSpanStart(uRLSpan);
                int spanEnd = m.getSpanEnd(uRLSpan);
                int spanFlags = m.getSpanFlags(uRLSpan);
                spannableStringBuilder.removeSpan(uRLSpan);
                spannableStringBuilder.setSpan(new a(uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
            }
            m = spannableStringBuilder;
        }
        textView.setText(m);
    }
}
