package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import defpackage.s81;
import java.util.ArrayList;

/* renamed from: l68  reason: default package */
public class l68 implements sg0<b91, b91> {
    private final boolean a;
    private final i68 b;
    private final f68 c;

    /* access modifiers changed from: private */
    /* renamed from: l68$a */
    public static final class a implements sg0<s81, s81> {
        private final boolean a;
        private final f68 b;
        private final i68 c;

        public a(boolean z, f68 f68, i68 i68) {
            this.a = z;
            this.b = f68;
            this.c = i68;
        }

        private s81 b(s81 s81) {
            Optional optional;
            a91 target = s81.target();
            if (target != null) {
                optional = Optional.fromNullable(target.uri());
            } else {
                optional = Optional.absent();
            }
            if (!optional.isPresent()) {
                return s81;
            }
            s81.a f = s81.toBuilder().x(null).f("click", this.b.a((String) optional.get(), s81));
            Optional<o81> a2 = this.c.a((String) optional.get(), s81);
            if (a2.isPresent()) {
                f = f.f("longClick", a2.get()).f("rightAccessoryClick", a2.get()).d("secondary_icon", SpotifyIconV2.MORE_ANDROID);
            }
            String str = (String) optional.get();
            if (l0.b(str, LinkType.TRACK) && !this.a) {
                f = f.c(z81.a().p("trackUri", str).d());
            }
            return f.l();
        }

        private s81 c(s81 s81) {
            if (s81.children().isEmpty()) {
                return b(s81);
            }
            ArrayList arrayList = new ArrayList(s81.children().size());
            for (s81 s812 : s81.children()) {
                arrayList.add(c(s812));
            }
            return b(s81).toBuilder().m(arrayList).l();
        }

        public s81 a(s81 s81) {
            return c(s81);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s81 apply(s81 s81) {
            return c(s81);
        }
    }

    l68(boolean z, f68 f68, i68 i68) {
        this.a = z;
        this.c = f68;
        this.b = i68;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        return b912.toBuilder().e(FluentIterable.from(b912.body()).transform(new e68(new a(this.a, this.c, this.b))).toList()).g();
    }
}
