package defpackage;

import android.media.MediaPlayer;
import com.spotify.base.java.logging.Logger;
import defpackage.gqe;
import defpackage.hqe;
import io.reactivex.functions.f;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: kqe  reason: default package */
public class kqe {
    private final iqe a;
    private final jqe b;
    private final y c;
    private final cqe d;

    /* renamed from: kqe$a */
    public static final class a implements io.reactivex.d {
        final /* synthetic */ kqe a;
        final /* synthetic */ String b;
        final /* synthetic */ kqe c;
        final /* synthetic */ String d;

        /* renamed from: kqe$a$a  reason: collision with other inner class name */
        public static final class C0634a implements MediaPlayer.OnPreparedListener {
            final /* synthetic */ a a;
            final /* synthetic */ long b;

            public C0634a(a aVar, long j, io.reactivex.b bVar) {
                this.a = aVar;
                this.b = j;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                iqe iqe = this.a.a.a;
                a aVar = this.a;
                iqe.b(new hqe.c(aVar.b, (int) (aVar.a.d.d() - this.b)));
            }
        }

        /* renamed from: kqe$a$b */
        public static final class b implements MediaPlayer.OnErrorListener {
            final /* synthetic */ a a;
            final /* synthetic */ io.reactivex.b b;

            public b(a aVar, long j, io.reactivex.b bVar) {
                this.a = aVar;
                this.b = bVar;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                h.e(mediaPlayer, "mp");
                mediaPlayer.reset();
                gqe b2 = kqe.b(this.a.a, i, i2);
                this.a.a.a.a(new hqe.a(this.a.b, mediaPlayer.getCurrentPosition(), b2));
                this.b.f(new Exception(b2.toString()));
                return true;
            }
        }

        /* renamed from: kqe$a$c */
        public static final class c implements MediaPlayer.OnCompletionListener {
            final /* synthetic */ a a;
            final /* synthetic */ io.reactivex.b b;

            public c(a aVar, long j, io.reactivex.b bVar) {
                this.a = aVar;
                this.b = bVar;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                h.e(mediaPlayer, "mp");
                mediaPlayer.reset();
                this.a.a.a.a(new hqe.b(this.a.b, mediaPlayer.getDuration()));
                this.b.onComplete();
            }
        }

        /* renamed from: kqe$a$d */
        public static final class d implements f {
            final /* synthetic */ MediaPlayer a;

            public d(MediaPlayer mediaPlayer) {
                this.a = mediaPlayer;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                this.a.release();
            }
        }

        public a(kqe kqe, String str, kqe kqe2, String str2) {
            this.a = kqe;
            this.b = str;
            this.c = kqe2;
            this.d = str2;
        }

        @Override // io.reactivex.d
        public final void subscribe(io.reactivex.b bVar) {
            h.e(bVar, "emitter");
            long d2 = this.a.d.d();
            try {
                MediaPlayer b2 = this.c.b.b();
                b2.setDataSource(this.d);
                b2.setOnPreparedListener(new C0634a(this, d2, bVar));
                b2.setOnErrorListener(new b(this, d2, bVar));
                b2.setOnCompletionListener(new c(this, d2, bVar));
                bVar.e(new d(b2));
                b2.prepare();
                b2.start();
            } catch (IllegalStateException e) {
                Logger.o(e, "mediaplayer error", new Object[0]);
                this.a.a.a(new hqe.a(this.b, 0, new gqe.a(e.toString())));
                bVar.f(e);
            }
        }
    }

    /* renamed from: kqe$b */
    public static final class b implements io.reactivex.d {
        final /* synthetic */ kqe a;
        final /* synthetic */ String b;
        final /* synthetic */ kqe c;
        final /* synthetic */ int d;

        /* renamed from: kqe$b$a */
        public static final class a implements MediaPlayer.OnPreparedListener {
            final /* synthetic */ b a;
            final /* synthetic */ long b;

            public a(b bVar, long j, io.reactivex.b bVar2) {
                this.a = bVar;
                this.b = j;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                iqe iqe = this.a.a.a;
                b bVar = this.a;
                iqe.b(new hqe.c(bVar.b, (int) (bVar.a.d.d() - this.b)));
            }
        }

