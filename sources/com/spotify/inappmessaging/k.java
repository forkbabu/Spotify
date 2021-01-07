package com.spotify.inappmessaging;

import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;
import com.spotify.inappmessaging.display.e;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class k {
    private final PublishSubject<e> a = PublishSubject.h1();

    public void a(u3<gp0, fp0> u3Var) {
        this.a.onNext(new InAppMessagingDisplayFragment.a(u3Var.a, u3Var.b));
    }

    public s<e> b() {
        return this.a;
    }
}
