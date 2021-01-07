package com.spotify.android.glue.components.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.glue.components.trackcloud.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class b {
    private final SpannableStringBuilder a = new SpannableStringBuilder();
    private Random b = new Random();
    private final List<CharSequence> c = new ArrayList();
    private final List<CharSequence> d = new ArrayList();
    private boolean e;
    private String f;
    private int g;

    public static SpannableString b(Context context) {
        int b2 = a.b(context, R.color.gray_70);
        SpannableString spannableString = new SpannableString("  •  ");
        spannableString.setSpan(new ForegroundColorSpan(b2), 0, spannableString.length(), 33);
        return spannableString;
    }

    public String a() {
        return this.f;
    }

    public int c(int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.c.size()) {
            if (this.e || i3 > 0) {
                i2 = this.d.get(i3).length() + i4;
            } else {
                i2 = i4;
            }
            int length = i2 + this.c.get(i3).length();
            if (length >= i) {
                break;
            }
            i3++;
            i4 = length;
        }
        return i4;
    }

    public int d() {
        return this.g;
    }

    public CharSequence e() {
        return this.a;
    }

    public void f(TextView textView, a aVar) {
        String str;
        String str2;
        int i;
        this.a.clear();
        this.a.clearSpans();
        this.e = aVar.n();
        this.f = aVar.c();
        this.g = aVar.e();
        this.c.clear();
        Context context = textView.getContext();
        List<a.C0145a> subList = aVar.r().subList(0, Math.min(aVar.g(), aVar.s()));
        int b2 = androidx.core.content.a.b(context, R.color.gray_70);
        int b3 = androidx.core.content.a.b(context, R.color.white);
        int b4 = androidx.core.content.a.b(context, R.color.gray_25);
        Iterator<a.C0145a> it = subList.iterator();
        while (true) {
            str = "  ";
            if (!it.hasNext()) {
                break;
            }
            a.C0145a next = it.next();
            boolean z = next.d;
            int i2 = z ? b2 : b4;
            int i3 = z ? b3 : b4;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (aVar.j()) {
                SpannableString spannableString = new SpannableString(je.H0(new StringBuilder(), next.b, ' '));
                spannableString.setSpan(new ForegroundColorSpan(i3), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            if (!aVar.l() || !next.c) {
                str = "";
            }
            StringBuilder V0 = je.V0(str);
            V0.append(next.a);
            SpannableString spannableString2 = new SpannableString(V0.toString());
            if (!aVar.l() || !next.c) {
                i = 0;
            } else {
                int textSize = (int) textView.getTextSize();
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, (float) textSize);
                spotifyIconDrawable.r(i2);
                i = 0;
                spotifyIconDrawable.setBounds(0, 0, textSize, textSize);
                spannableString2.setSpan(new ImageSpan(spotifyIconDrawable, 1), 0, 1, 18);
            }
            spannableString2.setSpan(new ForegroundColorSpan(i2), i, spannableString2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
            this.c.add(spannableStringBuilder);
        }
        int size = this.c.size();
        this.d.clear();
        Context context2 = textView.getContext();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.e) {
                List<CharSequence> list = this.d;
                int b5 = androidx.core.content.a.b(context2, R.color.white);
                StringBuilder sb = new StringBuilder();
                if (i4 == 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                sb.append(str2);
                sb.append(i4 + 1);
                sb.append(". ");
                SpannableString spannableString3 = new SpannableString(sb.toString());
                spannableString3.setSpan(new ForegroundColorSpan(b5), 0, spannableString3.length(), 17);
                list.add(spannableString3);
            } else {
                this.d.add(b(context2));
            }
        }
        for (int i5 = 0; i5 < this.c.size(); i5++) {
            if (aVar.n() || i5 > 0) {
                this.a.append(this.d.get(i5));
            }
            this.a.append(this.c.get(i5));
        }
    }
}
