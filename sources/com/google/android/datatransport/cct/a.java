package com.google.android.datatransport.cct;

import com.adjust.sdk.Constants;
import com.google.android.datatransport.b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a implements ng {
    static final String c;
    static final String d;
    private static final String e;
    private static final Set<b> f = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.b("proto"), b.b("json"))));
    public static final a g;
    public static final a h;
    private final String a;
    private final String b;

    static {
        String a2 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a2;
        String a3 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d = a3;
        String a4 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = a4;
        g = new a(a2, null);
        h = new a(a3, a4);
    }

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0021: APUT  (r1v1 java.lang.Object[]), (3 ??[int, float, short, byte, char]), (r0v1 java.lang.String) */
    public byte[] d() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Constants.ENCODING));
    }

    public Set<b> e() {
        return f;
    }
}
