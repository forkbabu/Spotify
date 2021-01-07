package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.thirdparty.publicsuffix.PublicSuffixType;

public final class InternetDomainName {
    private static final CharMatcher DASH_MATCHER;
    private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".。．｡");
    private static final Joiner DOT_JOINER = Joiner.on('.');
    private static final Splitter DOT_SPLITTER = Splitter.on('.');
    private static final CharMatcher PART_CHAR_MATCHER;
    private final String name;
    private final ImmutableList<String> parts;

    static {
        CharMatcher anyOf = CharMatcher.anyOf("-_");
        DASH_MATCHER = anyOf;
        PART_CHAR_MATCHER = CharMatcher.javaLetterOrDigit().or(anyOf);
    }

    InternetDomainName(String str) {
        String lowerCase = rw.toLowerCase(DOTS_MATCHER.replaceFrom(str, '.'));
        boolean z = true;
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        MoreObjects.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.name = lowerCase;
        ImmutableList<String> copyOf = ImmutableList.copyOf(DOT_SPLITTER.split(lowerCase));
        this.parts = copyOf;
        MoreObjects.checkArgument(copyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        int size = copyOf.size() - 1;
        if (validatePart(copyOf.get(size), true)) {
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (!validatePart(copyOf.get(i), false)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        MoreObjects.checkArgument(z, "Not a valid domain name: '%s'", lowerCase);
        findSuffixOfType(Optional.absent());
        findSuffixOfType(Optional.of(PublicSuffixType.REGISTRY));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        if ((r8.isPresent() ? r8.equals(r3) : r3.isPresent()) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int findSuffixOfType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> r8) {
        /*
            r7 = this;
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r7.parts
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x0075
            com.google.common.base.Joiner r3 = com.google.common.net.InternetDomainName.DOT_JOINER
            com.google.common.collect.ImmutableList<java.lang.String> r4 = r7.parts
            com.google.common.collect.ImmutableList r4 = r4.subList(r2, r0)
            java.lang.String r3 = r3.join(r4)
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r4 = com.google.thirdparty.publicsuffix.a.a
            java.lang.Object r4 = r4.get(r3)
            com.google.common.base.Optional r4 = com.google.common.base.Optional.fromNullable(r4)
            boolean r5 = r8.isPresent()
            if (r5 == 0) goto L_0x002b
            boolean r4 = r8.equals(r4)
            goto L_0x002f
        L_0x002b:
            boolean r4 = r4.isPresent()
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            return r2
        L_0x0032:
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r4 = com.google.thirdparty.publicsuffix.a.c
            boolean r4 = r4.containsKey(r3)
            r5 = 1
            if (r4 == 0) goto L_0x003d
            int r2 = r2 + r5
            return r2
        L_0x003d:
            com.google.common.base.Splitter r4 = com.google.common.net.InternetDomainName.DOT_SPLITTER
            r6 = 2
            com.google.common.base.Splitter r4 = r4.limit(r6)
            java.util.List r3 = r4.splitToList(r3)
            int r4 = r3.size()
            if (r4 != r6) goto L_0x006e
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r4 = com.google.thirdparty.publicsuffix.a.b
            java.lang.Object r3 = r3.get(r5)
            java.lang.Object r3 = r4.get(r3)
            com.google.common.base.Optional r3 = com.google.common.base.Optional.fromNullable(r3)
            boolean r4 = r8.isPresent()
            if (r4 == 0) goto L_0x0067
            boolean r3 = r8.equals(r3)
            goto L_0x006b
        L_0x0067:
            boolean r3 = r3.isPresent()
        L_0x006b:
            if (r3 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            if (r5 == 0) goto L_0x0072
            return r2
        L_0x0072:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0075:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InternetDomainName.findSuffixOfType(com.google.common.base.Optional):int");
    }

    public static InternetDomainName from(String str) {
        str.getClass();
        return new InternetDomainName(str);
    }

    private static boolean validatePart(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!PART_CHAR_MATCHER.matchesAllOf(CharMatcher.ascii().negate().removeFrom(str))) {
                return false;
            }
            CharMatcher charMatcher = DASH_MATCHER;
            if (!charMatcher.matches(str.charAt(0)) && !charMatcher.matches(str.charAt(str.length() - 1))) {
                return !z || !CharMatcher.digit().matches(str.charAt(0));
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.name.equals(((InternetDomainName) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
