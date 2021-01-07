package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedList;

final class b {
    private static final Joiner a = Joiner.on("");

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[EDGE_INSN: B:36:0x006b->B:27:0x006b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.util.List<java.lang.CharSequence> r10, java.lang.CharSequence r11, int r12, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r13) {
        /*
            int r0 = r11.length()
            r1 = 0
            r2 = r12
            r3 = 0
        L_0x0007:
            r4 = 58
            r5 = 33
            r6 = 44
            r7 = 63
            if (r2 >= r0) goto L_0x0025
            char r3 = r11.charAt(r2)
            r8 = 38
            if (r3 == r8) goto L_0x0025
            if (r3 == r7) goto L_0x0025
            if (r3 == r5) goto L_0x0025
            if (r3 == r4) goto L_0x0025
            if (r3 != r6) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0025:
            java.lang.CharSequence r8 = r11.subSequence(r12, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.StringBuilder r8 = r9.reverse()
            r10.add(r1, r8)
            if (r3 == r5) goto L_0x003d
            if (r3 == r7) goto L_0x003d
            if (r3 == r4) goto L_0x003d
            if (r3 != r6) goto L_0x0050
        L_0x003d:
            com.google.common.base.Joiner r4 = com.google.thirdparty.publicsuffix.b.a
            java.lang.String r4 = r4.join(r10)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0050
            com.google.thirdparty.publicsuffix.PublicSuffixType r5 = com.google.thirdparty.publicsuffix.PublicSuffixType.d(r3)
            r13.mo51put(r4, r5)
        L_0x0050:
            int r2 = r2 + 1
            if (r3 == r7) goto L_0x006b
            if (r3 == r6) goto L_0x006b
        L_0x0056:
            if (r2 >= r0) goto L_0x006b
            int r3 = a(r10, r11, r2, r13)
            int r2 = r2 + r3
            char r3 = r11.charAt(r2)
            if (r3 == r7) goto L_0x0069
            char r3 = r11.charAt(r2)
            if (r3 != r6) goto L_0x0056
        L_0x0069:
            int r2 = r2 + 1
        L_0x006b:
            r10.remove(r1)
            int r2 = r2 - r12
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.thirdparty.publicsuffix.b.a(java.util.List, java.lang.CharSequence, int, com.google.common.collect.ImmutableMap$Builder):int");
    }

    static ImmutableMap<String, PublicSuffixType> b(CharSequence charSequence) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += a(new LinkedList(), charSequence, i, builder);
        }
        return builder.build();
    }
}
