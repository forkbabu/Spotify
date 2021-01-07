package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.s;
import androidx.media.v;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
    static int d;
    private final b a;
    private final MediaControllerCompat b;
    private final ArrayList<h> c = new ArrayList<>();

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        private final MediaDescriptionCompat a;
        private final long b;
        private MediaSession.QueueItem c;

        static class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static List<QueueItem> a(List<?> list) {
            QueueItem queueItem;
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj == null || Build.VERSION.SDK_INT < 21) {
                    queueItem = null;
                } else {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                    queueItem = new QueueItem(queueItem2, MediaDescriptionCompat.a(queueItem2.getDescription()), queueItem2.getQueueId());
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        public Object b() {
            MediaSession.QueueItem queueItem = this.c;
            if (queueItem != null || Build.VERSION.SDK_INT < 21) {
                return queueItem;
            }
            MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem((MediaDescription) this.a.e(), this.b);
            this.c = queueItem2;
            return queueItem2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("MediaSession.QueueItem {Description=");
            V0.append(this.a);
            V0.append(", Id=");
            return je.E0(V0, this.b, " }");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeLong(this.b);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.a = mediaDescriptionCompat;
                this.b = j;
                this.c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        ResultReceiver a;

        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }

    public static abstract class a {
        final MediaSession.Callback a;
        WeakReference<b> b;
        private HandlerC0007a c = null;
        private boolean d;

        /* access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        public class HandlerC0007a extends Handler {
            HandlerC0007a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar;
                if (message.what == 1 && (bVar = a.this.b.get()) != null) {
                    bVar.s((s) message.obj);
                    a.this.a();
                    bVar.s(null);
                }
            }
        }

        private class b extends MediaSession.Callback {
            b() {
            }

            /* access modifiers changed from: package-private */
            public void a() {
                WeakReference<b> weakReference = a.this.b;
                b bVar = weakReference != null ? weakReference.get() : null;
                if (bVar != null) {
                    bVar.s(null);
                }
            }

            /* access modifiers changed from: package-private */
            public void b() {
                if (Build.VERSION.SDK_INT < 28) {
                    WeakReference<b> weakReference = a.this.b;
                    b bVar = weakReference != null ? weakReference.get() : null;
                    if (bVar != null) {
                        String h = bVar.h();
                        if (TextUtils.isEmpty(h)) {
                            h = "android.media.session.MediaController";
                        }
                        bVar.s(new s(h, -1, -1));
                    }
                }
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                MediaSessionCompat.b(bundle);
                b();
                try {
                    QueueItem queueItem = null;
                    IBinder iBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        e eVar = (e) a.this.b.get();
                        if (eVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = eVar.b;
                            b a2 = token.a();
                            if (a2 != null) {
                                iBinder = a2.asBinder();
                            }
                            androidx.core.app.d.c(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
                            androidx.versionedparcelable.c b = token.b();
                            if (b != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(b));
                                bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                            }
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        a aVar = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        aVar.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        a aVar2 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        aVar2.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        a aVar3 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        aVar3.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        e eVar2 = (e) a.this.b.get();
                        if (!(eVar2 == null || eVar2.h == null)) {
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < eVar2.h.size()) {
                                queueItem = eVar2.h.get(i);
                            }
                            if (queueItem != null) {
                                a.this.getClass();
                            }
                        }
                    } else {
                        a.this.b(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.b(bundle2);
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    a.this.i((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    a.this.j((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    a.this.m(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    a.this.n(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                    a.this.getClass();
                } else {
                    a.this.c(str, bundle);
                }
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                b();
                a.this.getClass();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                b();
                boolean d = a.this.d(intent);
                a();
                return d || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                b();
                a.this.e();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                b();
                a.this.f();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                a.this.g(str, bundle);
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                a.this.h(str, bundle);
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                a.this.i(uri, bundle);
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                b();
                a.this.getClass();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                a.this.getClass();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                a.this.getClass();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                a.this.j(uri, bundle);
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                b();
                a.this.getClass();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                b();
                a.this.k(j);
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                b();
                a.this.l(RatingCompat.a(rating));
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                b();
                a.this.o();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                b();
                a.this.p();
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                b();
                a.this.q(j);
                a();
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                b();
                a.this.r();
                a();
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.a = new b();
            } else {
                this.a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            long j;
            if (this.d) {
                boolean z = false;
                this.d = false;
                this.c.removeMessages(1);
                b bVar = this.b.get();
                if (bVar != null) {
                    PlaybackStateCompat l = bVar.l();
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.n;
                    }
                    boolean z2 = l != null && l.a == 3;
                    boolean z3 = (516 & j) != 0;
                    if ((j & 514) != 0) {
                        z = true;
                    }
                    if (z2 && z) {
                        e();
                    } else if (!z2 && z3) {
                        f();
                    }
                }
            }
        }

        public void b(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void c(String str, Bundle bundle) {
        }

        public boolean d(Intent intent) {
            b bVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27 || (bVar = this.b.get()) == null || this.c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            s u = bVar.u();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    a();
                } else if (this.d) {
                    this.c.removeMessages(1);
                    this.d = false;
                    PlaybackStateCompat l = bVar.l();
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.n;
                    }
                    if ((j & 32) != 0) {
                        o();
                    }
                } else {
                    this.d = true;
                    HandlerC0007a aVar = this.c;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, u), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a();
            return false;
        }

        public void e() {
        }

        public void f() {
        }

        public void g(String str, Bundle bundle) {
        }

        public void h(String str, Bundle bundle) {
        }

        public void i(Uri uri, Bundle bundle) {
        }

        public void j(Uri uri, Bundle bundle) {
        }

        public void k(long j) {
        }

        public void l(RatingCompat ratingCompat) {
        }

        public void m(int i) {
        }

        public void n(int i) {
        }

        public void o() {
        }

        public void p() {
        }

        public void q(long j) {
        }

        public void r() {
        }

        /* access modifiers changed from: package-private */
        public void s(b bVar, Handler handler) {
            this.b = new WeakReference<>(bVar);
            HandlerC0007a aVar = this.c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.c = new HandlerC0007a(handler.getLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        void I(int i);

        void d();

        void e(Bundle bundle);

        void f(MediaMetadataCompat mediaMetadataCompat);

        void g(PlaybackStateCompat playbackStateCompat);

        String h();

        void i(a aVar, Handler handler);

        boolean isActive();

        void j(CharSequence charSequence);

        void k(int i);

        PlaybackStateCompat l();

        void m(List<QueueItem> list);

        Token n();

        void o(PendingIntent pendingIntent);

        void p(int i);

        void q(PendingIntent pendingIntent);

        Object r();

        void s(s sVar);

        void setActive(boolean z);

        void t(v vVar);

        s u();

        void x(int i);
    }

    static class c extends g {
        private static boolean F = true;

        /* access modifiers changed from: package-private */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j) {
                c.this.y(18, -1, -1, Long.valueOf(j), null);
            }
        }

        c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public void B(PlaybackStateCompat playbackStateCompat) {
            long j = playbackStateCompat.b;
            float f = playbackStateCompat.f;
            long j2 = playbackStateCompat.q;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = playbackStateCompat.a;
            if (i == 3) {
                long j3 = 0;
                if (j > 0) {
                    if (j2 > 0) {
                        j3 = elapsedRealtime - j2;
                        if (f > 0.0f && f != 1.0f) {
                            j3 = (long) (((float) j3) * f);
                        }
                    }
                    j += j3;
                }
            }
            this.j.setPlaybackState(v(i), j, f);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            if (F) {
                this.i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                this.i.unregisterMediaButtonEventReceiver(componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.g, android.support.v4.media.session.MediaSessionCompat.b
        public void i(a aVar, Handler handler) {
            super.i(aVar, handler);
            if (aVar == null) {
                this.j.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.j.setPlaybackPositionUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public int w(long j) {
            int w = super.w(j);
            return (j & 256) != 0 ? w | 256 : w;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public void z(PendingIntent pendingIntent, ComponentName componentName) {
            if (F) {
                try {
                    this.i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    F = false;
                }
            }
            if (!F) {
                this.i.registerMediaButtonEventReceiver(componentName);
            }
        }
    }

    static class d extends c {

        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    d.this.y(19, -1, -1, RatingCompat.a(obj), null);
                }
            }
        }

        d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public RemoteControlClient.MetadataEditor b(Bundle bundle) {
            long j;
            RemoteControlClient.MetadataEditor b = super.b(bundle);
            PlaybackStateCompat playbackStateCompat = this.t;
            if (playbackStateCompat == null) {
                j = 0;
            } else {
                j = playbackStateCompat.n;
            }
            if ((j & 128) != 0) {
                b.addEditableKey(268435457);
            }
            if (bundle == null) {
                return b;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                b.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                b.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                b.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.g, android.support.v4.media.session.MediaSessionCompat.b
        public void i(a aVar, Handler handler) {
            super.i(aVar, handler);
            if (aVar == null) {
                this.j.setMetadataUpdateListener(null);
                return;
            }
            this.j.setMetadataUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.g
        public int w(long j) {
            int w = super.w(j);
            return (j & 128) != 0 ? w | 512 : w;
        }
    }

    static class e implements b {
        final MediaSession a;
        final Token b;
        final Object c = new Object();
        final Bundle d;
        boolean e = false;
        final RemoteCallbackList<a> f = new RemoteCallbackList<>();
        PlaybackStateCompat g;
        List<QueueItem> h;
        MediaMetadataCompat i;
        int j;
        int k;
        int l;
        s m;

        class a extends b.a {
            a() {
            }

            @Override // android.support.v4.media.session.b
            public void A1(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B1(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public void B2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle D1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void E(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void H() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean I0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void K(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void L0(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M1(a aVar) {
                if (!e.this.e) {
                    e.this.f.register(aVar, new s("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean N() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void N0(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Q(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Q2(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void S1(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void U1(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void U2(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent W() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int Y0() {
                return e.this.l;
            }

            @Override // android.support.v4.media.session.b
            public int Z() {
                return e.this.j;
            }

            @Override // android.support.v4.media.session.b
            public void a1(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void a2(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean b1() {
                e.this.getClass();
                return false;
            }

            @Override // android.support.v4.media.session.b
            public boolean c2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void d2(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void h2(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat l() {
                e eVar = e.this;
                return MediaSessionCompat.g(eVar.g, eVar.i);
            }

            @Override // android.support.v4.media.session.b
            public void l0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle n0() {
                if (e.this.d == null) {
                    return null;
                }
                return new Bundle(e.this.d);
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence o2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int q3() {
                return e.this.k;
            }

            @Override // android.support.v4.media.session.b
            public void r1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo r3() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void t0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u2(a aVar) {
                e.this.f.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public String v() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void x(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String y() {
                throw new AssertionError();
            }
        }

        e(Context context, String str, androidx.versionedparcelable.c cVar, Bundle bundle) {
            MediaSession mediaSession = new MediaSession(context, str);
            this.a = mediaSession;
            this.b = new Token(mediaSession.getSessionToken(), new a(), cVar);
            this.d = bundle;
            mediaSession.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void I(int i2) {
            if (this.k != i2) {
                this.k = i2;
                for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f.getBroadcastItem(beginBroadcast).F(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void d() {
            this.e = true;
            this.a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void e(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void f(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.i = mediaMetadataCompat;
            MediaSession mediaSession = this.a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.g();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void g(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.g = playbackStateCompat;
            for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f.getBroadcastItem(beginBroadcast).y3(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f.finishBroadcast();
            MediaSession mediaSession = this.a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.e();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public String h() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
            } catch (Exception e2) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e2);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i(a aVar, Handler handler) {
            this.a.setCallback(aVar == null ? null : aVar.a, handler);
            if (aVar != null) {
                aVar.s(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public boolean isActive() {
            return this.a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(CharSequence charSequence) {
            this.a.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(int i2) {
            if (Build.VERSION.SDK_INT < 22) {
                this.j = i2;
            } else {
                this.a.setRatingType(i2);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public PlaybackStateCompat l() {
            return this.g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void m(List<QueueItem> list) {
            this.h = list;
            if (list == null) {
                this.a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (QueueItem queueItem : list) {
                arrayList.add((MediaSession.QueueItem) queueItem.b());
            }
            this.a.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Token n() {
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void o(PendingIntent pendingIntent) {
            this.a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void p(int i2) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i2);
            this.a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void q(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Object r() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void s(s sVar) {
            synchronized (this.c) {
                this.m = sVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void setActive(boolean z) {
            this.a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void t(v vVar) {
            this.a.setPlaybackToRemote((VolumeProvider) vVar.d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public s u() {
            s sVar;
            synchronized (this.c) {
                sVar = this.m;
            }
            return sVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void x(int i2) {
            if (this.l != i2) {
                this.l = i2;
                for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f.getBroadcastItem(beginBroadcast).f1(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
        }
    }

    static class f extends e {
        f(Context context, String str, androidx.versionedparcelable.c cVar, Bundle bundle) {
            super(context, str, cVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.b
        public void s(s sVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.b
        public final s u() {
            return new s(this.a.getCurrentControllerInfo());
        }
    }

    /* access modifiers changed from: package-private */
    public static class g implements b {
        Bundle A;
        int B;
        int C;
        v D;
        private v.b E = new a();
        private final Context a;
        private final ComponentName b;
        private final PendingIntent c;
        private final c d;
        private final Token e;
        final String f;
        final Bundle g;
        final String h;
        final AudioManager i;
        final RemoteControlClient j;
        final Object k = new Object();
        final RemoteCallbackList<a> l = new RemoteCallbackList<>();
        private d m;
        boolean n = false;
        boolean o = false;
        volatile a p;
        private s q;
        int r = 3;
        MediaMetadataCompat s;
        PlaybackStateCompat t;
        PendingIntent u;
        List<QueueItem> v;
        CharSequence w;
        int x;
        int y;
        int z;

        class a extends v.b {
            a() {
            }

            @Override // androidx.media.v.b
            public void a(v vVar) {
                g gVar = g.this;
                if (gVar.D == vVar) {
                    g.this.A(new ParcelableVolumeInfo(gVar.B, gVar.C, vVar.c(), vVar.b(), vVar.a()));
                }
            }
        }

        private static final class b {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = str;
                this.b = bundle;
                this.c = resultReceiver;
            }
        }

        class c extends b.a {
            c() {
            }

            @Override // android.support.v4.media.session.b
            public void A1(long j) {
                F3(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.b
            public void B1(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public void B2() {
                D3(16);
            }

            @Override // android.support.v4.media.session.b
            public Bundle D1() {
                Bundle bundle;
                synchronized (g.this.k) {
                    bundle = g.this.A;
                }
                return bundle;
            }

            /* access modifiers changed from: package-private */
            public void D3(int i) {
                g.this.y(i, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void E(float f) {
                F3(32, Float.valueOf(f));
            }

            /* access modifiers changed from: package-private */
            public void E3(int i, int i2) {
                g.this.y(i, i2, 0, null, null);
            }

            /* access modifiers changed from: package-private */
            public void F3(int i, Object obj) {
                g.this.y(i, 0, 0, obj, null);
            }

            /* access modifiers changed from: package-private */
            public void G3(int i, Object obj, Bundle bundle) {
                g.this.y(i, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void H() {
                D3(7);
            }

            @Override // android.support.v4.media.session.b
            public void I(int i) {
                E3(23, i);
            }

            @Override // android.support.v4.media.session.b
            public boolean I0(KeyEvent keyEvent) {
                F3(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void K(String str, Bundle bundle) {
                G3(20, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void L0(RatingCompat ratingCompat, Bundle bundle) {
                G3(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void M1(a aVar) {
                if (g.this.n) {
                    try {
                        aVar.M0();
                    } catch (Exception unused) {
                    }
                } else {
                    g.this.l.register(aVar, new s(g.this.c(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean N() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void N0(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                g.this.y(26, i, 0, mediaDescriptionCompat, null);
            }

            @Override // android.support.v4.media.session.b
            public void Q(Uri uri, Bundle bundle) {
                G3(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void Q2(int i, int i2, String str) {
                g.this.a(i, i2);
            }

            @Override // android.support.v4.media.session.b
            public void S1(RatingCompat ratingCompat) {
                F3(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public void U1(int i, int i2, String str) {
                g.this.C(i, i2);
            }

            @Override // android.support.v4.media.session.b
            public void U2(boolean z) {
                F3(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent W() {
                PendingIntent pendingIntent;
                synchronized (g.this.k) {
                    pendingIntent = g.this.u;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public int Y0() {
                return g.this.z;
            }

            @Override // android.support.v4.media.session.b
            public int Z() {
                return g.this.x;
            }

            @Override // android.support.v4.media.session.b
            public void a1(int i) {
                E3(28, i);
            }

            @Override // android.support.v4.media.session.b
            public void a2(MediaDescriptionCompat mediaDescriptionCompat) {
                F3(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public boolean b1() {
                g.this.getClass();
                return false;
            }

            @Override // android.support.v4.media.session.b
            public boolean c2() {
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void d2(MediaDescriptionCompat mediaDescriptionCompat) {
                F3(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public long getFlags() {
                long j;
                synchronized (g.this.k) {
                    j = (long) g.this.r;
                }
                return j;
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                return g.this.s;
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                synchronized (g.this.k) {
                    list = g.this.v;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void h2(String str, Bundle bundle) {
                G3(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void k() {
                D3(3);
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat l() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (g.this.k) {
                    g gVar = g.this;
                    playbackStateCompat = gVar.t;
                    mediaMetadataCompat = gVar.s;
                }
                return MediaSessionCompat.g(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public void l0(String str, Bundle bundle) {
                G3(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void m1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                F3(1, new b(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.a));
            }

            @Override // android.support.v4.media.session.b
            public Bundle n0() {
                if (g.this.g == null) {
                    return null;
                }
                return new Bundle(g.this.g);
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                D3(14);
            }

            @Override // android.support.v4.media.session.b
            public CharSequence o2() {
                return g.this.w;
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                D3(12);
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                D3(15);
            }

            @Override // android.support.v4.media.session.b
            public int q3() {
                return g.this.y;
            }

            @Override // android.support.v4.media.session.b
            public void r1() {
                D3(17);
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo r3() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (g.this.k) {
                    g gVar = g.this;
                    i = gVar.B;
                    i2 = gVar.C;
                    v vVar = gVar.D;
                    i3 = 2;
                    if (i == 2) {
                        int c = vVar.c();
                        int b = vVar.b();
                        i4 = vVar.a();
                        i5 = b;
                        i3 = c;
                    } else {
                        i5 = gVar.i.getStreamMaxVolume(i2);
                        i4 = g.this.i.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i5, i4);
            }

            @Override // android.support.v4.media.session.b
            public void s0(String str, Bundle bundle) {
                G3(8, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j) {
                F3(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                D3(13);
            }

            @Override // android.support.v4.media.session.b
            public void t0(String str, Bundle bundle) {
                G3(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void u0(Uri uri, Bundle bundle) {
                G3(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void u2(a aVar) {
                g.this.l.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public String v() {
                return g.this.h;
            }

            @Override // android.support.v4.media.session.b
            public void x(int i) {
                E3(30, i);
            }

            @Override // android.support.v4.media.session.b
            public String y() {
                return g.this.f;
            }
        }

        /* access modifiers changed from: package-private */
        public class d extends Handler {
            public d(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                long j;
                int i;
                a aVar = g.this.p;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.b(data);
                    g.this.s(new s(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.b(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                b bVar = (b) message.obj;
                                aVar.b(bVar.a, bVar.b, bVar.c);
                                break;
                            case 2:
                                g.this.a(message.arg1, 0);
                                break;
                            case 4:
                                String str = (String) message.obj;
                                break;
                            case 5:
                                String str2 = (String) message.obj;
                                break;
                            case 6:
                                aVar.j((Uri) message.obj, bundle);
                                break;
                            case 7:
                                aVar.f();
                                break;
                            case 8:
                                aVar.g((String) message.obj, bundle);
                                break;
                            case 9:
                                aVar.h((String) message.obj, bundle);
                                break;
                            case 10:
                                aVar.i((Uri) message.obj, bundle);
                                break;
                            case 11:
                                aVar.q(((Long) message.obj).longValue());
                                break;
                            case 12:
                                aVar.e();
                                break;
                            case 13:
                                aVar.r();
                                break;
                            case 14:
                                aVar.o();
                                break;
                            case 15:
                                aVar.p();
                                break;
                            case 18:
                                aVar.k(((Long) message.obj).longValue());
                                break;
                            case 19:
                                aVar.l((RatingCompat) message.obj);
                                break;
                            case 20:
                                aVar.c((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.d(intent) && keyEvent != null) {
                                    if (keyEvent.getAction() == 0) {
                                        PlaybackStateCompat playbackStateCompat = g.this.t;
                                        if (playbackStateCompat == null) {
                                            j = 0;
                                        } else {
                                            j = playbackStateCompat.n;
                                        }
                                        int keyCode = keyEvent.getKeyCode();
                                        if (keyCode == 126) {
                                            if ((j & 4) != 0) {
                                                aVar.f();
                                                break;
                                            }
                                        } else if (keyCode == 127) {
                                            if ((j & 2) != 0) {
                                                aVar.e();
                                                break;
                                            }
                                        } else {
                                            switch (keyCode) {
                                                case 86:
                                                    if ((j & 1) != 0) {
                                                        aVar.r();
                                                        break;
                                                    }
                                                    break;
                                                case 87:
                                                    if ((j & 32) != 0) {
                                                        aVar.o();
                                                        break;
                                                    }
                                                    break;
                                                case 88:
                                                    if ((j & 16) != 0) {
                                                        aVar.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                g.this.C(message.arg1, 0);
                                break;
                            case 23:
                                aVar.m(message.arg1);
                                break;
                            case 25:
                                MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) message.obj;
                                break;
                            case 26:
                                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) message.obj;
                                break;
                            case 27:
                                MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) message.obj;
                                break;
                            case 28:
                                List<QueueItem> list = g.this.v;
                                if (list != null && (i = message.arg1) >= 0 && i < list.size()) {
                                    g.this.v.get(message.arg1);
                                    break;
                                }
                            case 29:
                                ((Boolean) message.obj).booleanValue();
                                break;
                            case 30:
                                aVar.n(message.arg1);
                                break;
                            case 31:
                                RatingCompat ratingCompat = (RatingCompat) message.obj;
                                break;
                            case 32:
                                ((Float) message.obj).floatValue();
                                break;
                        }
                    } finally {
                        g.this.s(null);
                    }
                }
            }
        }

        public g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            if (componentName != null) {
                this.a = context;
                this.f = context.getPackageName();
                this.g = bundle;
                this.i = (AudioManager) context.getSystemService("audio");
                this.h = str;
                this.b = componentName;
                this.c = pendingIntent;
                c cVar = new c();
                this.d = cVar;
                this.e = new Token(cVar);
                this.x = 0;
                this.B = 1;
                this.C = 3;
                this.j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        /* access modifiers changed from: package-private */
        public void A(ParcelableVolumeInfo parcelableVolumeInfo) {
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).K1(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.l.finishBroadcast();
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void B(PlaybackStateCompat playbackStateCompat) {
            this.j.setPlaybackState(v(playbackStateCompat.a));
        }

        /* access modifiers changed from: package-private */
        public void C(int i2, int i3) {
            if (this.B == 2) {
                v vVar = this.D;
                if (vVar != null) {
                    vVar.f(i2);
                    return;
                }
                return;
            }
            this.i.setStreamVolume(this.C, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            if (this.o) {
                z(this.c, this.b);
                this.i.registerRemoteControlClient(this.j);
                f(this.s);
                g(this.t);
                return;
            }
            D(this.c, this.b);
            this.j.setPlaybackState(0);
            this.i.unregisterRemoteControlClient(this.j);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void I(int i2) {
            if (this.y != i2) {
                this.y = i2;
                int beginBroadcast = this.l.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast >= 0) {
                        try {
                            this.l.getBroadcastItem(beginBroadcast).F(i2);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.l.finishBroadcast();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            if (this.B == 2) {
                v vVar = this.D;
                if (vVar != null) {
                    vVar.e(i2);
                    return;
                }
                return;
            }
            this.i.adjustStreamVolume(this.C, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor b(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* access modifiers changed from: package-private */
        public String c(int i2) {
            String nameForUid = this.a.getPackageManager().getNameForUid(i2);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void d() {
            this.o = false;
            this.n = true;
            E();
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).M0();
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.l.finishBroadcast();
                    this.l.kill();
                    return;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void e(Bundle bundle) {
            this.A = bundle;
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).l2(bundle);
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.l.finishBroadcast();
                    return;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void f(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.d).a();
            }
            synchronized (this.k) {
                this.s = mediaMetadataCompat;
            }
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    this.l.getBroadcastItem(beginBroadcast).O0(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
            if (this.o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.c();
                }
                b(bundle).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void g(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.k) {
                this.t = playbackStateCompat;
            }
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    this.l.getBroadcastItem(beginBroadcast).y3(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
            if (this.o) {
                if (playbackStateCompat == null) {
                    this.j.setPlaybackState(0);
                    this.j.setTransportControlFlags(0);
                    return;
                }
                B(playbackStateCompat);
                this.j.setTransportControlFlags(w(playbackStateCompat.n));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public String h() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i(a aVar, Handler handler) {
            this.p = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.k) {
                    d dVar = this.m;
                    if (dVar != null) {
                        dVar.removeCallbacksAndMessages(null);
                    }
                    this.m = new d(handler.getLooper());
                    this.p.s(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public boolean isActive() {
            return this.o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(CharSequence charSequence) {
            this.w = charSequence;
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).P2(charSequence);
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.l.finishBroadcast();
                    return;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(int i2) {
            this.x = i2;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public PlaybackStateCompat l() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.k) {
                playbackStateCompat = this.t;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void m(List<QueueItem> list) {
            this.v = list;
            int beginBroadcast = this.l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).h0(list);
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.l.finishBroadcast();
                    return;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Token n() {
            return this.e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void o(PendingIntent pendingIntent) {
            synchronized (this.k) {
                this.u = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void p(int i2) {
            v vVar = this.D;
            if (vVar != null) {
                vVar.g(null);
            }
            this.C = i2;
            this.B = 1;
            A(new ParcelableVolumeInfo(1, i2, 2, this.i.getStreamMaxVolume(i2), this.i.getStreamVolume(this.C)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void q(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Object r() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void s(s sVar) {
            synchronized (this.k) {
                this.q = sVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void setActive(boolean z2) {
            if (z2 != this.o) {
                this.o = z2;
                E();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void t(v vVar) {
            v vVar2 = this.D;
            if (vVar2 != null) {
                vVar2.g(null);
            }
            this.B = 2;
            this.D = vVar;
            A(new ParcelableVolumeInfo(2, this.C, vVar.c(), this.D.b(), this.D.a()));
            vVar.g(this.E);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public s u() {
            s sVar;
            synchronized (this.k) {
                sVar = this.q;
            }
            return sVar;
        }

        /* access modifiers changed from: package-private */
        public int v(int i2) {
            switch (i2) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        public int w(long j2) {
            int i2 = (1 & j2) != 0 ? 32 : 0;
            if ((2 & j2) != 0) {
                i2 |= 16;
            }
            if ((4 & j2) != 0) {
                i2 |= 4;
            }
            if ((8 & j2) != 0) {
                i2 |= 2;
            }
            if ((16 & j2) != 0) {
                i2 |= 1;
            }
            if ((32 & j2) != 0) {
                i2 |= 128;
            }
            if ((64 & j2) != 0) {
                i2 |= 64;
            }
            return (j2 & 512) != 0 ? i2 | 8 : i2;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void x(int i2) {
            if (this.z != i2) {
                this.z = i2;
                int beginBroadcast = this.l.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast >= 0) {
                        try {
                            this.l.getBroadcastItem(beginBroadcast).f1(i2);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.l.finishBroadcast();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void y(int i2, int i3, int i4, Object obj, Bundle bundle) {
            synchronized (this.k) {
                d dVar = this.m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i2, i3, i4, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    String nameForUid = this.a.getPackageManager().getNameForUid(callingUid);
                    if (TextUtils.isEmpty(nameForUid)) {
                        nameForUid = "android.media.session.MediaController";
                    }
                    bundle2.putString("data_calling_pkg", nameForUid);
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void z(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.registerMediaButtonEventReceiver(componentName);
        }
    }

    public interface h {
        void a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                f fVar = new f(context, str, null, null);
                this.a = fVar;
                l(new c(this));
                fVar.a.setMediaButtonReceiver(pendingIntent);
            } else if (i >= 21) {
                e eVar = new e(context, str, null, null);
                this.a = eVar;
                l(new d(this));
                eVar.a.setMediaButtonReceiver(pendingIntent);
            } else if (i >= 19) {
                this.a = new d(context, str, componentName, pendingIntent, null);
            } else if (i >= 18) {
                this.a = new c(context, str, componentName, pendingIntent, null);
            } else {
                this.a = new g(context, str, componentName, pendingIntent, null);
            }
            this.b = new MediaControllerCompat(context, this);
            if (d == 0) {
                d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat g(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.b == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.a;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        long j2 = playbackStateCompat.q;
        if (j2 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = ((long) (playbackStateCompat.f * ((float) (elapsedRealtime - j2)))) + playbackStateCompat.b;
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.f("android.media.metadata.DURATION");
        }
        long j4 = (j < 0 || j3 <= j) ? j3 < 0 ? 0 : j3 : j;
        PlaybackStateCompat.b bVar = new PlaybackStateCompat.b(playbackStateCompat);
        bVar.h(playbackStateCompat.a, j4, playbackStateCompat.f, elapsedRealtime);
        return bVar.b();
    }

    public void a(h hVar) {
        if (hVar != null) {
            this.c.add(hVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public MediaControllerCompat c() {
        return this.b;
    }

    public final s d() {
        return this.a.u();
    }

    public Object e() {
        return this.a.r();
    }

    public Token f() {
        return this.a.n();
    }

    public boolean h() {
        return this.a.isActive();
    }

    public void i() {
        this.a.d();
    }

    public void j(h hVar) {
        if (hVar != null) {
            this.c.remove(hVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void k(boolean z) {
        this.a.setActive(z);
        Iterator<h> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void l(a aVar) {
        if (aVar == null) {
            this.a.i(null, null);
        } else {
            this.a.i(aVar, new Handler());
        }
    }

    public void m(Bundle bundle) {
        this.a.e(bundle);
    }

    public void n(PendingIntent pendingIntent) {
        this.a.q(pendingIntent);
    }

    public void o(MediaMetadataCompat mediaMetadataCompat) {
        this.a.f(mediaMetadataCompat);
    }

    public void p(PlaybackStateCompat playbackStateCompat) {
        this.a.g(playbackStateCompat);
    }

    public void q(int i) {
        this.a.p(i);
    }

    public void r(v vVar) {
        if (vVar != null) {
            this.a.t(vVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void s(List<QueueItem> list) {
        this.a.m(list);
    }

    public void t(CharSequence charSequence) {
        this.a.j(charSequence);
    }

    public void u(int i) {
        this.a.k(i);
    }

    public void v(int i) {
        this.a.I(i);
    }

    public void w(PendingIntent pendingIntent) {
        this.a.o(pendingIntent);
    }

    public void x(int i) {
        this.a.x(i);
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        private final Object a;
        private b b;
        private androidx.versionedparcelable.c c;

        static class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this.a = obj;
            this.b = null;
            this.c = null;
        }

        public b a() {
            return this.b;
        }

        public androidx.versionedparcelable.c b() {
            return this.c;
        }

        public Object c() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(b bVar) {
            this.b = bVar;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.a;
            if (obj2 != null) {
                Object obj3 = token.a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.a == null) {
                return true;
            } else {
                return false;
            }
        }

        public void f(androidx.versionedparcelable.c cVar) {
            this.c = cVar;
        }

        @Override // java.lang.Object
        public int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.a);
            }
        }

        Token(Object obj, b bVar, androidx.versionedparcelable.c cVar) {
            this.a = obj;
            this.b = bVar;
            this.c = cVar;
        }
    }
}
