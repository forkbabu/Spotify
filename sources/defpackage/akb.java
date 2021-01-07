package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import retrofit2.v;

/* renamed from: akb  reason: default package */
public final /* synthetic */ class akb implements l {
    public static final /* synthetic */ akb a = new akb();

    private /* synthetic */ akb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) Optional.fromNullable(((v) obj).h().C().c("Authorization")).or((Optional) "");
    }
}
