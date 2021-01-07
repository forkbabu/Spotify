package com.spotify.music.marquee;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.marquee.trigger.h0;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class g {
    private final PublishSubject<h0> a = PublishSubject.h1();

    public s<h0> a() {
        return this.a;
    }

    public void b() {
        Logger.b("[MarqueeBackgroundStateObserver] onAppBackgrounded", new Object[0]);
        this.a.onNext(h0.a());
    }
}
