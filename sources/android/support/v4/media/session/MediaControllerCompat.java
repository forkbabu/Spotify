package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class MediaControllerCompat {
    private final b a;
    private final MediaSessionCompat.Token b;
    private final ConcurrentHashMap<a, Boolean> c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {
        protected final MediaController a;
        final Object b = new Object();
        private final List<a> c = new ArrayList();
        private HashMap<a, a> d = new HashMap<>();
        final MediaSessionCompat.Token e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.b) {
                        mediaControllerImplApi21.e.e(b.a.C3(androidx.core.app.d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                        androidx.versionedparcelable.c cVar = null;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(androidx.versionedparcelable.a.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (parcelable instanceof ParcelImpl) {
                                    cVar = ((ParcelImpl) parcelable).a();
                                } else {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                            }
                        } catch (RuntimeException unused) {
                        }
                        token.f(cVar);
                        mediaControllerImplApi21.e();
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void K1(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void M0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void O0(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void P2(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void h0(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void l2(Bundle bundle) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.c());
            this.a = mediaController;
            if (mediaController == null) {
                throw new RemoteException();
            } else if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void a(a aVar) {
            this.a.unregisterCallback(aVar.a);
            synchronized (this.b) {
                if (this.e.a() != null) {
                    try {
                        a remove = this.d.remove(aVar);
                        if (remove != null) {
                            aVar.c = null;
                            this.e.a().u2(remove);
                        }
                    } catch (RemoteException e2) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e2);
                    }
                } else {
                    this.c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent b() {
            return this.a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e c() {
            return new f(this.a.getTransportControls());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void d(a aVar, Handler handler) {
            this.a.registerCallback(aVar.a, handler);
            synchronized (this.b) {
                if (this.e.a() != null) {
                    a aVar2 = new a(aVar);
                    this.d.put(aVar, aVar2);
                    aVar.c = aVar2;
                    try {
                        this.e.a().M1(aVar2);
                        aVar.d(13, null, null);
                    } catch (RemoteException e2) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                    }
                } else {
                    aVar.c = null;
                    this.c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.e.a() != null) {
                for (a aVar : this.c) {
                    a aVar2 = new a(aVar);
                    this.d.put(aVar, aVar2);
                    aVar.c = aVar2;
                    try {
                        this.e.a().M1(aVar2);
                        aVar.d(13, null, null);
                    } catch (RemoteException e2) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                    }
                }
                this.c.clear();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat getMetadata() {
            MediaMetadata metadata = this.a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.b(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat l() {
            if (this.e.a() != null) {
                try {
                    return this.e.a().l();
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e2);
                }
            }
            PlaybackState playbackState = this.a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.a(playbackState);
            }
            return null;
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {
        final MediaController.Callback a;
        b b;
        a c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        private static class C0006a extends MediaController.Callback {
            private final WeakReference<a> a;

            C0006a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.a.get() != null) {
                    playbackInfo.getPlaybackType();
                    AudioAttributesCompat.a(playbackInfo.getAudioAttributes());
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.b(bundle);
                this.a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.a.get();
                if (aVar != null && aVar.c == null) {
                    aVar.b(PlaybackStateCompat.a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                if (this.a.get() != null) {
                    MediaSessionCompat.QueueItem.a(list);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                this.a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.c();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = this.a.get();
                if (aVar != null && aVar.c != null) {
                    int i = Build.VERSION.SDK_INT;
                }
            }
        }

        /* access modifiers changed from: private */
        public class b extends Handler {
            boolean a = false;

            b(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.b(message.getData());
                            a aVar = a.this;
                            String str = (String) message.obj;
                            aVar.getClass();
                            return;
                        case 2:
                            a.this.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            a aVar2 = a.this;
                            d dVar = (d) message.obj;
                            aVar2.getClass();
                            return;
                        case 5:
                            a aVar3 = a.this;
                            List list = (List) message.obj;
                            aVar3.getClass();
                            return;
                        case 6:
                            a aVar4 = a.this;
                            CharSequence charSequence = (CharSequence) message.obj;
                            aVar4.getClass();
                            return;
                        case 7:
                            MediaSessionCompat.b((Bundle) message.obj);
                            a.this.getClass();
                            return;
                        case 8:
                            a.this.c();
                            return;
                        case 9:
                            a aVar5 = a.this;
                            ((Integer) message.obj).intValue();
                            aVar5.getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            a aVar6 = a.this;
                            ((Boolean) message.obj).booleanValue();
                            aVar6.getClass();
                            return;
                        case 12:
                            a aVar7 = a.this;
                            ((Integer) message.obj).intValue();
                            aVar7.getClass();
                            return;
                        case 13:
                            a.this.getClass();
                            return;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public static class c extends a.AbstractBinderC0008a {
            private final WeakReference<a> a;

            c(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void D3(boolean z) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(11, Boolean.valueOf(z), null);
                }
            }

            public void E3(String str, Bundle bundle) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void F(int i) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(9, Integer.valueOf(i), null);
                }
            }

            public void F3() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void K1(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.f, parcelableVolumeInfo.n) : null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void M0() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void O0(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void P2(CharSequence charSequence) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void f1(int i) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void h0(List<MediaSessionCompat.QueueItem> list) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void l2(Bundle bundle) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void y3(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(2, playbackStateCompat, null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.a = new C0006a(this);
                return;
            }
            this.a = null;
            this.c = new c(this);
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void b(PlaybackStateCompat playbackStateCompat) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d(8, null, null);
        }

        public void c() {
        }

        /* access modifiers changed from: package-private */
        public void d(int i, Object obj, Bundle bundle) {
            b bVar = this.b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        public void e(Handler handler) {
            if (handler == null) {
                b bVar = this.b;
                if (bVar != null) {
                    bVar.a = false;
                    bVar.removeCallbacksAndMessages(null);
                    this.b = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.b = bVar2;
            bVar2.a = true;
        }
    }

    interface b {
        void a(a aVar);

        PendingIntent b();

        e c();

        void d(a aVar, Handler handler);

        MediaMetadataCompat getMetadata();

        PlaybackStateCompat l();
    }

    static class c implements b {
        private b a;
        private e b;

        public c(MediaSessionCompat.Token token) {
            this.a = b.a.C3((IBinder) token.c());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void a(a aVar) {
            try {
                this.a.u2(aVar.c);
                this.a.asBinder().unlinkToDeath(aVar, 0);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent b() {
            try {
                return this.a.W();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e c() {
            if (this.b == null) {
                this.b = new g(this.a);
            }
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void d(a aVar, Handler handler) {
            try {
                this.a.asBinder().linkToDeath(aVar, 0);
                this.a.M1(aVar.c);
                aVar.d(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                aVar.d(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat getMetadata() {
            try {
                return this.a.getMetadata();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat l() {
            try {
                return this.a.l();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                return null;
            }
        }
    }

    public static final class d {
        d(int i, int i2, int i3, int i4, int i5) {
            AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
            aVar.b(i2);
            aVar.a();
        }
    }

    public static abstract class e {
        e() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    static class f extends e {
        protected final MediaController.TransportControls a;

        f(MediaController.TransportControls transportControls) {
            this.a = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void a() {
            this.a.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void b() {
            this.a.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void c() {
            this.a.stop();
        }
    }

    static class g extends e {
        private b a;

        public g(b bVar) {
            this.a = bVar;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void a() {
            try {
                this.a.pause();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in pause.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void b() {
            try {
                this.a.H();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in play.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void c() {
            try {
                this.a.stop();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in stop.", e);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        MediaSessionCompat.Token f2 = mediaSessionCompat.f();
        this.b = f2;
        MediaControllerImplApi21 mediaControllerImplApi21 = null;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                mediaControllerImplApi21 = new MediaControllerImplApi21(context, f2);
            } else {
                mediaControllerImplApi21 = new c(f2);
            }
        } catch (RemoteException unused) {
        }
        this.a = mediaControllerImplApi21;
    }

    public MediaMetadataCompat a() {
        return this.a.getMetadata();
    }

    public PlaybackStateCompat b() {
        return this.a.l();
    }

    public PendingIntent c() {
        return this.a.b();
    }

    public e d() {
        return this.a.c();
    }

    public void e(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.putIfAbsent(aVar, Boolean.TRUE) == null) {
            Handler handler = new Handler();
            aVar.e(handler);
            this.a.d(aVar, handler);
        }
    }

    public void f(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.remove(aVar) != null) {
            try {
                this.a.a(aVar);
            } finally {
                aVar.e(null);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        this.b = token;
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new MediaControllerImplApi21(context, token);
        } else {
            this.a = new c(token);
        }
    }
}
