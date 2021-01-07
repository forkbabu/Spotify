package defpackage;

import android.text.TextUtils;
import com.google.common.base.Predicate;

/* access modifiers changed from: package-private */
/* renamed from: u81  reason: default package */
public final class u81<T> implements Predicate<s81> {
    final /* synthetic */ String a;

    u81(String str) {
        this.a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Predicate
    public boolean apply(s81 s81) {
        s81 s812 = s81;
        return s812 != null && TextUtils.equals(s812.id(), this.a);
    }
}
