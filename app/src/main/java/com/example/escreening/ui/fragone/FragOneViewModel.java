package com.example.escreening.ui.fragone;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragOneViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragOneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Academic Undertaking fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
