package com.spotify.music.libs.yourlibraryx.pin;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class YourLibraryXPinHelperImpl implements a {
    private final ei0 a;
    private final wbb b;
    private final s<String> c;

    static final class a<T, R> implements l<String, fi0> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public fi0 apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return new fi0(str2, this.a);
        }
    }

    static final class b<T, R> implements l<YourLibraryPinProto$PinResponse, Boolean> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse) {
            YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse2 = yourLibraryPinProto$PinResponse;
            h.e(yourLibraryPinProto$PinResponse2, "it");
            return Boolean.valueOf(yourLibraryPinProto$PinResponse2.i() == YourLibraryPinProto$PinResponse.PinStatus.PINNED);
        }
    }

    static final class c<T, R> implements l<String, fi0> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public fi0 apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return new fi0(str2, this.a);
        }
    }

    static final class d<T, R> implements l<fi0, v<? extends YourLibraryPinProto$PinResponse>> {
        final /* synthetic */ YourLibraryXPinHelperImpl a;

        d(YourLibraryXPinHelperImpl yourLibraryXPinHelperImpl) {
            this.a = yourLibraryXPinHelperImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends YourLibraryPinProto$PinResponse> apply(fi0 fi0) {
            fi0 fi02 = fi0;
            h.e(fi02, "it");
            return this.a.a.a(fi02);
        }
    }

    static final class e<T, R> implements l<YourLibraryPinProto$PinResponse, YourLibraryPinStatus> {
        public static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public YourLibraryPinStatus apply(YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse) {
            YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse2 = yourLibraryPinProto$PinResponse;
            YourLibraryPinStatus yourLibraryPinStatus = YourLibraryPinStatus.CANNOT_PIN;
            h.e(yourLibraryPinProto$PinResponse2, "it");
            int ordinal = yourLibraryPinProto$PinResponse2.i().ordinal();
            if (ordinal == 0) {
                return yourLibraryPinStatus;
            }
            if (ordinal == 1) {
                return YourLibraryPinStatus.PINNED;
            }
            if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    return yourLibraryPinStatus;
                }
                throw new NoWhenBranchMatchedException();
            } else if (yourLibraryPinProto$PinResponse2.h()) {
                return yourLibraryPinStatus;
            } else {
                return YourLibraryPinStatus.NOT_PINNED;
            }
        }
    }

    static final class f<T, R> implements l<String, fi0> {
        final /* synthetic */ String a;

        f(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public fi0 apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return new fi0(str2, this.a);
        }
    }

    static final class g<T, R> implements l<YourLibraryPinProto$PinResponse, Boolean> {
        public static final g a = new g();

        g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse) {
            YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse2 = yourLibraryPinProto$PinResponse;
            h.e(yourLibraryPinProto$PinResponse2, "it");
            return Boolean.valueOf(yourLibraryPinProto$PinResponse2.i() == YourLibraryPinProto$PinResponse.PinStatus.NOT_PINNED);
        }
    }

    public YourLibraryXPinHelperImpl(ei0 ei0, wbb wbb, s<String> sVar) {
        h.e(ei0, "endpoint");
        h.e(wbb, "flags");
        h.e(sVar, "username");
        this.a = ei0;
        this.b = wbb;
        this.c = sVar;
    }

    @Override // com.spotify.music.libs.yourlibraryx.pin.a
    public s<YourLibraryPinStatus> a(com.spotify.music.libs.viewuri.c cVar, String str) {
        YourLibraryPinStatus yourLibraryPinStatus = YourLibraryPinStatus.CANNOT_PIN;
        h.e(cVar, "viewUri");
        h.e(str, "itemUri");
        if (!h.a(cVar, ViewUris.l1)) {
            s<YourLibraryPinStatus> i0 = s.i0(yourLibraryPinStatus);
            h.d(i0, "Observable.just(YourLibraryPinStatus.CANNOT_PIN)");
            return i0;
        } else if (!this.b.a()) {
            s<YourLibraryPinStatus> i02 = s.i0(yourLibraryPinStatus);
            h.d(i02, "Observable.just(YourLibraryPinStatus.CANNOT_PIN)");
            return i02;
        } else {
            s<R> j0 = this.c.j0(new c(str)).J0(new d(this)).j0(e.a);
            h.d(j0, "username.map { YourLibra…          }\n            }");
            return j0;
        }
    }

    @Override // com.spotify.music.libs.yourlibraryx.pin.a
    public z<Boolean> b(String str) {
        h.e(str, "itemUri");
        z<R> A = this.c.T().A(new a(str)).s(new b(new YourLibraryXPinHelperImpl$pin$2(this.a))).A(b.a);
        h.d(A, "username.firstOrError().…p { it.status == PINNED }");
        return A;
    }

    @Override // com.spotify.music.libs.yourlibraryx.pin.a
    public z<Boolean> c(String str) {
        h.e(str, "itemUri");
        z<R> A = this.c.T().A(new f(str)).s(new b(new YourLibraryXPinHelperImpl$unpin$2(this.a))).A(g.a);
        h.d(A, "username.firstOrError().…it.status == NOT_PINNED }");
        return A;
    }
}
