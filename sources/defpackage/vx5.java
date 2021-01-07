package defpackage;

import android.text.SpannableString;

/* renamed from: vx5  reason: default package */
final class vx5 extends py5 {
    private final SpannableString a;
    private final SpannableString b;
    private final SpannableString c;
    private final boolean d;
    private final String e;

    vx5(SpannableString spannableString, SpannableString spannableString2, SpannableString spannableString3, boolean z, String str) {
        this.a = spannableString;
        this.b = spannableString2;
        this.c = spannableString3;
        this.d = z;
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null ticker");
    }

    @Override // defpackage.py5
    public SpannableString a() {
        return this.b;
    }

    @Override // defpackage.py5
    public SpannableString b() {
        return this.a;
    }

    @Override // defpackage.py5
    public boolean c() {
        return this.d;
    }

    @Override // defpackage.py5
    public SpannableString d() {
        return this.c;
    }

    @Override // defpackage.py5
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof py5)) {
            return false;
        }
        py5 py5 = (py5) obj;
        SpannableString spannableString = this.a;
        if (spannableString != null ? spannableString.equals(py5.b()) : py5.b() == null) {
            SpannableString spannableString2 = this.b;
            if (spannableString2 != null ? spannableString2.equals(py5.a()) : py5.a() == null) {
                SpannableString spannableString3 = this.c;
                if (spannableString3 != null ? spannableString3.equals(py5.d()) : py5.d() == null) {
                    if (this.d == py5.c() && this.e.equals(py5.e())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        SpannableString spannableString = this.a;
        int i = 0;
        int hashCode = ((spannableString == null ? 0 : spannableString.hashCode()) ^ 1000003) * 1000003;
        SpannableString spannableString2 = this.b;
        int hashCode2 = (hashCode ^ (spannableString2 == null ? 0 : spannableString2.hashCode())) * 1000003;
        SpannableString spannableString3 = this.c;
        if (spannableString3 != null) {
            i = spannableString3.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackNotificationViewData{contentTitle=");
        V0.append((Object) this.a);
        V0.append(", contentText=");
        V0.append((Object) this.b);
        V0.append(", subText=");
        V0.append((Object) this.c);
        V0.append(", ongoing=");
        V0.append(this.d);
        V0.append(", ticker=");
        return je.I0(V0, this.e, "}");
    }
}
