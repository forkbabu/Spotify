package com.spotify.music.inappmessaging;

import com.spotify.music.inappmessaging.a;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class b {
    private MessageRequest a;
    private final PublishSubject<a> b = PublishSubject.h1();

    public s<a> a() {
        return this.b;
    }

    public void b(MessageRequest messageRequest) {
        MessageRequest messageRequest2 = this.a;
        if (messageRequest2 != null) {
            this.b.onNext(new a.C0278a(messageRequest2.f()));
        }
        this.b.onNext(new a.b(messageRequest.f()));
        this.a = messageRequest;
    }
}
