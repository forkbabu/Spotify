package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import defpackage.lbe;

/* renamed from: fee  reason: default package */
public abstract class fee implements Parcelable {
    public static final fee a = ((lbe.a) a(SignupConfigurationResponse.DEFAULT)).a();

    /* renamed from: fee$a */
    static class a implements Parcelable.Creator<fee> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public fee createFromParcel(Parcel parcel) {
            return dee.CREATOR.createFromParcel(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public fee[] newArray(int i) {
            return new dee[i];
        }
    }

    /* renamed from: fee$b */
    public interface b {
    }

    private static b a(SignupConfigurationResponse signupConfigurationResponse) {
        lbe.a aVar = new lbe.a();
        aVar.b(signupConfigurationResponse.canAcceptLicensesInOneStep);
        lbe.a aVar2 = aVar;
        aVar2.d(signupConfigurationResponse.canSignupWithAllGenders);
        lbe.a aVar3 = aVar2;
        aVar3.c(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition);
        lbe.a aVar4 = aVar3;
        aVar4.f(signupConfigurationResponse.requiresMarketingOptIn);
        lbe.a aVar5 = aVar4;
        aVar5.g(signupConfigurationResponse.requiresMarketingOptInText);
        lbe.a aVar6 = aVar5;
        aVar6.i(signupConfigurationResponse.requiresSpecificLicenses);
        lbe.a aVar7 = aVar6;
        aVar7.h(signupConfigurationResponse.showPersonalInformationCollection);
        lbe.a aVar8 = aVar7;
        aVar8.e(signupConfigurationResponse.country);
        return aVar8;
    }

    public static Parcelable.Creator<fee> g() {
        return new a();
    }

    public static fee h(SignupConfigurationResponse signupConfigurationResponse) {
        return ((lbe.a) a(signupConfigurationResponse)).a();
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean e();

    public abstract String f();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();
}
