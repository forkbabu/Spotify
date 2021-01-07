package defpackage;

import com.google.protobuf.StringValue;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: l44  reason: default package */
public final class l44<Upstream, Downstream> implements w<a44, v34> {
    final /* synthetic */ s a;
    final /* synthetic */ bqa b;

    /* renamed from: l44$a */
    static final class a<T, R> implements l<a44, v<? extends String>> {
        final /* synthetic */ l44 a;

        a(l44 l44) {
            this.a = l44;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends String> apply(a44 a44) {
            h.e(a44, "it");
            return this.a.a;
        }
    }

    /* renamed from: l44$b */
    static final class b<T, R> implements l<String, v<? extends IdentityV3$UserProfile>> {
        final /* synthetic */ l44 a;

        b(l44 l44) {
            this.a = l44;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends IdentityV3$UserProfile> apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return this.a.b.a(str2);
        }
    }

    /* renamed from: l44$c */
    static final class c<T, R> implements l<IdentityV3$UserProfile, v34> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v34 apply(IdentityV3$UserProfile identityV3$UserProfile) {
            IdentityV3$UserProfile identityV3$UserProfile2 = identityV3$UserProfile;
            h.e(identityV3$UserProfile2, "it");
            StringValue n = identityV3$UserProfile2.n();
            h.d(n, "it.name");
            String i = n.i();
            h.d(i, "it.name.value");
            String d = dqa.d(identityV3$UserProfile2);
            if (d == null) {
                d = "";
            }
            return new i44(new h44(i, d));
        }
    }

    l44(s sVar, bqa bqa) {
        this.a = sVar;
        this.b = bqa;
    }

    @Override // io.reactivex.w
    public final v<v34> apply(s<a44> sVar) {
        h.e(sVar, "getUserInfo");
        return sVar.w(new a(this)).w(new b(this)).s0((R) IdentityV3$UserProfile.h()).j0(c.a);
    }
}
