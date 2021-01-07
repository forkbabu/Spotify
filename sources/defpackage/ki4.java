package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.music.preview.z;
import com.spotify.playlist.models.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: ki4  reason: default package */
public final class ki4 {

    /* renamed from: ki4$a */
    static final class a<T, R> implements l<k, bh4> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public bh4 apply(k kVar) {
            k kVar2 = kVar;
            h.e(kVar2, "playlistEntity");
            return new ph4(kVar2);
        }
    }

    /* renamed from: ki4$b */
    static final class b<T, R> implements l<Throwable, bh4> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public bh4 apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            return new oh4(message);
        }
    }

    /* renamed from: ki4$c */
    static final class c<T, R> implements l<z, bh4> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public bh4 apply(z zVar) {
            z zVar2 = zVar;
            h.e(zVar2, "it");
            return new qh4(zVar2);
        }
    }

    /* renamed from: ki4$d */
    static final class d<T, R> implements l<List<? extends ty4>, bh4> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public bh4 apply(List<? extends ty4> list) {
            List<? extends ty4> list2 = list;
            h.e(list2, "it");
            return new zh4(list2);
        }
    }

    /* renamed from: ki4$e */
    static final class e<T, R> implements l<String, bh4> {
        public static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public bh4 apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return new yh4(str2);
        }
    }

    public static final q<bh4> a(s<k> sVar, s<z> sVar2, s<List<ty4>> sVar3, s<String> sVar4) {
        h.e(sVar, "playlistEntityObservable");
        h.e(sVar2, "previewPlayerState");
        h.e(sVar3, "userSelectionUpdates");
        h.e(sVar4, "undoRequests");
        return i.a(sVar.j0(a.a).r0(b.a), sVar2.j0(c.a), sVar3.j0(d.a), sVar4.j0(e.a));
    }
}
