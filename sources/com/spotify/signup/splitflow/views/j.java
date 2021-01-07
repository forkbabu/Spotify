package com.spotify.signup.splitflow.views;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import io.reactivex.subjects.PublishSubject;

public class j implements l {
    public static final /* synthetic */ int d = 0;
    private final Context a;
    private final g b;
    private final PublishSubject<iee> c = PublishSubject.h1();

    public j(Context context, g gVar) {
        this.a = context;
        this.b = gVar;
    }

    public PublishSubject<iee> a() {
        return this.c;
    }

    public /* synthetic */ void b(String str, DialogInterface dialogInterface, int i) {
        this.c.onNext(iee.v(str));
    }

    public /* synthetic */ void c(String str, DialogInterface dialogInterface, int i) {
        this.c.onNext(iee.e(str));
    }

    public /* synthetic */ void d(String str, DialogInterface dialogInterface) {
        this.c.onNext(iee.e(str));
    }

    public /* synthetic */ void e(iee iee, DialogInterface dialogInterface, int i) {
        this.c.onNext(iee);
    }

    public /* synthetic */ void f(iee iee, DialogInterface dialogInterface) {
        this.c.onNext(iee);
    }

    public /* synthetic */ void g(iee iee, DialogInterface dialogInterface, int i) {
        this.c.onNext(iee);
    }

    public /* synthetic */ void h(iee iee, DialogInterface dialogInterface, int i) {
        this.c.onNext(iee);
    }

    public void i(String str) {
        f c2 = this.b.c(this.a.getString(C0707R.string.signup_email_error_email_already_taken_title), this.a.getString(C0707R.string.signup_email_error_email_already_taken_message));
        c2.f(this.a.getString(C0707R.string.signup_action_go_to_login), new e(this, str));
        c2.e(this.a.getString(C0707R.string.signup_action_close), new g(this, str));
        c2.h(new c(this, str));
        c2.b().a();
    }

    public void j() {
        f c2 = this.b.c(this.a.getString(C0707R.string.signup_email_error_email_already_taken_title), this.a.getString(C0707R.string.signup_email_error_email_already_taken_message));
        c2.f(this.a.getString(C0707R.string.signup_action_go_to_login), f.a);
        c2.e(this.a.getString(C0707R.string.signup_action_close), b.a);
        c2.b().a();
    }

    public void k(iee iee) {
        f b2 = this.b.b(this.a.getString(C0707R.string.signup_generic_error));
        b2.f(this.a.getString(C0707R.string.signup_action_retry), new a(this, iee));
        b2.b().a();
    }

    public void l() {
        f b2 = this.b.b(this.a.getString(C0707R.string.signup_error_generic_title));
        b2.f(this.a.getString(C0707R.string.signup_action_ok), b.a);
        b2.b().a();
    }

    public void m(iee iee, iee iee2) {
        f b2 = this.b.b(this.a.getString(C0707R.string.signup_generic_error));
        b2.h(new d(this, iee2));
        b2.f(this.a.getString(C0707R.string.signup_action_retry), new h(this, iee));
        b2.e(this.a.getString(C0707R.string.signup_action_close), new i(this, iee2));
        b2.b().a();
    }

    public void n() {
        f b2 = this.b.b(this.a.getString(C0707R.string.signup_age_error_invalid_age));
        b2.f(this.a.getString(C0707R.string.signup_action_ok), b.a);
        b2.b().a();
    }

    public void o() {
        f c2 = this.b.c(this.a.getString(C0707R.string.signup_email_no_connection_dialog_title), this.a.getString(C0707R.string.signup_email_no_connection_dialog_message));
        c2.f(this.a.getString(C0707R.string.signup_action_ok), b.a);
        c2.b().a();
    }

    public void p(String str) {
        f b2 = this.b.b(str);
        b2.f(this.a.getString(C0707R.string.signup_action_ok), b.a);
        b2.b().a();
    }
}
