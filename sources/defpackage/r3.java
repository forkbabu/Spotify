package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: r3  reason: default package */
public final class r3 {
    private static final Comparator<b> a = new a();

    /* renamed from: r3$a */
    class a implements Comparator<b> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(b bVar, b bVar2) {
            int i;
            int i2;
            b bVar3 = bVar;
            b bVar4 = bVar2;
            int i3 = bVar3.c;
            int i4 = bVar4.c;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4 || (i = bVar3.d) < (i2 = bVar4.d)) {
                return 1;
            }
            if (i > i2) {
                return -1;
            }
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3$b */
    public static class b {
        URLSpan a;
        String b;
        int c;
        int d;

        b() {
        }
    }

    public static boolean a(Spannable spannable, int i) {
        int i2;
        int i3;
        int i4;
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = objArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(objArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            b(arrayList, spannable, v3.g, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            b(arrayList, spannable, v3.h, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            String obj = spannable.toString();
            int i5 = 0;
            while (true) {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = WebView.findAddress(obj);
                    } else {
                        str = q3.b(obj);
                    }
                    if (str == null) {
                        break;
                    }
                    int indexOf = obj.indexOf(str);
                    if (indexOf < 0) {
                        break;
                    }
                    b bVar = new b();
                    int length2 = str.length() + indexOf;
                    bVar.c = indexOf + i5;
                    i5 += length2;
                    bVar.d = i5;
                    obj = obj.substring(length2);
                    try {
                        bVar.b = "geo:0,0?q=" + URLEncoder.encode(str, Constants.ENCODING);
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
        Object[] objArr2 = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i6 = 0; i6 < objArr2.length; i6++) {
            b bVar2 = new b();
            bVar2.a = objArr2[i6];
            bVar2.c = spannable.getSpanStart(objArr2[i6]);
            bVar2.d = spannable.getSpanEnd(objArr2[i6]);
            arrayList.add(bVar2);
        }
        Collections.sort(arrayList, a);
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            int i8 = size - 1;
            if (i7 >= i8) {
                break;
            }
            b bVar3 = (b) arrayList.get(i7);
            int i9 = i7 + 1;
            b bVar4 = (b) arrayList.get(i9);
            int i10 = bVar3.c;
            int i11 = bVar4.c;
            if (i10 <= i11 && (i2 = bVar3.d) > i11) {
                int i12 = bVar4.d;
                int i13 = (i12 > i2 && (i3 = i2 - i10) <= (i4 = i12 - i11)) ? i3 < i4 ? i7 : -1 : i9;
                if (i13 != -1) {
                    Object obj2 = ((b) arrayList.get(i13)).a;
                    if (obj2 != null) {
                        spannable.removeSpan(obj2);
                    }
                    arrayList.remove(i13);
                    size = i8;
                }
            }
            i7 = i9;
        }
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar5 = (b) it.next();
            if (bVar5.a == null) {
                spannable.setSpan(new URLSpan(bVar5.b), bVar5.c, bVar5.d, 33);
            }
        }
        return true;
    }

    private static void b(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                b bVar = new b();
                String group = matcher.group(0);
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= strArr.length) {
                        z = false;
                        break;
                    } else if (!group.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                        i++;
                    } else if (!group.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                        group = strArr[i] + group.substring(strArr[i].length());
                    }
                }
                if (!z && strArr.length > 0) {
                    group = je.I0(new StringBuilder(), strArr[0], group);
                }
                bVar.b = group;
                bVar.c = start;
                bVar.d = end;
                arrayList.add(bVar);
            }
        }
    }
}