        /* renamed from: kqe$b$b  reason: collision with other inner class name */
        public static final class C0635b implements MediaPlayer.OnErrorListener {
            final /* synthetic */ b a;
            final /* synthetic */ io.reactivex.b b;

            public C0635b(b bVar, long j, io.reactivex.b bVar2) {
                this.a = bVar;
                this.b = bVar2;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                h.e(mediaPlayer, "mp");
                mediaPlayer.reset();
                gqe b2 = kqe.b(this.a.a, i, i2);
                this.a.a.a.a(new hqe.a(this.a.b, mediaPlayer.getCurrentPosition(), b2));
                this.b.f(new Exception(b2.toString()));
                return true;
            }
        }

        /* renamed from: kqe$b$c */
        public static final class c implements MediaPlayer.OnCompletionListener {
            final /* synthetic */ b a;
            final /* synthetic */ io.reactivex.b b;

            public c(b bVar, long j, io.reactivex.b bVar2) {
                this.a = bVar;
                this.b = bVar2;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                h.e(mediaPlayer, "mp");
                mediaPlayer.reset();
                this.a.a.a.a(new hqe.b(this.a.b, mediaPlayer.getDuration()));
                this.b.onComplete();
            }
        }

        /* renamed from: kqe$b$d */
        public static final class d implements f {
            final /* synthetic */ MediaPlayer a;

            public d(MediaPlayer mediaPlayer) {
                this.a = mediaPlayer;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                this.a.release();
            }
        }

        public b(kqe kqe, String str, kqe kqe2, int i) {
            this.a = kqe;
            this.b = str;
            this.c = kqe2;
            this.d = i;
        }

        @Override // io.reactivex.d
        public final void subscribe(io.reactivex.b bVar) {
            h.e(bVar, "emitter");
            long d2 = this.a.d.d();
            try {
                MediaPlayer a2 = this.c.b.a(this.d);
                a2.setOnPreparedListener(new a(this, d2, bVar));
                a2.setOnErrorListener(new C0635b(this, d2, bVar));
                a2.setOnCompletionListener(new c(this, d2, bVar));
                bVar.e(new d(a2));
                a2.start();
            } catch (IllegalStateException e) {
                Logger.o(e, "mediaplayer error", new Object[0]);
                this.a.a.a(new hqe.a(this.b, 0, new gqe.a(e.toString())));
                bVar.f(e);
            }
        }
    }

    public kqe(iqe iqe, jqe jqe, y yVar, cqe cqe) {
        h.e(iqe, "ttsEventLogger");
        h.e(jqe, "ttsMediaPlayerFactory");
        h.e(yVar, "ioScheduler");
        h.e(cqe, "clock");
        this.a = iqe;
        this.b = jqe;
        this.c = yVar;
        this.d = cqe;
    }

    public static final gqe b(kqe kqe, int i, int i2) {
        kqe.getClass();
        if (i == 1) {
            return new gqe.b(i2 != -1010 ? i2 != -1007 ? i2 != -1004 ? i2 != -110 ? je.p0("Unknown error code ", i2) : "MEDIA_ERROR_TIMED_OUT" : "MEDIA_ERROR_IO" : "MEDIA_ERROR_MALFORMED" : "MEDIA_ERROR_UNSUPPORTED");
        } else if (i == 100) {
            return new gqe.a("MEDIA_ERROR_SERVER_DIED");
        } else {
            return new gqe.c("type: " + i + " detail: " + i2 + ' ');
        }
    }

    public io.reactivex.a e(String str, int i) {
        h.e(str, "utteranceId");
        io.reactivex.a G = io.reactivex.a.m(new b(this, str, this, i)).G(this.c);
        h.d(G, "Completable.create { emi….subscribeOn(ioScheduler)");
        return G;
    }

    public io.reactivex.a f(String str, String str2) {
        h.e(str, "utteranceId");
        h.e(str2, "ttsUrl");
        io.reactivex.a G = io.reactivex.a.m(new a(this, str, this, str2)).G(this.c);
        h.d(G, "Completable.create { emi….subscribeOn(ioScheduler)");
        return G;
    }

    public void g() {
        MediaPlayer c2 = this.b.c();
        if (c2 != null) {
            try {
                c2.stop();
                c2.reset();
            } catch (IllegalStateException unused) {
            }
        }
    }
}
