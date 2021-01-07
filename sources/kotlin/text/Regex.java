package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class Regex implements Serializable {
    private Set<? extends Object> _options;
    private final Pattern nativePattern;

    private static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public Serialized(String str, int i) {
            h.e(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            h.d(compile, "Pattern.compile(pattern, flags)");
            return new Regex(compile);
        }
    }

    public Regex(Pattern pattern) {
        h.e(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        h.d(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final String a(CharSequence charSequence, String str) {
        h.e(charSequence, "input");
        h.e(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        h.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String b(CharSequence charSequence, nmf<? super c, ? extends CharSequence> nmf) {
        h.e(charSequence, "input");
        h.e(nmf, "transform");
        h.e(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        h.d(matcher, "nativePattern.matcher(input)");
        int i = 0;
        c dVar = !matcher.find(0) ? null : new d(matcher, charSequence);
        if (dVar == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            h.c(dVar);
            sb.append(charSequence, i, dVar.b().j().intValue());
            sb.append((CharSequence) nmf.invoke(dVar));
            i = Integer.valueOf(dVar.b().e()).intValue() + 1;
            dVar = dVar.next();
            if (i >= length) {
                break;
            }
        } while (dVar != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        h.d(sb2, "sb.toString()");
        return sb2;
    }

    public final List<String> c(CharSequence charSequence, int i) {
        h.e(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            Matcher matcher = this.nativePattern.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return d.t(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i4 >= 0 && arrayList.size() == i4) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    @Override // java.lang.Object
    public String toString() {
        String pattern = this.nativePattern.toString();
        h.d(pattern, "nativePattern.toString()");
        return pattern;
    }

    public Regex(String str) {
        h.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        h.d(compile, "Pattern.compile(pattern)");
        h.e(compile, "nativePattern");
        this.nativePattern = compile;
    }
}
