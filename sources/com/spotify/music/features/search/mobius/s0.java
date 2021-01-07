package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import defpackage.s81;
import java.util.ArrayList;

public class s0 implements sg0<b91, b91> {
    private final boolean a;
    private final i68 b;

    /* access modifiers changed from: private */
    public static final class a implements sg0<s81, s81> {
        private final boolean a;
        private final i68 b;

        public a(boolean z, i68 i68) {
            this.a = z;
            this.b = i68;
        }

        private s81 b(s81 s81) {
            String uri;
            a91 target = s81.target();
            if (target == null || (uri = target.uri()) == null) {
                return s81;
            }
            s81.a f = s81.toBuilder().x(null).f("click", t.a(uri, rqa.e(s81), s81.logging().string("ui:group")));
            Optional<o81> a2 = this.b.a(uri, s81);
            if (a2.isPresent()) {
                f = f.f("longClick", a2.get()).f("rightAccessoryClick", a2.get());
            }
            if (l0.b(uri, LinkType.TRACK) && !this.a) {
                f = f.d("secondary_icon", SpotifyIconV2.MORE_ANDROID).c(z81.a().p("trackUri", uri).d());
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

    s0(boolean z, i68 i68) {
        this.a = z;
        this.b = i68;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        return b912.toBuilder().e(FluentIterable.from(b912.body()).transform(new n(new a(this.a, this.b))).toList()).g();
    }
}
