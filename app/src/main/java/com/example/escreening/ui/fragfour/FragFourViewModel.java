package com.example.escreening.ui.fragfour;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragFourViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragFourViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Course Registration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
