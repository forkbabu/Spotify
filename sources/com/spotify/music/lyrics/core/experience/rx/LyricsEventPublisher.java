package com.spotify.music.lyrics.core.experience.rx;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class LyricsEventPublisher {
    private static final Map<Subject, PublishSubject<a>> a = new EnumMap(Subject.class);
    private static final Map<Object, io.reactivex.disposables.a> b = new HashMap();
    public static final LyricsEventPublisher c = null;

    public enum Subject {
        SYNC_THIS_LYRICS,
        MINIMUM_CHARACTER_COUNT
    }

    public static abstract class a {

        /* renamed from: com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher$a$a  reason: collision with other inner class name */
        public static final class C0306a extends a {
            public static final C0306a a = new C0306a();

            private C0306a() {
                super(null);
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private a() {
        }

        public a(f fVar) {
        }
    }

    private static final PublishSubject<a> a(Subject subject) {
        Map<Subject, PublishSubject<a>> map = a;
        PublishSubject<a> publishSubject = map.get(subject);
        if (publishSubject != null) {
            return publishSubject;
        }
        PublishSubject<a> h1 = PublishSubject.h1();
        h1.I0(io.reactivex.android.schedulers.a.b());
        map.put(subject, h1);
        return h1;
    }

    public static final void b(Subject subject, a aVar) {
        h.e(subject, "event");
        h.e(aVar, "message");
        a(subject).onNext(aVar);
    }

    public static final void c(Subject subject, Object obj, g<a> gVar) {
        h.e(subject, "event");
        h.e(obj, "lifecycle");
        h.e(gVar, "action");
        b subscribe = a(subject).subscribe(gVar);
        h.d(subscribe, "getSubject(event).subscribe(action)");
        Map<Object, io.reactivex.disposables.a> map = b;
        io.reactivex.disposables.a aVar = map.get(obj);
        if (aVar == null) {
            aVar = new io.reactivex.disposables.a();
            map.put(obj, aVar);
        }
        aVar.b(subscribe);
    }

    public static final void d(Object obj) {
        h.e(obj, "lifecycle");
        io.reactivex.disposables.a remove = b.remove(obj);
        if (remove != null) {
            remove.dispose();
        }
    }
}
