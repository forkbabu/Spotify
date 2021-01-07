package defpackage;

import com.google.common.base.Optional;

/* renamed from: af7  reason: default package */
final class af7 {
    public static Optional<String> a(s81 s81) {
        o81 o81 = (o81) s81.events().get("click");
        if (o81 != null) {
            return Optional.fromNullable(o81.data().string("uri"));
        }
        return Optional.absent();
    }
}
