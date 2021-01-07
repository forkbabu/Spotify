package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: iy5  reason: default package */
public class iy5 implements hy5 {
    private final Context a;
    private final l2e b;
    private c c;
    private final Picasso d;
    private final CoverArtFetcher e;
    private final ey5 f;
    private Optional<String> g = Optional.absent();
    private final er0 h;
    private Notification i;
    private PlayerState j = PlayerState.EMPTY;
    private final f0 k = new a();
    private Bitmap l;
    private final y m;
    private final g<PlayerState> n;
    private final g<c> o;
    private final g<GaiaDevice> p;
    private final q q = new q();

    /* renamed from: iy5$a */
    class a implements f0 {
        a() {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            int ordinal = loadedFrom.ordinal();
            if (ordinal == 0) {
                MoreObjects.checkArgument(!bitmap.isRecycled());
            } else if (ordinal == 1) {
                MoreObjects.checkArgument(!bitmap.isRecycled());
            } else if (ordinal == 2) {
                MoreObjects.checkArgument(!bitmap.isRecycled());
            }
            if (iy5.this.i != null && iy5.n(iy5.this.j)) {
                iy5 iy5 = iy5.this;
                iy5.i = iy5.f.a(iy5.this.j, iy5.this.g, iy5.this.c, bitmap, "playback_channel");
                iy5.this.b.f(C0707R.id.notification_playback, iy5.this.i, iy5.this.j());
                MoreObjects.checkArgument(!bitmap.isRecycled());
            }
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public iy5(Context context, l2e l2e, Picasso picasso, ey5 ey5, g<PlayerState> gVar, g<c> gVar2, g<GaiaDevice> gVar3, y yVar, CoverArtFetcher coverArtFetcher, er0 er0) {
        context.getClass();
        this.a = context;
        l2e.getClass();
        this.b = l2e;
        this.d = picasso;
        this.f = ey5;
        this.n = gVar;
        this.o = gVar2;
        this.p = gVar3;
        this.m = yVar;
        this.e = coverArtFetcher;
        this.h = er0;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("playback_channel", context.getString(C0707R.string.notification_channel_playback_name), 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean j() {
        if (((!this.g.isPresent()) || this.h.b()) && !this.j.isPaused()) {
            return true;
        }
        return false;
    }

    public static void k(iy5 iy5, Optional optional) {
        iy5.g = optional;
        iy5.o();
    }

    public static void l(iy5 iy5, PlayerState playerState) {
        iy5.j = playerState;
        iy5.o();
        iy5.e.a(playerState.nextTracks(), CoverArtFetcher.CoverArtSize.REGULAR);
    }

    /* access modifiers changed from: private */
    public static boolean n(PlayerState playerState) {
        if (!playerState.track().isPresent()) {
            return false;
        }
        if (!MoreObjects.isNullOrEmpty(playerState.track().get().metadata().get("title")) || kxd.f(playerState.track().get())) {
            return true;
        }
        return false;
    }

    private void o() {
        if (n(this.j)) {
            if (this.l == null) {
                Drawable d2 = androidx.core.content.a.d(this.a, C0707R.drawable.cat_placeholder_album);
                if (d2 instanceof BitmapDrawable) {
                    this.l = ((BitmapDrawable) d2).getBitmap();
                }
            }
            this.i = this.f.a(this.j, this.g, this.c, this.l, "playback_channel");
            this.d.m(kxd.c(this.j.track().get())).o(this.k);
            this.b.f(C0707R.id.notification_playback, this.i, j());
        }
    }

    public /* synthetic */ void m(c cVar) {
        this.c = cVar;
    }

    @Override // defpackage.hy5
    public void start() {
        this.q.b(this.o.Q(this.m).subscribe(new lx5(this)), this.n.Q(this.m).subscribe(new mx5(this)), this.p.O(kx5.a).s().Q(this.m).subscribe(new jx5(this)));
    }

    @Override // defpackage.hy5
    public void stop() {
        this.q.c();
        this.b.b(C0707R.id.notification_playback);
        this.j = PlayerState.EMPTY;
    }
}
