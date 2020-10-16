package com.example.escreening.ui.fragfive;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragFiveViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragFiveViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HND Programme fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
