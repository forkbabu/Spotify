package defpackage;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: bn7  reason: default package */
public final /* synthetic */ class bn7 implements g {
    public final /* synthetic */ gu7 a;

    public /* synthetic */ bn7(gu7 gu7) {
        this.a = gu7;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Optional<String> optional;
        gu7 gu7 = this.a;
        km7.i iVar = (km7.i) obj;
        if (iVar.b().isPresent()) {
            optional = Optional.of(MoreObjects.firstNonNull(Uri.parse(iVar.b().or((Optional<String>) "")).getPath(), ""));
        } else {
            optional = Optional.absent();
        }
        gu7.c(iVar.a(), optional);
    }
}
