package net.comorevi.testapp;

import net.comorevi.cphone.cphone.CPhone;
import net.comorevi.cphone.cphone.application.ApplicationManifest;
import net.comorevi.cphone.cphone.data.StringsData;
import net.comorevi.cphone.cphone.model.Bundle;
import net.comorevi.cphone.cphone.model.CustomResponse;
import net.comorevi.cphone.cphone.model.ListResponse;
import net.comorevi.cphone.cphone.model.Response;
import net.comorevi.cphone.cphone.widget.activity.ReturnType;
import net.comorevi.cphone.cphone.widget.activity.base.CustomActivity;
import net.comorevi.cphone.cphone.widget.element.Input;
import net.comorevi.cphone.cphone.widget.element.Label;

import static net.comorevi.cphone.cphone.data.StringsData.strings;

public class TestActivity extends CustomActivity {

    private CPhone cPhone;
    private Bundle bundle;

    public TestActivity(ApplicationManifest manifest) {
        super(manifest);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.setTitle(strings.get("cphone_title"));
        this.cPhone = bundle.getCPhone();
        this.bundle = bundle;
        init();
    }

    @Override
    public ReturnType onStop(Response response) {
        CustomResponse customResponse = (CustomResponse) response;

        return ReturnType.TYPE_END;
    }

    private void init() {
        this.addFormElement(new Label(bundle.getString("test_string")));
        this.addFormElement(new Input(bundle.getString("input_title")));
    }

}
