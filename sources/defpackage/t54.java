package defpackage;

import com.google.common.base.Optional;

/* renamed from: t54  reason: default package */
public class t54 implements s54 {
    private Optional<s54> a = Optional.absent();

    @Override // defpackage.s54
    public void a() {
        if (this.a.isPresent()) {
            this.a.get().a();
        }
    }

    public void b(s54 s54) {
        this.a = Optional.fromNullable(s54);
    }
}
