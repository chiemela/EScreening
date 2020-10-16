package com.example.escreening.ui.fragsix;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragSixViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragSixViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bio Data fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
