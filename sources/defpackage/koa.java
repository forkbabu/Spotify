package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: koa  reason: default package */
public final class koa implements joa {
    private static final Pattern a = Pattern.compile("(\\s*\\n\\s*){3,}");

    /* renamed from: koa$a */
    private static final class a {
        private final int a;
        private final int b;
        private final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("InvalidString(start=");
            V0.append(this.a);
            V0.append(", end=");
            V0.append(this.b);
            V0.append(", length=");
            return je.B0(V0, this.c, ")");
        }
    }

    @Override // defpackage.joa
    public CharSequence a(CharSequence charSequence) {
        h.e(charSequence, "original");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Matcher matcher = a.matcher(charSequence);
        ArrayList<a> arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            arrayList.add(new a(start, end, end - start));
        }
        int i = 0;
        for (a aVar : arrayList) {
            int c = aVar.c() - i;
            spannableStringBuilder.delete(c, aVar.a() - i);
            spannableStringBuilder.insert(c, (CharSequence) "\n\n");
            i += aVar.b() - 2;
        }
        return e.C(spannableStringBuilder);
    }
}
