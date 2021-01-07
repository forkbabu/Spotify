package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.share.assetpicker.ui.LyricsShareAssetPickerFragment;
import com.spotify.rxjava2.q;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.g;
import io.reactivex.y;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: heb  reason: default package */
public final class heb implements zdb {
    public com.spotify.music.lyrics.share.social.ui.b a;
    public qeb b;
    private q c = new q();
    private final afb d;
    private final u2e e;
    private final Activity f;
    private final y g;
    private final meb h;
    private final aeb i;
    private final SnackbarManager j;

    /* access modifiers changed from: package-private */
    /* renamed from: heb$a */
    public static final class a<T> implements g<List<? extends o8e>> {
        final /* synthetic */ heb a;
        final /* synthetic */ Context b;
        final /* synthetic */ Integer c;

        a(heb heb, Context context, Integer num) {
            this.a = heb;
            this.b = context;
            this.c = num;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(List<? extends o8e> list) {
            List<? extends o8e> list2 = list;
            h.e(list2, "destinations");
            for (T t : list2) {
                com.spotify.music.lyrics.share.social.ui.b bVar = this.a.a;
                if (bVar != null) {
                    int id = t.id();
                    Context context = this.b;
                    Drawable icon = t.icon();
                    h.d(icon, "it.icon()");
                    int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(C0707R.dimen.social_icon_size);
                    h.e(context, "context");
                    h.e(icon, "icon");
                    if (icon instanceof BitmapDrawable) {
                        icon = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(((BitmapDrawable) icon).getBitmap(), dimensionPixelSize, dimensionPixelSize, true));
                    }
                    String string = this.b.getString(t.c());
                    h.d(string, "context.getString(it.titleResId())");
                    bVar.a(id, icon, string, this.c);
                } else {
                    h.k("socialIconBarBinder");
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: heb$b */
    public static final class b<T> implements g<Throwable> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "throwable");
            Logger.e(th2, "Something went wrong", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: heb$c */
    public static final class c<T> implements g<String> {
        final /* synthetic */ heb a;
        final /* synthetic */ t b;
        final /* synthetic */ o8e c;

        c(heb heb, t tVar, o8e o8e) {
            this.a = heb;
            this.b = tVar;
            this.c = o8e;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(String str) {
            String str2 = str;
            heb heb = this.a;
            o8e o8e = this.c;
            h.d(str2, "shareId");
            heb.d(heb, o8e, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: heb$d */
    public static final class d<T> implements g<Throwable> {
        final /* synthetic */ heb a;
        final /* synthetic */ t b;
        final /* synthetic */ o8e c;

        d(heb heb, t tVar, o8e o8e) {
            this.a = heb;
            this.b = tVar;
            this.c = o8e;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            SnackbarManager snackbarManager = this.a.j;
            SnackbarConfiguration a2 = heb.a(this.a);
            View m4 = ((LyricsShareAssetPickerFragment) this.a.i).m4();
            h.d(m4, "requireView()");
            snackbarManager.showInView(a2, m4);
        }
    }

    public heb(afb afb, u2e u2e, Activity activity, y yVar, meb meb, aeb aeb, SnackbarManager snackbarManager) {
        h.e(afb, "socialFlow");
        h.e(u2e, "shareService");
        h.e(activity, "activity");
        h.e(yVar, "scheduler");
        h.e(meb, "lyricsSharingLogger");
        h.e(aeb, "shareAssetPickerViewBinder");
        h.e(snackbarManager, "snackbarManager");
        this.d = afb;
        this.e = u2e;
        this.f = activity;
        this.g = yVar;
        this.h = meb;
        this.i = aeb;
        this.j = snackbarManager;
    }

    public static final SnackbarConfiguration a(heb heb) {
        heb.getClass();
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.lyrics_share_asset_error_snackbar).actionText(heb.f.getString(C0707R.string.lyrics_share_asset_error_snackbar_retry)).onClickListener(geb.a).build();
        h.d(build, "SnackbarConfiguration\n  …   }\n            .build()");
        return build;
    }

    public static final void d(heb heb, o8e o8e, String str) {
        meb meb = heb.h;
        String valueOf = String.valueOf(o8e.id());
        qeb qeb = heb.b;
        if (qeb != null) {
            meb.a(valueOf, qeb.c(), str);
        } else {
            h.k("shareableData");
            throw null;
        }
    }

    public void e(qeb qeb) {
        h.e(qeb, "shareableData");
        this.b = qeb;
        this.h.b();
        ((LyricsShareAssetPickerFragment) this.i).h5(qeb);
        ((LyricsShareAssetPickerFragment) this.i).k5();
    }

    public void f(Context context, Integer num) {
        h.e(context, "context");
        this.c.a(this.d.d().B(this.g).subscribe(new a(this, context, num), b.a));
    }

    public void g() {
        this.h.e();
    }

    public void h(int i2) {
        Bitmap bitmap;
        t tVar;
        List<ShareCapability> b2;
        ShareCapability shareCapability = ShareCapability.IMAGE_STORY;
        o8e c2 = this.d.c(i2);
        Boolean valueOf = (c2 == null || (b2 = c2.b()) == null) ? null : Boolean.valueOf(b2.contains(shareCapability));
        Bitmap a2 = ydb.a(((LyricsShareAssetPickerFragment) this.i).i5(), null);
        aeb aeb = this.i;
        h.c(valueOf);
        View j5 = ((LyricsShareAssetPickerFragment) aeb).j5(valueOf.booleanValue());
        if (!valueOf.booleanValue()) {
            qeb qeb = this.b;
            if (qeb != null) {
                List<peb> b3 = qeb.b();
                qeb qeb2 = this.b;
                if (qeb2 != null) {
                    bitmap = ydb.a(j5, Integer.valueOf(b3.get(qeb2.a()).a()));
                } else {
                    h.k("shareableData");
                    throw null;
                }
            } else {
                h.k("shareableData");
                throw null;
            }
        } else {
            bitmap = ydb.a(j5, null);
        }
        qeb qeb3 = this.b;
        if (qeb3 != null) {
            String e2 = qeb3.e().e();
            if (e2 == null) {
                e2 = "";
            }
            afb afb = this.d;
            r build = r.h(e2).build();
            h.d(build, "LinkShareData.builder(trackUri).build()");
            afb.getClass();
            h.e(build, "linkShareData");
            h.e(a2, "backgroundBitmap");
            h.e(bitmap, "stickerBitmap");
            h.c(c2);
            if (c2.b().contains(shareCapability)) {
                tVar = com.spotify.share.sharedata.q.k(build, a2, Optional.of(bitmap));
                h.d(tVar, "ImageStoryShareData.from…tional.of(stickerBitmap))");
            } else {
                tVar = p.j(build, bitmap);
                h.d(tVar, "ImageShareData.from(linkShareData, stickerBitmap)");
            }
            this.c.a(this.e.a(this.f, c2, tVar, PageIdentifiers.LYRICS_SHARE.toString(), null, this.f.getString(C0707R.string.integration_id_context_menu)).B(this.g).subscribe(new c(this, tVar, c2), new d(this, tVar, c2)));
            return;
        }
        h.k("shareableData");
        throw null;
    }
}
