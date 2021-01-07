package defpackage;

import android.text.SpannableStringBuilder;
import defpackage.o3;
import java.util.Locale;

/* renamed from: k3  reason: default package */
public final class k3 {
    static final n3 d;
    private static final String e = Character.toString(8206);
    private static final String f = Character.toString(8207);
    static final k3 g;
    static final k3 h;
    public static final /* synthetic */ int i = 0;
    private final boolean a;
    private final int b;
    private final n3 c;

    /* renamed from: k3$a */
    public static final class a {
        private boolean a;
        private int b;
        private n3 c;

        public a() {
            this.a = p3.a(Locale.getDefault()) != 1 ? false : true;
            this.c = k3.d;
            this.b = 2;
        }

        public k3 a() {
            if (this.b == 2 && this.c == k3.d) {
                return this.a ? k3.h : k3.g;
            }
            return new k3(this.a, this.b, this.c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3$b */
    public static class b {
        private static final byte[] e = new byte[1792];
        private final CharSequence a;
        private final int b;
        private int c;
        private char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = charSequence.length();
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.a.charAt(this.c - 1);
            this.d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.c);
                this.c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.c--;
            char c2 = this.d;
            return c2 < 1792 ? e[c2] : Character.getDirectionality(c2);
        }

        /* access modifiers changed from: package-private */
        public int b() {
            byte b2;
            this.c = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.c;
                if (i4 < this.b && i == 0) {
                    char charAt = this.a.charAt(i4);
                    this.d = charAt;
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(this.a, this.c);
                        this.c = Character.charCount(codePointAt) + this.c;
                        b2 = Character.getDirectionality(codePointAt);
                    } else {
                        this.c++;
                        char c2 = this.d;
                        b2 = c2 < 1792 ? e[c2] : Character.getDirectionality(c2);
                    }
                    if (b2 != 0) {
                        if (b2 == 1 || b2 == 2) {
                            if (i3 == 0) {
                                return 1;
                            }
                        } else if (b2 != 9) {
                            switch (b2) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return -1;
                    }
                    i = i3;
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.c > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            this.c = this.b;
            int i = 0;
            int i2 = 0;
            while (this.c > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 != 0) {
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 != 0) {
                    }
                }
                i2 = i;
            }
            return 0;
        }
    }

    static {
        n3 n3Var = o3.c;
        d = n3Var;
        g = new k3(false, 2, n3Var);
        h = new k3(true, 2, n3Var);
    }

    k3(boolean z, int i2, n3 n3Var) {
        this.a = z;
        this.b = i2;
        this.c = n3Var;
    }

    public CharSequence a(CharSequence charSequence) {
        return b(charSequence, this.c, true);
    }

    public CharSequence b(CharSequence charSequence, n3 n3Var, boolean z) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean a2 = ((o3.c) n3Var).a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if (((this.b & 2) != 0) && z) {
            boolean a3 = ((o3.c) (a2 ? o3.b : o3.a)).a(charSequence, 0, charSequence.length());
            if (this.a || (!a3 && new b(charSequence, false).b() != 1)) {
                str = (!this.a || (a3 && new b(charSequence, false).b() != -1)) ? str2 : f;
            } else {
                str = e;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (a2 != this.a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean a4 = ((o3.c) (a2 ? o3.b : o3.a)).a(charSequence, 0, charSequence.length());
            if (!this.a && (a4 || new b(charSequence, false).c() == 1)) {
                str2 = e;
            } else if (this.a && (!a4 || new b(charSequence, false).c() == -1)) {
                str2 = f;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }

    public String c(String str) {
        n3 n3Var = this.c;
        if (str == null) {
            return null;
        }
        return b(str, n3Var, true).toString();
    }
}
