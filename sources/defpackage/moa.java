package defpackage;

import kotlin.jvm.internal.h;
import kotlin.text.Regex;
import kotlin.text.e;

/* renamed from: moa  reason: default package */
public final class moa implements joa {
    @Override // defpackage.joa
    public CharSequence a(CharSequence charSequence) {
        h.e(charSequence, "original");
        return new Regex("(\\s*<br>\\s*)+").a(e.C(charSequence), "<br>");
    }
}
