package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.h;

/* renamed from: ioa  reason: default package */
public final class ioa implements eoa {
    private final LinkedHashSet<joa> a;

    public ioa(LinkedHashSet<joa> linkedHashSet) {
        h.e(linkedHashSet, "stepsSet");
        this.a = linkedHashSet;
    }

    @Override // defpackage.eoa
    public CharSequence a(CharSequence charSequence) {
        h.e(charSequence, "original");
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            charSequence = it.next().a(charSequence);
        }
        return charSequence;
    }
}
