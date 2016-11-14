package me.jcala.xmarket.mvp.user.login.register.next;

import android.content.Context;

import java.util.List;

import me.jcala.xmarket.data.dto.Result;

public class RegisterNextPresenterImpl
        implements RegisterNextPresenter,RegisterNextModel.onRegisterNextListener{

    private Context context;
    private RegisterNextModel model;
    private RegisterNextView view;

    public RegisterNextPresenterImpl(Context context, RegisterNextView view) {
        this.context = context;
        this.view = view;
        this.model=new RegisterNextModelImpl();
    }

    @Override
    public void getSchoolList() {

    }

    @Override
    public void hasGotSchoolList(Result<List<String>> result) {
        if (result==null){
            return;
        }
        switch (result.getCode()) {
            case 100:
                view.whenGetSchoolListSuccess(result.getData());
                break;
            case 99:
                view.whenFails(result.getMsg());
                break;
            default:
                break;
        }
    }

    @Override
    public void hasGotRegisterResult(Result<?> result) {

    }
}
