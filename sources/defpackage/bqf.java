package defpackage;

import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.i;

/* renamed from: bqf  reason: default package */
public abstract class bqf extends cqf implements a {
    @Override // org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }
}
